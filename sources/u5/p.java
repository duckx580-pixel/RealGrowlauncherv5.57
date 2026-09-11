package u5;

import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.g f17685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.work.g f17686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f17687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f17689i;
    public final androidx.work.d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f17690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f17691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f17692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f17693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f17694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f17695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17697r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f17698s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f17699t;

    static {
        kotlin.jvm.internal.l.e("tagWithPrefix(\"WorkSpec\")", androidx.work.p.f("WorkSpec"));
    }

    public p(String str, int i10, String str2, String str3, androidx.work.g gVar, androidx.work.g gVar2, long j, long j10, long j11, androidx.work.d dVar, int i11, int i12, long j12, long j13, long j14, long j15, boolean z3, int i13, int i14, int i15) {
        kotlin.jvm.internal.l.f("id", str);
        k0.g.s(i10, "state");
        kotlin.jvm.internal.l.f("workerClassName", str2);
        kotlin.jvm.internal.l.f("input", gVar);
        kotlin.jvm.internal.l.f("output", gVar2);
        kotlin.jvm.internal.l.f("constraints", dVar);
        k0.g.s(i12, "backoffPolicy");
        k0.g.s(i13, "outOfQuotaPolicy");
        this.f17681a = str;
        this.f17682b = i10;
        this.f17683c = str2;
        this.f17684d = str3;
        this.f17685e = gVar;
        this.f17686f = gVar2;
        this.f17687g = j;
        this.f17688h = j10;
        this.f17689i = j11;
        this.j = dVar;
        this.f17690k = i11;
        this.f17691l = i12;
        this.f17692m = j12;
        this.f17693n = j13;
        this.f17694o = j14;
        this.f17695p = j15;
        this.f17696q = z3;
        this.f17697r = i13;
        this.f17698s = i14;
        this.f17699t = i15;
    }

    public final long a() {
        int i10;
        if (this.f17682b == 1 && (i10 = this.f17690k) > 0) {
            int i11 = this.f17691l;
            long j = this.f17692m;
            long jScalb = i11 == 2 ? j * ((long) i10) : (long) Math.scalb(j, i10 - 1);
            long j10 = this.f17693n;
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j10 + jScalb;
        }
        boolean zC = c();
        long j11 = this.f17687g;
        if (!zC) {
            long jCurrentTimeMillis = this.f17693n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + j11;
        }
        int i12 = this.f17698s;
        long j12 = this.f17693n;
        if (i12 == 0) {
            j12 += j11;
        }
        long j13 = this.f17689i;
        long j14 = this.f17688h;
        if (j13 != j14) {
            return j12 + j14 + (i12 == 0 ? ((long) (-1)) * j13 : 0L);
        }
        return j12 + (i12 != 0 ? j14 : 0L);
    }

    public final boolean b() {
        return !kotlin.jvm.internal.l.a(androidx.work.d.f2326i, this.j);
    }

    public final boolean c() {
        return this.f17688h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.f17681a, pVar.f17681a) && this.f17682b == pVar.f17682b && kotlin.jvm.internal.l.a(this.f17683c, pVar.f17683c) && kotlin.jvm.internal.l.a(this.f17684d, pVar.f17684d) && kotlin.jvm.internal.l.a(this.f17685e, pVar.f17685e) && kotlin.jvm.internal.l.a(this.f17686f, pVar.f17686f) && this.f17687g == pVar.f17687g && this.f17688h == pVar.f17688h && this.f17689i == pVar.f17689i && kotlin.jvm.internal.l.a(this.j, pVar.j) && this.f17690k == pVar.f17690k && this.f17691l == pVar.f17691l && this.f17692m == pVar.f17692m && this.f17693n == pVar.f17693n && this.f17694o == pVar.f17694o && this.f17695p == pVar.f17695p && this.f17696q == pVar.f17696q && this.f17697r == pVar.f17697r && this.f17698s == pVar.f17698s && this.f17699t == pVar.f17699t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int i10 = android.support.v4.media.session.a.i((t.g.c(this.f17682b) + (this.f17681a.hashCode() * 31)) * 31, 31, this.f17683c);
        String str = this.f17684d;
        int iB = h0.b(h0.b(h0.b(h0.b((t.g.c(this.f17691l) + android.support.v4.media.session.a.z(this.f17690k, (this.j.hashCode() + h0.b(h0.b(h0.b((this.f17686f.hashCode() + ((this.f17685e.hashCode() + ((i10 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.f17687g), 31, this.f17688h), 31, this.f17689i)) * 31, 31)) * 31, 31, this.f17692m), 31, this.f17693n), 31, this.f17694o), 31, this.f17695p);
        boolean z3 = this.f17696q;
        ?? r22 = z3;
        if (z3) {
            r22 = 1;
        }
        return Integer.hashCode(this.f17699t) + android.support.v4.media.session.a.z(this.f17698s, (t.g.c(this.f17697r) + ((iB + r22) * 31)) * 31, 31);
    }

    public final String toString() {
        return k0.g.k(new StringBuilder("{WorkSpec: "), this.f17681a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p(String str, int i10, String str2, String str3, androidx.work.g gVar, androidx.work.g gVar2, long j, long j10, long j11, androidx.work.d dVar, int i11, int i12, long j12, long j13, long j14, long j15, boolean z3, int i13, int i14, int i15, int i16) {
        androidx.work.g gVar3;
        androidx.work.g gVar4;
        int i17 = (i15 & 2) != 0 ? 1 : i10;
        String str4 = (i15 & 8) != 0 ? null : str3;
        if ((i15 & 16) != 0) {
            androidx.work.g gVar5 = androidx.work.g.f2342c;
            kotlin.jvm.internal.l.e("EMPTY", gVar5);
            gVar3 = gVar5;
        } else {
            gVar3 = gVar;
        }
        if ((i15 & 32) != 0) {
            androidx.work.g gVar6 = androidx.work.g.f2342c;
            kotlin.jvm.internal.l.e("EMPTY", gVar6);
            gVar4 = gVar6;
        } else {
            gVar4 = gVar2;
        }
        this(str, i17, str2, str4, gVar3, gVar4, (i15 & 64) != 0 ? 0L : j, (i15 & 128) != 0 ? 0L : j10, (i15 & 256) != 0 ? 0L : j11, (i15 & 512) != 0 ? androidx.work.d.f2326i : dVar, (i15 & 1024) != 0 ? 0 : i11, (i15 & 2048) != 0 ? 1 : i12, (i15 & 4096) != 0 ? 30000L : j12, (i15 & 8192) != 0 ? 0L : j13, (i15 & 16384) != 0 ? 0L : j14, (32768 & i15) != 0 ? -1L : j15, (65536 & i15) != 0 ? false : z3, (131072 & i15) != 0 ? 1 : i13, (i15 & 262144) != 0 ? 0 : i14, 0);
    }
}
