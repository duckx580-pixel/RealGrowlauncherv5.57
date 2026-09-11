package s8;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15251i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15252r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15253s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ long f15254t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15255u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f15256v;

    public /* synthetic */ b1(Object obj, Object obj2, Object obj3, Object obj4, long j, int i10) {
        this.f15251i = i10;
        this.f15256v = obj;
        this.f15252r = obj2;
        this.f15253s = obj3;
        this.f15255u = obj4;
        this.f15254t = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15251i) {
            case 0:
                String str = (String) this.f15253s;
                a3 a3Var = ((c1) this.f15256v).f15280d;
                String str2 = (String) this.f15252r;
                if (str2 != null) {
                    z1 z1Var = new z1((String) this.f15255u, str2, this.f15254t);
                    a3Var.b().t();
                    String str3 = a3Var.T;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    a3Var.T = str;
                    a3Var.S = z1Var;
                } else {
                    a3Var.b().t();
                    String str4 = a3Var.T;
                    if (str4 == null || str4.equals(str)) {
                        a3Var.T = str;
                        a3Var.S = null;
                    }
                }
                break;
            case 1:
                v1 v1Var = (v1) this.f15256v;
                String str5 = (String) this.f15252r;
                String str6 = (String) this.f15253s;
                v1Var.J(this.f15254t, this.f15255u, str5, str6);
                break;
            default:
                c2 c2Var = (c2) this.f15256v;
                Bundle bundle = (Bundle) this.f15252r;
                z1 z1Var2 = (z1) this.f15253s;
                z1 z1Var3 = (z1) this.f15255u;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                e3 e3Var = ((y0) c2Var.f3470r).B;
                y0.h(e3Var);
                c2Var.x(z1Var2, z1Var3, this.f15254t, true, e3Var.v0("screen_view", bundle, null, false));
                break;
        }
    }
}
