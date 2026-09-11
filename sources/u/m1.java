package u;

import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class m1 implements k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Magnifier f17468a;

    public m1(Magnifier magnifier) {
        this.f17468a = magnifier;
    }

    @Override // u.k1
    public void a(long j, long j10) {
        this.f17468a.show(f1.c.d(j), f1.c.e(j));
    }

    public final void b() {
        this.f17468a.dismiss();
    }

    public final long c() {
        return te.a.c(this.f17468a.getWidth(), this.f17468a.getHeight());
    }

    public final void d() {
        this.f17468a.update();
    }
}
