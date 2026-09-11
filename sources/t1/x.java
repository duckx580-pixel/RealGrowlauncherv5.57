package t1;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f16338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f16339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0 f16340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eh.c f16341f;

    public x(int i10, int i11, Map map, y yVar, d0 d0Var, eh.c cVar) {
        this.f16336a = i10;
        this.f16337b = i11;
        this.f16338c = map;
        this.f16339d = yVar;
        this.f16340e = d0Var;
        this.f16341f = cVar;
    }

    @Override // t1.i0
    public final int a() {
        return this.f16337b;
    }

    @Override // t1.i0
    public final int b() {
        return this.f16336a;
    }

    @Override // t1.i0
    public final Map c() {
        return this.f16338c;
    }

    @Override // t1.i0
    public final void d() {
        v1.s sVar;
        androidx.compose.ui.node.a aVar = this.f16340e.f16271i;
        boolean zU = this.f16339d.U();
        eh.c cVar = this.f16341f;
        if (!zU || (sVar = ((v1.t) aVar.M.f9529d).X) == null) {
            cVar.invoke(((v1.t) aVar.M.f9529d).f18445x);
        } else {
            cVar.invoke(sVar.f18445x);
        }
    }
}
