package v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f18237a;

    public o(p pVar) {
        this.f18237a = pVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // v.a1
    public final float a(float f9) {
        if (Float.isNaN(f9)) {
            return 0.0f;
        }
        return ((Number) this.f18237a.f18242a.invoke(Float.valueOf(f9))).floatValue();
    }
}
