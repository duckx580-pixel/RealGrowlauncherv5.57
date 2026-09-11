package h3;

import android.app.Activity;
import android.app.SharedElementCallback;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void a(Activity activity) {
        activity.finishAfterTransition();
    }

    public static void b(Activity activity) {
        activity.postponeEnterTransition();
    }

    public static void c(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setEnterSharedElementCallback(sharedElementCallback);
    }

    public static void d(Activity activity, SharedElementCallback sharedElementCallback) {
        activity.setExitSharedElementCallback(sharedElementCallback);
    }

    public static void e(Activity activity) {
        activity.startPostponedEnterTransition();
    }
}
