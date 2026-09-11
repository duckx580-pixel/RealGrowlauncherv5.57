package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f1408d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1434g);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 1) {
                this.f1407c = typedArrayObtainStyledAttributes.getFloat(index, this.f1407c);
            } else if (index == 0) {
                int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f1405a);
                this.f1405a = i11;
                this.f1405a = o.f1422d[i11];
            } else if (index == 4) {
                this.f1406b = typedArrayObtainStyledAttributes.getInt(index, this.f1406b);
            } else if (index == 3) {
                this.f1408d = typedArrayObtainStyledAttributes.getFloat(index, this.f1408d);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
