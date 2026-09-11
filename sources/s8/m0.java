package s8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f15477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15479c;

    public m0(a3 a3Var) {
        this.f15477a = a3Var;
    }

    public final void a() {
        a3 a3Var = this.f15477a;
        a3Var.d();
        a3Var.b().t();
        a3Var.b().t();
        if (this.f15478b) {
            a3Var.c().E.b("Unregistering connectivity change receiver");
            this.f15478b = false;
            this.f15479c = false;
            try {
                a3Var.B.f15658i.unregisterReceiver(this);
            } catch (IllegalArgumentException e8) {
                a3Var.c().w.c("Failed to unregister the network broadcast receiver", e8);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a3 a3Var = this.f15477a;
        a3Var.d();
        String action = intent.getAction();
        a3Var.c().E.c("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            a3Var.c().f15413z.c("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        l0 l0Var = a3Var.f15239r;
        a3.I(l0Var);
        boolean zH = l0Var.H();
        if (this.f15479c != zH) {
            this.f15479c = zH;
            a3Var.b().B(new a8.q(this, zH));
        }
    }
}
