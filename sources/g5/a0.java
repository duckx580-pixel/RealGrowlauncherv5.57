package g5;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 extends w9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f6980l = true;

    public float M(View view) {
        if (f6980l) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f6980l = false;
            }
        }
        return view.getAlpha();
    }

    public void N(View view, float f9) {
        if (f6980l) {
            try {
                view.setTransitionAlpha(f9);
                return;
            } catch (NoSuchMethodError unused) {
                f6980l = false;
            }
        }
        view.setAlpha(f9);
    }
}
