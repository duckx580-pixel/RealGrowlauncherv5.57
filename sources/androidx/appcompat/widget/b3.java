package androidx.appcompat.widget;

import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 extends Property {
    @Override // android.util.Property
    public final Object get(Object obj) {
        return Float.valueOf(((e3) obj).mThumbPosition);
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((e3) obj).setThumbPosition(((Float) obj2).floatValue());
    }
}
