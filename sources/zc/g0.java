package zc;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f20835i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient p4 f20836r;

    public g0(k0 k0Var, p4 p4Var) {
        if (k0Var == null) {
            throw new NullPointerException("adapter == null");
        }
        if (p4Var == null) {
            throw new NullPointerException("unknownFields == null");
        }
        this.f20836r = p4Var;
    }

    public final p4 a() {
        p4 p4Var = this.f20836r;
        return p4Var != null ? p4Var : p4.f21062u;
    }
}
