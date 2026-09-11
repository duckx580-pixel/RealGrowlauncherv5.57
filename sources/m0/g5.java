package m0;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10698i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10699r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5(int i10, ug.c cVar, int i11) {
        super(i10, cVar);
        this.f10698i = i11;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f10698i) {
            case 0:
                g5 g5Var = new g5(2, cVar, 0);
                g5Var.f10699r = obj;
                return g5Var;
            case 1:
                g5 g5Var2 = new g5(2, cVar, 1);
                g5Var2.f10699r = obj;
                return g5Var2;
            case 2:
                g5 g5Var3 = new g5(2, cVar, 2);
                g5Var3.f10699r = obj;
                return g5Var3;
            case 3:
                g5 g5Var4 = new g5(2, cVar, 3);
                g5Var4.f10699r = obj;
                return g5Var4;
            default:
                g5 g5Var5 = new g5(2, cVar, 4);
                g5Var5.f10699r = obj;
                return g5Var5;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10698i) {
            case 0:
                g5 g5Var = (g5) create((v.d0) obj, (ug.c) obj2);
                qg.o oVar = qg.o.f13926a;
                g5Var.invokeSuspend(oVar);
                return oVar;
            case 1:
                return ((g5) create((o0.i1) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 2:
                return ((g5) create((rh.y0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 3:
                return ((g5) create((rg.v) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            default:
                g5 g5Var2 = (g5) create((t4.z) obj, (ug.c) obj2);
                qg.o oVar2 = qg.o.f13926a;
                g5Var2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f10698i;
        qg.o oVar = qg.o.f13926a;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                androidx.work.v.B(obj);
                ((v.d0) this.f10699r).b(0.0f);
                return oVar;
            case 1:
                vg.a aVar2 = vg.a.f18663i;
                androidx.work.v.B(obj);
                return Boolean.valueOf(((o0.i1) this.f10699r) == o0.i1.f12442i);
            case 2:
                vg.a aVar3 = vg.a.f18663i;
                androidx.work.v.B(obj);
                return Boolean.valueOf(((rh.y0) this.f10699r) != rh.y0.f14854i);
            case 3:
                vg.a aVar4 = vg.a.f18663i;
                androidx.work.v.B(obj);
                return Boolean.valueOf(((rg.v) this.f10699r) != null);
            default:
                vg.a aVar5 = vg.a.f18663i;
                androidx.work.v.B(obj);
                t4.z zVar = (t4.z) this.f10699r;
                if (t4.l.f16562b != null && Log.isLoggable("Paging", 2)) {
                    hd.b0.e(2, "Sent " + zVar);
                }
                return oVar;
        }
    }
}
