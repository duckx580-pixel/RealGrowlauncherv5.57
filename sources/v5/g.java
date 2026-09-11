package v5;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final NetworkCapabilities a(ConnectivityManager connectivityManager, Network network) {
        kotlin.jvm.internal.l.f("<this>", connectivityManager);
        return connectivityManager.getNetworkCapabilities(network);
    }

    public static final boolean b(NetworkCapabilities networkCapabilities, int i10) {
        kotlin.jvm.internal.l.f("<this>", networkCapabilities);
        return networkCapabilities.hasCapability(i10);
    }

    public static final void c(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        kotlin.jvm.internal.l.f("<this>", connectivityManager);
        kotlin.jvm.internal.l.f("networkCallback", networkCallback);
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }
}
