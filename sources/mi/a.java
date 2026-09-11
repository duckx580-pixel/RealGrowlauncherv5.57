package mi;

import androidx.lifecycle.v0;
import launcher.powerkuy.growlauncher.api.model.User;
import li.t;
import li.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11741i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f11744t;

    public /* synthetic */ a(v0 v0Var, Object obj, int i10, int i11, int i12) {
        this.f11741i = i12;
        this.f11743s = v0Var;
        this.f11744t = obj;
        this.f11742r = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11741i) {
            case 0:
                ((Integer) obj2).getClass();
                w9.a.c((String) this.f11743s, (a1.n) this.f11744t, (o0.o) obj, o0.p.S(this.f11742r | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                pi.c.e((User) this.f11743s, (eh.a) this.f11744t, (o0.o) obj, o0.p.S(this.f11742r | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iS = o0.p.S(1);
                pi.c.b((t) this.f11743s, (li.m) this.f11744t, this.f11742r, (o0.o) obj, iS);
                break;
            case 3:
                ((Integer) obj2).getClass();
                pi.c.g((li.m) this.f11743s, (User) this.f11744t, (o0.o) obj, o0.p.S(1), this.f11742r);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ti.a.c((k1.f) this.f11743s, (eh.a) this.f11744t, (o0.o) obj, o0.p.S(this.f11742r | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                ui.a.c((w) this.f11743s, (eh.a) this.f11744t, (o0.o) obj, o0.p.S(1), this.f11742r);
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10, int i11) {
        this.f11741i = i11;
        this.f11743s = obj;
        this.f11744t = obj2;
        this.f11742r = i10;
    }

    public /* synthetic */ a(t tVar, li.m mVar, int i10, int i11) {
        this.f11741i = 2;
        this.f11743s = tVar;
        this.f11744t = mVar;
        this.f11742r = i10;
    }
}
