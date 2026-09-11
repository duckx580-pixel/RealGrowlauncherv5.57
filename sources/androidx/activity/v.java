package androidx.activity;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f719i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w f720r;

    public v(w wVar, q qVar) {
        kotlin.jvm.internal.l.f("onBackPressedCallback", qVar);
        this.f720r = wVar;
        this.f719i = qVar;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        w wVar = this.f720r;
        rg.j jVar = wVar.f722b;
        q qVar = this.f719i;
        jVar.remove(qVar);
        qVar.f708b.remove(this);
        if (Build.VERSION.SDK_INT >= 33) {
            qVar.f709c = null;
            wVar.c();
        }
    }
}
