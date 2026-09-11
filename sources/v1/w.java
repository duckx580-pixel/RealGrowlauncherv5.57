package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface w extends l {
    default int b(k0 k0Var, t1.g0 g0Var, int i10) {
        return f(new t1.o(k0Var, k0Var.getLayoutDirection()), new t1.j(g0Var, 1, 2, 2), rk.a.G(i10, 0, 13)).a();
    }

    default int c(k0 k0Var, t1.g0 g0Var, int i10) {
        return f(new t1.o(k0Var, k0Var.getLayoutDirection()), new t1.j(g0Var, 2, 2, 2), rk.a.G(i10, 0, 13)).a();
    }

    default int d(k0 k0Var, t1.g0 g0Var, int i10) {
        return f(new t1.o(k0Var, k0Var.getLayoutDirection()), new t1.j(g0Var, 2, 1, 2), rk.a.G(0, i10, 7)).b();
    }

    t1.i0 f(t1.j0 j0Var, t1.g0 g0Var, long j);

    default int g(k0 k0Var, t1.g0 g0Var, int i10) {
        return f(new t1.o(k0Var, k0Var.getLayoutDirection()), new t1.j(g0Var, 1, 1, 2), rk.a.G(0, i10, 7)).b();
    }
}
