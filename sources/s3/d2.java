package s3;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f2 f15055b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2 f15056a;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f15055b = (i10 >= 30 ? new w1() : i10 >= 29 ? new v1() : new u1()).b().f15063a.a().f15063a.b().f15063a.c();
    }

    public d2(f2 f2Var) {
        this.f15056a = f2Var;
    }

    public f2 a() {
        return this.f15056a;
    }

    public f2 b() {
        return this.f15056a;
    }

    public f2 c() {
        return this.f15056a;
    }

    public l e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        return o() == d2Var.o() && n() == d2Var.n() && r3.b.a(k(), d2Var.k()) && r3.b.a(i(), d2Var.i()) && r3.b.a(e(), d2Var.e());
    }

    public k3.c f(int i10) {
        return k3.c.f9223e;
    }

    public k3.c g(int i10) {
        if ((i10 & 8) == 0) {
            return k3.c.f9223e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public k3.c h() {
        return k();
    }

    public int hashCode() {
        return r3.b.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public k3.c i() {
        return k3.c.f9223e;
    }

    public k3.c j() {
        return k();
    }

    public k3.c k() {
        return k3.c.f9223e;
    }

    public k3.c l() {
        return k();
    }

    public f2 m(int i10, int i11, int i12, int i13) {
        return f15055b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void d(View view) {
    }

    public void q(k3.c[] cVarArr) {
    }

    public void r(f2 f2Var) {
    }

    public void s(k3.c cVar) {
    }
}
