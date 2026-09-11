package bi;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xh.c f2964a;

    public f0(xh.c cVar) {
        this.f2964a = cVar;
    }

    @Override // bi.a
    public void f(ai.a aVar, int i10, Object obj) {
        i(i10, obj, aVar.k(getDescriptor(), i10, this.f2964a, null));
    }

    public abstract void i(int i10, Object obj, Object obj2);

    @Override // xh.h
    public void serialize(ai.d dVar, Object obj) {
        int iD = d(obj);
        ai.b bVarP = dVar.p(getDescriptor(), iD);
        Iterator itC = c(obj);
        if (iD > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                bVarP.z(getDescriptor(), i10, this.f2964a, itC.next());
                if (i11 >= iD) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        bVarP.b(getDescriptor());
    }
}
