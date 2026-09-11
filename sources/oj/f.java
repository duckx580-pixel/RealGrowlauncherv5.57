package oj;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends InputStream {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13075i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f13076r;

    public /* synthetic */ f(i iVar, int i10) {
        this.f13075i = i10;
        this.f13076r = iVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f13075i) {
            case 0:
                jMin = Math.min(((g) this.f13076r).f13078r, Integer.MAX_VALUE);
                break;
            default:
                z zVar = (z) this.f13076r;
                if (zVar.f13127s) {
                    throw new IOException(MCCampaignStatus.CLOSED);
                }
                jMin = Math.min(zVar.f13126r.f13078r, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f13075i) {
            case 0:
                break;
            default:
                ((z) this.f13076r).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f13075i) {
            case 0:
                g gVar = (g) this.f13076r;
                if (gVar.f13078r > 0) {
                    return gVar.readByte() & 255;
                }
                return -1;
            default:
                z zVar = (z) this.f13076r;
                g gVar2 = zVar.f13126r;
                if (zVar.f13127s) {
                    throw new IOException(MCCampaignStatus.CLOSED);
                }
                if (gVar2.f13078r == 0 && zVar.f13125i.q(gVar2, 8192L) == -1) {
                    return -1;
                }
                return gVar2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f13075i) {
            case 0:
                return ((g) this.f13076r) + ".inputStream()";
            default:
                return ((z) this.f13076r) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f13075i) {
            case 0:
                kotlin.jvm.internal.l.f("sink", bArr);
                return ((g) this.f13076r).read(bArr, i10, i11);
            default:
                kotlin.jvm.internal.l.f("data", bArr);
                z zVar = (z) this.f13076r;
                g gVar = zVar.f13126r;
                if (!zVar.f13127s) {
                    gh.a.b(bArr.length, i10, i11);
                    if (gVar.f13078r == 0 && zVar.f13125i.q(gVar, 8192L) == -1) {
                        return -1;
                    }
                    return gVar.read(bArr, i10, i11);
                }
                throw new IOException(MCCampaignStatus.CLOSED);
        }
    }

    private final void a() {
    }
}
