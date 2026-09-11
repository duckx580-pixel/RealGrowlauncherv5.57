package ll;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f10169a = g0.f10115b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f10170b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ al.h f10171c;

    public l0(al.h hVar) {
        this.f10171c = hVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        m mVarA;
        g0 g0Var = this.f10169a;
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (objArr == null) {
            objArr = this.f10170b;
        }
        g0Var.getClass();
        if (method.isDefault()) {
            return g0Var.b(obj, method, objArr);
        }
        al.h hVar = this.f10171c;
        m mVar = (m) ((ConcurrentHashMap) hVar.f638b).get(method);
        if (mVar == null) {
            synchronized (((ConcurrentHashMap) hVar.f638b)) {
                try {
                    mVarA = (m) ((ConcurrentHashMap) hVar.f638b).get(method);
                    if (mVarA == null) {
                        mVarA = m.a(hVar, method);
                        ((ConcurrentHashMap) hVar.f638b).put(method, mVarA);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            mVar = mVarA;
        }
        s sVar = new s(mVar.f10172a, objArr, mVar.f10173b, mVar.f10174c);
        switch (mVar.f10175d) {
            case 0:
                return mVar.f10176e.j(sVar);
            case 1:
                c cVar = (c) mVar.f10176e.j(sVar);
                ug.c cVar2 = (ug.c) objArr[objArr.length - 1];
                try {
                    oh.f fVar = new oh.f(1, qd.a.j(cVar2));
                    fVar.t(new o(cVar, 0));
                    cVar.n(new ke.f(fVar));
                    Object objQ = fVar.q();
                    vg.a aVar = vg.a.f18663i;
                    return objQ;
                } catch (Exception e8) {
                    return r0.n(e8, cVar2);
                }
            default:
                c cVar3 = (c) mVar.f10176e.j(sVar);
                ug.c cVar4 = (ug.c) objArr[objArr.length - 1];
                try {
                    oh.f fVar2 = new oh.f(1, qd.a.j(cVar4));
                    fVar2.t(new o(cVar3, 1));
                    cVar3.n(new lc.n(17, fVar2));
                    Object objQ2 = fVar2.q();
                    vg.a aVar2 = vg.a.f18663i;
                    return objQ2;
                } catch (Exception e10) {
                    return r0.n(e10, cVar4);
                }
        }
    }
}
