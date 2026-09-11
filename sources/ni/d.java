package ni;

import o0.s0;
import qg.o;
import rh.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12318i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ li.m f12319r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f12320s;

    public /* synthetic */ d(li.m mVar, s0 s0Var, int i10) {
        this.f12318i = i10;
        this.f12319r = mVar;
        this.f12320s = s0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12318i) {
            case 0:
                boolean z3 = !((Boolean) this.f12320s.getValue()).booleanValue();
                h1 h1Var = this.f12319r.f9989g;
                Boolean boolValueOf = Boolean.valueOf(z3);
                h1Var.getClass();
                h1Var.k(null, boolValueOf);
                break;
            default:
                if (((Boolean) this.f12320s.getValue()).booleanValue()) {
                    h1 h1Var2 = this.f12319r.f9987e;
                    Boolean bool = Boolean.FALSE;
                    h1Var2.getClass();
                    h1Var2.k(null, bool);
                }
                break;
        }
        return o.f13926a;
    }
}
