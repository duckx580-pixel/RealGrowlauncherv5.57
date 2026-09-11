package oj;

import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f13094a;

    static {
        s sVar;
        try {
            Class.forName("java.nio.file.Files");
            sVar = new t();
        } catch (ClassNotFoundException unused) {
            sVar = new s();
        }
        f13094a = sVar;
        String str = w.f13114r;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.l.e("getProperty(...)", property);
        hd.b0.c(property);
        ClassLoader classLoader = pj.f.class.getClassLoader();
        kotlin.jvm.internal.l.e("getClassLoader(...)", classLoader);
        new pj.f(classLoader);
    }

    public abstract d0 a(w wVar);

    public abstract void b(w wVar, w wVar2);

    public abstract void c(w wVar);

    public abstract void d(w wVar);

    public final void e(w wVar) {
        kotlin.jvm.internal.l.f("path", wVar);
        d(wVar);
    }

    public final boolean f(w wVar) {
        kotlin.jvm.internal.l.f("path", wVar);
        return i(wVar) != null;
    }

    public abstract List g(w wVar);

    public final c3.f h(w wVar) throws FileNotFoundException {
        kotlin.jvm.internal.l.f("path", wVar);
        c3.f fVarI = i(wVar);
        if (fVarI != null) {
            return fVarI;
        }
        throw new FileNotFoundException("no such file: " + wVar);
    }

    public abstract c3.f i(w wVar);

    public abstract r j(w wVar);

    public abstract d0 k(w wVar);

    public abstract f0 l(w wVar);
}
