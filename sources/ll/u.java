package ll;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0 f10205c;

    public /* synthetic */ u(r0 r0Var, int i10) {
        this.f10204b = i10;
        this.f10205c = r0Var;
    }

    @Override // ll.r0
    public final void a(h0 h0Var, Object obj) {
        switch (this.f10204b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.f10205c.a(h0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i10 = 0; i10 < length; i10++) {
                        this.f10205c.a(h0Var, Array.get(obj, i10));
                    }
                    break;
                }
                break;
        }
    }
}
