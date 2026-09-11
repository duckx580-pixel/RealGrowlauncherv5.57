package qi;

import com.rtsoft.growtopia.R;
import fi.n0;
import java.io.File;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import launcher.powerkuy.growlauncher.manager.ThemeVariable;
import li.w;
import m0.r2;
import o0.d2;
import o0.k;
import o0.o;
import r4.a0;
import s.i;
import ui.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends m implements eh.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13996i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f13997r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f13998s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        super(4);
        this.f13996i = i10;
        this.f13997r = obj;
        this.f13998s = obj2;
    }

    @Override // eh.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        Object objPrevious;
        int i11;
        switch (this.f13996i) {
            case 0:
                z.a aVar = (z.a) obj;
                int iIntValue = ((Number) obj2).intValue();
                o oVar = (o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                a0 a0Var = (a0) this.f13998s;
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
                    File file = (File) ((List) this.f13997r).get(iIntValue);
                    oVar.U(537412220);
                    oVar.U(-1633490746);
                    boolean zH = oVar.h(a0Var) | oVar.h(file);
                    Object objL = oVar.L();
                    if (zH || objL == k.f12458a) {
                        objL = new n0(5, a0Var, file);
                        oVar.g0(objL);
                    }
                    oVar.r(false);
                    r2.a(w0.f.b(oVar, -1141443003, new f(file, 0)), androidx.compose.foundation.a.f(a1.k.f196a, false, (eh.a) objL, 7), w0.f.b(oVar, 1053496328, new f(file, 1)), null, null, null, 0.0f, 0.0f, oVar, 3078, 500);
                    oVar.r(false);
                }
                break;
            case 1:
                i iVar = (i) obj;
                r4.k kVar = (r4.k) obj2;
                o oVar2 = (o) obj3;
                ((Number) obj4).intValue();
                List list = (List) ((d2) this.f13998s).getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (l.a(kVar, (r4.k) objPrevious)) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                r4.k kVar2 = (r4.k) objPrevious;
                if (kVar2 != null) {
                    jj.l.a(kVar2, (x0.c) this.f13997r, w0.f.b(oVar2, -1425390790, new a0.g(11, kVar2, iVar)), oVar2, 456);
                }
                break;
            default:
                z.a aVar2 = (z.a) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                o oVar3 = (o) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                w wVar = (w) this.f13998s;
                if ((iIntValue4 & 14) == 0) {
                    i11 = (oVar3.f(aVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i11 = iIntValue4;
                }
                if ((iIntValue4 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
                    i11 |= oVar3.d(iIntValue3) ? 32 : 16;
                }
                if ((i11 & 731) == 146 && oVar3.D()) {
                    oVar3.P();
                } else {
                    ThemeVariable themeVariable = (ThemeVariable) ((List) this.f13997r).get(iIntValue3);
                    oVar3.U(-1505231119);
                    String name = themeVariable.getName();
                    String hex = themeVariable.getHex();
                    oVar3.U(5004770);
                    boolean zH2 = oVar3.h(wVar);
                    Object objL2 = oVar3.L();
                    if (zH2 || objL2 == k.f12458a) {
                        objL2 = new u(wVar);
                        oVar3.g0(objL2);
                    }
                    oVar3.r(false);
                    ui.a.e(name, hex, (eh.f) objL2, wVar, oVar3, 0);
                    oVar3.r(false);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
