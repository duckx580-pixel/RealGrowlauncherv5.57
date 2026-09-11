package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import h.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f732i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f733r;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7263t);
        this.f733r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f732i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
