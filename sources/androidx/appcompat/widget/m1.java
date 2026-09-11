package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends l1 {
    @Override // androidx.appcompat.widget.l1, androidx.appcompat.widget.n1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // androidx.appcompat.widget.n1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
