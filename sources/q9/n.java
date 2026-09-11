package q9;

import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements AutoCompleteTextView.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f13827a;

    public n(o oVar) {
        this.f13827a = oVar;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        o oVar = this.f13827a;
        oVar.j = true;
        oVar.f13834l = System.currentTimeMillis();
        oVar.h(false);
    }
}
