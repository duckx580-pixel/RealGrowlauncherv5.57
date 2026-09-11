package s6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import t6.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f15208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f f15209s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15210i;

    static {
        int i10 = 0;
        f15208r = new f(i10, 0);
        f15209s = new f(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10, int i11) {
        super(i10);
        this.f15210i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f15210i) {
            case 0:
                Object value = z.f17134a.getValue();
                l.e(PredefinedUICustomizationFont.defaultFamily, value);
                return (ExecutorService) value;
            default:
                return new LinkedHashSet();
        }
    }
}
