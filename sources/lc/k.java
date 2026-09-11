package lc;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f9904a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb.c f9905b;

    public k() {
        kb.c cVar = new kb.c();
        cVar.f9562i = new mc.a();
        this.f9905b = cVar;
        for (oc.a aVar : oc.a.values()) {
            kb.c cVar2 = this.f9905b;
            this.f9904a.put(aVar, 1);
            int i10 = j.f9903a[aVar.ordinal()];
            if (i10 == 1) {
                ((mc.a) cVar2.f9562i).getClass();
                mc.a.e("sdra", 1);
            } else if (i10 == 2) {
                ((mc.a) cVar2.f9562i).getClass();
                mc.a.e("sdia", 1);
            } else if (i10 == 3) {
                ((mc.a) cVar2.f9562i).getClass();
                mc.a.e("sdba", 1);
            } else if (i10 == 4) {
                ((mc.a) cVar2.f9562i).getClass();
                mc.a.e("sdna", 1);
            }
        }
    }
}
