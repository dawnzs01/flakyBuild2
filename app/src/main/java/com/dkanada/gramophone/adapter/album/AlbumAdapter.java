package com.dkanada.gramophone.adapter.album;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.appcompat.app.AppCompatActivity;

import com.dkanada.gramophone.util.QueryUtil;
import com.dkanada.gramophone.util.ThemeUtil;
import com.dkanada.gramophone.R;
import com.dkanada.gramophone.adapter.base.AbsMultiSelectAdapter;
import com.dkanada.gramophone.adapter.base.MediaEntryViewHolder;
import com.dkanada.gramophone.glide.CustomGlideRequest;
import com.dkanada.gramophone.glide.CustomPaletteTarget;
import com.dkanada.gramophone.helper.menu.SongsMenuHelper;
import com.dkanada.gramophone.interfaces.CabHolder;
import com.dkanada.gramophone.model.Album;
import com.dkanada.gramophone.util.MusicUtil;
import com.dkanada.gramophone.util.NavigationUtil;
import com.dkanada.gramophone.util.PreferenceUtil;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;

import org.jellyfin.apiclient.model.querying.ItemQuery;

import java.util.List;

public class AlbumAdapter extends AbsMultiSelectAdapter<AlbumAdapter.ViewHolder, Album> implements FastScrollRecyclerView.SectionedAdapter {
    protected final AppCompatActivity activity;
    protected List<Album> dataSet;

    protected int itemLayoutRes;

    protected boolean usePalette;

    public AlbumAdapter(@NonNull AppCompatActivity activity, List<Album> dataSet, @LayoutRes int itemLayoutRes, boolean usePalette, @Nullable CabHolder cabHolder) {
        super(activity, R.id.cab_stub, R.menu.menu_select_media);

        this.activity = activity;
        this.dataSet = dataSet;
        this.itemLayoutRes = itemLayoutRes;
        this.usePalette = usePalette;

        setHasStableIds(true);
    }

    public void usePalette(boolean usePalette) {
        this.usePalette = usePalette;
        notifyDataSetChanged();
    }

    public void swapDataSet(List<Album> dataSet) {
        this.dataSet = dataSet;
        notifyDataSetChanged();
    }

    public List<Album> getDataSet() {
        return dataSet;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(itemLayoutRes, parent, false);

        return createViewHolder(view, viewType);
    }

    protected ViewHolder createViewHolder(View view, int viewType) {
        return new ViewHolder(view);
    }

    protected String getAlbumTitle(Album album) {
        return album.title;
    }

    protected String getAlbumText(Album album) {
        return MusicUtil.getAlbumInfoString(activity, album);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final Album album = dataSet.get(position);
        final boolean isChecked = isChecked(album);
        holder.itemView.setActivated(isChecked);

        if (holder.getBindingAdapterPosition() == getItemCount() - 1) {
            if (holder.shortSeparator != null) {
                holder.shortSeparator.setVisibility(View.GONE);
            }
        } else {
            if (holder.shortSeparator != null) {
                holder.shortSeparator.setVisibility(View.VISIBLE);
            }
        }

        if (holder.title != null) {
            holder.title.setText(getAlbumTitle(album));
        }

        if (holder.text != null) {
            holder.text.setText(getAlbumText(album));
        }

        loadAlbumCover(album, holder);
    }

    protected void setColors(int color, ViewHolder holder) {
        if (holder.paletteColorContainer != null) {
            holder.paletteColorContainer.setBackgroundColor(color);
            if (holder.title != null) {
                holder.title.setTextColor(ThemeUtil.getPrimaryTextColor(activity, color));
            }

            if (holder.text != null) {
                holder.text.setTextColor(ThemeUtil.getSecondaryTextColor(activity, color));
            }
        }
    }

    protected void loadAlbumCover(Album album, final ViewHolder holder) {
        if (holder.image == null) return;

        CustomGlideRequest.Builder
                .from(activity, album.primary, album.blurHash)
                .palette().build()
                .into(new CustomPaletteTarget(holder.image) {
                    @Override
                    public void onLoadCleared(Drawable placeholder) {
                        super.onLoadCleared(placeholder);
                        setColors(getDefaultFooterColor(), holder);
                    }

                    @Override
                    public void onColorReady(int color) {
                        if (usePalette) {
                            setColors(color, holder);
                        } else {
                            setColors(getDefaultFooterColor(), holder);
                        }
                    }
                });
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    @Override
    public long getItemId(int position) {
        return dataSet.get(position).hashCode();
    }

    @Override
    protected Album getIdentifier(int position) {
        return dataSet.get(position);
    }

    @Override
    protected String getName(Album album) {
        return album.title;
    }

    @Override
    protected void onMultipleItemAction(@NonNull MenuItem menuItem, @NonNull List<Album> selection) {
        for (Album album : selection) {
            ItemQuery songs = new ItemQuery();
            songs.setParentId(album.id);

            QueryUtil.getSongs(songs, (media) -> {
                SongsMenuHelper.handleMenuClick(activity, media, menuItem.getItemId());
            });
        }
    }

    @NonNull
    @Override
    public String getSectionName(int position) {
        @Nullable String sectionName = null;
        switch (PreferenceUtil.getInstance(activity).getAlbumSortMethod()) {
            case NAME:
                sectionName = dataSet.get(position).title;
                break;
            case ARTIST:
                sectionName = dataSet.get(position).artistName;
                break;
            case YEAR:
                return MusicUtil.getYearString(dataSet.get(position).year);
            case ADDED:
                return "";
            case RANDOM:
                return activity.getResources().getString(R.string.random);
        }

        return MusicUtil.getSectionName(sectionName);
    }

    public class ViewHolder extends MediaEntryViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            setImageTransitionName(activity.getString(R.string.transition_album_image));
            if (menu != null) {
                menu.setVisibility(View.GONE);
            }
        }

        @Override
        public void onClick(View v) {
            if (isActive()) {
                toggleChecked(getBindingAdapterPosition());
            } else {
                Pair transition = Pair.create(image, activity.getResources().getString(R.string.transition_album_image));
                NavigationUtil.startAlbum(activity, dataSet.get(getBindingAdapterPosition()), transition);
            }
        }

        @Override
        public boolean onLongClick(View view) {
            toggleChecked(getBindingAdapterPosition());
            return true;
        }
    }
}
