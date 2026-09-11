package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ud.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p f1735i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f1736r;

    public m(n nVar, p pVar) {
        this.f1736r = nVar;
        this.f1735i = pVar;
    }

    @Override // ud.a
    public final View p(int i10) {
        p pVar = this.f1735i;
        if (pVar.r()) {
            return pVar.p(i10);
        }
        Dialog dialog = this.f1736r.f1747t0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // ud.a
    public final boolean r() {
        return this.f1735i.r() || this.f1736r.f1751x0;
    }
}
