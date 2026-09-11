package t6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Network f17025d;

    @Override // androidx.fragment.app.h
    public final String d() {
        Network network = this.f17025d;
        if (network == null) {
            return "unknown";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1693a;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        return networkCapabilities != null ? networkCapabilities.hasTransport(1) ? "WIFI" : networkCapabilities.hasTransport(0) ? "MOBILE" : "unknown" : "unknown";
    }

    @Override // androidx.fragment.app.h
    public final boolean u() {
        Network network = this.f17025d;
        if (network != null) {
            if (kotlin.jvm.internal.l.a(this.f17024c, "NetworkLost")) {
                network = null;
            }
            if (network != null) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f1693a;
                NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
                if (networkCapabilities != null && networkCapabilities.hasTransport(4) && !networkCapabilities.hasCapability(15)) {
                    return true;
                }
            }
        }
        return false;
    }
}
