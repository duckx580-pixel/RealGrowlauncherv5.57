package qk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rk.c f14416a;

    static {
        rk.c cVar = new rk.c(1);
        int i10 = 0;
        while (true) {
            b[] bVarArr = b.Cg;
            if (i10 >= bVarArr.length) {
                f14416a = cVar;
                return;
            } else {
                cVar.s(bVarArr[i10].f14414r, Integer.valueOf(i10));
                i10++;
            }
        }
    }
}
