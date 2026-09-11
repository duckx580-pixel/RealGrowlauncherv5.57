package xe;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19628a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f19629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f19630c;

    public e(o oVar, j jVar) {
        this.f19630c = oVar;
        this.f19629b = jVar;
    }

    @Override // xe.m
    public final boolean a(ArrayList arrayList, boolean z3, af.f fVar) {
        float f9 = this.f19628a;
        o oVar = this.f19630c;
        j jVar = this.f19629b;
        this.f19628a += o.a(oVar, arrayList, z3, fVar, null, f9, jVar);
        return jVar.f19645c != 0.0f;
    }
}
