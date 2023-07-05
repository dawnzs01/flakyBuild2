package com.dkanada.gramophone.fragments.library;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dkanada.gramophone.R;
import com.dkanada.gramophone.model.SortMethod;
import com.dkanada.gramophone.model.SortOrder;
import com.dkanada.gramophone.util.Util;

public abstract class AbsLibraryPagerRecyclerViewCustomGridSizeFragment<A extends RecyclerView.Adapter, L extends RecyclerView.LayoutManager, Q> extends AbsLibraryPagerRecyclerViewFragment<A, L, Q> {
    private int gridSize;
    private SortMethod sortMethod;
    private SortOrder sortOrder;

    private boolean usePaletteInitialized;
    private boolean usePalette;
    private int currentLayoutRes;

    public final int getGridSize() {
        if (gridSize == 0) {
            if (isLandscape()) {
                gridSize = loadGridSizeLand();
            } else {
                gridSize = loadGridSize();
            }
        }

        return gridSize;
    }

    public int getMaxGridSize() {
        if (isLandscape()) {
            return getResources().getInteger(R.integer.max_columns_land);
        } else {
            return getResources().getInteger(R.integer.max_columns);
        }
    }

    public final boolean usePalette() {
        if (!usePaletteInitialized) {
            usePalette = loadUsePalette();
            usePaletteInitialized = true;
        }

        return usePalette;
    }

    public final SortMethod getSortMethod() {
        if (sortMethod == null) {
            sortMethod = loadSortMethod();
        }

        return sortMethod;
    }

    public final SortOrder getSortOrder() {
        if (sortOrder == null) {
            sortOrder = loadSortOrder();
        }

        return sortOrder;
    }

    public void setAndSaveGridSize(final int gridSize) {
        int oldLayoutRes = getItemLayoutRes();
        this.gridSize = gridSize;
        if (isLandscape()) {
            saveGridSizeLand(gridSize);
        } else {
            saveGridSize(gridSize);
        }

        // only recreate the adapter and layout manager if the layout currentLayoutRes has changed
        if (oldLayoutRes != getItemLayoutRes()) {
            invalidateLayoutManager();
            invalidateAdapter();
        } else {
            setGridSize(gridSize);
        }
    }

    public void setAndSaveUsePalette(final boolean usePalette) {
        this.usePalette = usePalette;
        saveUsePalette(usePalette);
        setUsePalette(usePalette);
    }

    public void setAndSaveSortMethod(final SortMethod sortMethod) {
        this.sortMethod = sortMethod;
        saveSortMethod(sortMethod);
        setSortMethod(sortMethod);
        invalidateAdapter();
    }

    public void setAndSaveSortOrder(final SortOrder sortOrder) {
        this.sortOrder = sortOrder;
        saveSortOrder(sortOrder);
        setSortOrder(sortOrder);
        invalidateAdapter();
    }

    public boolean canUsePalette() {
        return getItemLayoutRes() == R.layout.item_grid;
    }

    @LayoutRes
    protected int getItemLayoutRes() {
        if (getGridSize() > getMaxGridSizeForList()) {
            return R.layout.item_grid;
        }

        return R.layout.item_list;
    }

    protected final void notifyLayoutResChanged(@LayoutRes int res) {
        this.currentLayoutRes = res;

        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView != null) {
            applyRecyclerViewPaddingForLayoutRes(recyclerView, currentLayoutRes);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        applyRecyclerViewPaddingForLayoutRes(getRecyclerView(), currentLayoutRes);
    }

    protected void applyRecyclerViewPaddingForLayoutRes(@NonNull RecyclerView recyclerView, @LayoutRes int res) {
        int padding;
        if (res == R.layout.item_grid) {
            padding = (int) (getResources().getDisplayMetrics().density * 2);
        } else {
            padding = 0;
        }

        recyclerView.setPadding(padding, padding, padding, padding);
    }

    protected abstract int loadGridSize();

    protected abstract void saveGridSize(int gridColumns);

    protected abstract int loadGridSizeLand();

    protected abstract void saveGridSizeLand(int gridColumns);

    protected abstract void saveUsePalette(boolean usePalette);

    protected abstract boolean loadUsePalette();

    protected abstract void setUsePalette(boolean usePalette);

    protected abstract void setGridSize(int gridSize);

    protected abstract SortMethod loadSortMethod();

    protected abstract void saveSortMethod(SortMethod sortMethod);

    protected abstract void setSortMethod(SortMethod sortMethod);

    protected abstract SortOrder loadSortOrder();

    protected abstract void saveSortOrder(SortOrder sortOrder);

    protected abstract void setSortOrder(SortOrder sortOrder);

    protected int getMaxGridSizeForList() {
        if (isLandscape()) {
            return requireActivity().getResources().getInteger(R.integer.default_list_columns_land);
        }

        return requireActivity().getResources().getInteger(R.integer.default_list_columns);
    }

    protected final boolean isLandscape() {
        return Util.isLandscape(getResources());
    }
}
