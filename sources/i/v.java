package i;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, b0 b0Var) {
        Objects.requireNonNull(b0Var);
        androidx.activity.s sVar = new androidx.activity.s(2, b0Var);
        u.c(obj).registerOnBackInvokedCallback(1000000, sVar);
        return sVar;
    }

    public static void c(Object obj, Object obj2) {
        u.c(obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
