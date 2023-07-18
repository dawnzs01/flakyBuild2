package org.popcraft.chunky.shape;

import org.popcraft.chunky.Selection;
import org.popcraft.chunky.platform.util.Vector2;

public abstract class AbstractEllipse extends AbstractShape {
    protected AbstractEllipse(final Selection selection, final boolean chunkAligned) {
        super(selection, chunkAligned);
    }

    public abstract Vector2 radii();
}
