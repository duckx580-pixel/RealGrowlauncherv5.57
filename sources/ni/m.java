package ni;

import com.rtsoft.growtopia.R;
import fi.y1;
import java.util.List;
import o0.n0;
import o0.o;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements eh.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12347i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f12348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f12349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f12350t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(List list, Object obj, Object obj2, int i10) {
        super(4);
        this.f12347i = i10;
        this.f12348r = list;
        this.f12349s = obj;
        this.f12350t = obj2;
    }

    @Override // eh.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        switch (this.f12347i) {
            case 0:
                z.a aVar = (z.a) obj;
                int iIntValue = ((Number) obj2).intValue();
                o oVar = (o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 14) == 0) {
                    i10 = (oVar.f(aVar) ? 4 : 2) | iIntValue2;
                } else {
                    i10 = iIntValue2;
                }
                if ((iIntValue2 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
                    i10 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if ((i10 & 731) == 146 && oVar.D()) {
                    oVar.P();
                } else {
                    y1 y1Var = (y1) this.f12348r.get(iIntValue);
                    oVar.U(-139409456);
                    f.f(y1Var, (li.m) this.f12349s, ((li.i) ((s0) this.f12350t).getValue()).f9974b, oVar, 0);
                    oVar.r(false);
                }
                break;
            default:
                z.a aVar2 = (z.a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                o oVar2 = (o) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                li.g gVar = (li.g) this.f12350t;
                if ((iIntValue4 & 14) == 0) {
                    i11 = (oVar2.f(aVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
                    i11 |= oVar2.d(iIntValue3) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && oVar2.D()) {
                    oVar2.P();
                } else {
                    String str = (String) this.f12348r.get(iIntValue3);
                    oVar2.U(-931050989);
                    boolean zA = kotlin.jvm.internal.l.a(((hi.a) this.f12349s).f(), str);
                    oVar2.U(-1633490746);
                    boolean zH = oVar2.h(gVar) | oVar2.f(str);
                    Object objL = oVar2.L();
                    n0 n0Var = o0.k.f12458a;
                    if (zH || objL == n0Var) {
                        objL = new ri.e(gVar, str, 0);
                        oVar2.g0(objL);
                    }
                    eh.a aVar3 = (eh.a) objL;
                    oVar2.r(false);
                    oVar2.U(-1633490746);
                    boolean zH2 = oVar2.h(gVar) | oVar2.f(str);
                    Object objL2 = oVar2.L();
                    if (zH2 || objL2 == n0Var) {
                        objL2 = new ri.e(gVar, str, 1);
                        oVar2.g0(objL2);
                    }
                    oVar2.r(false);
                    ri.a.a(str, zA, aVar3, (eh.a) objL2, oVar2, 0);
                    ud.a.h(androidx.compose.foundation.layout.c.h(a1.k.f196a, t6.k.u(4, oVar2)), oVar2);
                    oVar2.r(false);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
