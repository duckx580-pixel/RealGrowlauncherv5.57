package ti;

import com.rtsoft.growtopia.R;
import g1.t;
import java.io.File;
import java.util.List;
import m0.l7;
import o0.n0;
import o0.s0;
import xi.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements eh.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f17327i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f17328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f17329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f17330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f17331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s0 f17332v;
    public final /* synthetic */ s0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List list, s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4, s0 s0Var5, s0 s0Var6) {
        super(4);
        this.f17327i = list;
        this.f17328r = s0Var;
        this.f17329s = s0Var2;
        this.f17330t = s0Var3;
        this.f17331u = s0Var4;
        this.f17332v = s0Var5;
        this.w = s0Var6;
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
            File file = (File) this.f17327i.get(iIntValue);
            oVar.U(-1604506628);
            String name = file.getName();
            kotlin.jvm.internal.l.e("getName(...)", name);
            s0 s0Var = this.f17328r;
            long j = kotlin.jvm.internal.l.a((File) s0Var.getValue(), file) ? t.f6909f : t.f6907d;
            a1.n nVarF = androidx.compose.foundation.layout.c.f(a1.k.f196a, 1.0f);
            oVar.U(-1746271574);
            boolean zH = oVar.h(file);
            Object objL = oVar.L();
            n0 n0Var = o0.k.f12458a;
            if (zH || objL == n0Var) {
                objL = new u(file, this.f17329s, this.f17330t, 2);
                oVar.g0(objL);
            }
            eh.a aVar2 = (eh.a) objL;
            oVar.r(false);
            oVar.U(-1224400529);
            boolean zH2 = oVar.h(file);
            Object objL2 = oVar.L();
            if (zH2 || objL2 == n0Var) {
                m mVar = new m(file, s0Var, this.f17331u, this.f17332v, this.w);
                oVar.g0(mVar);
                objL2 = mVar;
            }
            oVar.r(false);
            l7.b(name, androidx.compose.foundation.layout.a.j(androidx.compose.foundation.a.i(nVarF, aVar2, (eh.a) objL2), t6.k.u(8, oVar), t6.k.u(4, oVar)), j, t6.k.v(10, oVar), null, null, i2.o.f8039s, 0L, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 130992);
            oVar.r(false);
        }
        return qg.o.f13926a;
    }
}
