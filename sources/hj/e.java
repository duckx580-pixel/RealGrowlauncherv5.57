package hj;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import oj.d0;
import oj.g;
import oj.h;
import oj.h0;
import oj.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o f7708i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f7709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ fb.a f7710s;

    public e(fb.a aVar) {
        this.f7710s = aVar;
        this.f7708i = new o(((h) aVar.f6057g).d());
    }

    @Override // oj.d0
    public final void P(g gVar, long j) {
        if (this.f7709r) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        cj.a.c(gVar.f13078r, 0L, j);
        ((h) this.f7710s.f6057g).P(gVar, j);
    }

    @Override // oj.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7709r) {
            return;
        }
        this.f7709r = true;
        o oVar = this.f7708i;
        h0 h0Var = oVar.f13097e;
        oVar.f13097e = h0.f13079d;
        h0Var.a();
        h0Var.b();
        this.f7710s.f6051a = 3;
    }

    @Override // oj.d0
    public final h0 d() {
        return this.f7708i;
    }

    @Override // oj.d0, java.io.Flushable
    public final void flush() {
        if (this.f7709r) {
            return;
        }
        ((h) this.f7710s.f6057g).flush();
    }
}
