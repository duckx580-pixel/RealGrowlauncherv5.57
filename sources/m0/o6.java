package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o6 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f11090i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x.k f11091r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n6 f11092s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g1.k0 f11093t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11094u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11095v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(boolean z3, x.k kVar, n6 n6Var, g1.k0 k0Var, int i10, int i11) {
        super(2);
        this.f11090i = z3;
        this.f11091r = kVar;
        this.f11092s = n6Var;
        this.f11093t = k0Var;
        this.f11094u = i10;
        this.f11095v = i11;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        o0.o oVar = (o0.o) obj;
        if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
            oVar.P();
        } else {
            r6 r6Var = r6.f11212a;
            int i10 = this.f11094u;
            int i11 = ((i10 >> 9) & 896) | ((i10 >> 6) & 14) | 196608 | ((i10 >> 15) & R.styleable.AppCompatTheme_windowActionBarOverlay);
            int i12 = this.f11095v;
            r6Var.a(this.f11090i, this.f11091r, this.f11092s, this.f11093t, oVar, i11 | ((i12 >> 6) & 7168) | (i12 & 57344));
        }
        return qg.o.f13926a;
    }
}
