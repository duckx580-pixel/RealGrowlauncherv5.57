package di;

import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5164i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x f5165r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(x xVar, int i10) {
        super(1);
        this.f5164i = i10;
        this.f5165r = xVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f5164i) {
            case 0:
                ci.k kVar = (ci.k) obj;
                kotlin.jvm.internal.l.f("it", kVar);
                this.f5165r.f9667i = kVar;
                return qg.o.f13926a;
            default:
                q1.k kVar2 = (q1.k) obj;
                x xVar = this.f5165r;
                Object obj2 = xVar.f9667i;
                if (obj2 == null && kVar2.D) {
                    xVar.f9667i = kVar2;
                } else if (obj2 != null) {
                    kVar2.getClass();
                }
                return Boolean.TRUE;
        }
    }
}
