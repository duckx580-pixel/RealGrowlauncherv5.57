package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface t extends a1.l {
    default int b(v1.k0 k0Var, g0 g0Var, int i10) {
        return f(new o(k0Var, k0Var.getLayoutDirection()), new j(g0Var, 1, 2, 1), rk.a.G(i10, 0, 13)).a();
    }

    default int c(v1.k0 k0Var, g0 g0Var, int i10) {
        return f(new o(k0Var, k0Var.getLayoutDirection()), new j(g0Var, 2, 2, 1), rk.a.G(i10, 0, 13)).a();
    }

    default int d(v1.k0 k0Var, g0 g0Var, int i10) {
        return f(new o(k0Var, k0Var.getLayoutDirection()), new j(g0Var, 2, 1, 1), rk.a.G(0, i10, 7)).b();
    }

    i0 f(j0 j0Var, g0 g0Var, long j);

    default int g(v1.k0 k0Var, g0 g0Var, int i10) {
        return f(new o(k0Var, k0Var.getLayoutDirection()), new j(g0Var, 1, 1, 1), rk.a.G(0, i10, 7)).b();
    }
}
