package ja;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f8879c = new f(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8881b;

    public f(int i10, int i11) {
        this.f8880a = i10;
        this.f8881b = i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f8880a);
        sb2.append(", length = ");
        return k0.g.i(sb2, this.f8881b, "]");
    }
}
