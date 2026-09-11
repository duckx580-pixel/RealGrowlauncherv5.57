package s6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import qg.o;
import t6.m3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15195i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f15196r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15198t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(boolean z3, String str, int i10, int i11) {
        super(1);
        this.f15195i = i11;
        this.f15198t = i10;
        this.f15197s = str;
        this.f15196r = z3;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f15195i) {
            case 0:
                m3 m3Var = (m3) obj;
                l.f(PredefinedUICustomizationFont.defaultFamily, m3Var);
                m3Var.m(this.f15198t, this.f15197s, this.f15196r);
                break;
            default:
                m3 m3Var2 = (m3) obj;
                l.f(PredefinedUICustomizationFont.defaultFamily, m3Var2);
                m3Var2.l(this.f15198t, this.f15197s, this.f15196r);
                break;
        }
        return o.f13926a;
    }
}
