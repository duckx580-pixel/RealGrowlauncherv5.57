package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n5 extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11010i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o5 f11011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f11012s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(o5 o5Var, int i10, int i11) {
        super(2);
        this.f11010i = i11;
        switch (i11) {
            case 1:
                w0.a aVar = l1.f10900a;
                this.f11011r = o5Var;
                this.f11012s = i10;
                super(2);
                break;
            default:
                w0.a aVar2 = l1.f10900a;
                this.f11011r = o5Var;
                this.f11012s = i10;
                break;
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f11010i;
        qg.o oVar = qg.o.f13926a;
        int i11 = this.f11012s;
        o5 o5Var = this.f11011r;
        switch (i10) {
            case 0:
                o0.o oVar2 = (o0.o) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    w0.a aVar = l1.f10900a;
                    kotlin.jvm.internal.l.c(o5Var);
                    aVar.invoke(o5Var, oVar2, Integer.valueOf((i11 >> 3) & R.styleable.AppCompatTheme_windowActionBarOverlay));
                }
                break;
            default:
                ((Number) obj2).intValue();
                w0.a aVar2 = l1.f10900a;
                n1.g(o5Var, (o0.o) obj, o0.p.S(i11 | 1));
                break;
        }
        return oVar;
    }
}
