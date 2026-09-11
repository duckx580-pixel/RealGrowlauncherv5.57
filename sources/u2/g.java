package u2;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17582i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f17583r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(s sVar, int i10) {
        super(1);
        this.f17582i = i10;
        this.f17583r = sVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f17582i) {
            case 0:
                t1.p pVarV = ((t1.p) obj).v();
                kotlin.jvm.internal.l.c(pVarV);
                this.f17583r.k(pVarV);
                break;
            case 1:
                q2.k kVar = new q2.k(((q2.k) obj).f13751a);
                s sVar = this.f17583r;
                sVar.m113setPopupContentSizefhxjrPA(kVar);
                sVar.l();
                break;
            default:
                eh.a aVar = (eh.a) obj;
                s sVar2 = this.f17583r;
                Handler handler = sVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = sVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new t2.a(aVar, 2));
                    }
                }
                break;
        }
        return qg.o.f13926a;
    }
}
