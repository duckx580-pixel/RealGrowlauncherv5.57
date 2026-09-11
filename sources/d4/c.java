package d4;

import androidx.work.v;
import fe.u0;
import java.util.Collections;
import java.util.Map;
import kotlin.jvm.internal.l;
import oh.x;
import qg.o;
import rg.y;
import wg.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4927i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f4929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f4930t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(eh.e eVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f4927i = i10;
        switch (i10) {
            case 1:
                this.f4930t = (i) eVar;
                super(2, cVar);
                break;
            case 2:
                this.f4930t = (i) eVar;
                super(2, cVar);
                break;
            default:
                this.f4930t = (i) eVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.e, wg.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eh.e, wg.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eh.e, wg.i] */
    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f4927i) {
            case 0:
                c cVar2 = new c(this.f4930t, cVar, 0);
                cVar2.f4929s = obj;
                return cVar2;
            case 1:
                c cVar3 = new c(this.f4930t, cVar, 1);
                cVar3.f4929s = obj;
                return cVar3;
            default:
                c cVar4 = new c(this.f4930t, cVar, 2);
                cVar4.f4929s = obj;
                return cVar4;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4927i) {
            case 0:
                return ((c) create((b) obj, (ug.c) obj2)).invokeSuspend(o.f13926a);
            case 1:
                return ((c) create((b) obj, (ug.c) obj2)).invokeSuspend(o.f13926a);
            default:
                return ((c) create((rh.i) obj, (ug.c) obj2)).invokeSuspend(o.f13926a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eh.e, wg.i] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eh.e, wg.i] */
    /* JADX WARN: Type inference failed for: r6v12, types: [eh.e, wg.i] */
    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4927i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f4928r;
                if (i10 == 0) {
                    v.B(obj);
                    b bVar = (b) this.f4929s;
                    this.f4928r = 1;
                    obj = this.f4930t.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                }
                b bVar2 = (b) obj;
                bVar2.f4926b.set(true);
                return bVar2;
            case 1:
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f4928r;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.f4929s;
                    v.B(obj);
                    return bVar3;
                }
                v.B(obj);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(((b) this.f4929s).f4925a);
                l.e("unmodifiableMap(preferencesMap)", mapUnmodifiableMap);
                b bVar4 = new b(y.M(mapUnmodifiableMap), false);
                this.f4929s = bVar4;
                this.f4928r = 1;
                return this.f4930t.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
            default:
                vg.a aVar3 = vg.a.f18663i;
                int i12 = this.f4928r;
                if (i12 == 0) {
                    v.B(obj);
                    u0 u0Var = new u0((rh.i) this.f4929s, (eh.e) this.f4930t, (ug.c) null);
                    this.f4928r = 1;
                    if (x.g(u0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                }
                return o.f13926a;
        }
    }
}
