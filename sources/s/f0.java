package s;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f14938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f14939c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f14940a;

    static {
        LinkedHashMap linkedHashMap = null;
        g0 g0Var = null;
        n0 n0Var = null;
        t tVar = null;
        ud.a aVar = null;
        f14938b = new f0(new p0(g0Var, n0Var, tVar, aVar, linkedHashMap, 63));
        f14939c = new f0(new p0(g0Var, n0Var, tVar, aVar, linkedHashMap, 47));
    }

    public f0(p0 p0Var) {
        this.f14940a = p0Var;
    }

    public final f0 a(f0 f0Var) {
        p0 p0Var = this.f14940a;
        g0 g0Var = p0Var.f14979a;
        if (g0Var == null) {
            g0Var = f0Var.f14940a.f14979a;
        }
        n0 n0Var = p0Var.f14980b;
        if (n0Var == null) {
            n0Var = f0Var.f14940a.f14980b;
        }
        t tVar = p0Var.f14981c;
        if (tVar == null) {
            tVar = f0Var.f14940a.f14981c;
        }
        p0 p0Var2 = f0Var.f14940a;
        return new f0(new p0(g0Var, n0Var, tVar, (ud.a) null, p0Var.f14982d || f0Var.f14940a.f14982d, rg.y.I(p0Var.f14983e, f0Var.f14940a.f14983e)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f0) && kotlin.jvm.internal.l.a(((f0) obj).f14940a, this.f14940a);
    }

    public final int hashCode() {
        return this.f14940a.hashCode();
    }

    public final String toString() {
        if (equals(f14938b)) {
            return "ExitTransition.None";
        }
        if (equals(f14939c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb2 = new StringBuilder("ExitTransition: \nFade - ");
        p0 p0Var = this.f14940a;
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
        sb2.append(",\nKeepUntilTransitionsFinished - ");
        sb2.append(p0Var.f14982d);
        return sb2.toString();
    }
}
