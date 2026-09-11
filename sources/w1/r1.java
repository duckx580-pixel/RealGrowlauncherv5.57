package w1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements d1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f18918g = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RenderNode f18919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18924f;

    public r1(t tVar) {
        RenderNode renderNodeCreate = RenderNode.create("Compose", tVar);
        this.f18919a = renderNodeCreate;
        if (f18918g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                w1 w1Var = w1.f18989a;
                w1Var.c(renderNodeCreate, w1Var.a(renderNodeCreate));
                w1Var.d(renderNodeCreate, w1Var.b(renderNodeCreate));
            }
            v1.f18986a.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f18918g = false;
        }
    }

    @Override // w1.d1
    public final void A() {
        this.f18919a.setRotationY(0.0f);
    }

    @Override // w1.d1
    public final void B(float f9) {
        this.f18919a.setScaleX(f9);
    }

    @Override // w1.d1
    public final void C() {
        this.f18919a.setLayerType(0);
        this.f18919a.setHasOverlappingRendering(true);
    }

    @Override // w1.d1
    public final void D(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            w1.f18989a.c(this.f18919a, i10);
        }
    }

    @Override // w1.d1
    public final void E() {
        this.f18919a.setTranslationX(0.0f);
    }

    @Override // w1.d1
    public final int F() {
        return this.f18922d;
    }

    @Override // w1.d1
    public final boolean G() {
        return this.f18919a.getClipToOutline();
    }

    @Override // w1.d1
    public final void H(boolean z3) {
        this.f18919a.setClipToOutline(z3);
    }

    @Override // w1.d1
    public final void I(float f9) {
        this.f18919a.setCameraDistance(-f9);
    }

    @Override // w1.d1
    public final void J(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            w1.f18989a.d(this.f18919a, i10);
        }
    }

    @Override // w1.d1
    public final void K(Matrix matrix) {
        this.f18919a.getMatrix(matrix);
    }

    @Override // w1.d1
    public final float L() {
        return this.f18919a.getElevation();
    }

    @Override // w1.d1
    public final int a() {
        return this.f18923e - this.f18921c;
    }

    @Override // w1.d1
    public final int b() {
        return this.f18922d - this.f18920b;
    }

    @Override // w1.d1
    public final float c() {
        return this.f18919a.getAlpha();
    }

    @Override // w1.d1
    public final void d(int i10) {
        this.f18920b += i10;
        this.f18922d += i10;
        this.f18919a.offsetLeftAndRight(i10);
    }

    @Override // w1.d1
    public final int e() {
        return this.f18923e;
    }

    @Override // w1.d1
    public final void g(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f18919a);
    }

    @Override // w1.d1
    public final int h() {
        return this.f18920b;
    }

    @Override // w1.d1
    public final void i(float f9) {
        this.f18919a.setRotation(f9);
    }

    @Override // w1.d1
    public final void j(float f9) {
        this.f18919a.setPivotX(f9);
    }

    @Override // w1.d1
    public final void k(boolean z3) {
        this.f18924f = z3;
        this.f18919a.setClipToBounds(z3);
    }

    @Override // w1.d1
    public final boolean l(int i10, int i11, int i12, int i13) {
        this.f18920b = i10;
        this.f18921c = i11;
        this.f18922d = i12;
        this.f18923e = i13;
        return this.f18919a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // w1.d1
    public final void m() {
        v1.f18986a.a(this.f18919a);
    }

    @Override // w1.d1
    public final void n(float f9) {
        this.f18919a.setPivotY(f9);
    }

    @Override // w1.d1
    public final void o(float f9) {
        this.f18919a.setScaleY(f9);
    }

    @Override // w1.d1
    public final void p(float f9) {
        this.f18919a.setElevation(f9);
    }

    @Override // w1.d1
    public final void q(int i10) {
        this.f18921c += i10;
        this.f18923e += i10;
        this.f18919a.offsetTopAndBottom(i10);
    }

    @Override // w1.d1
    public final boolean r() {
        return this.f18919a.isValid();
    }

    @Override // w1.d1
    public final void s(Outline outline) {
        this.f18919a.setOutline(outline);
    }

    @Override // w1.d1
    public final boolean t() {
        return this.f18919a.setHasOverlappingRendering(true);
    }

    @Override // w1.d1
    public final void u(u5.l lVar, g1.e0 e0Var, eh.c cVar) {
        Canvas canvasStart = this.f18919a.start(b(), a());
        g1.d dVar = (g1.d) lVar.f17672i;
        Canvas canvas = dVar.f6861a;
        dVar.f6861a = canvasStart;
        if (e0Var != null) {
            dVar.save();
            dVar.e(e0Var);
        }
        cVar.invoke(dVar);
        if (e0Var != null) {
            dVar.p();
        }
        ((g1.d) lVar.f17672i).f6861a = canvas;
        this.f18919a.end(canvasStart);
    }

    @Override // w1.d1
    public final void v() {
        this.f18919a.setRotationX(0.0f);
    }

    @Override // w1.d1
    public final void w(float f9) {
        this.f18919a.setAlpha(f9);
    }

    @Override // w1.d1
    public final boolean x() {
        return this.f18924f;
    }

    @Override // w1.d1
    public final int y() {
        return this.f18921c;
    }

    @Override // w1.d1
    public final void z() {
        this.f18919a.setTranslationY(0.0f);
    }

    @Override // w1.d1
    public final void f() {
    }
}
