package uf;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f17933i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f17934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f17935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f17936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f17937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f17938v;
    public float w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f17939x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s f17940y;

    public r(s sVar, int i10) {
        this.f17940y = sVar;
        float f9 = i10;
        this.f17935s = f9;
        this.f17934r = f9;
        this.f17933i = f9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f9;
        float f10;
        s sVar = this.f17940y;
        wf.v vVar = sVar.f17944d;
        c cVar = sVar.f17941a;
        int i10 = sVar.f17962x;
        float f11 = ((i10 & 1) != 0 ? -this.f17934r : 0.0f) + ((i10 & 2) != 0 ? this.f17934r : 0.0f);
        float f12 = ((i10 & 4) != 0 ? -this.f17935s : 0.0f) + ((i10 & 8) != 0 ? this.f17935s : 0.0f);
        if (f11 > 0.0f) {
            int i11 = sVar.f17945e;
            int i12 = (i11 == 0 || i11 == 1) ? cVar.getCursor().f13407c.f13384b : cVar.getCursor().f13408d.f13384b;
            if (sVar.f17942b.f17930b.getCurrX() > (cVar.U() + cVar.f17847z.r(i12, cVar.getText().o(i12).f13401r)[1]) - (cVar.getWidth() * 0.85f)) {
                f11 = 0.0f;
            }
        }
        sVar.j(f11, f12, false);
        if (vVar.f19247b.isShowing()) {
            vVar.a();
        }
        boolean zA = s.a(sVar, f11, this.f17936t);
        float f13 = this.f17933i;
        if (zA) {
            float f14 = this.f17938v;
            if (f14 < 32.0f) {
                f9 = 1.06f;
                f10 = 1.0f;
                if ((this.f17939x & 1) == 0) {
                    this.f17938v = f14 + 1.0f;
                    this.f17934r *= 1.06f;
                }
            } else {
                f9 = 1.06f;
                f10 = 1.0f;
            }
        } else {
            f9 = 1.06f;
            f10 = 1.0f;
            this.f17934r = f13;
            this.f17938v = 0.0f;
        }
        if (s.a(sVar, f12, this.f17937u)) {
            float f15 = this.w;
            if (f15 < 32.0f && (this.f17939x & 1) == 0) {
                this.w = f15 + f10;
                this.f17935s *= f9;
            }
        } else {
            this.f17935s = f13;
            this.w = 0.0f;
        }
        this.f17936t = f11;
        this.f17937u = f12;
        MotionEvent motionEvent = sVar.f17964z;
        if (motionEvent != null && !sVar.f(motionEvent, true)) {
            MotionEvent motionEvent2 = sVar.f17964z;
            int i13 = sVar.f17945e;
            if (i13 == 0) {
                sVar.f17943c.f(motionEvent2);
            } else if (i13 == 1) {
                sVar.f17960u.f(motionEvent2);
            } else if (i13 == 2) {
                sVar.f17961v.f(motionEvent2);
            }
        }
        this.f17939x++;
        if (sVar.f17962x != 0) {
            cVar.a0(this, 10L);
        }
    }
}
