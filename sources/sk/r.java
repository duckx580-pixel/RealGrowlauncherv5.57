package sk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk.a f15960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public af.a f15966i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public org.joni.ast.g[] f15968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15973q;

    public r(p pVar) {
        this.f15958a = pVar.f15948q;
        this.f15959b = pVar.f15949r;
        this.f15960c = pVar.f15947p;
    }

    public final int a() {
        int i10 = this.j;
        if (i10 >= g.f15887v) {
            throw new uk.b("too many capture groups are specified");
        }
        int i11 = i10 + 1;
        this.j = i11;
        if (i10 == 0) {
            this.f15968l = new org.joni.ast.g[g.f15870d];
        } else {
            org.joni.ast.g[] gVarArr = this.f15968l;
            if (i11 >= gVarArr.length) {
                org.joni.ast.g[] gVarArr2 = new org.joni.ast.g[gVarArr.length << 1];
                System.arraycopy(gVarArr, 0, gVarArr2, 0, gVarArr.length);
                this.f15968l = gVarArr2;
            }
        }
        return this.j;
    }

    public final void b() {
        if (((-2019556389) & 67108864) != 0) {
            int i10 = this.f15973q;
            if ((i10 & 67108864) == 0) {
                this.f15973q = i10 | 67108864;
            }
        }
    }
}
