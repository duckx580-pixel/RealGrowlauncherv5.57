package v5;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.l.f("<this>", connectivityManager);
        return connectivityManager.getActiveNetwork();
    }
}
