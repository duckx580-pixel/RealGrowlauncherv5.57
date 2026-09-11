package s8;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f15512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f15515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f15516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f15517i;
    public final Long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f15518k;

    public o(String str, String str2, long j, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        b8.a0.e(str);
        b8.a0.e(str2);
        b8.a0.b(j >= 0);
        b8.a0.b(j10 >= 0);
        b8.a0.b(j11 >= 0);
        b8.a0.b(j13 >= 0);
        this.f15509a = str;
        this.f15510b = str2;
        this.f15511c = j;
        this.f15512d = j10;
        this.f15513e = j11;
        this.f15514f = j12;
        this.f15515g = j13;
        this.f15516h = l10;
        this.f15517i = l11;
        this.j = l12;
        this.f15518k = bool;
    }

    public final o a(Long l10, Long l11, Boolean bool) {
        return new o(this.f15509a, this.f15510b, this.f15511c, this.f15512d, this.f15513e, this.f15514f, this.f15515g, this.f15516h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    public final o b(long j) {
        return new o(this.f15509a, this.f15510b, this.f15511c, this.f15512d, this.f15513e, j, this.f15515g, this.f15516h, this.f15517i, this.j, this.f15518k);
    }
}
