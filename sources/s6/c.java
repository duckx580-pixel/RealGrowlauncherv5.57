package s6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import qg.o;
import t6.m3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15199i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f15200r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f15201s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj, int i11) {
        super(1);
        this.f15199i = i11;
        this.f15201s = i10;
        this.f15200r = obj;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f15199i) {
            case 0:
                m3 m3Var = (m3) obj;
                l.f(PredefinedUICustomizationFont.defaultFamily, m3Var);
                m3Var.a(this.f15201s, (String) this.f15200r);
                return o.f13926a;
            case 1:
                m3 m3Var2 = (m3) obj;
                l.f(PredefinedUICustomizationFont.defaultFamily, m3Var2);
                m3Var2.n(this.f15201s, (String) this.f15200r);
                return o.f13926a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f15201s, (Collection) this.f15200r));
        }
    }
}
