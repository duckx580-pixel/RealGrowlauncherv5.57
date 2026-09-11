package v4;

import f0.d1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18545i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f18546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f18547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f18548t;

    public /* synthetic */ a(d1 d1Var, int i10, Object obj) {
        this.f18547s = d1Var;
        this.f18546r = i10;
        this.f18548t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18545i) {
            case 0:
                ((c) ((d1) this.f18547s).f5679c).k(this.f18546r, this.f18548t);
                break;
            default:
                xf.i iVar = (xf.i) this.f18547s;
                uf.c cVar = (uf.c) this.f18548t;
                if (iVar.f19705i == cVar) {
                    if (this.f18546r == iVar.f19719t.get()) {
                        cVar.setLayoutBusy(false);
                        cVar.getEventHandler().j(0.0f, 0.0f, false);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ a(xf.i iVar, uf.c cVar, int i10) {
        this.f18547s = iVar;
        this.f18548t = cVar;
        this.f18546r = i10;
    }
}
