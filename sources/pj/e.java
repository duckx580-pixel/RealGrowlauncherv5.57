package pj;

import java.io.IOException;
import kotlin.jvm.internal.l;
import oj.f0;
import oj.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f13530r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f13531s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13532t;

    public e(f0 f0Var, long j, boolean z3) {
        super(f0Var);
        this.f13530r = j;
        this.f13531s = z3;
    }

    @Override // oj.n, oj.f0
    public final long q(oj.g gVar, long j) throws IOException {
        l.f("sink", gVar);
        long j10 = this.f13532t;
        long j11 = this.f13530r;
        if (j10 > j11) {
            j = 0;
        } else if (this.f13531s) {
            long j12 = j11 - j10;
            if (j12 == 0) {
                return -1L;
            }
            j = Math.min(j, j12);
        }
        long jQ = super.q(gVar, j);
        if (jQ != -1) {
            this.f13532t += jQ;
        }
        long j13 = this.f13532t;
        if ((j13 >= j11 || jQ != -1) && j13 <= j11) {
            return jQ;
        }
        if (jQ > 0 && j13 > j11) {
            long j14 = gVar.f13078r - (j13 - j11);
            oj.g gVar2 = new oj.g();
            gVar2.Q(gVar);
            gVar.P(gVar2, j14);
            gVar2.a();
        }
        throw new IOException("expected " + j11 + " bytes but got " + this.f13532t);
    }
}
