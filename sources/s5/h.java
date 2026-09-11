package s5;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.work.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15191a;

    static {
        String strF = p.f("NetworkStateTracker");
        l.e("tagWithPrefix(\"NetworkStateTracker\")", strF);
        f15191a = strF;
    }

    public static final q5.a a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        l.f("<this>", connectivityManager);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = v5.g.a(connectivityManager, v5.h.a(connectivityManager));
        } catch (SecurityException e8) {
            p.d().c(f15191a, "Unable to validate active network", e8);
        }
        boolean zB = networkCapabilitiesA != null ? v5.g.b(networkCapabilitiesA, 16) : false;
        return new q5.a(z3, zB, n3.a.a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
