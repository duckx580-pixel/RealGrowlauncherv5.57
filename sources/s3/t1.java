package s3;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f15108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Field f15109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Field f15110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f15111d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f15108a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f15109b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f15110c = declaredField3;
            declaredField3.setAccessible(true);
            f15111d = true;
        } catch (ReflectiveOperationException e8) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
        }
    }
}
