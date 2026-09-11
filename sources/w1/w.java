package w1;

import android.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final void a(t3.j jVar, b2.o oVar) {
        if (f0.m(oVar)) {
            b2.j jVar2 = oVar.f2578d;
            Object obj = jVar2.f2569i.get(b2.i.f2551f);
            if (obj == null) {
                obj = null;
            }
            b2.a aVar = (b2.a) obj;
            if (aVar != null) {
                jVar.b(new t3.d(R.id.accessibilityActionSetProgress, aVar.f2535a));
            }
        }
    }
}
