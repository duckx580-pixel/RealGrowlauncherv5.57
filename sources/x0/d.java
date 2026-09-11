package x0;

import java.util.LinkedHashMap;
import java.util.Map;
import rg.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f19348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f19349s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19350i;

    static {
        int i10 = 2;
        f19348r = new d(i10, 0);
        f19349s = new d(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f19350i = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19350i) {
            case 0:
                g gVar = (g) obj2;
                LinkedHashMap linkedHashMapM = y.M(gVar.f19358a);
                for (f fVar : gVar.f19359b.values()) {
                    Object obj3 = fVar.f19354a;
                    if (fVar.f19355b) {
                        Map mapC = fVar.f19356c.c();
                        if (mapC.isEmpty()) {
                            linkedHashMapM.remove(obj3);
                        } else {
                            linkedHashMapM.put(obj3, mapC);
                        }
                    }
                }
                if (linkedHashMapM.isEmpty()) {
                    return null;
                }
                return linkedHashMapM;
            default:
                return obj2;
        }
    }
}
