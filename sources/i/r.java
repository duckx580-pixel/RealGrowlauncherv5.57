package i;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static Context a(Context context, Configuration configuration) {
        return context.createConfigurationContext(configuration);
    }

    public static int b(Configuration configuration) {
        return configuration.getLayoutDirection();
    }

    public static void c(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    public static void d(View view, int i10) {
        view.setLayoutDirection(i10);
    }

    public static void e(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }
}
