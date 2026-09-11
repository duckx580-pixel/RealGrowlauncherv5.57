package t;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends wg.i implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j f16007i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kotlin.jvm.internal.s f16008r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16009s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f16010t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f16011u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ x0 f16012v;
    public final /* synthetic */ long w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Object obj, x0 x0Var, long j, ug.c cVar2) {
        super(1, cVar2);
        this.f16010t = cVar;
        this.f16011u = obj;
        this.f16012v = x0Var;
        this.w = j;
    }

    @Override // wg.a
    public final ug.c create(ug.c cVar) {
        return new a(this.f16010t, this.f16011u, this.f16012v, this.w, cVar);
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        return ((a) create((ug.c) obj)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        kotlin.jvm.internal.s sVar;
        x0 x0Var = this.f16012v;
        vg.a aVar = vg.a.f18663i;
        int i10 = this.f16009s;
        int i11 = 1;
        c cVar = this.f16010t;
        try {
            if (i10 == 0) {
                androidx.work.v.B(obj);
                cVar.f16024c.f16115s = (o) cVar.f16022a.f16120a.invoke(this.f16011u);
                cVar.f16026e.setValue(x0Var.f16216d);
                cVar.f16025d.setValue(Boolean.TRUE);
                j jVar2 = cVar.f16024c;
                j jVar3 = new j(jVar2.f16113i, jVar2.f16114r.getValue(), d.f(jVar2.f16115s), jVar2.f16116t, Long.MIN_VALUE, jVar2.f16118v);
                kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                long j = this.w;
                b0.m0 m0Var = new b0.m0(cVar, jVar3, sVar2, 14);
                this.f16007i = jVar3;
                this.f16008r = sVar2;
                this.f16009s = 1;
                if (d.b(jVar3, x0Var, j, m0Var, this) == aVar) {
                    return aVar;
                }
                jVar = jVar3;
                sVar = sVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sVar = this.f16008r;
                jVar = this.f16007i;
                androidx.work.v.B(obj);
            }
            if (!sVar.f9662i) {
                i11 = 2;
            }
            c.a(cVar);
            return new a0.f0(jVar, i11, 13);
        } catch (CancellationException e8) {
            c.a(cVar);
            throw e8;
        }
    }
}
