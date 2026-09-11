package pf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n[] f13413e = new n[8];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f13414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13417d;

    public final int a() {
        char cCharAt;
        int i10 = this.f13416c;
        this.f13415b = i10;
        if (i10 == this.f13417d) {
            return 2;
        }
        char cCharAt2 = this.f13414a.charAt(i10);
        if (cCharAt2 == '\n') {
            this.f13416c = this.f13415b + 1;
            return 1;
        }
        if (cCharAt2 == '\r') {
            int i11 = this.f13415b;
            if (i11 + 1 >= this.f13417d || this.f13414a.charAt(i11 + 1) != '\n') {
                this.f13416c = this.f13415b + 1;
            } else {
                this.f13416c = this.f13415b + 2;
            }
            return 1;
        }
        this.f13416c = this.f13415b + 1;
        while (true) {
            int i12 = this.f13416c;
            if (i12 >= this.f13417d || (cCharAt = this.f13414a.charAt(i12)) == '\n' || cCharAt == '\r') {
                return 0;
            }
            this.f13416c++;
        }
    }
}
