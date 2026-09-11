package s3;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y.z f15093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15095c;

    public p1(y.z zVar) {
        super(zVar.f20004r);
        this.f15095c = new HashMap();
        this.f15093a = zVar;
    }

    public final s1 a(WindowInsetsAnimation windowInsetsAnimation) {
        s1 s1Var = (s1) this.f15095c.get(windowInsetsAnimation);
        if (s1Var == null) {
            s1Var = new s1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                s1Var.f15107a = new q1(windowInsetsAnimation);
            }
            this.f15095c.put(windowInsetsAnimation, s1Var);
        }
        return s1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f15093a.a(a(windowInsetsAnimation));
        this.f15095c.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        a(windowInsetsAnimation);
        y.z zVar = this.f15093a;
        zVar.f20006t = true;
        zVar.f20007u = true;
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f15094b;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f15094b = arrayList2;
            Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            s1 s1VarA = a(windowInsetsAnimation);
            s1VarA.f15107a.c(windowInsetsAnimation.getFraction());
            this.f15094b.add(s1VarA);
        }
        f2 f2VarG = f2.g(null, windowInsets);
        y.z0 z0Var = this.f15093a.f20005s;
        y.z0.a(z0Var, f2VarG);
        if (z0Var.f20026r) {
            f2VarG = f2.f15062b;
        }
        return f2VarG.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a(windowInsetsAnimation);
        k3.c cVarE = q1.e(bounds);
        k3.c cVarD = q1.d(bounds);
        this.f15093a.f20006t = false;
        o1.c();
        return o1.a(cVarE.d(), cVarD.d());
    }
}
