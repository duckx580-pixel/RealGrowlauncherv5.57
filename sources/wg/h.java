package wg;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends g implements kotlin.jvm.internal.h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19258i;

    public h(ug.c cVar) {
        super(cVar);
        this.f19258i = 2;
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f19258i;
    }

    @Override // wg.a
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        y.f9668a.getClass();
        String strA = z.a(this);
        l.e("renderLambdaToString(...)", strA);
        return strA;
    }
}
