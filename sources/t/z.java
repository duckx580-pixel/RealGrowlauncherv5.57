package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface z extends i {
    @Override // t.i
    default l1 a(j1 j1Var) {
        return new t6.b(this);
    }

    float b(long j, float f9, float f10, float f11);

    long c(float f9, float f10, float f11);

    default float d(float f9, float f10, float f11) {
        return b(c(f9, f10, f11), f9, f10, f11);
    }

    float e(long j, float f9, float f10, float f11);
}
