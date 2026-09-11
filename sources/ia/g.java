package ia;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.internal.measurement.l4;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import s8.a3;
import s8.c1;
import s8.l0;
import s8.t0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8182i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f8183r;

    public /* synthetic */ g() {
        this.f8182i = 5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8182i) {
            case 0:
                ((l) this.f8183r).run();
                return null;
            case 1:
                JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) this.f8183r;
                l5.m mVar = new l5.m();
                mVar.f9808a = jsReplyProxyBoundaryInterface;
                return mVar;
            case 2:
                q4.a aVar = (q4.a) this.f8183r;
                aVar.f13790u.set(true);
                try {
                    Process.setThreadPriority(10);
                    aVar.a();
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th2) {
                    try {
                        aVar.f13789t.set(true);
                        throw th2;
                    } finally {
                        aVar.b(null);
                    }
                }
            case 3:
                return new l4(((t0) this.f8183r).B);
            case 4:
                a3 a3Var = ((c1) this.f8183r).f15280d;
                a3Var.a();
                l0 l0Var = a3Var.f15244x;
                a3.I(l0Var);
                l0Var.t();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                s5.e eVar = (s5.e) this.f8183r;
                if (eVar.a()) {
                    return eVar.c();
                }
                return null;
        }
    }

    public /* synthetic */ g(int i10, Object obj) {
        this.f8182i = i10;
        this.f8183r = obj;
    }

    public g(c1 c1Var, s8.q qVar, String str) {
        this.f8182i = 4;
        this.f8183r = c1Var;
    }
}
