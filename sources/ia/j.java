package ia;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import ka.e0;
import s8.a3;
import s8.c1;
import s8.g3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8190i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f8191r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f8192s;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.f8190i = i10;
        this.f8192s = obj;
        this.f8191r = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8190i) {
            case 0:
                u5.e eVar = (u5.e) this.f8192s;
                n nVar = (n) eVar.f17655s;
                Boolean bool = (Boolean) this.f8191r;
                if (bool.booleanValue()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                    }
                    boolean zBooleanValue = bool.booleanValue();
                    c3.f fVar = nVar.f8205b;
                    if (!zBooleanValue) {
                        fVar.getClass();
                        throw new IllegalStateException("An invalid data collection token was used.");
                    }
                    ((v8.h) fVar.f3305i).b(null);
                    Executor executor = (Executor) nVar.f8208e.f17675a;
                    return ((Task) eVar.f17654r).f(executor, new u5.c(10, this, executor, false));
                }
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
                }
                na.b bVar = nVar.f8210g;
                Iterator it = na.b.f(bVar.f12277b.listFiles(n.f8203r)).iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
                na.b bVar2 = ((na.a) nVar.f8214l.f11701i).f12274b;
                na.a.a(na.b.f(bVar2.f12279d.listFiles()));
                na.a.a(na.b.f(bVar2.f12280e.listFiles()));
                na.a.a(na.b.f(bVar2.f12281f.listFiles()));
                nVar.f8218p.b(null);
                return o1.c.q(null);
            case 1:
                n.a((n) this.f8192s, (String) this.f8191r);
                return null;
            case 2:
                return q.a((q) this.f8192s, (e0) this.f8191r);
            case 3:
                a3 a3Var = ((c1) this.f8192s).f15280d;
                a3Var.a();
                s8.k kVar = a3Var.f15240s;
                a3.I(kVar);
                return kVar.V((String) this.f8191r);
            default:
                a3 a3Var2 = (a3) this.f8192s;
                g3 g3Var = (g3) this.f8191r;
                String str = g3Var.f15353i;
                b8.a0.h(str);
                s8.i iVarL = a3Var2.L(str);
                s8.h hVar = s8.h.ANALYTICS_STORAGE;
                if (iVarL.f(hVar) && s8.i.b(g3Var.L).f(hVar)) {
                    return a3Var2.J(g3Var).G();
                }
                a3Var2.c().E.b("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }
}
