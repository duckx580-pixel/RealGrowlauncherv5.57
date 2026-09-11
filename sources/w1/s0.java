package w1;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f18932a;

    public s0(ViewConfiguration viewConfiguration) {
        this.f18932a = viewConfiguration;
    }

    @Override // w1.d2
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // w1.d2
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // w1.d2
    public final float d() {
        return this.f18932a.getScaledMaximumFlingVelocity();
    }

    @Override // w1.d2
    public final float e() {
        return this.f18932a.getScaledTouchSlop();
    }
}
