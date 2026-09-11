package s;

import com.rtsoft.growtopia.R;
import t1.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14900i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f14901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f14902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f14903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f14904u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(Object obj, long j, long j10, Object obj2, int i10) {
        super(1);
        this.f14900i = i10;
        this.f14903t = obj;
        this.f14901r = j;
        this.f14902s = j10;
        this.f14904u = obj2;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10 = this.f14900i;
        qg.o oVar = qg.o.f13926a;
        Object obj2 = this.f14904u;
        Object obj3 = this.f14903t;
        switch (i10) {
            case 0:
                int i11 = q2.i.f13745c;
                long j = this.f14901r;
                long j10 = this.f14902s;
                ((t1.p0) obj).getClass();
                t1.p0.i((q0) obj3, ((int) (j >> 32)) + ((int) (j10 >> 32)), ((int) (j & 4294967295L)) + ((int) (j10 & 4294967295L)), (b0.m0) obj2);
                break;
            default:
                v1.e0 e0Var = (v1.e0) obj;
                e0Var.b();
                i1.d.y(e0Var, (g1.p) obj3, this.f14901r, this.f14902s, 0.0f, (i1.e) obj2, R.styleable.AppCompatTheme_textColorAlertDialogListItem);
                break;
        }
        return oVar;
    }
}
