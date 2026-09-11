package wg;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends c implements kotlin.jvm.internal.h {
    private final int arity;

    public i(int i10, ug.c cVar) {
        super(cVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    @Override // wg.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        y.f9668a.getClass();
        String strA = z.a(this);
        l.e("renderLambdaToString(...)", strA);
        return strA;
    }
}
