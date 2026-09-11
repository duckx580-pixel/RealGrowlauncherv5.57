package t6;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final y f17121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final y f17122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y f17123t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17124i;

    static {
        int i10 = 0;
        f17121r = new y(i10, 0);
        f17122s = new y(i10, 1);
        f17123t = new y(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, int i11) {
        super(i10);
        this.f17124i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17124i) {
            case 0:
                return Executors.newSingleThreadExecutor();
            case 1:
                return new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            default:
                return s6.j.b();
        }
    }
}
