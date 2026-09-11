package rc;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f14635b;

    public abstract void a(int i10, int i11, String str);

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.f14635b;
        return str != null && str.equals(dVar.f14635b);
    }
}
