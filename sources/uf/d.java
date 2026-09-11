package uf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable, we.q {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f17849i;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17851s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f17853u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float[] f17854v;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f17852t = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17850r = true;

    public d(c cVar, int i10) {
        this.f17849i = cVar;
        this.f17853u = i10;
        cVar.o0(we.w.class, this);
    }

    @Override // we.q
    public final void c(com.google.protobuf.j jVar, n6.i iVar) {
        this.f17852t = System.currentTimeMillis();
        this.f17850r = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f17851s || this.f17853u <= 0) {
            this.f17850r = true;
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f17852t;
        long j = ((long) this.f17853u) * 2;
        c cVar = this.f17849i;
        if (jCurrentTimeMillis >= j) {
            this.f17850r = !this.f17850r;
            pf.c cVarA = cVar.getCursor().f13407c.a();
            this.f17854v = cVar.getLayout().d(cVarA.f13384b, cVarA.f13385c, this.f17854v);
            if (!cVar.getCursor().a() && this.f17854v[0] >= cVar.getOffsetY()) {
                if (this.f17854v[0] - cVar.getRowHeight() <= cVar.getHeight() + cVar.getOffsetY() && this.f17854v[1] >= cVar.getOffsetX()) {
                    if (this.f17854v[1] - 100.0f <= cVar.getWidth() + cVar.getOffsetX()) {
                        cVar.postInvalidate();
                    }
                }
            }
        } else {
            this.f17850r = true;
        }
        cVar.a0(this, this.f17853u);
    }
}
