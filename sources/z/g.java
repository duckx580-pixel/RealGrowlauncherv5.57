package z;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ af.a f20487b;

    public /* synthetic */ g(af.a aVar, int i10) {
        this.f20486a = i10;
        this.f20487b = aVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f20486a) {
            case 0:
                Object obj3 = ((m) obj).f20535i;
                af.a aVar = this.f20487b;
                return o1.c.m(Integer.valueOf(aVar.a(obj3)), Integer.valueOf(aVar.a(((m) obj2).f20535i)));
            default:
                Object obj4 = ((m) obj2).f20535i;
                af.a aVar2 = this.f20487b;
                return o1.c.m(Integer.valueOf(aVar2.a(obj4)), Integer.valueOf(aVar2.a(((m) obj).f20535i)));
        }
    }
}
