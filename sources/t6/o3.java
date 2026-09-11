package t6;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o3 extends p4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f16951g;

    public o3(String str, String str2, a0 a0Var, Runnable runnable) {
        super(str, str2, runnable);
        this.f16951g = a0Var;
    }

    public final boolean d() {
        if (this.f16951g.f16702f.i(0, "appsFlyerCount") <= 0) {
            return true;
        }
        s6.h.f15212b.b(11, "Install referrer will not load, the counter >= 1, ");
        return false;
    }
}
