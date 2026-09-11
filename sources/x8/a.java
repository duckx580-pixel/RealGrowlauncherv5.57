package x8;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f19491a = new LinearInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k4.a f19492b = new k4.a(k4.a.f9248d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k4.a f19493c = new k4.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k4.a f19494d = new k4.a(k4.a.f9249e);

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f9, float f10, float f11) {
        return ((f10 - f9) * f11) + f9;
    }
}
