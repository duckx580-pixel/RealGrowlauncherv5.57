package xe;

import android.graphics.Canvas;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f19631a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19632b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Canvas f19633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f19634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f19635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f19636f;

    public f(o oVar, Canvas canvas, j jVar, float f9) {
        this.f19636f = oVar;
        this.f19633c = canvas;
        this.f19634d = jVar;
        this.f19635e = f9;
    }

    @Override // xe.m
    public final boolean a(ArrayList arrayList, boolean z3, af.f fVar) {
        float fA = this.f19631a + o.a(this.f19636f, arrayList, z3, fVar, this.f19633c, this.f19631a, this.f19634d);
        this.f19631a = fA;
        boolean z10 = fA < this.f19635e;
        this.f19632b = z10;
        return z10;
    }
}
