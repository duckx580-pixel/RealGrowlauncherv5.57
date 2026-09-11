package c5;

import a1.k;
import android.database.sqlite.SQLiteQuery;
import com.rtsoft.growtopia.R;
import i2.i0;
import i2.j0;
import i2.o;
import i2.p;
import i2.u;
import i2.v;
import i2.x;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements eh.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3347i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f3348r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj) {
        super(4);
        this.f3347i = i10;
        this.f3348r = obj;
    }

    @Override // eh.g
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f3347i) {
            case 0:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                b5.e eVar = (b5.e) this.f3348r;
                l.c(sQLiteQuery);
                eVar.a(new h(sQLiteQuery));
                break;
            case 1:
                int i10 = ((u) obj3).f8053a;
                int i11 = ((v) obj4).f8054a;
                m2.c cVar = (m2.c) this.f3348r;
                j0 j0VarB = ((p) cVar.f11554u).b((o) obj, (x) obj2, i10, i11);
                if (!(j0VarB instanceof i0)) {
                    mf.e eVar2 = new mf.e(j0VarB, cVar.f11558z);
                    cVar.f11558z = eVar2;
                    Object obj5 = eVar2.f11711t;
                    l.d("null cannot be cast to non-null type android.graphics.Typeface", obj5);
                } else {
                    Object obj6 = ((i0) j0VarB).f8029i;
                    l.d("null cannot be cast to non-null type android.graphics.Typeface", obj6);
                }
                break;
            case 2:
                z.a aVar = (z.a) obj;
                int iIntValue = ((Number) obj2).intValue();
                o0.o oVar = (o0.o) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i12 = (iIntValue2 & 14) == 0 ? (oVar.f(aVar) ? 4 : 2) | iIntValue2 : iIntValue2;
                if ((iIntValue2 & R.styleable.AppCompatTheme_windowActionBarOverlay) == 0) {
                    i12 |= oVar.d(iIntValue) ? 32 : 16;
                }
                if ((i12 & 731) == 146 && oVar.D()) {
                    oVar.P();
                } else {
                    pi.g gVar = (pi.g) ((List) this.f3348r).get(iIntValue);
                    oVar.U(419160108);
                    pi.c.j(gVar, oVar, 8);
                    ud.a.h(androidx.compose.foundation.layout.c.h(k.f196a, t6.k.u(8, oVar)), oVar);
                    oVar.r(false);
                }
                break;
            default:
                z.a aVar2 = (z.a) obj;
                ((Number) obj2).intValue();
                o0.o oVar2 = (o0.o) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 14) == 0) {
                    iIntValue3 |= oVar2.f(aVar2) ? 4 : 2;
                }
                if ((iIntValue3 & 651) == 130 && oVar2.D()) {
                    oVar2.P();
                } else {
                    ((w0.a) this.f3348r).invoke(aVar2, oVar2, Integer.valueOf(iIntValue3 & 14));
                }
                break;
        }
        return qg.o.f13926a;
    }
}
