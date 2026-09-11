package s3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 extends x1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f15112e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f15113f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Constructor f15114g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f15115h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowInsets f15116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k3.c f15117d;

    public u1() {
        this.f15116c = i();
    }

    private static WindowInsets i() {
        if (!f15113f) {
            try {
                f15112e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
            }
            f15113f = true;
        }
        Field field = f15112e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e10);
            }
        }
        if (!f15115h) {
            try {
                f15114g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e11) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e11);
            }
            f15115h = true;
        }
        Constructor constructor = f15114g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e12) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e12);
            }
        }
        return null;
    }

    @Override // s3.x1
    public f2 b() {
        a();
        f2 f2VarG = f2.g(null, this.f15116c);
        k3.c[] cVarArr = this.f15126b;
        d2 d2Var = f2VarG.f15063a;
        d2Var.q(cVarArr);
        d2Var.s(this.f15117d);
        return f2VarG;
    }

    @Override // s3.x1
    public void e(k3.c cVar) {
        this.f15117d = cVar;
    }

    @Override // s3.x1
    public void g(k3.c cVar) {
        WindowInsets windowInsets = this.f15116c;
        if (windowInsets != null) {
            this.f15116c = windowInsets.replaceSystemWindowInsets(cVar.f9224a, cVar.f9225b, cVar.f9226c, cVar.f9227d);
        }
    }

    public u1(f2 f2Var) {
        super(f2Var);
        this.f15116c = f2Var.f();
    }
}
