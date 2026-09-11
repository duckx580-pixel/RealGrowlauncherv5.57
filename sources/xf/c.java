package xf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f19700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f19701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19702d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19703e = 0;

    public c(int i10, b bVar) {
        this.f19699a = i10;
        this.f19700b = new Object[i10];
        this.f19701c = bVar;
    }

    public final synchronized void a(Object obj) {
        Object[] objArr = this.f19700b;
        int i10 = this.f19702d;
        int i11 = i10 + 1;
        this.f19702d = i11;
        objArr[i10] = obj;
        if (i11 == this.f19699a) {
            this.f19701c.b(this.f19703e, objArr);
        }
    }
}
