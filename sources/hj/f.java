package hj;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.io.IOException;
import kotlin.jvm.internal.l;
import oj.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7711t;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7698r) {
            return;
        }
        if (!this.f7711t) {
            a();
        }
        this.f7698r = true;
    }

    @Override // hj.a, oj.f0
    public final long q(g gVar, long j) throws IOException {
        l.f("sink", gVar);
        if (j < 0) {
            throw new IllegalArgumentException(k0.g.f(j, "byteCount < 0: ").toString());
        }
        if (this.f7698r) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        if (this.f7711t) {
            return -1L;
        }
        long jQ = super.q(gVar, j);
        if (jQ != -1) {
            return jQ;
        }
        this.f7711t = true;
        a();
        return -1L;
    }
}
