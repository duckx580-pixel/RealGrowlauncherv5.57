package wf;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final pf.c f19223i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ze.c f19224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pf.k f19225s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cf.g f19226t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f19227u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19228v;
    public final /* synthetic */ k w;

    public j(k kVar, long j, cf.g gVar) {
        this.w = kVar;
        this.f19227u = j;
        uf.c cVar = kVar.E;
        this.f19223i = cVar.getCursor().f13407c.a();
        this.f19224r = cVar.getEditorLanguage();
        pf.k kVar2 = new pf.k(cVar.getText());
        this.f19225s = kVar2;
        kVar2.f13432t = this;
        this.f19226t = gVar;
        cVar.getExtraArguments();
        this.f19228v = false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        k kVar = this.w;
        uf.c cVar = kVar.E;
        cf.g gVar = this.f19226t;
        try {
            this.f19224r.d(this.f19225s, this.f19223i, gVar);
            if (gVar.f3491b.size() + gVar.f3490a.size() <= 0) {
                cVar.b0(new h(kVar, 3));
            } else if (kVar.I == Thread.currentThread() && !gVar.f3497h) {
                gVar.f3493d.post(new cf.e(gVar, true));
            }
            cVar.b0(new androidx.activity.b(17, this));
        } catch (Exception e8) {
            if (e8 instanceof cf.c) {
                Log.v("CompletionThread", "Completion is cancelled");
            } else {
                Log.e("CompletionThread", "Completion failed", e8);
            }
        }
    }
}
