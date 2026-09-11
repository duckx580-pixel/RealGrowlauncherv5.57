package u;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends w1.f0 implements d1.e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f17423c;

    public e0(f fVar) {
        this.f17423c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f17423c, ((e0) obj).f17423c);
    }

    public final int hashCode() {
        return this.f17423c.hashCode();
    }

    @Override // d1.e
    public final void i(v1.e0 e0Var) {
        boolean zG;
        e0Var.b();
        f fVar = this.f17423c;
        h1 h1Var = fVar.f17426a;
        EdgeEffect edgeEffect = fVar.f17429d;
        EdgeEffect edgeEffect2 = fVar.f17431f;
        EdgeEffect edgeEffect3 = fVar.f17428c;
        EdgeEffect edgeEffect4 = fVar.f17430e;
        EdgeEffect edgeEffect5 = fVar.f17434i;
        EdgeEffect edgeEffect6 = fVar.f17435k;
        EdgeEffect edgeEffect7 = fVar.f17433h;
        EdgeEffect edgeEffect8 = fVar.j;
        if (f1.f.e(fVar.f17440p)) {
            return;
        }
        g1.r rVarJ = e0Var.f18385i.f7986r.j();
        fVar.f17436l = fVar.f17437m.f();
        Canvas canvasA = g1.e.a(rVarJ);
        if (sb.c.q(edgeEffect8) != 0.0f) {
            fVar.h(e0Var, edgeEffect8, canvasA);
            edgeEffect8.finish();
        }
        if (edgeEffect4.isFinished()) {
            zG = false;
        } else {
            zG = fVar.g(e0Var, edgeEffect4, canvasA);
            sb.c.F(edgeEffect8, sb.c.q(edgeEffect4));
        }
        if (sb.c.q(edgeEffect7) != 0.0f) {
            fVar.f(e0Var, edgeEffect7, canvasA);
            edgeEffect7.finish();
        }
        if (!edgeEffect3.isFinished()) {
            int iSave = canvasA.save();
            canvasA.translate(0.0f, e0Var.W(h1Var.f17453b.f19970b));
            boolean zDraw = edgeEffect3.draw(canvasA);
            canvasA.restoreToCount(iSave);
            zG = zDraw || zG;
            sb.c.F(edgeEffect7, sb.c.q(edgeEffect3));
        }
        if (sb.c.q(edgeEffect6) != 0.0f) {
            fVar.g(e0Var, edgeEffect6, canvasA);
            edgeEffect6.finish();
        }
        if (!edgeEffect2.isFinished()) {
            zG = fVar.h(e0Var, edgeEffect2, canvasA) || zG;
            sb.c.F(edgeEffect6, sb.c.q(edgeEffect2));
        }
        if (sb.c.q(edgeEffect5) != 0.0f) {
            int iSave2 = canvasA.save();
            canvasA.translate(0.0f, e0Var.W(h1Var.f17453b.f19970b));
            edgeEffect5.draw(canvasA);
            canvasA.restoreToCount(iSave2);
            edgeEffect5.finish();
        }
        if (!edgeEffect.isFinished()) {
            boolean z3 = fVar.f(e0Var, edgeEffect, canvasA) || zG;
            sb.c.F(edgeEffect5, sb.c.q(edgeEffect));
            zG = z3;
        }
        if (zG) {
            fVar.i();
        }
    }

    public final String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.f17423c + ')';
    }
}
