package s;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f14979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f14980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f14981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f14983e;

    public p0(g0 g0Var, n0 n0Var, t tVar, ud.a aVar, boolean z3, Map map) {
        this.f14979a = g0Var;
        this.f14980b = n0Var;
        this.f14981c = tVar;
        this.f14982d = z3;
        this.f14983e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.l.a(this.f14979a, p0Var.f14979a) && kotlin.jvm.internal.l.a(this.f14980b, p0Var.f14980b) && kotlin.jvm.internal.l.a(this.f14981c, p0Var.f14981c) && kotlin.jvm.internal.l.a(null, null) && this.f14982d == p0Var.f14982d && kotlin.jvm.internal.l.a(this.f14983e, p0Var.f14983e);
    }

    public final int hashCode() {
        g0 g0Var = this.f14979a;
        int iHashCode = (g0Var == null ? 0 : g0Var.hashCode()) * 31;
        n0 n0Var = this.f14980b;
        int iHashCode2 = (iHashCode + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        t tVar = this.f14981c;
        return this.f14983e.hashCode() + h0.c((((iHashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31) + 0) * 31, 31, this.f14982d);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f14979a + ", slide=" + this.f14980b + ", changeSize=" + this.f14981c + ", scale=" + ((Object) null) + ", hold=" + this.f14982d + ", effectsMap=" + this.f14983e + ')';
    }

    public /* synthetic */ p0(g0 g0Var, n0 n0Var, t tVar, ud.a aVar, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : g0Var, (i10 & 2) != 0 ? null : n0Var, (i10 & 4) != 0 ? null : tVar, (i10 & 8) != 0 ? null : aVar, (i10 & 16) == 0, (i10 & 32) != 0 ? rg.t.f14665i : linkedHashMap);
    }
}
