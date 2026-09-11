package ij;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Closeable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f8393v = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final oj.g f8394i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f8395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f8397t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final oj.h f8398u;

    public w(oj.y yVar) {
        kotlin.jvm.internal.l.f("sink", yVar);
        this.f8398u = yVar;
        oj.g gVar = new oj.g();
        this.f8394i = gVar;
        this.f8395r = 16384;
        this.f8397t = new d(gVar);
    }

    public final synchronized void a(z zVar) {
        try {
            kotlin.jvm.internal.l.f("peerSettings", zVar);
            if (this.f8396s) {
                throw new IOException(MCCampaignStatus.CLOSED);
            }
            int i10 = this.f8395r;
            int i11 = zVar.f8403a;
            if ((i11 & 32) != 0) {
                i10 = zVar.f8404b[5];
            }
            this.f8395r = i10;
            if (((i11 & 2) != 0 ? zVar.f8404b[1] : -1) != -1) {
                d dVar = this.f8397t;
                int i12 = (i11 & 2) != 0 ? zVar.f8404b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = dVar.f8312c;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        dVar.f8310a = Math.min(dVar.f8310a, iMin);
                    }
                    dVar.f8311b = true;
                    dVar.f8312c = iMin;
                    int i14 = dVar.f8316g;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            b[] bVarArr = dVar.f8313d;
                            rg.k.y0(0, bVarArr.length, null, bVarArr);
                            dVar.f8314e = dVar.f8313d.length - 1;
                            dVar.f8315f = 0;
                            dVar.f8316g = 0;
                        } else {
                            dVar.a(i14 - iMin);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.f8398u.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(boolean z3, int i10, oj.g gVar, int i11) {
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        e(i10, i11, 0, z3 ? 1 : 0);
        if (i11 > 0) {
            oj.h hVar = this.f8398u;
            kotlin.jvm.internal.l.c(gVar);
            hVar.P(gVar, i11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f8396s = true;
        this.f8398u.close();
    }

    public final void e(int i10, int i11, int i12, int i13) {
        Level level = Level.FINE;
        Logger logger = f8393v;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(i10, i11, i12, i13, false));
        }
        if (i11 > this.f8395r) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f8395r + ": " + i11).toString());
        }
        if ((((int) 2147483648L) & i10) != 0) {
            throw new IllegalArgumentException(k0.g.d(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = cj.a.f3572a;
        oj.h hVar = this.f8398u;
        kotlin.jvm.internal.l.f("$this$writeMedium", hVar);
        hVar.writeByte((i11 >>> 16) & 255);
        hVar.writeByte((i11 >>> 8) & 255);
        hVar.writeByte(i11 & 255);
        hVar.writeByte(i12 & 255);
        hVar.writeByte(i13 & 255);
        hVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void f(byte[] bArr, int i10, int i11) {
        k0.g.s(i11, "errorCode");
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        if (t.g.c(i11) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        e(0, bArr.length + 8, 7, 0);
        this.f8398u.writeInt(i10);
        this.f8398u.writeInt(t.g.c(i11));
        if (bArr.length != 0) {
            this.f8398u.write(bArr);
        }
        this.f8398u.flush();
    }

    public final synchronized void flush() {
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        this.f8398u.flush();
    }

    public final synchronized void g(boolean z3, int i10, ArrayList arrayList) {
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        this.f8397t.d(arrayList);
        long j = this.f8394i.f13078r;
        long jMin = Math.min(this.f8395r, j);
        int i11 = j == jMin ? 4 : 0;
        if (z3) {
            i11 |= 1;
        }
        e(i10, (int) jMin, 1, i11);
        this.f8398u.P(this.f8394i, jMin);
        if (j > jMin) {
            long j10 = j - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f8395r, j10);
                j10 -= jMin2;
                e(i10, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f8398u.P(this.f8394i, jMin2);
            }
        }
    }

    public final synchronized void h(int i10, int i11, boolean z3) {
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        e(0, 8, 6, z3 ? 1 : 0);
        this.f8398u.writeInt(i10);
        this.f8398u.writeInt(i11);
        this.f8398u.flush();
    }

    public final synchronized void i(int i10, int i11) {
        k0.g.s(i11, "errorCode");
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        if (t.g.c(i11) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        e(i10, 4, 3, 0);
        this.f8398u.writeInt(t.g.c(i11));
        this.f8398u.flush();
    }

    public final synchronized void m(long j, int i10) {
        if (this.f8396s) {
            throw new IOException(MCCampaignStatus.CLOSED);
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        e(i10, 4, 8, 0);
        this.f8398u.writeInt((int) j);
        this.f8398u.flush();
    }
}
