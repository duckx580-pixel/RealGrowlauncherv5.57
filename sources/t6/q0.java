package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16996i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f16997r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(r0 r0Var, int i10) {
        super(0);
        this.f16996i = i10;
        this.f16997r = r0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16996i) {
            case 0:
                u uVarB = ((t) r0.e(this.f16997r)).b();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, uVarB);
                return new s0(uVarB);
            case 1:
                b0 b0VarQ = ((t) r0.e(this.f16997r)).q();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, b0VarQ);
                return b0VarQ;
            case 2:
                a0 a0VarA = ((t) r0.e(this.f16997r)).a();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, a0VarA);
                return a0VarA;
            case 3:
                b2 b2VarN = ((t) r0.e(this.f16997r)).n();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, b2VarN);
                return b2VarN;
            case 4:
                ExecutorService executorServiceY = ((t) r0.e(this.f16997r)).y();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, executorServiceY);
                return executorServiceY;
            case 5:
                x1 x1VarC = ((t) r0.e(this.f16997r)).c();
                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, x1VarC);
                return x1VarC;
            default:
                return new o0(this.f16997r.j());
        }
    }
}
