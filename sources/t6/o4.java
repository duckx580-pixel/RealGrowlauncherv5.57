package t6;

import android.content.Context;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import zc.c5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o4 implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f16953b;

    public /* synthetic */ o4(int i10, Object obj) {
        this.f16952a = i10;
        this.f16953b = obj;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        Object objCast;
        zc.b3 b3Var;
        switch (this.f16952a) {
            case 0:
                ((p4) this.f16953b).f16994f.run();
                break;
            case 1:
                boolean zC = ((zc.f2) this.f16953b).f20826a.c("usage_tracking_enabled", false);
                if (zc.n2.f21015k != zC) {
                    zc.n2.f21015k = zC;
                    zc.n2 n2Var = zc.n2.j;
                    if (n2Var != null) {
                        try {
                            if (zC) {
                                n2Var.f21022g.execute(new zc.m2(n2Var, 1, c5.b(), null, null, null));
                            } else {
                                n2Var.f21022g.execute(new zc.m2(n2Var, 2, 0L, null, null, null));
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                Iterator it = ((zc.f2) this.f16953b).f20826a.f21075a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map map = ((zc.p2) it.next()).f21054a;
                        Object obj2 = map != null ? map.get("usage_tracking_exclude") : null;
                        if (obj2 != null && List.class.isInstance(obj2)) {
                            objCast = List.class.cast(obj2);
                        }
                    } else {
                        objCast = null;
                    }
                }
                Collection collection = (Collection) objCast;
                if (collection == null || collection.isEmpty()) {
                    zc.n2.f21013h = null;
                } else {
                    zc.n2.f21013h = new HashSet(collection);
                }
                break;
            default:
                zc.q0 q0Var = (zc.q0) this.f16953b;
                zc.x1.f21242b.deleteObserver(this);
                if (!Boolean.TRUE.equals(obj) && (b3Var = q0Var.f21070e) != null && ((Context) b3Var.f20728a) != null) {
                    q0Var.f21068c = new s8.e2(q0Var);
                    new Thread(q0Var.f21068c).start();
                    break;
                }
                break;
        }
    }
}
