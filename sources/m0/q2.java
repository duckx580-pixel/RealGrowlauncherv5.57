package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11157i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d2.x f11158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.e f11159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11160t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2(d2.x xVar, eh.e eVar, int i10, int i11) {
        super(2);
        this.f11157i = i11;
        this.f11158r = xVar;
        this.f11159s = eVar;
        this.f11160t = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11157i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    l7.a(this.f11158r, this.f11159s, oVar, (this.f11160t >> 3) & R.styleable.AppCompatTheme_windowActionBarOverlay);
                }
                break;
            case 1:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    l7.a(this.f11158r, this.f11159s, oVar2, (this.f11160t >> 15) & R.styleable.AppCompatTheme_windowActionBarOverlay);
                }
                break;
            case 2:
                o0.o oVar3 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar3.D()) {
                    oVar3.P();
                } else {
                    l7.a(this.f11158r, this.f11159s, oVar3, (this.f11160t >> 12) & R.styleable.AppCompatTheme_windowActionBarOverlay);
                }
                break;
            default:
                ((Number) obj2).intValue();
                int iS = o0.p.S(this.f11160t | 1);
                l7.a(this.f11158r, this.f11159s, (o0.o) obj, iS);
                break;
        }
        return qg.o.f13926a;
    }
}
