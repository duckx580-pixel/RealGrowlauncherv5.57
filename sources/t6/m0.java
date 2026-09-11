package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final m0 f16920r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final m0 f16921s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16922i;

    static {
        int i10 = 1;
        f16920r = new m0(i10, 0);
        f16921s = new m0(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i10, int i11) {
        super(i10);
        this.f16922i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f16922i) {
            case 0:
                StackTraceElement stackTraceElement = (StackTraceElement) obj;
                kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, stackTraceElement);
                return "at " + stackTraceElement;
            default:
                kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, (n1) obj);
                return qg.o.f13926a;
        }
    }
}
