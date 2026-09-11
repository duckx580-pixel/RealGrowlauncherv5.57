package androidx.compose.ui.input.rotary;

import a1.m;
import v1.o0;
import w1.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class RotaryInputElement extends o0 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        Object obj2 = o.f18873s;
        return obj2.equals(obj2);
    }

    @Override // v1.o0
    public final int hashCode() {
        return o.f18873s.hashCode() * 31;
    }

    @Override // v1.o0
    public final m m() {
        o oVar = o.f18873s;
        s1.a aVar = new s1.a();
        aVar.D = oVar;
        return aVar;
    }

    @Override // v1.o0
    public final void n(m mVar) {
        ((s1.a) mVar).D = o.f18873s;
    }

    public final String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + o.f18873s + ", onPreRotaryScrollEvent=null)";
    }
}
