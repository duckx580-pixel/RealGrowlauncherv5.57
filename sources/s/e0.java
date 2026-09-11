package s;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e0 f14930b = new e0(new p0((g0) null, (n0) null, (t) null, (ud.a) null, (LinkedHashMap) null, 63));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f14931a;

    public e0(p0 p0Var) {
        this.f14931a = p0Var;
    }

    public final e0 a(e0 e0Var) {
        p0 p0Var = this.f14931a;
        g0 g0Var = p0Var.f14979a;
        if (g0Var == null) {
            g0Var = e0Var.f14931a.f14979a;
        }
        n0 n0Var = p0Var.f14980b;
        if (n0Var == null) {
            n0Var = e0Var.f14931a.f14980b;
        }
        t tVar = p0Var.f14981c;
        if (tVar == null) {
            tVar = e0Var.f14931a.f14981c;
        }
        p0 p0Var2 = e0Var.f14931a;
        return new e0(new p0(g0Var, n0Var, tVar, (ud.a) null, rg.y.I(p0Var.f14983e, e0Var.f14931a.f14983e), 16));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e0) && kotlin.jvm.internal.l.a(((e0) obj).f14931a, this.f14931a);
    }

    public final int hashCode() {
        return this.f14931a.hashCode();
    }

    public final String toString() {
        if (equals(f14930b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb2 = new StringBuilder("EnterTransition: \nFade - ");
        p0 p0Var = this.f14931a;
        g0 g0Var = p0Var.f14979a;
        sb2.append(g0Var != null ? g0Var.toString() : null);
        sb2.append(",\nSlide - ");
        n0 n0Var = p0Var.f14980b;
        sb2.append(n0Var != null ? n0Var.toString() : null);
        sb2.append(",\nShrink - ");
        t tVar = p0Var.f14981c;
        sb2.append(tVar != null ? tVar.toString() : null);
        sb2.append(",\nScale - ");
        sb2.append((String) null);
        return sb2.toString();
    }
}
