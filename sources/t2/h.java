package t2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.p0;
import androidx.lifecycle.v;
import b0.m0;
import h0.z;
import java.util.LinkedHashMap;
import launcher.powerkuy.growlauncher.R;
import oi.w;
import q1.u;
import s3.x;
import t.h0;
import t.q0;
import v1.a1;
import v1.y0;
import v1.z0;
import w1.f0;
import w1.p2;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends ViewGroup implements x, o0.i, z0 {
    public eh.c A;
    public v B;
    public a5.h C;
    public final g D;
    public final g E;
    public eh.c F;
    public final int[] G;
    public int H;
    public int I;
    public final af.f J;
    public boolean K;
    public final androidx.compose.ui.node.a L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1.d f16380i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final View f16381r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y0 f16382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public eh.a f16383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public eh.a f16385v;
    public eh.a w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public a1.n f16386x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public eh.c f16387y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q2.b f16388z;

    public h(Context context, o0.m mVar, int i10, p1.d dVar, View view, y0 y0Var) {
        super(context);
        this.f16380i = dVar;
        this.f16381r = view;
        this.f16382s = y0Var;
        LinkedHashMap linkedHashMap = p2.f18888a;
        setTag(R.id.androidx_compose_ui_view_composition_context, mVar);
        int i11 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        this.f16383t = f.f16376t;
        this.f16385v = f.f16375s;
        this.w = f.f16374r;
        this.f16386x = a1.k.f196a;
        this.f16388z = new q2.c(1.0f, 1.0f);
        n nVar = (n) this;
        this.D = new g(nVar, 1);
        this.E = new g(nVar, i11);
        int i12 = 2;
        this.G = new int[2];
        this.H = Integer.MIN_VALUE;
        this.I = Integer.MIN_VALUE;
        this.J = new af.f();
        androidx.compose.ui.node.a aVar = new androidx.compose.ui.node.a(3);
        aVar.f1251z = nVar;
        a1.n nVarA = b2.l.a(androidx.compose.ui.input.nestedscroll.a.a(dVar), true, b.f16362t);
        u uVar = new u();
        uVar.f13711a = new q1.v(nVar, 0);
        w wVar = new w();
        w wVar2 = uVar.f13712b;
        if (wVar2 != null) {
            wVar2.f13046r = null;
        }
        uVar.f13712b = wVar;
        wVar.f13046r = uVar;
        setOnRequestDisallowInterceptTouchEvent$ui_release(wVar);
        a1.n nVarD = androidx.compose.ui.layout.a.d(androidx.compose.ui.draw.a.a(nVarA.j(uVar), new m0(nVar, aVar, nVar, 15)), new c(nVar, aVar, i12));
        aVar.X(this.f16386x.j(nVarD));
        this.f16387y = new h0(4, aVar, nVarD);
        aVar.U(this.f16388z);
        this.A = new q0(i12, aVar);
        aVar.S = new c(nVar, aVar, i11);
        aVar.T = new q1.v(nVar, 1);
        aVar.W(new d(nVar, aVar));
        this.L = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a1 getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return ((t) this.f16382s).getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
    }

    public static final int k(n nVar, int i10, int i11, int i12) {
        return (i12 >= 0 || i10 == i11) ? View.MeasureSpec.makeMeasureSpec(gh.a.e(i12, i10, i11), 1073741824) : (i12 != -2 || i11 == Integer.MAX_VALUE) ? (i12 != -1 || i11 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i11, 1073741824) : View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
    }

    @Override // o0.i
    public final void a() {
        this.w.invoke();
    }

    @Override // o0.i
    public final void b() {
        this.f16385v.invoke();
        removeAllViewsInLayout();
    }

    @Override // s3.x
    public final void c(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.f16381r.isNestedScrollingEnabled()) {
            float f9 = i10;
            float f10 = -1;
            long jB = vd.a.b(f9 * f10, i11 * f10);
            long jB2 = vd.a.b(i12 * f10, i13 * f10);
            int i15 = i14 == 0 ? 1 : 2;
            p1.h hVarD = this.f16380i.d();
            long jN0 = hVarD != null ? hVarD.n0(jB, jB2, i15) : f1.c.f5973b;
            iArr[0] = f0.p(f1.c.d(jN0));
            iArr[1] = f0.p(f1.c.e(jN0));
        }
    }

    @Override // s3.w
    public final void d(View view, int i10, int i11, int i12, int i13, int i14) {
        if (this.f16381r.isNestedScrollingEnabled()) {
            float f9 = i10;
            float f10 = -1;
            long jB = vd.a.b(f9 * f10, i11 * f10);
            long jB2 = vd.a.b(i12 * f10, i13 * f10);
            int i15 = i14 == 0 ? 1 : 2;
            p1.h hVarD = this.f16380i.d();
            if (hVarD != null) {
                hVarD.n0(jB, jB2, i15);
            } else {
                int i16 = f1.c.f5976e;
            }
        }
    }

    @Override // s3.w
    public final boolean e(View view, View view2, int i10, int i11) {
        return ((i10 & 2) == 0 && (i10 & 1) == 0) ? false : true;
    }

    @Override // s3.w
    public final void f(View view, View view2, int i10, int i11) {
        af.f fVar = this.J;
        if (i11 == 1) {
            fVar.f615b = i10;
        } else {
            fVar.f614a = i10;
        }
    }

    @Override // s3.w
    public final void g(View view, int i10) {
        af.f fVar = this.J;
        if (i10 == 1) {
            fVar.f615b = 0;
        } else {
            fVar.f614a = 0;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.G;
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], getWidth() + i10, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final q2.b getDensity() {
        return this.f16388z;
    }

    public final View getInteropView() {
        return this.f16381r;
    }

    public final androidx.compose.ui.node.a getLayoutNode() {
        return this.L;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f16381r.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final v getLifecycleOwner() {
        return this.B;
    }

    public final a1.n getModifier() {
        return this.f16386x;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        af.f fVar = this.J;
        return fVar.f615b | fVar.f614a;
    }

    public final eh.c getOnDensityChanged$ui_release() {
        return this.A;
    }

    public final eh.c getOnModifierChanged$ui_release() {
        return this.f16387y;
    }

    public final eh.c getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.F;
    }

    public final eh.a getRelease() {
        return this.w;
    }

    public final eh.a getReset() {
        return this.f16385v;
    }

    public final a5.h getSavedStateRegistryOwner() {
        return this.C;
    }

    public final eh.a getUpdate() {
        return this.f16383t;
    }

    public final View getView() {
        return this.f16381r;
    }

    @Override // s3.w
    public final void h(View view, int i10, int i11, int[] iArr, int i12) {
        if (this.f16381r.isNestedScrollingEnabled()) {
            float f9 = i10;
            float f10 = -1;
            long jB = vd.a.b(f9 * f10, i11 * f10);
            int i13 = i12 == 0 ? 1 : 2;
            p1.h hVarD = this.f16380i.d();
            long jR = hVarD != null ? hVarD.R(jB, i13) : f1.c.f5973b;
            iArr[0] = f0.p(f1.c.d(jR));
            iArr[1] = f0.p(f1.c.e(jR));
        }
    }

    @Override // o0.i
    public final void i() {
        View view = this.f16381r;
        if (view.getParent() != this) {
            addView(view);
        } else {
            this.f16385v.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.K) {
            this.L.x();
            return null;
        }
        this.f16381r.postOnAnimation(new a(this.E, 0));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f16381r.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.D.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.K) {
            this.L.x();
        } else {
            this.f16381r.postOnAnimation(new a(this.E, 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDetachedFromWindow() {
        /*
            r22 = this;
            r1 = r22
            super.onDetachedFromWindow()
            v1.a1 r0 = r1.getSnapshotObserver()
            y0.v r0 = r0.f18354a
            q0.f r2 = r0.f20117f
            monitor-enter(r2)
            q0.f r0 = r0.f20117f     // Catch: java.lang.Throwable -> L99
            int r3 = r0.f13646s     // Catch: java.lang.Throwable -> L99
            r5 = 0
            r6 = 0
        L14:
            if (r5 >= r3) goto L9f
            java.lang.Object[] r7 = r0.f13644i     // Catch: java.lang.Throwable -> L99
            r7 = r7[r5]     // Catch: java.lang.Throwable -> L99
            y0.u r7 = (y0.u) r7     // Catch: java.lang.Throwable -> L99
            q.s r8 = r7.f20106f     // Catch: java.lang.Throwable -> L99
            java.lang.Object r8 = r8.g(r1)     // Catch: java.lang.Throwable -> L99
            q.r r8 = (q.r) r8     // Catch: java.lang.Throwable -> L99
            if (r8 != 0) goto L29
        L26:
            r16 = r5
            goto L80
        L29:
            java.lang.Object[] r9 = r8.f13607b     // Catch: java.lang.Throwable -> L99
            int[] r10 = r8.f13608c     // Catch: java.lang.Throwable -> L99
            long[] r8 = r8.f13606a     // Catch: java.lang.Throwable -> L99
            int r11 = r8.length     // Catch: java.lang.Throwable -> L99
            int r11 = r11 + (-2)
            if (r11 < 0) goto L26
            r12 = 0
        L35:
            r13 = r8[r12]     // Catch: java.lang.Throwable -> L99
            r16 = r5
            long r4 = ~r13     // Catch: java.lang.Throwable -> L99
            r17 = 7
            long r4 = r4 << r17
            long r4 = r4 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r17
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 == 0) goto L79
            int r4 = r12 - r11
            int r4 = ~r4     // Catch: java.lang.Throwable -> L99
            int r4 = r4 >>> 31
            r5 = 8
            int r4 = 8 - r4
            r15 = 0
        L54:
            if (r15 >= r4) goto L77
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r13 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L6e
            int r18 = r12 << 3
            int r18 = r18 + r15
            r19 = r5
            r5 = r9[r18]     // Catch: java.lang.Throwable -> L99
            r18 = r10[r18]     // Catch: java.lang.Throwable -> L99
            r7.d(r1, r5)     // Catch: java.lang.Throwable -> L99
            goto L70
        L6e:
            r19 = r5
        L70:
            long r13 = r13 >> r19
            int r15 = r15 + 1
            r5 = r19
            goto L54
        L77:
            if (r4 != r5) goto L80
        L79:
            if (r12 == r11) goto L80
            int r12 = r12 + 1
            r5 = r16
            goto L35
        L80:
            q.s r4 = r7.f20106f     // Catch: java.lang.Throwable -> L99
            int r4 = r4.f13616e     // Catch: java.lang.Throwable -> L99
            if (r4 == 0) goto L88
            r4 = 1
            goto L89
        L88:
            r4 = 0
        L89:
            if (r4 != 0) goto L8e
            int r6 = r6 + 1
            goto L9b
        L8e:
            if (r6 <= 0) goto L9b
            java.lang.Object[] r4 = r0.f13644i     // Catch: java.lang.Throwable -> L99
            int r5 = r16 - r6
            r7 = r4[r16]     // Catch: java.lang.Throwable -> L99
            r4[r5] = r7     // Catch: java.lang.Throwable -> L99
            goto L9b
        L99:
            r0 = move-exception
            goto Lab
        L9b:
            int r5 = r16 + 1
            goto L14
        L9f:
            java.lang.Object[] r4 = r0.f13644i     // Catch: java.lang.Throwable -> L99
            int r5 = r3 - r6
            r6 = 0
            java.util.Arrays.fill(r4, r5, r3, r6)     // Catch: java.lang.Throwable -> L99
            r0.f13646s = r5     // Catch: java.lang.Throwable -> L99
            monitor-exit(r2)
            return
        Lab:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.h.onDetachedFromWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i10, int i11, int i12, int i13) {
        this.f16381r.layout(0, 0, i12 - i10, i13 - i11);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f16381r;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.H = i10;
        this.I = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f9, float f10, boolean z3) {
        if (!this.f16381r.isNestedScrollingEnabled()) {
            return false;
        }
        oh.x.s(this.f16380i.c(), null, 0, new e(z3, this, ud.a.i(f9 * (-1.0f), f10 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f9, float f10) {
        if (!this.f16381r.isNestedScrollingEnabled()) {
            return false;
        }
        oh.x.s(this.f16380i.c(), null, 0, new z(this, ud.a.i(f9 * (-1.0f), f10 * (-1.0f)), null, 3), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z3) {
        eh.c cVar = this.F;
        if (cVar != null) {
            cVar.invoke(Boolean.valueOf(z3));
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    public final void setDensity(q2.b bVar) {
        if (bVar != this.f16388z) {
            this.f16388z = bVar;
            eh.c cVar = this.A;
            if (cVar != null) {
                cVar.invoke(bVar);
            }
        }
    }

    public final void setLifecycleOwner(v vVar) {
        if (vVar != this.B) {
            this.B = vVar;
            p0.k(this, vVar);
        }
    }

    public final void setModifier(a1.n nVar) {
        if (nVar != this.f16386x) {
            this.f16386x = nVar;
            eh.c cVar = this.f16387y;
            if (cVar != null) {
                cVar.invoke(nVar);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(eh.c cVar) {
        this.A = cVar;
    }

    public final void setOnModifierChanged$ui_release(eh.c cVar) {
        this.f16387y = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(eh.c cVar) {
        this.F = cVar;
    }

    public final void setRelease(eh.a aVar) {
        this.w = aVar;
    }

    public final void setReset(eh.a aVar) {
        this.f16385v = aVar;
    }

    public final void setSavedStateRegistryOwner(a5.h hVar) {
        if (hVar != this.C) {
            this.C = hVar;
            k8.g.w(this, hVar);
        }
    }

    public final void setUpdate(eh.a aVar) {
        this.f16383t = aVar;
        this.f16384u = true;
        this.D.invoke();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // v1.z0
    public final boolean w() {
        return isAttachedToWindow();
    }
}
