package z;

import a0.d0;
import androidx.appcompat.widget.w3;
import androidx.work.v;
import b0.u;
import java.util.LinkedHashMap;
import oh.w;
import t.p0;
import v.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20551i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f20553s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, int i10, ug.c cVar) {
        super(2, cVar);
        this.f20551i = 0;
        this.f20553s = qVar;
        this.f20552r = i10;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f20551i) {
            case 0:
                return new p(this.f20553s, this.f20552r, cVar);
            case 1:
                return new p(this.f20553s, cVar, 1);
            default:
                return new p(this.f20553s, cVar, 2);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20551i) {
            case 0:
                p pVar = (p) create((a1) obj, (ug.c) obj2);
                qg.o oVar = qg.o.f13926a;
                pVar.invokeSuspend(oVar);
                break;
        }
        return ((p) create((w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f20551i;
        qg.o oVar = qg.o.f13926a;
        q qVar = this.f20553s;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                v.B(obj);
                int i11 = this.f20552r;
                d0 d0Var = qVar.f20557c;
                d0Var.a(i11, 0);
                d0Var.f45e = null;
                w3 w3Var = qVar.f20569p;
                ((LinkedHashMap) w3Var.f1063i).clear();
                w3Var.f1064r = u.f2509a;
                androidx.compose.ui.node.a aVar2 = qVar.f20566m;
                if (aVar2 != null) {
                    aVar2.j();
                }
                return oVar;
            case 1:
                vg.a aVar3 = vg.a.f18663i;
                int i12 = this.f20552r;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                    return oVar;
                }
                v.B(obj);
                t.j jVar = qVar.f20577y;
                Float f9 = new Float(0.0f);
                p0 p0VarM = t.d.m(400.0f, new Float(0.5f), 1);
                this.f20552r = 1;
                return t.d.d(jVar, f9, p0VarM, this) == aVar3 ? aVar3 : oVar;
            default:
                vg.a aVar4 = vg.a.f18663i;
                int i13 = this.f20552r;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.B(obj);
                    return oVar;
                }
                v.B(obj);
                t.j jVar2 = qVar.f20577y;
                Float f10 = new Float(0.0f);
                p0 p0VarM2 = t.d.m(400.0f, new Float(0.5f), 1);
                this.f20552r = 1;
                return t.d.d(jVar2, f10, p0VarM2, this) == aVar4 ? aVar4 : oVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f20551i = i10;
        this.f20553s = qVar;
    }
}
