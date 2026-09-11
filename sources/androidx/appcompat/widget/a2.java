package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Field f834a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
        f834a = declaredField;
    }
}
