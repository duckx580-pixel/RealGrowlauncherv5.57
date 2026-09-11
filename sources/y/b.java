package y;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19917a;

    public /* synthetic */ b(int i10) {
        this.f19917a = i10;
    }

    public static final a c(int i10, String str) {
        WeakHashMap weakHashMap = z0.f20009u;
        return new a(i10, str);
    }

    public static final w0 d(int i10, String str) {
        WeakHashMap weakHashMap = z0.f20009u;
        return new w0(new c0(0, 0, 0, 0), str);
    }

    public static z0 e(o0.o oVar) {
        z0 z0Var;
        oVar.U(-1366542614);
        View view = (View) oVar.k(w1.n0.f18862f);
        WeakHashMap weakHashMap = z0.f20009u;
        synchronized (weakHashMap) {
            try {
                Object z0Var2 = weakHashMap.get(view);
                if (z0Var2 == null) {
                    z0Var2 = new z0(view);
                    weakHashMap.put(view, z0Var2);
                }
                z0Var = (z0) z0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        o0.p.c(z0Var, new t.h0(16, z0Var, view), oVar);
        oVar.r(false);
        return z0Var;
    }

    @Override // y.g
    public void b(q2.b bVar, int i10, int[] iArr, int[] iArr2) {
        switch (this.f19917a) {
            case 0:
                i.c(i10, iArr, iArr2, false);
                break;
            default:
                i.b(iArr, iArr2, false);
                break;
        }
    }

    public String toString() {
        switch (this.f19917a) {
            case 0:
                return "Arrangement#Bottom";
            case 1:
                return "Arrangement#Top";
            default:
                return super.toString();
        }
    }
}
