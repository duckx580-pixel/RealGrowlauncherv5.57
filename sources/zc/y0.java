package zc;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends androidx.fragment.app.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b1 f21287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f21288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f21289e;

    public final z0 I() {
        String str;
        b1 b1Var = this.f21287c;
        if (b1Var != null && (str = this.f21288d) != null) {
            return new z0(b1Var, str, this.f21289e, g());
        }
        b5.f(b1Var, "type", this.f21288d, "name");
        throw null;
    }
}
