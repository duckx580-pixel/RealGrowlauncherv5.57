package androidx.fragment.app;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends ud.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r f1760i;

    public p(r rVar) {
        this.f1760i = rVar;
    }

    @Override // ud.a
    public final View p(int i10) {
        r rVar = this.f1760i;
        View view = rVar.U;
        if (view != null) {
            return view.findViewById(i10);
        }
        throw new IllegalStateException("Fragment " + rVar + " does not have a view");
    }

    @Override // ud.a
    public final boolean r() {
        return this.f1760i.U != null;
    }
}
