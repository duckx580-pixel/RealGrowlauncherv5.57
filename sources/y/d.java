package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19932a;

    @Override // y.e
    public final void c(q2.b bVar, int i10, int[] iArr, q2.l lVar, int[] iArr2) {
        switch (this.f19932a) {
            case 0:
                if (lVar != q2.l.f13752i) {
                    i.b(iArr, iArr2, true);
                } else {
                    i.c(i10, iArr, iArr2, false);
                }
                break;
            default:
                if (lVar != q2.l.f13752i) {
                    i.c(i10, iArr, iArr2, true);
                } else {
                    i.b(iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f19932a) {
            case 0:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
