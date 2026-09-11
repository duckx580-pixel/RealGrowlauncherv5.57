package hj;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import oj.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7706t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ fb.a f7707u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fb.a aVar, long j) {
        super(aVar);
        this.f7707u = aVar;
        this.f7706t = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zS;
        if (this.f7698r) {
            return;
        }
        if (this.f7706t != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = cj.a.f3572a;
            l.f("timeUnit", timeUnit);
            try {
                zS = cj.a.s(this, 100);
            } catch (IOException unused) {
                zS = false;
            }
            if (!zS) {
                ((fj.l) this.f7707u.f6055e).k();
                a();
            }
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
        long j10 = this.f7706t;
        if (j10 == 0) {
            return -1L;
        }
        long jQ = super.q(gVar, Math.min(j10, j));
        if (jQ == -1) {
            ((fj.l) this.f7707u.f6055e).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j11 = this.f7706t - jQ;
        this.f7706t = j11;
        if (j11 == 0) {
            a();
        }
        return jQ;
    }
}
