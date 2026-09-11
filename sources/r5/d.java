package r5;

import androidx.work.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    static {
        l.e("tagWithPrefix(\"NetworkNotRoamingCtrlr\")", p.f("NetworkNotRoamingCtrlr"));
    }

    @Override // r5.b
    public final boolean a(u5.p pVar) {
        l.f("workSpec", pVar);
        return pVar.j.f2327a == 4;
    }

    @Override // r5.b
    public final boolean b(Object obj) {
        q5.a aVar = (q5.a) obj;
        l.f("value", aVar);
        return (aVar.f13795a && aVar.f13798d) ? false : true;
    }
}
