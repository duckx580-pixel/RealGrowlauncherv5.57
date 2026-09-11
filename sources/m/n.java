package m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends FrameLayout implements l.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CollapsibleActionView f10323i;

    /* JADX WARN: Multi-variable type inference failed */
    public n(View view) {
        super(view.getContext());
        this.f10323i = (CollapsibleActionView) view;
        addView(view);
    }
}
