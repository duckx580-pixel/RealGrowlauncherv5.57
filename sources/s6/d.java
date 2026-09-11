package s6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import qg.o;
import t6.m3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15202i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f15203r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f15204s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f15205t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f15206u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Throwable f15207v;
    public final boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i10, String str, Throwable th2, boolean z3, boolean z10, boolean z11, boolean z12) {
        super(1);
        this.f15205t = i10;
        this.f15202i = str;
        this.f15207v = th2;
        this.f15206u = z3;
        this.w = z10;
        this.f15204s = z11;
        this.f15203r = z12;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        m3 m3Var = (m3) obj;
        l.f(PredefinedUICustomizationFont.defaultFamily, m3Var);
        m3Var.f(this.f15205t, this.f15202i, this.f15207v, this.f15206u, this.w, this.f15204s, this.f15203r);
        return o.f13926a;
    }
}
