package ti;

import java.io.File;
import k2.u;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ File f17309i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f17310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f17311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f17312t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f17313u;

    public m(File file, s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4) {
        this.f17309i = file;
        this.f17310r = s0Var;
        this.f17311s = s0Var2;
        this.f17312t = s0Var3;
        this.f17313u = s0Var4;
    }

    @Override // eh.a
    public final Object invoke() {
        s0 s0Var = this.f17312t;
        s0 s0Var2 = this.f17310r;
        File file = this.f17309i;
        s0Var2.setValue(file);
        try {
            String strE = bh.l.E(file);
            boolean zJ = nh.o.J(strE, "GLSC", false);
            s0 s0Var3 = this.f17311s;
            if (zJ) {
                s0Var3.setValue(Boolean.TRUE);
                s0Var.setValue(new u(6, 0L, "-- # File is encrypted by GrowLauncher #"));
            } else {
                s0Var3.setValue(Boolean.FALSE);
                s0Var.setValue(new u(6, 0L, strE));
            }
            this.f17313u.setValue(((u) s0Var.getValue()).f9196a.f4836i);
        } catch (Exception unused) {
            s0Var.setValue(new u(6, 0L, "-- Error reading file"));
        }
        return qg.o.f13926a;
    }
}
