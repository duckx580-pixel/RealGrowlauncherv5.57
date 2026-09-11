package k2;

import android.graphics.RectF;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, f1.d dVar) {
        EditorBoundsInfo.Builder builder2 = new EditorBoundsInfo.Builder();
        float f9 = dVar.f5979a;
        float f10 = dVar.f5980b;
        float f11 = dVar.f5981c;
        float f12 = dVar.f5982d;
        return builder.setEditorBoundsInfo(builder2.setEditorBounds(new RectF(f9, f10, f11, f12)).setHandwritingBounds(new RectF(dVar.f5979a, f10, f11, f12)).build());
    }
}
