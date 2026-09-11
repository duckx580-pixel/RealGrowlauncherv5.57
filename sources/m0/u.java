package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11307i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f11308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ eh.e f11310t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(long j, eh.e eVar, int i10, int i11) {
        super(2);
        this.f11307i = i11;
        this.f11308r = j;
        this.f11310t = eVar;
        this.f11309s = i10;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11307i) {
            case 0:
                o0.o oVar = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    o0.p.b(new o0.g1[]{gb.e.e(this.f11308r, m1.f10941a)}, (w0.a) this.f11310t, oVar, ((this.f11309s >> 12) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 8);
                }
                break;
            default:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    o0.p.b(new o0.g1[]{gb.e.e(this.f11308r, m1.f10941a)}, this.f11310t, oVar2, ((this.f11309s >> 3) & R.styleable.AppCompatTheme_windowActionBarOverlay) | 8);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
