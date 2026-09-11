package b0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o0 f2474i = new o0(2);

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        r0 r0Var = (r0) obj2;
        x0.c cVar = (x0.c) r0Var.f2494b.getValue();
        if (cVar != null) {
            Iterator it = r0Var.f2495c.iterator();
            while (it.hasNext()) {
                cVar.e(it.next());
            }
        }
        Map mapC = r0Var.f2493a.c();
        if (mapC.isEmpty()) {
            return null;
        }
        return mapC;
    }
}
