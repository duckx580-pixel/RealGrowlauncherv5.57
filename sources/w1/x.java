package w1;

import android.R;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static final void a(t3.j jVar, b2.o oVar) {
        boolean zM = f0.m(oVar);
        LinkedHashMap linkedHashMap = oVar.f2578d.f2569i;
        if (zM) {
            Object obj = linkedHashMap.get(b2.i.f2566v);
            if (obj == null) {
                obj = null;
            }
            b2.a aVar = (b2.a) obj;
            if (aVar != null) {
                jVar.b(new t3.d(R.id.accessibilityActionPageUp, aVar.f2535a));
            }
            Object obj2 = linkedHashMap.get(b2.i.f2567x);
            if (obj2 == null) {
                obj2 = null;
            }
            b2.a aVar2 = (b2.a) obj2;
            if (aVar2 != null) {
                jVar.b(new t3.d(R.id.accessibilityActionPageDown, aVar2.f2535a));
            }
            Object obj3 = linkedHashMap.get(b2.i.w);
            if (obj3 == null) {
                obj3 = null;
            }
            b2.a aVar3 = (b2.a) obj3;
            if (aVar3 != null) {
                jVar.b(new t3.d(R.id.accessibilityActionPageLeft, aVar3.f2535a));
            }
            Object obj4 = linkedHashMap.get(b2.i.f2568y);
            b2.a aVar4 = (b2.a) (obj4 != null ? obj4 : null);
            if (aVar4 != null) {
                jVar.b(new t3.d(R.id.accessibilityActionPageRight, aVar4.f2535a));
            }
        }
    }
}
