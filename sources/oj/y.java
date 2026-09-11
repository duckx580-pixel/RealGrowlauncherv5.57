package oj;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d0 f13122i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f13123r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13124s;

    public y(d0 d0Var) {
        kotlin.jvm.internal.l.f("sink", d0Var);
        this.f13122i = d0Var;
        this.f13123r = new g();
    }

    @Override // oj.h
    public final h A(int i10, byte[] bArr) {
        kotlin.jvm.internal.l.f("source", bArr);
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.write(bArr, 0, i10);
        a();
        return this;
    }

    @Override // oj.h
    public final h B(String str) {
        kotlin.jvm.internal.l.f("string", str);
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.l0(str);
        a();
        return this;
    }

    @Override // oj.h
    public final h I(long j) {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.h0(j);
        a();
        return this;
    }

    @Override // oj.h
    public final h J(j jVar) {
        kotlin.jvm.internal.l.f("byteString", jVar);
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.e0(jVar);
        a();
        return this;
    }

    @Override // oj.d0
    public final void P(g gVar, long j) {
        kotlin.jvm.internal.l.f("source", gVar);
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.P(gVar, j);
        a();
    }

    @Override // oj.h
    public final long Q(f0 f0Var) {
        long j = 0;
        while (true) {
            long jQ = ((c) f0Var).q(this.f13123r, 8192L);
            if (jQ == -1) {
                return j;
            }
            j += jQ;
            a();
        }
    }

    @Override // oj.h
    public final h Z(long j) {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.g0(j);
        a();
        return this;
    }

    public final h a() {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        g gVar = this.f13123r;
        long jC = gVar.c();
        if (jC > 0) {
            this.f13122i.P(gVar, jC);
        }
        return this;
    }

    @Override // oj.h
    public final g b() {
        return this.f13123r;
    }

    @Override // oj.d0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d0 d0Var = this.f13122i;
        if (this.f13124s) {
            return;
        }
        try {
            g gVar = this.f13123r;
            long j = gVar.f13078r;
            if (j > 0) {
                d0Var.P(gVar, j);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            d0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f13124s = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // oj.d0
    public final h0 d() {
        return this.f13122i.d();
    }

    @Override // oj.h, oj.d0, java.io.Flushable
    public final void flush() {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        g gVar = this.f13123r;
        long j = gVar.f13078r;
        d0 d0Var = this.f13122i;
        if (j > 0) {
            d0Var.P(gVar, j);
        }
        d0Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13124s;
    }

    public final String toString() {
        return "buffer(" + this.f13122i + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        kotlin.jvm.internal.l.f("source", byteBuffer);
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        int iWrite = this.f13123r.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // oj.h
    public final h writeByte(int i10) {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.f0(i10);
        a();
        return this;
    }

    @Override // oj.h
    public final h writeInt(int i10) {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.i0(i10);
        a();
        return this;
    }

    @Override // oj.h
    public final h writeShort(int i10) {
        if (this.f13124s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f13123r.j0(i10);
        a();
        return this;
    }

    @Override // oj.h
    public final h write(byte[] bArr) {
        kotlin.jvm.internal.l.f("source", bArr);
        if (!this.f13124s) {
            this.f13123r.write(bArr, 0, bArr.length);
            a();
            return this;
        }
        throw new IllegalStateException(MCCampaignStatus.CLOSED);
    }
}
