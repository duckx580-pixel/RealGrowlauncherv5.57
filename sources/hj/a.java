package hj;

import java.io.IOException;
import kotlin.jvm.internal.l;
import oj.f0;
import oj.g;
import oj.h0;
import oj.i;
import oj.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f7697i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ fb.a f7699s;

    public a(fb.a aVar) {
        this.f7699s = aVar;
        this.f7697i = new o(((i) aVar.f6056f).d());
    }

    public final void a() {
        fb.a aVar = this.f7699s;
        int i10 = aVar.f6051a;
        if (i10 == 6) {
            return;
        }
        if (i10 != 5) {
            throw new IllegalStateException("state: " + aVar.f6051a);
        }
        o oVar = this.f7697i;
        h0 h0Var = oVar.f13097e;
        oVar.f13097e = h0.f13079d;
        h0Var.a();
        h0Var.b();
        aVar.f6051a = 6;
    }

    @Override // oj.f0
    public final h0 d() {
        return this.f7697i;
    }

    @Override // oj.f0
    public long q(g gVar, long j) throws IOException {
        fb.a aVar = this.f7699s;
        l.f("sink", gVar);
        try {
            return ((i) aVar.f6056f).q(gVar, j);
        } catch (IOException e8) {
            ((fj.l) aVar.f6055e).k();
            a();
            throw e8;
        }
    }
}
