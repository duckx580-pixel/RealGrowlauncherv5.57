package vj;

import ck.n;
import hd.c0;
import java.io.StringReader;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f18722a = new c0(16);

    public static g a(ik.a aVar) {
        g gVar;
        af.a aVar2 = (af.a) aVar;
        aVar2.getClass();
        StringReader stringReader = new StringReader(((StringBuilder) aVar2.f598d).toString());
        try {
            int iC = t.g.c(((af.a) aVar).f596b);
            c0 c0Var = f18722a;
            if (iC == 0) {
                gVar = (g) ck.f.f3579a.c(stringReader, c0Var);
            } else if (iC != 1) {
                ck.j.f3590b.getClass();
                gVar = (g) ck.j.a(stringReader, c0Var);
            } else {
                gVar = (g) n.f3594c.c(stringReader, c0Var);
            }
            stringReader.close();
            return gVar;
        } catch (Throwable th2) {
            try {
                stringReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
