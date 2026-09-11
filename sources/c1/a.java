package c1;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import f1.f;
import g1.r;
import q2.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends View.DragShadowBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q2.c f3279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.c f3281c;

    public a(q2.c cVar, long j, eh.c cVar2) {
        this.f3279a = cVar;
        this.f3280b = j;
        this.f3281c = cVar2;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        i1.b bVar = new i1.b();
        Canvas canvas2 = g1.e.f6866a;
        g1.d dVar = new g1.d();
        dVar.f6861a = canvas;
        i1.a aVar = bVar.f7985i;
        q2.b bVar2 = aVar.f7981a;
        l lVar = aVar.f7982b;
        r rVar = aVar.f7983c;
        long j = aVar.f7984d;
        aVar.f7981a = this.f3279a;
        aVar.f7982b = l.f13752i;
        aVar.f7983c = dVar;
        aVar.f7984d = this.f3280b;
        dVar.save();
        this.f3281c.invoke(bVar);
        dVar.p();
        aVar.f7981a = bVar2;
        aVar.f7982b = lVar;
        aVar.f7983c = rVar;
        aVar.f7984d = j;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        long j = this.f3280b;
        float fD = f.d(j);
        q2.c cVar = this.f3279a;
        point.set(cVar.e0(fD / cVar.a()), cVar.e0(f.b(j) / cVar.a()));
        point2.set(point.x / 2, point.y / 2);
    }
}
