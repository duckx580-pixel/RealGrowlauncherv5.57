package lk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c[] f10078c = new c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f10080b;

    public c(int[] iArr, int i10) {
        this.f10079a = i10;
        this.f10080b = iArr;
    }

    public static c a(int i10, int i11) {
        return new c(new int[]{i11}, i10);
    }

    public static c b(int i10, int i11, int i12) {
        return new c(new int[]{i11, i12}, i10);
    }
}
