package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m implements h, Serializable {
    private final int arity;

    public m(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        y.f9668a.getClass();
        String strA = z.a(this);
        l.e("renderLambdaToString(...)", strA);
        return strA;
    }
}
