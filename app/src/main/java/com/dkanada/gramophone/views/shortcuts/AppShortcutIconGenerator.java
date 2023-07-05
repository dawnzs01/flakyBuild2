package com.dkanada.gramophone.views.shortcuts;

import android.content.Context;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;

import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

import com.dkanada.gramophone.R;
import com.dkanada.gramophone.util.ImageUtil;
import com.dkanada.gramophone.util.PreferenceUtil;

@RequiresApi(Build.VERSION_CODES.O)
public final class AppShortcutIconGenerator {
    public static Icon generateThemedIcon(Context context, int iconId) {
        if (PreferenceUtil.getInstance(context).getColoredShortcuts()) {
            return generateUserThemedIcon(context, iconId).toIcon(context);
        } else {
            return generateDefaultThemedIcon(context, iconId).toIcon(context);
        }
    }

    private static IconCompat generateDefaultThemedIcon(Context context, int iconId) {
        // return icon of iconId with default colors
        return generateThemedIcon(context, iconId,
                context.getColor(R.color.color_shortcut_foreground),
                context.getColor(R.color.color_shortcut_background)
        );
    }

    private static IconCompat generateUserThemedIcon(Context context, int iconId) {
        // Get background color from context's theme
        final TypedValue typedColorBackground = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedColorBackground, true);

        // Return an Icon of iconId with those colors
        return generateThemedIcon(context, iconId,
                PreferenceUtil.getInstance(context).getPrimaryColor(),
                typedColorBackground.data
        );
    }

    private static IconCompat generateThemedIcon(Context context, int iconId, int foregroundColor, int backgroundColor) {
        // Get and tint foreground and background drawables
        Drawable vectorDrawable = ImageUtil.getTintedVectorDrawable(context, iconId, foregroundColor);
        Drawable backgroundDrawable = ImageUtil.getTintedVectorDrawable(context, R.drawable.ic_app_shortcut_background, backgroundColor);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            AdaptiveIconDrawable adaptiveIconDrawable = new AdaptiveIconDrawable(backgroundDrawable, vectorDrawable);
            return IconCompat.createWithAdaptiveBitmap(ImageUtil.createBitmap(adaptiveIconDrawable));
        } else {
            // Squash the two drawables together
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{backgroundDrawable, vectorDrawable});

            // Return as an Icon
            return IconCompat.createWithBitmap(ImageUtil.createBitmap(layerDrawable));
        }
    }

}
