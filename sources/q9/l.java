package q9;

import android.view.accessibility.AccessibilityManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import s3.i0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f13824a;

    public l(o oVar) {
        this.f13824a = oVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        o oVar = this.f13824a;
        TextInputLayout textInputLayout = oVar.f13840a;
        if (textInputLayout.getEditText() == null || o.g(textInputLayout.getEditText())) {
            return;
        }
        CheckableImageButton checkableImageButton = oVar.f13842c;
        int i10 = z3 ? 2 : 1;
        WeakHashMap weakHashMap = z0.f15140a;
        i0.s(checkableImageButton, i10);
    }
}
