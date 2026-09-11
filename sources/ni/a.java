package ni;

import o0.o;
import o0.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12309i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f12310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12311s;

    public /* synthetic */ a(Object obj, int i10, int i11) {
        this.f12309i = i11;
        this.f12310r = obj;
        this.f12311s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12309i) {
            case 0:
                ((Integer) obj2).getClass();
                f.b((li.m) this.f12310r, (o) obj, p.S(this.f12311s | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                f.d((li.m) this.f12310r, (o) obj, p.S(this.f12311s | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                f.h((li.m) this.f12310r, (o) obj, p.S(this.f12311s | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vd.a.a((a1.n) this.f12310r, (o) obj, p.S(this.f12311s | 1));
                break;
        }
        return qg.o.f13926a;
    }
}
