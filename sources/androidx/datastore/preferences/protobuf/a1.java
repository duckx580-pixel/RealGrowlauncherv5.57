package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f1471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f1473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1474d;

    public a1(w wVar, String str, Object[] objArr) {
        this.f1471a = wVar;
        this.f1472b = str;
        this.f1473c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f1474d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f1474d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }
}
