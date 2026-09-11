package t6;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16738i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f16739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f16740s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(int i10, long j, Object obj) {
        super(0);
        this.f16738i = i10;
        this.f16740s = obj;
        this.f16739r = j;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16738i) {
            case 0:
                return ((Intent) ((u5.l) this.f16740s).f17672i).putExtra("af_consumed", this.f16739r);
            default:
                v1.l0 l0VarH0 = ((v1.i0) this.f16740s).a().H0();
                kotlin.jvm.internal.l.c(l0VarH0);
                l0VarH0.n(this.f16739r);
                return qg.o.f13926a;
        }
    }
}
