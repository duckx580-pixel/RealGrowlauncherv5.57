package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16561a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static hd.b0 f16562b;

    public static final boolean a(p1 p1Var, p1 p1Var2, u uVar) {
        kotlin.jvm.internal.l.f("<this>", p1Var);
        if (p1Var2 == null || ((p1Var2 instanceof o1) && (p1Var instanceof n1))) {
            return true;
        }
        if ((p1Var instanceof o1) && (p1Var2 instanceof n1)) {
            return false;
        }
        return (p1Var.f16610c == p1Var2.f16610c && p1Var.f16611d == p1Var2.f16611d && p1Var2.a(uVar) <= p1Var.a(uVar)) ? false : true;
    }

    public static final rh.h b(eh.e eVar) {
        return rh.w0.f(new a6.i(new d4.c(eVar, null, 2)), -2);
    }
}
