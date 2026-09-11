package w1;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2.o f18744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2.j f18745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f18746c = new LinkedHashSet();

    public a0(b2.o oVar, Map map) {
        this.f18744a = oVar;
        this.f18745b = oVar.f2578d;
        List listG = oVar.g(false, true);
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            b2.o oVar2 = (b2.o) listG.get(i10);
            if (map.containsKey(Integer.valueOf(oVar2.f2581g))) {
                this.f18746c.add(Integer.valueOf(oVar2.f2581g));
            }
        }
    }
}
