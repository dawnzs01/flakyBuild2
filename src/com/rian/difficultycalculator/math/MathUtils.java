package com.rian.difficultycalculator.math;

/**
 * Some math utility functions.
 */
public final class MathUtils {
    private MathUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Limits the specified number on range <code>[min, max]</code>.
     *
     * @param num The number to limit.
     * @param min The minimum range.
     * @param max The maximum range.
     */
    public static double clamp(double num, double min, double max) {
        return Math.max(min, Math.min(num, max));
    }

    /**
     * Limits the specified number on range <code>[min, max]</code>.
     *
     * @param num The number to limit.
     * @param min The minimum range.
     * @param max The maximum range.
     */
    public static float clamp(float num, float min, float max) {
        return Math.max(min, Math.min(num, max));
    }

    /**
     * Limits the specified number on range <code>[min, max]</code>.
     *
     * @param num The number to limit.
     * @param min The minimum range.
     * @param max The maximum range.
     */
    public static int clamp(int num, int min, int max) {
        return Math.max(min, Math.min(num, max));
    }
}
