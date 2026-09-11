package t0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends l {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f16260t;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f16260t) {
            case 0:
                int i10 = this.f16259s;
                this.f16259s = i10 + 2;
                Object[] objArr = this.f16257i;
                return new a(objArr[i10], objArr[i10 + 1]);
            case 1:
                int i11 = this.f16259s;
                this.f16259s = i11 + 2;
                return this.f16257i[i11];
            default:
                int i12 = this.f16259s;
                this.f16259s = i12 + 2;
                return this.f16257i[i12 + 1];
        }
    }
}
