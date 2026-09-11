package t1;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i0 f16349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f16350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f16352e;

    public /* synthetic */ z(i0 i0Var, d0 d0Var, int i10, i0 i0Var2, int i11) {
        this.f16348a = i11;
        this.f16350c = d0Var;
        this.f16351d = i10;
        this.f16352e = i0Var2;
        this.f16349b = i0Var;
    }

    @Override // t1.i0
    public final int a() {
        switch (this.f16348a) {
        }
        return this.f16349b.a();
    }

    @Override // t1.i0
    public final int b() {
        switch (this.f16348a) {
        }
        return this.f16349b.b();
    }

    @Override // t1.i0
    public final Map c() {
        switch (this.f16348a) {
        }
        return this.f16349b.c();
    }

    @Override // t1.i0
    public final void d() {
        switch (this.f16348a) {
            case 0:
                int i10 = this.f16351d;
                d0 d0Var = this.f16350c;
                d0Var.f16275u = i10;
                this.f16352e.d();
                Set setEntrySet = d0Var.B.entrySet();
                t.q0 q0Var = new t.q0(1, d0Var);
                kotlin.jvm.internal.l.f("<this>", setEntrySet);
                rg.q.U(setEntrySet, q0Var);
                break;
            default:
                int i11 = this.f16351d;
                d0 d0Var2 = this.f16350c;
                d0Var2.f16274t = i11;
                this.f16352e.d();
                d0Var2.c(d0Var2.f16274t);
                break;
        }
    }
}
