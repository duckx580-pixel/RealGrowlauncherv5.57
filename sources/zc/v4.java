package zc;

/* JADX INFO: loaded from: classes.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v4 f21208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public v4 f21209g;

    public v4() {
        this.f21203a = new byte[8192];
        this.f21207e = true;
        this.f21206d = false;
    }

    public final v4 a() {
        v4 v4Var = this.f21208f;
        v4 v4Var2 = v4Var != this ? v4Var : null;
        v4 v4Var3 = this.f21209g;
        v4Var3.f21208f = v4Var;
        this.f21208f.f21209g = v4Var3;
        this.f21208f = null;
        this.f21209g = null;
        return v4Var2;
    }

    public final void b(v4 v4Var) {
        v4Var.f21209g = this;
        v4Var.f21208f = this.f21208f;
        this.f21208f.f21209g = v4Var;
        this.f21208f = v4Var;
    }

    public v4(v4 v4Var) {
        this(v4Var.f21203a, v4Var.f21204b, v4Var.f21205c);
        v4Var.f21206d = true;
    }

    public v4(byte[] bArr, int i10, int i11) {
        this.f21203a = bArr;
        this.f21204b = i10;
        this.f21205c = i11;
        this.f21207e = false;
        this.f21206d = true;
    }
}
