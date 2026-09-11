package u;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public wh.a f17409i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f17410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f17411s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e1 f17412t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17413u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f17414v;
    public final /* synthetic */ b1 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e1 f17415x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ wg.i f17416y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17417z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(b1 b1Var, e1 e1Var, eh.e eVar, Object obj, ug.c cVar) {
        super(2, cVar);
        this.w = b1Var;
        this.f17415x = e1Var;
        this.f17416y = (wg.i) eVar;
        this.f17417z = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eh.e, wg.i] */
    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        d1 d1Var = new d1(this.w, this.f17415x, this.f17416y, this.f17417z, cVar);
        d1Var.f17414v = obj;
        return d1Var;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eh.e] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        e1 e1Var;
        Object obj2;
        c1 c1Var;
        wh.a aVar;
        ?? r52;
        e1 e1Var2;
        Throwable th2;
        c1 c1Var2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        vg.a aVar2 = vg.a.f18663i;
        ?? r12 = this.f17413u;
        try {
            try {
                if (r12 == 0) {
                    androidx.work.v.B(obj);
                    ug.f fVarI = ((oh.w) this.f17414v).h().i(oh.t.f12918r);
                    kotlin.jvm.internal.l.c(fVarI);
                    c1 c1Var3 = new c1(this.w, (oh.w0) fVarI);
                    e1Var = this.f17415x;
                    AtomicReference atomicReference3 = e1Var.f17424a;
                    while (true) {
                        c1 c1Var4 = (c1) atomicReference3.get();
                        if (c1Var4 != null && c1Var3.f17404a.compareTo(c1Var4.f17404a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(c1Var4, c1Var3)) {
                            if (atomicReference3.get() != c1Var4) {
                                break;
                            }
                        }
                        if (c1Var4 != null) {
                            c1Var4.f17405b.c(new a1.o("Mutation interrupted", 4));
                        }
                        wh.d dVar = e1Var.f17425b;
                        this.f17414v = c1Var3;
                        this.f17409i = dVar;
                        wg.i iVar = this.f17416y;
                        this.f17410r = iVar;
                        Object obj3 = this.f17417z;
                        this.f17411s = obj3;
                        this.f17412t = e1Var;
                        this.f17413u = 1;
                        if (dVar.c(this) != aVar2) {
                            obj2 = obj3;
                            c1Var = c1Var3;
                            aVar = dVar;
                            r52 = iVar;
                        }
                    }
                    return aVar2;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e1Var2 = (e1) this.f17410r;
                    aVar = this.f17409i;
                    c1Var2 = (c1) this.f17414v;
                    try {
                        androidx.work.v.B(obj);
                        atomicReference2 = e1Var2.f17424a;
                        while (!atomicReference2.compareAndSet(c1Var2, null) && atomicReference2.get() == c1Var2) {
                        }
                        ((wh.d) aVar).d(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = e1Var2.f17424a;
                        while (!atomicReference.compareAndSet(c1Var2, null)) {
                        }
                        throw th2;
                    }
                }
                e1 e1Var3 = this.f17412t;
                obj2 = this.f17411s;
                eh.e eVar = (eh.e) this.f17410r;
                wh.a aVar3 = this.f17409i;
                c1Var = (c1) this.f17414v;
                androidx.work.v.B(obj);
                e1Var = e1Var3;
                aVar = aVar3;
                r52 = eVar;
                this.f17414v = c1Var;
                this.f17409i = aVar;
                this.f17410r = e1Var;
                this.f17411s = null;
                this.f17412t = null;
                this.f17413u = 2;
                Object objInvoke = r52.invoke(obj2, this);
                if (objInvoke != aVar2) {
                    e1Var2 = e1Var;
                    obj = objInvoke;
                    c1Var2 = c1Var;
                    atomicReference2 = e1Var2.f17424a;
                    while (!atomicReference2.compareAndSet(c1Var2, null)) {
                    }
                    ((wh.d) aVar).d(null);
                    return obj;
                }
                return aVar2;
            } catch (Throwable th4) {
                e1Var2 = e1Var;
                th2 = th4;
                c1Var2 = c1Var;
                atomicReference = e1Var2.f17424a;
                while (!atomicReference.compareAndSet(c1Var2, null) && atomicReference.get() == c1Var2) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            ((wh.d) r12).d(null);
            throw th5;
        }
    }
}
