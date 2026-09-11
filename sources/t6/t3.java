package t6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends androidx.fragment.app.h {
    @Override // androidx.fragment.app.h
    public final String d() {
        Network[] allNetworks;
        Object next;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1693a;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
            return "unknown";
        }
        bh.h hVar = new bh.h(mh.k.w(rg.k.n0(allNetworks), new t.q0(6, this)));
        while (true) {
            if (!hVar.hasNext()) {
                next = null;
                break;
            }
            next = hVar.next();
            NetworkInfo networkInfo = (NetworkInfo) next;
            if (networkInfo != null ? networkInfo.isConnectedOrConnecting() : false) {
                break;
            }
        }
        NetworkInfo networkInfo2 = (NetworkInfo) next;
        if (networkInfo2 == null) {
            return "unknown";
        }
        int type = networkInfo2.getType();
        return type != 0 ? type != 1 ? "unknown" : "WIFI" : "MOBILE";
    }

    @Override // androidx.fragment.app.h
    public final boolean u() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f1693a;
        if (connectivityManager != null) {
            try {
                Network[] allNetworks = connectivityManager.getAllNetworks();
                if (allNetworks != null) {
                    ArrayList<NetworkCapabilities> arrayList = new ArrayList();
                    for (Network network : allNetworks) {
                        kotlin.jvm.internal.l.c(connectivityManager);
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                        if (networkCapabilities != null) {
                            arrayList.add(networkCapabilities);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (NetworkCapabilities networkCapabilities2 : arrayList) {
                            if ((networkCapabilities2 == null || !networkCapabilities2.hasTransport(4) || networkCapabilities2.hasCapability(15)) ? false : true) {
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception e8) {
                s6.h.r("Failed collecting ivc data", e8);
            }
        }
        return false;
    }
}
