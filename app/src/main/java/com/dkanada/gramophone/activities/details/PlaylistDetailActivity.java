package com.dkanada.gramophone.activities.details;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.afollestad.materialcab.attached.AttachedCab;
import com.afollestad.materialcab.attached.AttachedCabKt;
import com.dkanada.gramophone.BuildConfig;
import com.dkanada.gramophone.activities.base.AbsMusicContentActivity;
import com.dkanada.gramophone.databinding.ActivityPlaylistDetailBinding;
import com.dkanada.gramophone.dialogs.DeletePlaylistDialog;
import com.dkanada.gramophone.dialogs.RenamePlaylistDialog;
import com.dkanada.gramophone.helper.menu.SongsMenuHelper;
import com.dkanada.gramophone.util.PreferenceUtil;
import com.h6ah4i.android.widget.advrecyclerview.animator.GeneralItemAnimator;
import com.h6ah4i.android.widget.advrecyclerview.animator.RefactoredDefaultItemAnimator;
import com.h6ah4i.android.widget.advrecyclerview.draggable.RecyclerViewDragDropManager;
import com.h6ah4i.android.widget.advrecyclerview.utils.WrapperAdapterUtils;
import com.dkanada.gramophone.R;
import com.dkanada.gramophone.adapter.song.OrderablePlaylistSongAdapter;
import com.dkanada.gramophone.adapter.song.SongAdapter;
import com.dkanada.gramophone.helper.MusicPlayerRemote;
import com.dkanada.gramophone.interfaces.CabHolder;
import com.dkanada.gramophone.model.Playlist;
import com.dkanada.gramophone.model.PlaylistSong;
import com.dkanada.gramophone.model.Song;
import com.dkanada.gramophone.util.PlaylistUtil;
import com.dkanada.gramophone.util.ViewUtil;

import org.jellyfin.apiclient.model.playlists.PlaylistItemQuery;

import java.util.ArrayList;

public class PlaylistDetailActivity extends AbsMusicContentActivity implements CabHolder {
    public static String EXTRA_PLAYLIST = BuildConfig.APPLICATION_ID + ".extra.playlist";

    private ActivityPlaylistDetailBinding binding;

    private Playlist playlist;

    private AttachedCab cab;
    private SongAdapter adapter;

    private RecyclerView.Adapter wrappedAdapter;
    private RecyclerViewDragDropManager recyclerViewDragDropManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        playlist = getIntent().getParcelableExtra(EXTRA_PLAYLIST);

        super.onCreate(savedInstanceState);

        setUpRecyclerView();
        setUpToolbar();
    }

    @Override
    public void onStateOnline() {
        PlaylistItemQuery query = new PlaylistItemQuery();
        query.setId(playlist.id);

        PlaylistUtil.getPlaylist(query, media -> {
            adapter.getDataSet().addAll(media);
            adapter.notifyDataSetChanged();
        });
    }

    @Override
    protected View createContentView() {
        binding = ActivityPlaylistDetailBinding.inflate(getLayoutInflater());

        return wrapSlidingMusicPanel(binding.getRoot());
    }

    private void setUpRecyclerView() {
        ViewUtil.setUpFastScrollRecyclerViewColor(this, binding.recyclerView, PreferenceUtil.getInstance(this).getAccentColor());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerViewDragDropManager = new RecyclerViewDragDropManager();
        final GeneralItemAnimator animator = new RefactoredDefaultItemAnimator();
        adapter = new OrderablePlaylistSongAdapter(this, new ArrayList<>(), R.layout.item_list, false, this, (fromPosition, toPosition) -> {
            PlaylistUtil.moveItem(playlist.id, (PlaylistSong) adapter.getDataSet().get(fromPosition), toPosition);
            Song song = adapter.getDataSet().remove(fromPosition);
            adapter.getDataSet().add(toPosition, song);
            adapter.notifyItemMoved(fromPosition, toPosition);
        });

        wrappedAdapter = recyclerViewDragDropManager.createWrappedAdapter(adapter);

        binding.recyclerView.setAdapter(wrappedAdapter);
        binding.recyclerView.setItemAnimator(animator);

        recyclerViewDragDropManager.attachRecyclerView(binding.recyclerView);

        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onChanged() {
                super.onChanged();
                checkIsEmpty();
            }
        });
    }

    private void setUpToolbar() {
        binding.toolbar.setTitle(playlist.name);
        binding.toolbar.setBackgroundColor(PreferenceUtil.getInstance(this).getPrimaryColor());
        setSupportActionBar(binding.toolbar);
        // noinspection ConstantConditions
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_detail_playlist, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.action_shuffle_playlist) {
            MusicPlayerRemote.openAndShuffleQueue(adapter.getDataSet(), true);
        } else if (item.getItemId() == R.id.action_rename_playlist) {
            RenamePlaylistDialog.create(playlist).show(getSupportFragmentManager(), RenamePlaylistDialog.TAG);
        } else if (item.getItemId() == R.id.action_delete_playlist) {
            DeletePlaylistDialog.create(playlist).show(getSupportFragmentManager(), DeletePlaylistDialog.TAG);
        }

        // TODO move SongsMenuHelper into AbsMediaDetailActivity
        return SongsMenuHelper.handleMenuClick(this, adapter.getDataSet(), item.getItemId())
            || super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateCab(AttachedCab cab) {
        this.cab = cab;
    }

    @Override
    public void onBackPressed() {
        if (cab != null && AttachedCabKt.isActive(cab)) {
            AttachedCabKt.destroy(cab);
        } else {
            binding.recyclerView.stopScroll();
            super.onBackPressed();
        }
    }

    private void checkIsEmpty() {
        binding.empty.setVisibility(adapter.getItemCount() == 0 ? View.VISIBLE : View.GONE);
    }

    @Override
    public void onPause() {
        if (recyclerViewDragDropManager != null) {
            recyclerViewDragDropManager.cancelDrag();
        }

        super.onPause();
    }

    @Override
    protected void onDestroy() {
        if (recyclerViewDragDropManager != null) {
            recyclerViewDragDropManager.release();
            recyclerViewDragDropManager = null;
        }

        binding.recyclerView.setItemAnimator(null);
        binding.recyclerView.setAdapter(null);

        if (wrappedAdapter != null) {
            WrapperAdapterUtils.releaseAll(wrappedAdapter);
            wrappedAdapter = null;
        }

        adapter = null;
        super.onDestroy();
    }
}
