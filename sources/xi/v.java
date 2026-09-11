package xi;

import com.rtsoft.growtopia.R;
import java.util.List;
import launcher.powerkuy.growlauncher.api.model.Script;
import o0.n0;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements eh.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f19867i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f19868r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ li.s f19869s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f19870t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f19871u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List list, eh.c cVar, li.s sVar, s0 s0Var, s0 s0Var2) {
        super(4);
        this.f19867i = list;
        this.f19868r = cVar;
        this.f19869s = sVar;
        this.f19870t = s0Var;
        this.f19871u = s0Var2;
    }

    @Override // eh.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        z.a aVar = (z.a) obj;
        int iIntValue = ((Number) obj2).intValue();
        o0.o oVar = (o0.o) obj3;
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
            Script script = (Script) this.f19867i.get(iIntValue);
            oVar.U(891956632);
            oVar.U(-1633490746);
            eh.c cVar = this.f19868r;
            boolean zF = oVar.f(cVar) | oVar.h(script);
            Object objL = oVar.L();
            n0 n0Var = o0.k.f12458a;
            if (zF || objL == n0Var) {
                objL = new s(cVar, script, 0);
                oVar.g0(objL);
            }
            eh.a aVar2 = (eh.a) objL;
            Object objJ = android.support.v4.media.session.a.j(oVar, false, 1849434622);
            if (objJ == n0Var) {
                objJ = t.f19862i;
                oVar.g0(objJ);
            }
            eh.a aVar3 = (eh.a) objJ;
            oVar.r(false);
            oVar.U(-1633490746);
            li.s sVar = this.f19869s;
            boolean zH = oVar.h(sVar) | oVar.h(script);
            Object objL2 = oVar.L();
            if (zH || objL2 == n0Var) {
                objL2 = new fi.n0(7, sVar, script);
                oVar.g0(objL2);
            }
            eh.a aVar4 = (eh.a) objL2;
            oVar.r(false);
            oVar.U(-1746271574);
            boolean zH2 = oVar.h(script);
            Object objL3 = oVar.L();
            if (zH2 || objL3 == n0Var) {
                objL3 = new u(script, this.f19870t, this.f19871u, 0);
                oVar.g0(objL3);
            }
            oVar.r(false);
            b.l(script, aVar2, aVar3, aVar4, (eh.a) objL3, oVar, 384);
            ud.a.h(androidx.compose.foundation.layout.c.h(a1.k.f196a, 8), oVar);
            oVar.r(false);
        }
        return qg.o.f13926a;
    }
}
