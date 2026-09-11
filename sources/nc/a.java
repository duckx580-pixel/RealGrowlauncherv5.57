package nc;

import android.os.Handler;
import kotlin.jvm.internal.m;
import lc.q;
import lc.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f12282r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f12283s;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12284i;

    static {
        int i10 = 0;
        f12282r = new a(i10, 0);
        f12283s = new a(i10, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, int i11) {
        super(i10);
        this.f12284i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f12284i) {
            case 0:
                return new v(7);
            default:
                q qVar = new q("managersThread");
                qVar.start();
                qVar.f9916i = new Handler(qVar.getLooper());
                return qVar;
        }
    }
}
