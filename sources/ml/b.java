package ml;

import a4.q;
import bj.s;
import com.google.gson.y;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.l;
import ll.j;
import o1.c;
import oj.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements j {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f11825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Charset f11826t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.gson.j f11827i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f11828r;

    static {
        Pattern pattern = s.f3186d;
        f11825s = c.s("application/json; charset=UTF-8");
        f11826t = Charset.forName("UTF-8");
    }

    public b(com.google.gson.j jVar, y yVar) {
        this.f11827i = jVar;
        this.f11828r = yVar;
    }

    @Override // ll.j
    public final Object b(Object obj) throws IOException {
        g gVar = new g();
        rb.b bVarE = this.f11827i.e(new OutputStreamWriter(new q(gVar), f11826t));
        this.f11828r.c(bVarE, obj);
        bVarE.close();
        oj.j jVarK = gVar.k(gVar.f13078r);
        l.f("content", jVarK);
        return new bj.y(jVarK, f11825s, 1);
    }
}
