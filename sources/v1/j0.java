package v1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements t1.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f18441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f18442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k0 f18443e;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(int i10, int i11, Map map, eh.c cVar, k0 k0Var) {
        this.f18439a = i10;
        this.f18440b = i11;
        this.f18441c = map;
        this.f18442d = (kotlin.jvm.internal.m) cVar;
        this.f18443e = k0Var;
    }

    @Override // t1.i0
    public final int a() {
        return this.f18440b;
    }

    @Override // t1.i0
    public final int b() {
        return this.f18439a;
    }

    @Override // t1.i0
    public final Map c() {
        return this.f18441c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.c, kotlin.jvm.internal.m] */
    @Override // t1.i0
    public final void d() {
        this.f18442d.invoke(this.f18443e.f18445x);
    }
}
