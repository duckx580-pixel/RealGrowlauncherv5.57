package w1;

import android.view.View;
import java.util.Set;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18914i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r2 f18915r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f18916s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(r2 r2Var, eh.e eVar, int i10) {
        super(2);
        this.f18914i = i10;
        this.f18915r = r2Var;
        this.f18916s = eVar;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f18914i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    n0.a(this.f18915r.f18925i, this.f18916s, oVar, 8);
                }
                break;
            default:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    r2 r2Var = this.f18915r;
                    t tVar = r2Var.f18925i;
                    Object tag = tVar.getTag(R.id.inspection_slot_table_set);
                    ug.c cVar = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof fh.a) && !(tag instanceof fh.e))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = tVar.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof fh.a) && !(tag2 instanceof fh.e))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(oVar2.f12515c);
                        oVar2.f12527p = true;
                        oVar2.B = true;
                    }
                    o0.p.d(new a0.j0(12, r2Var, cVar), tVar, oVar2);
                    o0.p.a(z0.b.f20581a.a(set), w0.f.b(oVar2, -1193460702, new q2(r2Var, this.f18916s, 0)), oVar2, 56);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
