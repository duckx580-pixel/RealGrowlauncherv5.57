package n9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f12244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Matrix f12245c;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f12244b = arrayList;
        this.f12245c = matrix;
    }

    @Override // n9.t
    public final void a(Matrix matrix, m9.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f12244b.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f12245c, aVar, i10, canvas);
        }
    }
}
