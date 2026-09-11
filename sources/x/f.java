package x;

import java.util.ArrayList;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements rh.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19324i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f19326s;

    public /* synthetic */ f(ArrayList arrayList, s0 s0Var, int i10) {
        this.f19324i = i10;
        this.f19325r = arrayList;
        this.f19326s = s0Var;
    }

    @Override // rh.i
    public final Object emit(Object obj, ug.c cVar) {
        switch (this.f19324i) {
            case 0:
                j jVar = (j) obj;
                boolean z3 = jVar instanceof d;
                ArrayList arrayList = this.f19325r;
                if (z3) {
                    arrayList.add(jVar);
                } else if (jVar instanceof e) {
                    arrayList.remove(((e) jVar).f19323a);
                }
                this.f19326s.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                j jVar2 = (j) obj;
                boolean z10 = jVar2 instanceof h;
                ArrayList arrayList2 = this.f19325r;
                if (z10) {
                    arrayList2.add(jVar2);
                } else if (jVar2 instanceof i) {
                    arrayList2.remove(((i) jVar2).f19331a);
                }
                this.f19326s.setValue(Boolean.valueOf(!arrayList2.isEmpty()));
                break;
            default:
                j jVar3 = (j) obj;
                boolean z11 = jVar3 instanceof n;
                ArrayList arrayList3 = this.f19325r;
                if (z11) {
                    arrayList3.add(jVar3);
                } else if (jVar3 instanceof o) {
                    arrayList3.remove(((o) jVar3).f19335a);
                } else if (jVar3 instanceof m) {
                    arrayList3.remove(((m) jVar3).f19333a);
                }
                this.f19326s.setValue(Boolean.valueOf(!arrayList3.isEmpty()));
                break;
        }
        return qg.o.f13926a;
    }
}
