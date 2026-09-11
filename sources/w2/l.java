package w2;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ae.c f19057b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19056a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19058c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19059d = new ArrayList();

    public final f a() {
        int i10 = this.f19058c;
        this.f19058c = i10 + 1;
        ArrayList arrayList = this.f19059d;
        f fVar = (f) rg.l.f0(i10, arrayList);
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(Integer.valueOf(this.f19058c));
        arrayList.add(fVar2);
        return fVar2;
    }
}
