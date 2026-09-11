package u;

import android.content.Context;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends EdgeEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17480b;

    public o0(Context context) {
        super(context);
        this.f17479a = qj.b.b(context).f13732i * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i10) {
        this.f17480b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9, float f10) {
        this.f17480b = 0.0f;
        super.onPull(f9, f10);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f17480b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f9) {
        this.f17480b = 0.0f;
        super.onPull(f9);
    }
}
