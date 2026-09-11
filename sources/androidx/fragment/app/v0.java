package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1833i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ w0 f1834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f1835s;

    public /* synthetic */ v0(j jVar, w0 w0Var, int i10) {
        this.f1833i = i10;
        this.f1835s = jVar;
        this.f1834r = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1833i) {
            case 0:
                ArrayList arrayList = this.f1835s.f1698b;
                w0 w0Var = this.f1834r;
                if (arrayList.contains(w0Var)) {
                    android.support.v4.media.session.a.a(w0Var.f1838c.U, w0Var.f1836a);
                }
                break;
            default:
                j jVar = this.f1835s;
                ArrayList arrayList2 = jVar.f1698b;
                w0 w0Var2 = this.f1834r;
                arrayList2.remove(w0Var2);
                jVar.f1699c.remove(w0Var2);
                break;
        }
    }
}
