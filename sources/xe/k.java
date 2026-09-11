package xe;

import android.graphics.Canvas;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19656a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f19657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Canvas f19658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f19659d;

    public k(o oVar, j jVar) {
        this.f19659d = oVar;
        this.f19657b = jVar;
    }

    @Override // xe.m
    public final boolean a(ArrayList arrayList, boolean z3, af.f fVar) {
        float f9 = this.f19656a;
        float fA = f9 + o.a(this.f19659d, arrayList, z3, fVar, this.f19658c, f9, this.f19657b);
        this.f19656a = fA;
        return fA < this.f19657b.f19645c;
    }
}
