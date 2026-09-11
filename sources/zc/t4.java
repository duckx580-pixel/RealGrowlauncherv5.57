package zc;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class t4 implements n4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m4 f21128i = new m4();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q4 f21129r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f21130s;

    public t4(q4 q4Var) {
        this.f21129r = q4Var;
    }

    @Override // zc.n4
    public final n4 G(String str) {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f21128i.e(str);
        a();
        return this;
    }

    @Override // zc.n4
    public final n4 U(int i10) {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f21128i.f(i10);
        a();
        return this;
    }

    @Override // zc.n4
    public final n4 X(int i10) {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f21128i.a(i10);
        a();
        return this;
    }

    public final void a() {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        m4 m4Var = this.f21128i;
        long j = m4Var.f21007r;
        if (j == 0) {
            j = 0;
        } else {
            v4 v4Var = m4Var.f21006i.f21209g;
            int i10 = v4Var.f21205c;
            if (i10 < 8192 && v4Var.f21207e) {
                j -= (long) (i10 - v4Var.f21204b);
            }
        }
        if (j > 0) {
            this.f21129r.a(m4Var, j);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        q4 q4Var = this.f21129r;
        if (this.f21130s) {
            return;
        }
        try {
            m4 m4Var = this.f21128i;
            long j = m4Var.f21007r;
            if (j > 0) {
                q4Var.a(m4Var, j);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            q4Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f21130s = true;
        if (th == null) {
            return;
        }
        Charset charset = y4.f21301a;
        throw th;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        m4 m4Var = this.f21128i;
        long j = m4Var.f21007r;
        q4 q4Var = this.f21129r;
        if (j > 0) {
            q4Var.a(m4Var, j);
        }
        q4Var.flush();
    }

    @Override // zc.n4
    public final n4 j(long j) {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        this.f21128i.i(j);
        a();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f21129r + ")";
    }

    @Override // zc.n4
    public final n4 v(p4 p4Var) {
        if (this.f21130s) {
            throw new IllegalStateException(MCCampaignStatus.CLOSED);
        }
        if (p4Var == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        p4Var.d(this.f21128i);
        a();
        return this;
    }
}
