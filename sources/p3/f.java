package p3;

import a0.f0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.recyclerview.widget.n1;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import q.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f13302a = new n1(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f13303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f13304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x f13305d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new i(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13303b = threadPoolExecutor;
        f13304c = new Object();
        f13305d = new x(0);
    }

    public static e a(String str, Context context, androidx.recyclerview.widget.b bVar, int i10) {
        n1 n1Var = f13302a;
        Typeface typeface = (Typeface) n1Var.h(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            f0 f0VarA = b.a(context, bVar);
            g[] gVarArr = (g[]) f0VarA.f60s;
            int i11 = f0VarA.f59r;
            int i12 = 1;
            if (i11 != 0) {
                i12 = i11 != 1 ? -3 : -2;
            } else if (gVarArr != null && gVarArr.length != 0) {
                int length = gVarArr.length;
                i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i13 >= length) {
                        break;
                    }
                    int i14 = gVarArr[i13].f13310e;
                    if (i14 == 0) {
                        i13++;
                    } else if (i14 >= 0) {
                        i12 = i14;
                    }
                }
            }
            if (i12 != 0) {
                return new e(i12);
            }
            Typeface typefaceK = k3.g.f9230a.k(context, gVarArr, i10);
            if (typefaceK == null) {
                return new e(-3);
            }
            n1Var.l(str, typefaceK);
            return new e(typefaceK);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }
}
