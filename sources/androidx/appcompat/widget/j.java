package androidx.appcompat.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f905i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m f906r;

    public j(m mVar, h hVar) {
        this.f906r = mVar;
        this.f905i = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.h hVar;
        m mVar = this.f906r;
        m.j jVar = mVar.f927s;
        if (jVar != null && (hVar = jVar.f10276e) != null) {
            hVar.f(jVar);
        }
        View view = (View) mVar.f931x;
        if (view != null && view.getWindowToken() != null) {
            h hVar2 = this.f905i;
            if (hVar2.b()) {
                mVar.I = hVar2;
            } else if (hVar2.f10336e != null) {
                hVar2.d(0, 0, false, false);
                mVar.I = hVar2;
            }
        }
        mVar.K = null;
    }
}
