package u;

import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 implements l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f17476b = new n1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f17477c = new n1(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17478a;

    public /* synthetic */ n1(int i10) {
        this.f17478a = i10;
    }

    @Override // u.l1
    public final boolean a() {
        switch (this.f17478a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // u.l1
    public final k1 b(View view, long j, q2.b bVar) {
        switch (this.f17478a) {
            case 0:
                return new m1(new Magnifier(view));
            default:
                return new o1(new Magnifier(view));
        }
    }
}
