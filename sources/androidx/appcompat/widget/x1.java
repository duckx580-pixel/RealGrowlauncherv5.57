package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f1075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f1076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f1077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f1078d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            Class cls3 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
            f1075a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f1076b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f1077c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f1078d = true;
        } catch (NoSuchMethodException e8) {
            e8.printStackTrace();
        }
    }
}
