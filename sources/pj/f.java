package pj;

import hd.b0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import oj.d0;
import oj.f0;
import oj.l;
import oj.r;
import oj.s;
import oj.w;
import qg.k;
import rg.m;
import rg.q;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w f13533e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClassLoader f13534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f13535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f13536d;

    static {
        String str = w.f13114r;
        f13533e = b0.c("/");
    }

    public f(ClassLoader classLoader) {
        s sVar = l.f13094a;
        kotlin.jvm.internal.l.f("systemFileSystem", sVar);
        this.f13534b = classLoader;
        this.f13535c = sVar;
        this.f13536d = android.support.v4.media.session.b.q(new p1.g(1, this));
    }

    @Override // oj.l
    public final d0 a(w wVar) throws IOException {
        kotlin.jvm.internal.l.f("file", wVar);
        throw new IOException(this + " is read-only");
    }

    @Override // oj.l
    public final void b(w wVar, w wVar2) throws IOException {
        kotlin.jvm.internal.l.f("source", wVar);
        kotlin.jvm.internal.l.f("target", wVar2);
        throw new IOException(this + " is read-only");
    }

    @Override // oj.l
    public final void c(w wVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override // oj.l
    public final void d(w wVar) throws IOException {
        kotlin.jvm.internal.l.f("path", wVar);
        throw new IOException(this + " is read-only");
    }

    @Override // oj.l
    public final List g(w wVar) throws FileNotFoundException {
        w wVar2 = f13533e;
        wVar2.getClass();
        String strP = c.b(wVar2, wVar, true).c(wVar2).f13115i.p();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z3 = false;
        for (qg.g gVar : (List) this.f13536d.getValue()) {
            l lVar = (l) gVar.f13911i;
            w wVar3 = (w) gVar.f13912r;
            try {
                List listG = lVar.g(wVar3.d(strP));
                ArrayList<w> arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (n9.e.f((w) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(m.O(arrayList, 10));
                for (w wVar4 : arrayList) {
                    kotlin.jvm.internal.l.f("<this>", wVar4);
                    String strReplace = nh.h.b0(wVar4.f13115i.p(), wVar3.f13115i.p()).replace('\\', '/');
                    kotlin.jvm.internal.l.e("replace(...)", strReplace);
                    arrayList2.add(wVar2.d(strReplace));
                }
                q.S(linkedHashSet, arrayList2);
                z3 = true;
            } catch (IOException unused) {
            }
        }
        if (z3) {
            return rg.l.x0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // oj.l
    public final c3.f i(w wVar) {
        kotlin.jvm.internal.l.f("path", wVar);
        if (!n9.e.f(wVar)) {
            return null;
        }
        w wVar2 = f13533e;
        wVar2.getClass();
        String strP = c.b(wVar2, wVar, true).c(wVar2).f13115i.p();
        for (qg.g gVar : (List) this.f13536d.getValue()) {
            c3.f fVarI = ((l) gVar.f13911i).i(((w) gVar.f13912r).d(strP));
            if (fVarI != null) {
                return fVarI;
            }
        }
        return null;
    }

    @Override // oj.l
    public final r j(w wVar) throws FileNotFoundException {
        if (!n9.e.f(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        w wVar2 = f13533e;
        wVar2.getClass();
        String strP = c.b(wVar2, wVar, true).c(wVar2).f13115i.p();
        for (qg.g gVar : (List) this.f13536d.getValue()) {
            try {
                return ((l) gVar.f13911i).j(((w) gVar.f13912r).d(strP));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }

    @Override // oj.l
    public final d0 k(w wVar) throws IOException {
        kotlin.jvm.internal.l.f("file", wVar);
        throw new IOException(this + " is read-only");
    }

    @Override // oj.l
    public final f0 l(w wVar) throws FileNotFoundException {
        kotlin.jvm.internal.l.f("file", wVar);
        if (!n9.e.f(wVar)) {
            throw new FileNotFoundException("file not found: " + wVar);
        }
        w wVar2 = f13533e;
        wVar2.getClass();
        InputStream resourceAsStream = this.f13534b.getResourceAsStream(c.b(wVar2, wVar, false).c(wVar2).f13115i.p());
        if (resourceAsStream != null) {
            return jj.d.M(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + wVar);
    }
}
