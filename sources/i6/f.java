package i6;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.work.p;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import kotlin.jvm.internal.l;
import s5.g;
import s5.h;
import t6.r3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8100b;

    public /* synthetic */ f(int i10, Object obj) {
        this.f8099a = i10;
        this.f8100b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f8099a) {
            case 0:
                mf.e.d((mf.e) this.f8100b, network, true);
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                l.f(PredefinedUICustomizationFont.defaultFamily, network);
                ((r3) this.f8100b).f17025d = network;
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f8099a) {
            case 1:
                l.f("network", network);
                l.f("capabilities", networkCapabilities);
                p.d().a(h.f15191a, "Network capabilities changed: " + networkCapabilities);
                g gVar = (g) this.f8100b;
                gVar.e(h.a(gVar.f15189f));
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f8099a) {
            case 0:
                mf.e.d((mf.e) this.f8100b, network, false);
                break;
            case 1:
                l.f("network", network);
                p.d().a(h.f15191a, "Network connection lost");
                g gVar = (g) this.f8100b;
                gVar.e(h.a(gVar.f15189f));
                break;
            default:
                l.f(PredefinedUICustomizationFont.defaultFamily, network);
                r3 r3Var = (r3) this.f8100b;
                r3Var.f17025d = network;
                r3Var.f17024c = "NetworkLost";
                break;
        }
    }
}
