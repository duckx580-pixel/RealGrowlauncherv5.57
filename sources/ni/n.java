package ni;

import com.rtsoft.growtopia.R;
import fi.y1;
import java.util.List;
import o0.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f12351i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ li.m f12352r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12353s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, li.m mVar, int i10) {
        super(4);
        this.f12351i = list;
        this.f12352r = mVar;
        this.f12353s = i10;
    }

    @Override // eh.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
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
            y1 y1Var = (y1) this.f12351i.get(iIntValue);
            oVar.U(2085960896);
            f.f(y1Var, this.f12352r, this.f12353s, oVar, 0);
            oVar.r(false);
        }
        return qg.o.f13926a;
    }
}
