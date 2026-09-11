package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11297i = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.e f11298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w0.a f11299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.e f11300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d2.x f11301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f11302v;
    public final /* synthetic */ long w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f11303x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(eh.e eVar, w0.a aVar, eh.e eVar2, d2.x xVar, long j, long j10, int i10) {
        super(2);
        this.f11298r = eVar;
        this.f11299s = aVar;
        this.f11300t = eVar2;
        this.f11301u = xVar;
        this.f11302v = j;
        this.w = j10;
        this.f11303x = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11297i) {
            case 0:
                ((Number) obj2).intValue();
                y5.c(this.f11299s, this.f11298r, this.f11300t, this.f11301u, this.f11302v, this.w, (o0.o) obj, o0.p.S(this.f11303x | 1));
                break;
            default:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    eh.e eVar = this.f11298r;
                    w0.a aVar = this.f11299s;
                    int i10 = this.f11303x;
                    if (eVar == null) {
                        oVar.U(-2104362496);
                        int i11 = ((i10 >> 27) & 14) | 48 | (i10 & 896);
                        int i12 = i10 >> 9;
                        y5.c(aVar, null, this.f11300t, this.f11301u, this.f11302v, this.w, oVar, i11 | (57344 & i12) | (458752 & i12));
                        oVar.r(false);
                    } else {
                        oVar.U(-2104361902);
                        int i13 = ((i10 >> 27) & 14) | (i10 & R.styleable.AppCompatTheme_windowActionBarOverlay) | (i10 & 896);
                        int i14 = i10 >> 9;
                        y5.c(aVar, this.f11298r, this.f11300t, this.f11301u, this.f11302v, this.w, oVar, i13 | (57344 & i14) | (458752 & i14));
                        oVar.r(false);
                    }
                }
                break;
        }
        return qg.o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(w0.a aVar, eh.e eVar, eh.e eVar2, d2.x xVar, long j, long j10, int i10) {
        super(2);
        this.f11299s = aVar;
        this.f11298r = eVar;
        this.f11300t = eVar2;
        this.f11301u = xVar;
        this.f11302v = j;
        this.w = j10;
        this.f11303x = i10;
    }
}
