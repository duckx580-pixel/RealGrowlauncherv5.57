package s8;

import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.l4;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s0 implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15575i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f15576r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15577s;

    public /* synthetic */ s0(t0 t0Var, String str, int i10) {
        this.f15575i = i10;
        this.f15576r = t0Var;
        this.f15577s = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15575i) {
            case 0:
                t0 t0Var = this.f15576r;
                k kVar = t0Var.f15638s.f15240s;
                a3.I(kVar);
                String str = this.f15577s;
                h1 h1VarM = kVar.M(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((y0) t0Var.f3470r).w.y();
                map.put("gmp_version", 73000L);
                if (h1VarM != null) {
                    String strH = h1VarM.H();
                    if (strH != null) {
                        map.put("app_version", strH);
                    }
                    map.put("app_version_int", Long.valueOf(h1VarM.B()));
                    map.put("dynamite_version", Long.valueOf(h1VarM.C()));
                }
                return map;
            case 1:
                u5.c cVar = new u5.c(17, this.f15576r, this.f15577s, false);
                c6 c6Var = new c6("internal.remoteConfig", 0);
                c6Var.f3816r.put("getValue", new l4(cVar));
                return c6Var;
            default:
                return new l4(new s0(this.f15576r, this.f15577s, 0));
        }
    }
}
