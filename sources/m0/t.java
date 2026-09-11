package m0;

import com.rtsoft.growtopia.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11266i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11267r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f11268s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11269t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11270u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f11271v;
    public final /* synthetic */ Object w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f11273y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(a1.n nVar, g1.k0 k0Var, l0 l0Var, o0 o0Var, u.p pVar, w0.a aVar, int i10, int i11) {
        super(2);
        this.f11267r = nVar;
        this.f11271v = k0Var;
        this.w = l0Var;
        this.f11272x = o0Var;
        this.f11273y = pVar;
        this.f11268s = aVar;
        this.f11269t = i10;
        this.f11270u = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        switch (this.f11266i) {
            case 0:
                ((Number) obj2).intValue();
                y.b((w0.a) this.f11268s, (a1.n) this.f11267r, (eh.e) this.f11271v, (eh.f) this.w, (y.y0) this.f11272x, (m7) this.f11273y, (o0.o) obj, o0.p.S(this.f11269t | 1), this.f11270u);
                break;
            case 1:
                ((Number) obj2).intValue();
                n1.b((a1.n) this.f11267r, (g1.k0) this.f11271v, (l0) this.w, (o0) this.f11272x, (u.p) this.f11273y, (w0.a) this.f11268s, (o0.o) obj, o0.p.S(this.f11269t | 1), this.f11270u);
                break;
            case 2:
                o0.o oVar = (o0.o) obj;
                int iIntValue = ((Number) obj2).intValue();
                t1.a1 a1Var = (t1.a1) this.f11267r;
                if ((iIntValue & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    y.b0 b0Var = new y.b0((y.y0) this.f11272x, a1Var);
                    ((w0.a) this.f11268s).invoke(new y.n0(androidx.compose.foundation.layout.a.d(b0Var, a1Var.getLayoutDirection()), ((ArrayList) this.f11271v).isEmpty() ? b0Var.c() : a1Var.K(this.f11269t), androidx.compose.foundation.layout.a.c(b0Var, a1Var.getLayoutDirection()), (((ArrayList) this.w).isEmpty() || (num = (Integer) this.f11273y) == null) ? b0Var.a() : a1Var.K(num.intValue())), oVar, Integer.valueOf((this.f11270u >> 3) & R.styleable.AppCompatTheme_windowActionBarOverlay));
                }
                break;
            default:
                ((Number) obj2).intValue();
                o1.c.b((r4.a0) this.f11268s, (String) this.f11271v, (a1.n) this.f11267r, (eh.c) this.w, (eh.c) this.f11272x, (eh.c) this.f11273y, (o0.o) obj, o0.p.S(this.f11269t | 1), this.f11270u);
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r4.a0 a0Var, String str, a1.n nVar, eh.c cVar, eh.c cVar2, eh.c cVar3, eh.c cVar4, eh.c cVar5, int i10, int i11) {
        super(2);
        this.f11268s = a0Var;
        this.f11271v = str;
        this.f11267r = nVar;
        this.w = cVar;
        this.f11272x = cVar2;
        this.f11273y = cVar5;
        this.f11269t = i10;
        this.f11270u = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w0.a aVar, a1.n nVar, eh.e eVar, eh.f fVar, y.y0 y0Var, m7 m7Var, int i10, int i11) {
        super(2);
        this.f11268s = aVar;
        this.f11267r = nVar;
        this.f11271v = eVar;
        this.w = fVar;
        this.f11272x = y0Var;
        this.f11273y = m7Var;
        this.f11269t = i10;
        this.f11270u = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(y.y0 y0Var, t1.a1 a1Var, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, w0.a aVar, int i11) {
        super(2);
        this.f11272x = y0Var;
        this.f11267r = a1Var;
        this.f11271v = arrayList;
        this.f11269t = i10;
        this.w = arrayList2;
        this.f11273y = num;
        this.f11268s = aVar;
        this.f11270u = i11;
    }
}
