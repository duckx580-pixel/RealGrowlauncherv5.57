package uf;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.TransactionTooLargeException;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextMenu;
import android.view.DragEvent;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import android.widget.Toast;
import com.google.android.gms.internal.measurement.j3;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ka.a1;
import kotlin.jvm.internal.l;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends View implements pf.j, ye.a {
    public int A;
    public boolean A0;
    public int B;
    public boolean B0;
    public int C;
    public final cg.d C0;
    public int D;
    public final cg.d D0;
    public int E;
    public final cg.d E0;
    public final float F;
    public final ClipboardManager F0;
    public float G;
    public final InputMethodManager G0;
    public float H;
    public pf.l H0;
    public float I;
    public pf.h I0;
    public float J;
    public final Matrix J0;
    public float K;
    public zf.a K0;
    public float L;
    public cg.c L0;
    public final float M;
    public String M0;
    public float N;
    public ze.c N0;
    public float O;
    public cg.b O0;
    public float P;
    public long P0;
    public float Q;
    public final wf.k Q0;
    public float R;
    public final s R0;
    public boolean S;
    public Paint.Align S0;
    public boolean T;
    public final GestureDetector T0;
    public boolean U;
    public final ScaleGestureDetector U0;
    public boolean V;
    public final CursorAnchorInfo.Builder V0;
    public boolean W;
    public final EdgeEffect W0;
    public final EdgeEffect X0;
    public ExtractedTextRequest Y0;
    public final p Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f17798a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public cg.a f17799a1;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f17800b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public cg.e f17801b1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f17802c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public d f17803c1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public volatile boolean f17804d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public final e f17805d1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f17806e0;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Bundle f17807e1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f17808f0;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public ff.f f17809f1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f17810g0;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public final yf.c f17811g1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f17812h0;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public final n f17813h1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u5.c f17814i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f17815i0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public boolean f17816i1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f17817j0;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public float f17818j1;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f17819k0;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public float f17820k1;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f17821l0;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public boolean f17822l1;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public boolean f17823m0;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public boolean f17824m1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f17825n0;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public pf.o f17826n1;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f17827o0;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public final ag.a f17828o1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f17829p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public final HashMap f17830p1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f17831q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public n7.e f17832r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f17833r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wf.t f17834s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f17835s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wf.q f17836t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f17837t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayList f17838u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f17839u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final n7.e f17840v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f17841v0;
    public pf.c w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f17842w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f17843x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f17844x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final we.p f17845y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f17846y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public xf.d f17847z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f17848z0;

    static {
        tf.e.a("CodeEditor");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0391  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [float] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v69, types: [float] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.<init>(android.content.Context):void");
    }

    public static int t(int i10, List list) {
        if (list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i11 = 0;
        int i12 = size;
        while (true) {
            if (i11 <= i12) {
                int i13 = ((i12 - i11) / 2) + i11;
                if (i13 >= 0 && i13 <= size) {
                    ff.a aVar = (ff.a) list.get(i13);
                    if (aVar == null) {
                        int i14 = i13 - 1;
                        while (true) {
                            i13++;
                            if (i14 < i11 && i13 > i12) {
                                return -1;
                            }
                            if (i14 >= i11 && list.get(i14) != null) {
                                i13 = i14;
                                break;
                            }
                            if (i13 <= i12 && list.get(i13) != null) {
                                break;
                            }
                            i14--;
                        }
                        aVar = (ff.a) list.get(i13);
                    }
                    int i15 = aVar.f6221c;
                    if (i15 <= i10) {
                        if (i15 >= i10) {
                            i11 = i13;
                            break;
                        }
                        i11 = i13 + 1;
                    } else {
                        i12 = i13 - 1;
                    }
                } else {
                    return -1;
                }
            } else {
                break;
            }
        }
        if (i11 < 0 || i11 > size) {
            return -1;
        }
        return i11;
    }

    public final void A() {
        if (this.H0.a()) {
            x(true);
            B();
            X();
            return;
        }
        pf.l cursor = getCursor();
        if (cursor.a()) {
            A();
            return;
        }
        pf.c cVarA = cursor.f13407c.a();
        int i10 = cVarA.f13384b;
        int i11 = getText().o(cVarA.f13384b).f13401r;
        int i12 = i10 + 1;
        if (i12 != getLineCount()) {
            l0(i10, 0, i12, 0);
        } else {
            if (getText().o(i10).f13401r == 0) {
                x(false);
                return;
            }
            l0(i10, 0, i10, getText().o(i10).f13401r);
        }
        A();
        this.f17805d1.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x023f A[PHI: r7
      0x023f: PHI (r7v6 int) = (r7v3 int), (r7v8 int) binds: [B:159:0x023d, B:79:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0264 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a A[PHI: r7
      0x011a: PHI (r7v12 int) = 
      (r7v3 int)
      (r7v2 int)
      (r7v4 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v2 int)
      (r7v13 int)
     binds: [B:168:0x0254, B:144:0x0215, B:145:0x0217, B:142:0x020d, B:127:0x01e6, B:115:0x01cc, B:103:0x01a5, B:93:0x0187, B:95:0x018d, B:85:0x016e, B:82:0x0162, B:74:0x013a, B:70:0x012c, B:71:0x012e, B:67:0x0122, B:68:0x0124, B:64:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x017f A[PHI: r7
      0x017f: PHI (r7v7 int) = (r7v3 int), (r7v5 int), (r7v8 int) binds: [B:165:0x024d, B:90:0x017e, B:79:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r5v82 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B() {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.B():void");
    }

    public final void C(String str, boolean z3) {
        pf.l cursor = getCursor();
        if (cursor.a()) {
            pf.c cVarA = cursor.f13407c.a();
            pf.c cVarA2 = cursor.f13408d.a().a();
            pf.h text = getText();
            int i10 = cVarA.f13384b;
            int i11 = cVarA.f13385c;
            int i12 = cVarA2.f13384b;
            int i13 = cVarA2.f13385c;
            text.u(false);
            try {
                pf.h hVarA = text.A(i10, i11, i12, i13);
                text.E(false);
                j0(cVarA2.f13384b, cVarA2.f13385c);
                w(str + ((Object) hVarA), false);
                if (z3) {
                    pf.c cVarA3 = cursor.f13408d.a();
                    l0(cVarA2.f13384b, cVarA2.f13385c, cVarA3.f13384b, cVarA3.f13385c);
                }
            } catch (Throwable th2) {
                text.E(false);
                throw th2;
            }
        }
    }

    public final void D(int i10, int i11) {
        float width;
        o scroller = getScroller();
        float[] fArrR = this.f17847z.r(i10, i11);
        float fU = U() + fArrR[1];
        float f9 = fArrR[0];
        OverScroller overScroller = scroller.f17930b;
        OverScroller overScroller2 = scroller.f17930b;
        float offsetY = overScroller.isFinished() ? getOffsetY() : overScroller.getFinalY();
        float offsetX = overScroller.isFinished() ? getOffsetX() : overScroller.getFinalX();
        this.f17805d1.getClass();
        float rowHeight = f9 - ((float) (getRowHeight() * 2)) < offsetY ? f9 - (getRowHeight() * 2) : offsetY;
        if (f9 > getHeight() + offsetY) {
            rowHeight = (getRowHeight() * 1.0f) + (f9 - getHeight());
        }
        float fMeasureText = i11 == 0 ? 0.0f : getTextPaint().measureText("a");
        if (fU < (this.f17833r0 ? U() : 0.0f) + offsetX) {
            int width2 = getWidth() / 2;
            width = ((this.f17833r0 ? -U() : 0.0f) + fU) - fMeasureText;
            float f10 = width2;
            if (Math.abs(width - offsetX) < f10) {
                width = Math.max(1.0f, offsetX - f10);
            }
        } else {
            width = offsetX;
        }
        if (fU + fMeasureText > offsetX + getWidth()) {
            width = ((fMeasureText * 0.8f) + fU) - getWidth();
        }
        float fMax = Math.max(0.0f, Math.min(getScrollMaxX(), width));
        float fMax2 = Math.max(0.0f, Math.min(getScrollMaxY(), rowHeight));
        if (Math.abs(fMax - getOffsetX()) < Math.abs(1.0f) && Math.abs(fMax2 - getOffsetY()) < Math.abs(1.0f)) {
            invalidate();
            return;
        }
        boolean z3 = System.currentTimeMillis() - this.P0 >= 100;
        this.P0 = System.currentTimeMillis();
        if (z3) {
            overScroller2.forceFinished(true);
            scroller.a();
            scroller.b(getOffsetX(), getOffsetY(), (int) (fMax - getOffsetX()), (int) (fMax2 - getOffsetY()), scroller.f17929a.getProps().f17862y);
            this.f17805d1.getClass();
        } else {
            scroller.b(getOffsetX(), getOffsetY(), (int) (fMax - getOffsetX()), (int) (fMax2 - getOffsetY()), 0);
            overScroller2.abortAnimation();
            scroller.a();
        }
        this.f17845y.a(new we.v(this, getOffsetX(), getOffsetY(), (int) fMax, (int) fMax2, 3));
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            r7 = this;
            pf.c r0 = r7.w
            if (r0 == 0) goto L52
            pf.h r1 = r7.I0
            r1.getClass()
            int r2 = r0.f13384b
            int r3 = r0.f13385c
            int r0 = r0.f13383a
            r4 = 0
            r1.u(r4)
            if (r2 < 0) goto L46
            java.util.ArrayList r5 = r1.f13391i     // Catch: java.lang.Throwable -> L44
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L44
            if (r2 < r5) goto L1e
            goto L46
        L1e:
            pf.i r5 = r1.o(r2)     // Catch: java.lang.Throwable -> L44
            int r6 = r5.f13401r     // Catch: java.lang.Throwable -> L44
            pf.o r5 = r5.d()     // Catch: java.lang.Throwable -> L44
            int r5 = r5.f13423r     // Catch: java.lang.Throwable -> L44
            int r6 = r6 + r5
            if (r3 > r6) goto L46
            if (r3 >= 0) goto L30
            goto L46
        L30:
            pf.a r5 = r1.n()     // Catch: java.lang.Throwable -> L44
            pf.c r2 = r5.B(r2, r3)     // Catch: java.lang.Throwable -> L44
            int r2 = r2.f13383a     // Catch: java.lang.Throwable -> L44
            if (r2 != r0) goto L3e
            r0 = 1
            goto L3f
        L3e:
            r0 = r4
        L3f:
            r1.E(r4)
            r4 = r0
            goto L4e
        L44:
            r0 = move-exception
            goto L4a
        L46:
            r1.E(r4)
            goto L4e
        L4a:
            r1.E(r4)
            throw r0
        L4e:
            if (r4 != 0) goto L51
            goto L52
        L51:
            return
        L52:
            pf.l r0 = r7.H0
            pf.c r0 = r0.f13408d
            pf.c r0 = r0.a()
            r7.w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.E():void");
    }

    public final void F() {
        D(getCursor().f13408d.f13384b, getCursor().f13408d.f13385c);
    }

    public final void G(v vVar) {
        E();
        pf.c selectingTarget = getSelectingTarget();
        vVar.getClass();
        kotlin.jvm.internal.l.f("pos", selectingTarget);
        pf.c cVar = (pf.c) vVar.f17977i.invoke(this, selectingTarget);
        pf.c cVar2 = this.w;
        m0(cVar2.f13384b, cVar2.f13385c, cVar.f13384b, cVar.f13385c, 7, false);
        if (vVar == v.f17975y) {
            this.R0.j(0.0f, -getHeight(), true);
        } else if (vVar == v.f17976z) {
            this.R0.j(0.0f, getHeight(), true);
        }
        if (this.H0.f13407c.a().equals(this.w)) {
            F();
        } else {
            pf.c cVar3 = this.H0.f13407c;
            D(cVar3.f13384b, cVar3.f13385c);
        }
    }

    public final ExtractedText H(ExtractedTextRequest extractedTextRequest) {
        getProps().getClass();
        getProps().getClass();
        pf.l cursor = getCursor();
        ExtractedText extractedText = new ExtractedText();
        int i10 = cursor.f13407c.f13383a;
        int i11 = cursor.f13408d.f13383a;
        if (extractedTextRequest.hintMaxChars == 0) {
            extractedTextRequest.hintMaxChars = this.f17805d1.w;
        }
        int i12 = extractedTextRequest.hintMaxChars;
        int iMin = i12 < i10 ? Math.min(i10 - (i12 / 2), i10) : 0;
        extractedText.text = this.f17843x.c(iMin, extractedTextRequest.hintMaxChars + iMin, extractedTextRequest.flags);
        extractedText.startOffset = iMin;
        extractedText.selectionStart = i10 - iMin;
        extractedText.selectionEnd = i11 - iMin;
        sf.a keyMetaStates = getKeyMetaStates();
        if (keyMetaStates.b() && !keyMetaStates.a()) {
            extractedText.flags |= 2;
        }
        return extractedText;
    }

    public final int I() {
        int i10;
        ff.f fVar = this.f17809f1;
        ArrayList arrayList = fVar == null ? null : fVar.f6227b;
        int i11 = -1;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i12 = this.H0.f13407c.f13384b;
            int iT = t(i12, arrayList);
            int i13 = 0;
            if (iT == -1) {
                iT = 0;
            }
            int size = arrayList.size() - 1;
            ff.f fVar2 = this.f17809f1;
            int i14 = fVar2 != null ? fVar2.f6228c : Integer.MAX_VALUE;
            int i15 = Integer.MAX_VALUE;
            while (iT <= size) {
                ff.a aVar = (ff.a) arrayList.get(iT);
                if (aVar != null) {
                    int i16 = aVar.f6221c;
                    if (i16 >= i12 && (i10 = aVar.f6219a) <= i12) {
                        int i17 = i16 - i10;
                        if (i17 < i15) {
                            i11 = iT;
                            i15 = i17;
                        }
                    } else if (i15 != Integer.MAX_VALUE && (i13 = i13 + 1) >= i14) {
                        break;
                    }
                }
                iT++;
            }
        }
        return i11;
    }

    public final long J(float f9, float f10) {
        float fMax = Math.max(0.0f, f10);
        this.f17813h1.getClass();
        return this.f17847z.b((f9 + getOffsetX()) - U(), fMax + getOffsetY());
    }

    public final int K(int i10) {
        int lineSpacingPixels = getLineSpacingPixels();
        Paint.FontMetricsInt fontMetricsInt = this.f17813h1.f17921r;
        return (((i10 + 1) * Math.max(1, (fontMetricsInt.descent - fontMetricsInt.ascent) + lineSpacingPixels)) - fontMetricsInt.descent) - (lineSpacingPixels / 2);
    }

    public final int L(int i10) {
        return (i10 + 1) * getRowHeight();
    }

    public final int M(int i10) {
        return (getLineSpacingPixels() / 2) + (getRowHeight() * i10);
    }

    public final List N(int i10) {
        ff.f fVar = this.f17809f1;
        u5.c cVar = fVar == null ? null : fVar.f6226a;
        ArrayList arrayList = this.f17838u;
        if (arrayList.isEmpty()) {
            arrayList.add(a1.z(5L, 0));
        }
        if (cVar != null) {
            try {
                return new j3(cVar).b(i10);
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public final void O(boolean z3) {
        pf.l cursor = getCursor();
        if (!z3 || cursor.a()) {
            ze.c editorLanguage = getEditorLanguage();
            int tabWidth = getTabWidth();
            int tabWidth2 = getTabWidth();
            editorLanguage.getClass();
            String strB = pf.m.b(tabWidth, tabWidth2, false);
            pf.h text = getText();
            int tabWidth3 = getTabWidth();
            text.b();
            for (int i10 = cursor.f13407c.f13384b; i10 <= cursor.f13408d.f13384b; i10++) {
                long jA = pf.m.a(text.o(i10));
                int i11 = (int) (jA >> 32);
                int i12 = (int) (jA & 4294967295L);
                int i13 = (i12 * tabWidth3) + i11;
                int i14 = i11 + i12;
                int i15 = tabWidth3 - (i13 % tabWidth3);
                if (i11 > 0 && i12 > 0) {
                    if (i15 == 0) {
                        i15 = tabWidth3;
                    }
                    text.w(i10, 0, nh.o.G((i15 + i13) / tabWidth3, strB), i10, i14);
                } else if (i15 == tabWidth3) {
                    text.r(i10, i14, strB);
                } else {
                    text.r(i10, i14, nh.o.G(i15, " "));
                }
            }
            text.k();
        }
    }

    public final boolean P() {
        if (!this.U || this.f17804d0) {
            return false;
        }
        Q();
        return true;
    }

    public final void Q() {
        this.N0.getClass();
    }

    public final boolean R() {
        this.f17805d1.getClass();
        return this.f17798a0 || this.f17800b0;
    }

    public final boolean S(float f9, float f10) {
        long J = J(f9, f10);
        xe.o oVarD = this.f17813h1.d(this.f17847z.l(this.I0.l((int) (J >> 32), (int) (J & 4294967295L))));
        xe.k kVar = new xe.k(oVarD, new xe.j());
        oVarD.l(kVar, true);
        float f11 = kVar.f19656a;
        float fU = U();
        float offsetX = getOffsetX() + f9;
        return offsetX >= fU && offsetX <= f11 + fU;
    }

    public final float T() {
        float fMax = 0.0f;
        if (!this.f17817j0) {
            return 0.0f;
        }
        int i10 = 0;
        for (int lineCount = getLineCount(); lineCount > 0; lineCount /= 10) {
            i10++;
        }
        float[] fArrA = tf.i.a(19);
        this.f17813h1.f17907c.getTextWidths("0 1 2 3 4 5 6 7 8 9", fArrA);
        tf.i.b(fArrA);
        for (int i11 = 0; i11 < 19; i11 += 2) {
            fMax = Math.max(fMax, fArrA[i11]);
        }
        return (fMax * i10) + this.Q;
    }

    public final float U() {
        if (!this.f17817j0) {
            return this.F * 5.0f;
        }
        float fT = T() + this.H + this.I + this.G;
        this.f17813h1.A();
        return fT + 0;
    }

    public final void V(v vVar, boolean z3) {
        if (z3) {
            G(vVar);
        } else {
            W(vVar);
        }
    }

    public final void W(v vVar) {
        pf.c cVarA;
        if (this.H0.a()) {
            if (vVar == v.f17972u) {
                pf.c cVar = this.H0.f13407c;
                k0(cVar.f13384b, cVar.f13385c, 7, true);
                return;
            } else if (vVar == v.f17973v) {
                pf.c cVar2 = this.H0.f13408d;
                k0(cVar2.f13384b, cVar2.f13385c, 7, true);
                return;
            }
        }
        int iOrdinal = vVar.f17978r.ordinal();
        if (iOrdinal == 0) {
            cVarA = this.H0.f13407c.a();
        } else if (iOrdinal != 1) {
            E();
            cVarA = this.w;
        } else {
            cVarA = this.H0.f13408d.a();
        }
        kotlin.jvm.internal.l.f("pos", cVarA);
        pf.c cVar3 = (pf.c) vVar.f17977i.invoke(this, cVarA);
        if (vVar == v.f17975y) {
            this.R0.j(0.0f, -getHeight(), true);
        } else if (vVar == v.f17976z) {
            this.R0.j(0.0f, getHeight(), true);
        }
        k0(cVar3.f13384b, cVar3.f13385c, 7, true);
    }

    public final void X() {
        ExtractedTextRequest extractedTextRequest = this.Y0;
        if (extractedTextRequest != null) {
            ExtractedText extractedTextH = H(extractedTextRequest);
            this.G0.updateExtractedText(this, this.Y0.token, extractedTextH);
        }
        s0();
        r0();
        if (this.f17843x.f17866b.a()) {
            f0();
        }
    }

    public final void Y(int i10) {
        this.f17845y.a(new we.w(this, i10));
        getCursorRange();
    }

    public final void Z() {
        ClipData primaryClip;
        String strA;
        f fVar;
        try {
            if (!this.F0.hasPrimaryClip() || (primaryClip = this.F0.getPrimaryClip()) == null || (strA = tf.h.a(primaryClip)) == null || (fVar = this.f17843x) == null) {
                return;
            }
            fVar.commitText(strA, 1);
            this.f17805d1.getClass();
            X();
        } catch (Exception e8) {
            Log.w("CodeEditor", "Error pasting text to editor", e8);
            Toast.makeText(getContext(), e8.toString(), 0).show();
        }
    }

    public final void a0(Runnable runnable, long j) {
        tf.d.f17178a.postDelayed(new a(this, runnable, 1), j);
    }

    public final void b0(Runnable runnable) {
        tf.d.f17178a.post(new a(this, runnable, 0));
    }

    public final void c0() {
        pf.h hVar = this.I0;
        pf.x xVar = hVar.f13398y;
        boolean z3 = xVar.f13448r;
        ArrayList arrayList = xVar.f13447i;
        if (z3 && xVar.f13452v < arrayList.size() && !xVar.w) {
            xVar.w = true;
            ((pf.s) arrayList.get(xVar.f13452v)).c(hVar);
            xVar.f13452v++;
            xVar.w = false;
        }
        X();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return Math.max(0, Math.min(getScrollMaxX(), getOffsetX()));
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return getScrollMaxX();
    }

    @Override // android.view.View
    public final void computeScroll() {
        o oVar = this.R0.f17942b;
        OverScroller overScroller = oVar.f17930b;
        OverScroller overScroller2 = oVar.f17930b;
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        if (zComputeScrollOffset) {
            oVar.a();
        }
        if (zComputeScrollOffset) {
            if (!overScroller2.isFinished() && (overScroller2.getStartX() != overScroller2.getFinalX() || overScroller2.getStartY() != overScroller2.getFinalY())) {
                this.f17818j1 = overScroller2.getFinalX();
                this.f17820k1 = overScroller2.getFinalY();
                this.f17824m1 = ((float) Math.abs(overScroller2.getStartX() - overScroller2.getFinalX())) > getDpUnit() * 5.0f;
                this.f17822l1 = ((float) Math.abs(overScroller2.getStartY() - overScroller2.getFinalY())) > getDpUnit() * 5.0f;
            }
            if (overScroller2.getCurrX() > 0 || this.f17818j1 > 0.0f || !this.X0.isFinished() || !this.f17824m1) {
                int scrollMaxX = getScrollMaxX();
                if (overScroller2.getCurrX() >= scrollMaxX && this.f17818j1 >= scrollMaxX && this.X0.isFinished() && this.f17824m1) {
                    this.X0.onAbsorb((int) overScroller2.getCurrVelocity());
                    this.R0.j = true;
                }
            } else {
                this.X0.onAbsorb((int) overScroller2.getCurrVelocity());
                this.R0.j = false;
            }
            if (overScroller2.getCurrY() > 0 || this.f17820k1 > 0.0f || !this.W0.isFinished() || !this.f17822l1) {
                int scrollMaxY = getScrollMaxY();
                if (overScroller2.getCurrY() >= scrollMaxY && this.f17820k1 >= scrollMaxY && this.W0.isFinished() && this.f17822l1) {
                    this.W0.onAbsorb((int) overScroller2.getCurrVelocity());
                    this.R0.f17949i = true;
                }
            } else {
                this.W0.onAbsorb((int) overScroller2.getCurrVelocity());
                this.R0.f17949i = false;
            }
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, Math.min(getScrollMaxY(), getOffsetY()));
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        return getScrollMaxY();
    }

    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        AccessibilityNodeInfo accessibilityNodeInfoCreateAccessibilityNodeInfo = super.createAccessibilityNodeInfo();
        if (isEnabled()) {
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setEditable(P());
            pf.l lVar = this.H0;
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setTextSelection(lVar.f13407c.f13383a, lVar.f13408d.f13383a);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setInputType(1);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setMultiLine(true);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setText(getText().D());
            accessibilityNodeInfoCreateAccessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_COPY);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CUT);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_PASTE);
            accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_TEXT);
            int scrollMaxY = getScrollMaxY();
            if (scrollMaxY > 0) {
                accessibilityNodeInfoCreateAccessibilityNodeInfo.setScrollable(true);
                int offsetY = getOffsetY();
                if (offsetY > 0) {
                    accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
                    accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
                }
                if (offsetY < scrollMaxY) {
                    accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
                    accessibilityNodeInfoCreateAccessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
                }
            }
        }
        return accessibilityNodeInfoCreateAccessibilityNodeInfo;
    }

    public final void d0() {
        this.Q0.e();
        this.Q0.f();
        this.f17834s.b();
        this.R0.f17944d.a();
        this.f17836t.b();
        if (this.f17815i0) {
            return;
        }
        this.f17845y.a(new we.m(this));
        this.f17815i0 = true;
        ze.c cVar = this.N0;
        if (cVar != null) {
            cVar.b().p();
            this.N0.getClass();
            this.N0.getClass();
            this.N0 = new ze.b();
        }
        this.f17809f1 = null;
        n7.e eVar = this.f17840v;
        eVar.f12173s = null;
        eVar.f12174t = null;
        pf.h hVar = this.I0;
        if (hVar != null) {
            hVar.f13392r.remove(this);
        }
        this.K0.d(this);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int x10 = (int) motionEvent.getX();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.C = x10;
            if (this.f17821l0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (action == 2) {
            int i10 = x10 - this.C;
            if (this.f17821l0 && !this.R0.g() && ((i10 > 0 && getScroller().f17930b.getCurrX() == 0) || (i10 < 0 && getScroller().f17930b.getCurrX() == getScrollMaxX()))) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // pf.j
    public final void e(pf.h hVar) {
        this.S = true;
        this.f17847z.e(hVar);
    }

    public final void e0() {
        if (this.f17846y0) {
            requestLayout();
        }
    }

    public final void f0() {
        f fVar = this.f17843x;
        if (fVar != null) {
            pf.h text = fVar.f17865a.getText();
            while (text.f13395u > 0) {
                text.k();
            }
            pf.e eVar = fVar.f17866b;
            eVar.f13389b = -1;
            eVar.f13388a = -1;
            eVar.f13390c = false;
            fVar.f17867c = false;
        }
        InputMethodManager inputMethodManager = this.G0;
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
    }

    public final void g0() {
        l0(0, 0, getLineCount() - 1, getText().o(getLineCount() - 1).f13401r);
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return c.class.getName();
    }

    public int getBlockIndex() {
        return this.B;
    }

    public float getBlockLineWidth() {
        return this.K;
    }

    public ClipboardManager getClipboardManager() {
        return this.F0;
    }

    public zf.a getColorScheme() {
        return this.K0;
    }

    public int getCurrentCursorBlock() {
        return this.B;
    }

    public pf.l getCursor() {
        return this.H0;
    }

    public cg.a getCursorAnimator() {
        return this.f17799a1;
    }

    public d getCursorBlink() {
        return this.f17803c1;
    }

    public pf.q getCursorRange() {
        pf.l lVar = this.H0;
        return new pf.q(lVar.f13407c.a(), lVar.f13408d.a());
    }

    public cg.b getDiagnosticIndicatorStyle() {
        return this.O0;
    }

    public df.a getDiagnostics() {
        return null;
    }

    public float getDividerMarginLeft() {
        return this.H;
    }

    public float getDividerMarginRight() {
        return this.I;
    }

    public float getDividerWidth() {
        return this.G;
    }

    public float getDpUnit() {
        return this.F;
    }

    public int getEdgeEffectColor() {
        return this.W0.getColor();
    }

    public boolean getEditable() {
        return this.U;
    }

    public ze.c getEditorLanguage() {
        return this.N0;
    }

    public s getEventHandler() {
        return this.R0;
    }

    public Bundle getExtraArguments() {
        return this.f17807e1;
    }

    public int getFirstVisibleLine() {
        try {
            return this.f17847z.p(getFirstVisibleRow());
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public int getFirstVisibleRow() {
        return Math.max(0, getOffsetY() / getRowHeight());
    }

    public String getFormatTip() {
        return this.M0;
    }

    public xe.c getGraphPaint() {
        return this.f17813h1.f17911g;
    }

    public cg.e getHandleStyle() {
        return this.f17801b1;
    }

    public ff.c getHighlightTexts() {
        return null;
    }

    public EdgeEffect getHorizontalEdgeEffect() {
        return this.X0;
    }

    @Override // android.view.View
    public Drawable getHorizontalScrollbarThumbDrawable() {
        return this.f17813h1.f17922s;
    }

    @Override // android.view.View
    public Drawable getHorizontalScrollbarTrackDrawable() {
        return this.f17813h1.f17923t;
    }

    public List<Object> getInlayHintRenderers() {
        return new ArrayList(this.f17830p1.values());
    }

    public gf.a getInlayHints() {
        return null;
    }

    public InputMethodManager getInputMethodManager() {
        return this.G0;
    }

    public int getInputType() {
        return this.D;
    }

    public cg.d getInsertHandleDescriptor() {
        return this.E0;
    }

    public float getInsertSelectionWidth() {
        return this.J;
    }

    public sf.a getKeyMetaStates() {
        return (sf.a) this.f17814i.f17649s;
    }

    public int getLastVisibleLine() {
        try {
            return this.f17847z.p(getLastVisibleRow());
        } catch (IndexOutOfBoundsException unused) {
            return getLineCount() - 1;
        }
    }

    public int getLastVisibleRow() {
        return Math.max(0, Math.min(this.f17847z.a() - 1, (getHeight() + getOffsetY()) / getRowHeight()));
    }

    public xf.e getLayout() {
        return this.f17847z;
    }

    public cg.d getLeftHandleDescriptor() {
        return this.C0;
    }

    public int getLineCount() {
        return this.I0.f13391i.size();
    }

    public float getLineInfoTextSize() {
        return this.N;
    }

    public Paint.Align getLineNumberAlign() {
        return this.S0;
    }

    public float getLineNumberMarginLeft() {
        return this.Q;
    }

    public Paint.FontMetricsInt getLineNumberMetrics() {
        return this.f17813h1.A;
    }

    public cg.c getLineNumberTipTextProvider() {
        return this.L0;
    }

    public pf.o getLineSeparator() {
        return this.f17826n1;
    }

    public float getLineSpacingExtra() {
        return this.P;
    }

    public float getLineSpacingMultiplier() {
        return this.O;
    }

    public int getLineSpacingPixels() {
        Paint.FontMetricsInt fontMetricsInt = this.f17813h1.f17921r;
        return (((int) (((this.O - 1.0f) * (fontMetricsInt.descent - fontMetricsInt.ascent)) + this.P)) / 2) * 2;
    }

    public int getLnPanelPosition() {
        return this.f17808f0;
    }

    public int getLnPanelPositionMode() {
        return this.f17810g0;
    }

    public int getNonPrintablePaintingFlags() {
        return this.E;
    }

    public int getOffsetX() {
        return this.R0.f17942b.f17930b.getCurrX();
    }

    public int getOffsetY() {
        return this.R0.f17942b.f17930b.getCurrY();
    }

    public xe.c getOtherPaint() {
        return this.f17813h1.f17907c;
    }

    public e getProps() {
        return this.f17805d1;
    }

    public yf.c getRenderContext() {
        return this.f17811g1;
    }

    public n getRenderer() {
        return this.f17813h1;
    }

    public cg.d getRightHandleDescriptor() {
        return this.D0;
    }

    public int getRowHeight() {
        Paint.FontMetricsInt fontMetricsInt = this.f17813h1.f17921r;
        return Math.max(1, getLineSpacingPixels() + (fontMetricsInt.descent - fontMetricsInt.ascent));
    }

    public int getRowHeightOfText() {
        Paint.FontMetricsInt fontMetricsInt = this.f17813h1.f17921r;
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }

    public int getScrollMaxX() {
        return (int) Math.max(0.0f, (U() + this.f17847z.s()) - (getWidth() / 2.0f));
    }

    public int getScrollMaxY() {
        float height;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iC = this.f17847z.c();
        if (layoutParams == null || layoutParams.height == -2) {
            height = getHeight();
        } else {
            height = (1.0f - this.R) * getHeight();
        }
        return Math.max(0, iC - ((int) height));
    }

    public o getScroller() {
        return this.R0.f17942b;
    }

    public p getSearcher() {
        return this.Z0;
    }

    public pf.c getSelectingTarget() {
        return this.H0.f13407c.a().equals(this.w) ? this.H0.f13408d.a() : this.H0.f13407c.a();
    }

    public ag.a getSnippetController() {
        return this.f17828o1;
    }

    public ff.f getStyles() {
        return this.f17809f1;
    }

    public int getTabWidth() {
        return this.A;
    }

    public pf.h getText() {
        return this.I0;
    }

    public float getTextBorderWidth() {
        return this.L;
    }

    public float getTextLetterSpacing() {
        return this.f17813h1.f17906b.getLetterSpacing();
    }

    public xe.c getTextPaint() {
        return this.f17813h1.f17906b;
    }

    public float getTextScaleX() {
        return this.f17813h1.f17906b.getTextScaleX();
    }

    public float getTextSizePx() {
        return this.f17813h1.f17906b.getTextSize();
    }

    public Typeface getTypefaceLineNumber() {
        return this.f17813h1.f17907c.getTypeface();
    }

    public Typeface getTypefaceText() {
        return this.f17813h1.f17906b.getTypeface();
    }

    public EdgeEffect getVerticalEdgeEffect() {
        return this.W0;
    }

    public float getVerticalExtraSpaceFactor() {
        return this.R;
    }

    @Override // android.view.View
    public Drawable getVerticalScrollbarThumbDrawable() {
        return this.f17813h1.f17924u;
    }

    @Override // android.view.View
    public Drawable getVerticalScrollbarTrackDrawable() {
        return this.f17813h1.f17925v;
    }

    public final void h0(int i10, int i11) {
        pf.q qVarD = tf.h.d(getText(), i10, i11, this.f17805d1.E);
        pf.c cVar = qVarD.f13427a;
        pf.c cVar2 = qVarD.f13428b;
        m0(cVar.f13384b, cVar.f13385c, cVar2.f13384b, cVar2.f13385c, 5, true);
    }

    @Override // pf.j
    public final void i(pf.h hVar, final int i10, int i11, final int i12, int i13, StringBuilder sb2) {
        int i14;
        int i15;
        ArrayList arrayList;
        yf.e eVar;
        yf.c cVar = this.f17811g1;
        af.a aVar = cVar.f20434a;
        ArrayList<yf.a> arrayList2 = (ArrayList) aVar.f598d;
        if (i10 != i12) {
            ((q.m) aVar.f597c).c(i10, i12);
            rg.q.V(new eh.c() { // from class: yf.b
                @Override // eh.c
                public final Object invoke(Object obj) {
                    a aVar2 = (a) obj;
                    l.f("it", aVar2);
                    int i16 = aVar2.f20429a;
                    return Boolean.valueOf(i10 <= i16 && i16 <= i12);
                }
            }, arrayList2);
            for (yf.a aVar2 : arrayList2) {
                int i16 = aVar2.f20429a;
                if (i16 > i12) {
                    aVar2.f20429a = i16 - (i12 - i10);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && (eVar = cVar.f20435b) != null) {
            eVar.a(i10, i12);
        }
        this.f17813h1.G();
        this.f17840v.getClass();
        pf.c cVarB = this.I0.n().B(i10, i11);
        pf.c cVarA = cVarB.a();
        cVarA.f13385c = i13;
        cVarA.f13384b = i12;
        cVarA.f13383a = sb2.length() + cVarB.f13383a;
        try {
            ff.f fVar = this.f17809f1;
            if (fVar != null && (i15 = (i14 = cVarB.f13384b) - cVarA.f13384b) != 0 && (arrayList = fVar.f6227b) != null) {
                k8.g.C(arrayList, i14, i15);
            }
        } catch (Exception e8) {
            Log.w("CodeEditor", "Update failure", e8);
        }
        this.f17847z.i(hVar, i10, i11, i12, i13, sb2);
        n nVar = this.f17813h1;
        nVar.c(i10, i10 + 1, nVar.f17928z, false);
        u();
        if (this.U && !this.H0.a() && !this.S && !this.f17843x.f17866b.a() && this.f17812h0 == 0) {
            ((dg.c) this.f17799a1).c();
            ((dg.c) this.f17799a1).e();
        }
        this.N0.b().o(cVarB, cVarA);
        this.w = this.f17802c0 ? this.H0.f13407c.a() : this.H0.f13408d.a();
        this.f17845y.a(new we.d(this, 3, cVarB, cVarA, sb2, this.I0.f13398y.w));
        Y(1);
        if (this.S) {
            return;
        }
        q0();
        F();
        s sVar = this.R0;
        if (sVar.m()) {
            sVar.f17955p = 0L;
            sVar.f17941a.invalidate();
        }
    }

    public final void i0(float f9, float f10) {
        if (f9 < 0.0f || f10 < 0.0f) {
            throw new IllegalArgumentException("margin can not be under zero");
        }
        this.H = f9;
        this.I = f10;
        e0();
        invalidate();
    }

    @Override // android.view.View
    public final boolean isHorizontalScrollBarEnabled() {
        return this.f17829p0;
    }

    @Override // android.view.View
    public final boolean isVerticalScrollBarEnabled() {
        return this.f17827o0;
    }

    public final void j0(int i10, int i11) {
        k0(i10, i11, 0, true);
    }

    @Override // pf.j
    public final void k(pf.h hVar) {
        this.f17805d1.getClass();
        ((dg.c) this.f17799a1).d();
        this.f17802c0 = this.H0.f13407c.a().equals(this.w);
    }

    public final void k0(int i10, int i11, int i12, boolean z3) {
        int i13;
        ((dg.c) this.f17799a1).d();
        if (i11 > 0 && Character.isHighSurrogate(this.I0.c(i10, i11 - 1)) && (i13 = i11 + 1) <= this.I0.o(i10).f13401r) {
            i11 = i13;
        }
        pf.l lVar = this.H0;
        lVar.f13407c = lVar.f13406b.B(i10, i11).a();
        lVar.f13408d = lVar.f13406b.B(i10, i11).a();
        if (this.f17823m0) {
            this.B = I();
        }
        q0();
        s0();
        if (this.U && !this.R0.g() && this.f17812h0 == 0) {
            ((dg.c) this.f17799a1).c();
            ((dg.c) this.f17799a1).e();
        }
        this.w = this.H0.f13408d.a();
        this.f17811g1.a();
        if (z3) {
            D(i10, i11);
        } else {
            invalidate();
        }
        Y(i12);
    }

    public final void l0(int i10, int i11, int i12, int i13) {
        m0(i10, i11, i12, i13, 0, true);
    }

    @Override // pf.j
    public final void m(pf.h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        ArrayList arrayList;
        yf.e eVar;
        int i14;
        yf.c cVar = this.f17811g1;
        af.a aVar = cVar.f20434a;
        q.m mVar = (q.m) aVar.f597c;
        if (i10 != i12) {
            int i15 = i12 - i10;
            if (i15 == 1) {
                if (i10 >= 0) {
                    int i16 = mVar.f13586b;
                    if (i10 <= i16) {
                        mVar.a(i16 + 1);
                        int[] iArr = mVar.f13585a;
                        int i17 = mVar.f13586b;
                        if (i10 != i17) {
                            rg.k.r0(i10 + 1, i10, i17, iArr, iArr);
                        }
                        iArr[i10] = 0;
                        mVar.f13586b++;
                    }
                } else {
                    mVar.getClass();
                }
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            int[] iArr2 = new int[i15];
            mVar.getClass();
            if (i10 < 0 || i10 > (i14 = mVar.f13586b)) {
                throw new IndexOutOfBoundsException(PredefinedUICustomizationFont.defaultFamily);
            }
            if (i15 != 0) {
                mVar.a(i14 + i15);
                int[] iArr3 = mVar.f13585a;
                int i18 = mVar.f13586b;
                if (i10 != i18) {
                    rg.k.r0(i10 + i15, i10, i18, iArr3, iArr3);
                }
                rg.k.u0(i10, 0, 12, iArr2, iArr3);
                mVar.f13586b += i15;
            }
            for (yf.a aVar2 : (ArrayList) aVar.f598d) {
                int i19 = aVar2.f20429a;
                if (i19 > i10) {
                    aVar2.f20429a = i19 + i15;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29 && (eVar = cVar.f20435b) != null) {
            for (yf.d dVar : eVar.f20440b) {
                int i20 = dVar.f20436a;
                if (i20 == i10) {
                    dVar.f20438c = true;
                } else if (i20 > i10) {
                    dVar.f20436a = (i12 - i10) + i20;
                }
            }
        }
        this.f17813h1.G();
        this.f17840v.getClass();
        pf.c cVarB = this.I0.n().B(i10, i11);
        pf.c cVarB2 = this.I0.n().B(i12, i13);
        try {
            ff.f fVar = this.f17809f1;
            if (fVar != null) {
                int i21 = cVarB2.f13384b;
                int i22 = cVarB.f13384b;
                int i23 = i21 - i22;
                if (i23 != 0 && (arrayList = fVar.f6227b) != null) {
                    k8.g.C(arrayList, i22, i23);
                }
            }
        } catch (Exception e8) {
            Log.w("CodeEditor", "Update failure", e8);
        }
        this.f17847z.m(hVar, i10, i11, i12, i13, charSequence);
        n nVar = this.f17813h1;
        nVar.c(i10, i12, nVar.f17928z, false);
        u();
        this.N0.b().B(cVarB, cVarB2, charSequence);
        s sVar = this.R0;
        if (sVar.m()) {
            sVar.f17955p = 0L;
            sVar.f17941a.invalidate();
        }
        if (this.U && !this.H0.a() && !this.f17843x.f17866b.a() && this.f17812h0 == 0) {
            ((dg.c) this.f17799a1).c();
            ((dg.c) this.f17799a1).e();
        }
        this.w = this.f17802c0 ? this.H0.f13407c.a() : this.H0.f13408d.a();
        this.f17845y.a(new we.d(this, 2, cVarB, cVarB2, charSequence, this.I0.f13398y.w));
        Y(1);
        cVarB.a();
        cVarB2.a();
        this.S = false;
        F();
        q0();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0(int r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.m0(int, int, int, int, int, boolean):void");
    }

    public final void n0(boolean z3, boolean z10) {
        if (this.V == z3 && this.f17835s0 == z10) {
            return;
        }
        this.V = z3;
        this.f17835s0 = z10;
        e0();
        z(true);
        if (!z3) {
            this.f17811g1.a();
        }
        invalidate();
    }

    public final void o0(Class cls, we.q qVar) {
        this.f17845y.f(cls, qVar);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17845y.a(new we.a(this));
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return isEnabled() && P();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.R0.i();
        this.f17800b0 = false;
        this.f17798a0 = false;
    }

    @Override // android.view.View
    public final void onCreateContextMenu(ContextMenu contextMenu) {
        super.onCreateContextMenu(contextMenu);
        PointF pointF = this.R0.F;
        if (pointF == null) {
            return;
        }
        long J = J(pointF.x, pointF.y);
        this.f17845y.a(new we.f(this, contextMenu, this.I0.n().B((int) (J >> 32), (int) (J & 4294967295L))));
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!P() || !isEnabled()) {
            return null;
        }
        if (v()) {
            int i10 = this.D;
            if (i10 == 0) {
                i10 = 131073;
            }
            editorInfo.inputType = i10;
        } else {
            editorInfo.inputType = 0;
        }
        editorInfo.initialSelStart = getCursor() != null ? getCursor().f13407c.f13383a : 0;
        editorInfo.initialSelEnd = getCursor() != null ? getCursor().f13408d.f13383a : 0;
        editorInfo.initialCapsMode = this.f17843x.getCursorCapsMode(0);
        this.f17805d1.getClass();
        editorInfo.imeOptions = 301989888;
        this.f17845y.a(new we.a(this));
        f fVar = this.f17843x;
        pf.h text = fVar.f17865a.getText();
        while (text.f13395u > 0) {
            text.k();
        }
        pf.e eVar = fVar.f17866b;
        eVar.f13389b = -1;
        eVar.f13388a = -1;
        eVar.f13390c = false;
        fVar.f17867c = false;
        this.I0.f13395u = 0;
        setExtracting(null);
        return this.f17843x;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f17845y.a(new we.a(this));
        d dVar = this.f17803c1;
        dVar.f17851s = false;
        removeCallbacks(dVar);
    }

    @Override // android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        f fVar;
        int action = dragEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action != 6) {
                        return super.onDragEvent(dragEvent);
                    }
                    this.R0.I = null;
                    postInvalidate();
                    return true;
                }
                s sVar = this.R0;
                pf.c cVar = sVar.I;
                if (cVar == null) {
                    return false;
                }
                sVar.I = null;
                j0(cVar.f13384b, cVar.f13385c);
                String strA = tf.h.a(dragEvent.getClipData());
                if (strA != null && (fVar = this.f17843x) != null) {
                    fVar.commitText(strA, 1);
                    this.f17805d1.getClass();
                    X();
                }
                requestFocus();
                postInvalidate();
                super.onDragEvent(dragEvent);
                return true;
            }
            long J = J(dragEvent.getX(), dragEvent.getY());
            this.R0.I = getText().n().B((int) (J >> 32), (int) (J & 4294967295L));
            postInvalidate();
            this.R0.k(null, dragEvent.getX(), dragEvent.getY());
        }
        return true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        n nVar = this.f17813h1;
        nVar.getClass();
        int iSave = canvas.save();
        canvas.translate(nVar.f17919p.getOffsetX(), nVar.f17919p.getOffsetY());
        nVar.G = true;
        try {
            nVar.s(canvas);
            nVar.G = false;
            canvas.restoreToCount(iSave);
            if (!(this.f17839u0 == this.f17803c1.f17850r && this.R0.f17942b.f17930b.isFinished()) && this.R0.f17944d.f19247b.isShowing()) {
                this.f17839u0 = this.f17803c1.f17850r;
                wf.v vVar = this.R0.f17944d;
                Objects.requireNonNull(vVar);
                b0(new androidx.activity.b(12, vVar));
            }
        } catch (Throwable th2) {
            nVar.G = false;
            throw th2;
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i10, Rect rect) {
        super.onFocusChanged(z3, i10, rect);
        if (z3) {
            d dVar = this.f17803c1;
            boolean z10 = dVar.f17853u > 0;
            dVar.f17851s = z10;
            if (z10) {
                b0(dVar);
            }
        } else {
            d dVar2 = this.f17803c1;
            dVar2.f17851s = false;
            dVar2.f17850r = false;
            s sVar = this.R0;
            if (sVar.m()) {
                sVar.f17955p = 0L;
                sVar.f17941a.invalidate();
            }
            removeCallbacks(this.f17803c1);
        }
        this.f17845y.a(new we.h(this, z3));
        invalidate();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.isFromSource(8194)) {
            if (motionEvent.getAction() == 9) {
                this.f17798a0 = true;
            } else if (motionEvent.getAction() == 10) {
                this.f17798a0 = false;
            }
            if (motionEvent.getActionMasked() == 11 || motionEvent.getActionMasked() == 12) {
                this.f17800b0 = motionEvent.getButtonState() != 0;
            }
            int action = motionEvent.getAction();
            if (action == 7 || action == 9 || action == 10) {
                this.R0.b(new b(0), null, motionEvent);
                return true;
            }
        }
        if (motionEvent.getAction() == 8 && motionEvent.isFromSource(2)) {
            u5.c cVar = this.f17814i;
            if (!((sf.a) cVar.f17649s).f15759c) {
                float f9 = -motionEvent.getAxisValue(9);
                float f10 = -motionEvent.getAxisValue(10);
                float f11 = this.M;
                float f12 = this.f17805d1.V;
                float f13 = f10 * f11 * f12;
                float f14 = f9 * f11 * f12;
                if (((sf.a) cVar.f17649s).a()) {
                    float f15 = this.f17805d1.P;
                    f13 *= f15;
                    f14 *= f15;
                }
                if (((sf.a) cVar.f17649s).b()) {
                    float f16 = f14;
                    f14 = f13;
                    f13 = f16;
                }
                this.R0.onScroll(motionEvent, motionEvent, f13, f14);
                return true;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        int scrollMaxY = getScrollMaxY();
        accessibilityEvent.setScrollable(scrollMaxY > 0);
        accessibilityEvent.setMaxScrollX(getScrollMaxX());
        accessibilityEvent.setMaxScrollY(scrollMaxY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x08b1 A[Catch: Exception -> 0x08c8, TRY_LEAVE, TryCatch #1 {Exception -> 0x08c8, blocks: (B:432:0x0894, B:434:0x08b1), top: B:507:0x0894 }] */
    /* JADX WARN: Type inference failed for: r15v27, types: [boolean, int] */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r31, android.view.KeyEvent r32) {
        /*
            Method dump skipped, instruction units count: 2710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i10, int i11, KeyEvent keyEvent) {
        c cVar = (c) this.f17814i.f17648r;
        we.j jVar = new we.j(cVar, keyEvent, 3);
        return (cVar.f17845y.a(jVar) & 2) != 0 ? jVar.B(false) : jVar.B(super.onKeyMultiple(i10, i11, keyEvent));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        u5.c cVar = this.f17814i;
        sf.a aVar = (sf.a) cVar.f17649s;
        aVar.onKeyUp(aVar.f15757a, aVar.f15758b, keyEvent.getKeyCode(), keyEvent);
        aVar.f15759c = keyEvent.isCtrlPressed();
        c cVar2 = (c) cVar.f17648r;
        we.p pVar = cVar2.f17845y;
        cVar2.getCursor();
        we.j jVar = new we.j(cVar2, keyEvent, 1);
        if ((pVar.a(jVar) & 2) != 0) {
            return jVar.B(false);
        }
        if (cVar.r(i10, keyEvent)) {
            keyEvent.isCtrlPressed();
            aVar.b();
            aVar.a();
            we.t tVar = new we.t(cVar2, keyEvent, 1);
            if ((pVar.a(tVar) & 2) != 0) {
                return tVar.B(false) || jVar.B(false);
            }
        }
        return jVar.B(super.onKeyUp(i10, keyEvent));
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z3;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int i12;
        int i13;
        int iMakeMeasureSpec3;
        int i14;
        int i15 = 0;
        if (View.MeasureSpec.getMode(i10) == 1073741824 && View.MeasureSpec.getMode(i11) == 1073741824) {
            this.f17846y0 = false;
            i12 = i10;
            i13 = i11;
        } else {
            Log.w("CodeEditor", "use wrap_content in editor may cause layout lags");
            float fU = U();
            float rowHeight = getRowHeight();
            boolean z10 = this.V;
            int i16 = this.A;
            pf.h hVar = this.I0;
            final xe.c cVar = this.f17813h1.f17906b;
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int size = mode == 0 ? 1073741823 : View.MeasureSpec.getSize(i10);
            int size2 = mode2 != 0 ? View.MeasureSpec.getSize(i11) : 1073741823;
            final xe.d dVar = new xe.d(i16);
            boolean z11 = true;
            if (z10) {
                if (mode != 1073741824) {
                    int[] iArr = mode2 != 1073741824 ? new int[hVar.f13391i.size()] : null;
                    hVar.y(hVar.f13391i.size() - 1, new ui.m(dVar, cVar, new tf.f(0), iArr));
                    int iMin = (int) Math.min(size, r9.f17181a + fU);
                    int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    if (iArr != null) {
                        int i17 = (int) (iMin - fU);
                        if (i17 <= 0) {
                            i14 = hVar.f13394t;
                        } else {
                            int iMax = 0;
                            while (i15 < iArr.length) {
                                iMax = (int) (Math.max(1.0d, Math.ceil((((double) iArr[i15]) * 1.0d) / ((double) i17))) + ((double) iMax));
                                i15++;
                                z11 = z11;
                            }
                            i14 = iMax;
                        }
                        z3 = z11;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(Math.min((int) (rowHeight * i14), size2), 1073741824);
                    } else {
                        z3 = true;
                        iMakeMeasureSpec3 = i11;
                    }
                    iMakeMeasureSpec2 = iMakeMeasureSpec3;
                    iMakeMeasureSpec = iMakeMeasureSpec4;
                } else {
                    z3 = true;
                    if (mode2 != 1073741824) {
                        final tf.f fVar = new tf.f(0);
                        final int i18 = (int) (size - fU);
                        if (i18 <= 0) {
                            fVar.f17181a = hVar.f13394t;
                        } else {
                            hVar.y(hVar.f13391i.size() - 1, new pf.g() { // from class: xf.m
                                @Override // pf.g
                                public final void a(int i19, pf.i iVar, qf.b bVar) {
                                    char[] cArr = iVar.f13400i;
                                    int i20 = iVar.f13401r;
                                    int iCeil = (int) Math.ceil(dVar.b(new pf.b(cArr, cArr.length), 0, i20, cVar));
                                    tf.f fVar2 = fVar;
                                    fVar2.f17181a = (int) (Math.max(1.0d, Math.ceil((((double) iCeil) * 1.0d) / ((double) i18))) + ((double) fVar2.f17181a));
                                }
                            });
                        }
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.min((int) (rowHeight * fVar.f17181a), size2), 1073741824);
                        iMakeMeasureSpec = i10;
                    } else {
                        iMakeMeasureSpec = i10;
                    }
                }
                long jE = tf.h.e(iMakeMeasureSpec, iMakeMeasureSpec2);
                i12 = (int) (jE >> 32);
                i13 = (int) (jE & 4294967295L);
                this.f17846y0 = z3;
            } else {
                z3 = true;
                if (mode != 1073741824) {
                    hVar.y(hVar.f13391i.size() - 1, new n7.b(dVar, cVar, new tf.f(0), 4));
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) Math.min(r5.f17181a + fU, size), 1073741824);
                } else {
                    iMakeMeasureSpec = i10;
                }
                iMakeMeasureSpec2 = mode2 != 1073741824 ? View.MeasureSpec.makeMeasureSpec(Math.min(size2, (int) (rowHeight * hVar.f13391i.size())), 1073741824) : i11;
                long jE2 = tf.h.e(iMakeMeasureSpec, iMakeMeasureSpec2);
                i12 = (int) (jE2 >> 32);
                i13 = (int) (jE2 & 4294967295L);
                this.f17846y0 = z3;
            }
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i10) {
        int i11;
        if (!motionEvent.isFromSource(8194)) {
            return super.onResolvePointerIcon(motionEvent, i10);
        }
        Q();
        if (this.f17804d0) {
            return PointerIcon.getSystemIcon(getContext(), 1004);
        }
        if (this.R0.g()) {
            return PointerIcon.getSystemIcon(getContext(), 1021);
        }
        if (getLeftHandleDescriptor().f3519a.contains(motionEvent.getX(), motionEvent.getY()) || getRightHandleDescriptor().f3519a.contains(motionEvent.getX(), motionEvent.getY()) || getInsertHandleDescriptor().f3519a.contains(motionEvent.getX(), motionEvent.getY())) {
            return PointerIcon.getSystemIcon(getContext(), 1020);
        }
        long J = a.a.J(this, motionEvent, i10);
        int i12 = (int) (J >> 32);
        boolean z3 = ((int) (J & 4294967295L)) == 0;
        if (i12 != 5 || !z3) {
            return (i12 == 1 && ((i11 = this.f17805d1.K) == 1 || i11 == 2)) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i10);
        }
        s sVar = this.R0;
        if (sVar.H && !sVar.G) {
            return PointerIcon.getSystemIcon(getContext(), 1021);
        }
        this.f17813h1.getClass();
        return PointerIcon.getSystemIcon(getContext(), 1008);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Rect rect = this.f17813h1.f17908d;
        rect.right = i10;
        rect.bottom = i11;
        getVerticalEdgeEffect().setSize(i10, i11);
        getHorizontalEdgeEffect().setSize(i11, i10);
        getVerticalEdgeEffect().finish();
        getHorizontalEdgeEffect().finish();
        if (this.f17847z == null || (this.V && i10 != i12)) {
            z(true);
        } else {
            this.R0.j(getOffsetX() > getScrollMaxX() ? getScrollMaxX() - getOffsetX() : 0.0f, getOffsetY() > getScrollMaxY() ? getScrollMaxY() - getOffsetY() : 0.0f, false);
        }
        this.f17822l1 = false;
        this.f17824m1 = false;
        if (i13 <= i11 || !this.f17805d1.A) {
            return;
        }
        F();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0266  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 727
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p0() {
        pf.q qVar;
        int i10;
        pf.h hVar = this.I0;
        pf.x xVar = hVar.f13398y;
        if (!xVar.f13448r || (i10 = xVar.f13452v) <= 0 || xVar.w) {
            qVar = null;
        } else {
            xVar.w = true;
            pf.s sVar = (pf.s) xVar.f13447i.get(i10 - 1);
            sVar.d(hVar);
            xVar.f13452v--;
            xVar.w = false;
            qVar = sVar.f13433i;
        }
        if (qVar != null) {
            try {
                pf.c cVar = qVar.f13427a;
                int i11 = cVar.f13384b;
                int i12 = cVar.f13385c;
                pf.c cVar2 = qVar.f13428b;
                m0(i11, i12, cVar2.f13384b, cVar2.f13385c, 1, true);
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        X();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        if (i10 == 4096) {
            W(v.f17975y);
            return true;
        }
        if (i10 == 8192) {
            W(v.f17976z);
            return true;
        }
        if (i10 == 16384) {
            x(true);
            return true;
        }
        if (i10 == 32768) {
            Z();
            return true;
        }
        if (i10 == 65536) {
            A();
            return true;
        }
        if (i10 == 2097152) {
            setText(bundle.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"));
            return true;
        }
        if (i10 == 16908344) {
            W(v.f17976z);
            return true;
        }
        if (i10 != 16908346) {
            return super.performAccessibilityAction(i10, bundle);
        }
        W(v.f17975y);
        return true;
    }

    public final void q0() {
        r0();
        ExtractedTextRequest extractedTextRequest = this.Y0;
        if (extractedTextRequest != null) {
            ExtractedText extractedTextH = H(extractedTextRequest);
            this.G0.updateExtractedText(this, this.Y0.token, extractedTextH);
        }
        if (this.I0.f13395u > 1 || this.f17843x.f17866b.a()) {
            return;
        }
        s0();
    }

    public final float r0() {
        float f9;
        boolean z3;
        pf.c cVar = this.H0.f13408d;
        float fU = (U() + this.f17847z.r(cVar.f13384b, cVar.f13385c)[1]) - getOffsetX();
        if (fU < 0.0f) {
            f9 = 0.0f;
            z3 = false;
        } else {
            f9 = fU;
            z3 = true;
        }
        pf.e eVar = this.f17843x.f17866b;
        if (!eVar.f13390c && this.f17805d1.S) {
            CursorAnchorInfo.Builder builder = this.V0;
            builder.reset();
            this.J0.set(getMatrix());
            getLocationOnScreen(new int[2]);
            this.J0.postTranslate(r8[0], r8[1]);
            builder.setMatrix(this.J0);
            pf.l lVar = this.H0;
            builder.setSelectionRange(lVar.f13407c.f13383a, lVar.f13408d.f13383a);
            if (eVar.a()) {
                int i10 = eVar.f13388a;
                builder.setComposingText(i10, this.I0.C(i10, eVar.f13389b));
            }
            builder.setInsertionMarkerLocation(f9, (getRowHeight() * r1) - getOffsetY(), K(r1) - getOffsetY(), L(r1) - getOffsetY(), z3 ? 1 : 2);
            this.G0.updateCursorAnchorInfo(this, builder.build());
        }
        return f9;
    }

    @Override // android.view.View
    public final boolean removeCallbacks(Runnable runnable) {
        tf.d.f17178a.removeCallbacks(runnable);
        return super.removeCallbacks(runnable);
    }

    public final void s0() {
        int i10;
        int i11;
        int i12;
        this.f17805d1.getClass();
        pf.e eVar = this.f17843x.f17866b;
        if (eVar.f13390c) {
            return;
        }
        int i13 = -1;
        if (eVar.a()) {
            try {
                pf.e eVar2 = this.f17843x.f17866b;
                i10 = eVar2.f13388a;
                try {
                    i13 = eVar2.f13389b;
                } catch (IndexOutOfBoundsException unused) {
                }
            } catch (IndexOutOfBoundsException unused2) {
                i10 = -1;
            }
            i11 = i13;
            i12 = i10;
        } else {
            i12 = -1;
            i11 = -1;
        }
        pf.l lVar = this.H0;
        this.G0.updateSelection(this, lVar.f13407c.f13383a, lVar.f13408d.f13383a, i12, i11);
    }

    public void setBlockLineEnabled(boolean z3) {
        this.f17819k0 = z3;
        invalidate();
    }

    public void setBlockLineWidth(float f9) {
        this.K = f9;
        invalidate();
    }

    public void setColorScheme(zf.a aVar) {
        zf.a aVar2 = this.K0;
        if (aVar2 != null) {
            aVar2.d(this);
        }
        this.K0 = aVar;
        aVar.c(this);
        invalidate();
    }

    public void setCursorAnimationEnabled(boolean z3) {
        if (!z3) {
            ((dg.c) this.f17799a1).a();
        }
        this.f17831q0 = z3;
    }

    public void setCursorAnimator(cg.a aVar) {
        this.f17799a1 = aVar;
    }

    public void setCursorBlinkPeriod(int i10) {
        d dVar = this.f17803c1;
        if (dVar == null) {
            this.f17803c1 = new d(this, i10);
            return;
        }
        int i11 = dVar.f17853u;
        dVar.f17853u = i10;
        if (i10 <= 0) {
            dVar.f17850r = true;
            dVar.f17851s = false;
        } else {
            dVar.f17851s = true;
        }
        if (i11 <= 0 && dVar.f17851s && isAttachedToWindow()) {
            b0(this.f17803c1);
        }
    }

    public void setCursorWidth(float f9) {
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("width can not be under zero");
        }
        this.J = f9;
        invalidate();
    }

    public void setDiagnosticIndicatorStyle(cg.b bVar) {
        this.O0 = bVar;
        invalidate();
    }

    public void setDiagnostics(df.a aVar) {
        invalidate();
    }

    public void setDisableSoftKbdIfHardKbdAvailable(boolean z3) {
        if (this.B0 == z3) {
            return;
        }
        this.B0 = z3;
        this.G0.hideSoftInputFromWindow(getWindowToken(), 0);
        f0();
    }

    public void setDisplayLnPanel(boolean z3) {
        this.f17806e0 = z3;
        invalidate();
    }

    public void setDividerMargin(float f9) {
        i0(f9, f9);
    }

    public void setDividerWidth(float f9) {
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("width can not be under zero");
        }
        this.G = f9;
        e0();
        invalidate();
    }

    public void setEdgeEffectColor(int i10) {
        this.W0.setColor(i10);
        this.X0.setColor(i10);
    }

    public void setEditable(boolean z3) {
        this.U = z3;
        if (z3) {
            return;
        }
        this.G0.hideSoftInputFromWindow(getWindowToken(), 0);
        this.f17828o1.getClass();
    }

    public void setEditorLanguage(ze.c cVar) {
        if (cVar == null) {
            cVar = new ze.b();
        }
        ze.c cVar2 = this.N0;
        if (cVar2 != null) {
            cVar2.b().f1693a = null;
            cVar2.b().p();
        }
        n7.e eVar = this.f17840v;
        eVar.f12173s = null;
        eVar.f12174t = null;
        this.N0 = cVar;
        this.f17809f1 = null;
        androidx.fragment.app.h hVarB = cVar.b();
        hVarB.f1693a = this.f17840v;
        pf.h hVar = this.I0;
        if (hVar != null) {
            hVarB.G(new pf.k(hVar), this.f17807e1);
        }
        n7.e eVar2 = this.f17832r;
        if (eVar2 != null) {
            eVar2.f12174t = null;
        }
        n7.e eVarC = this.N0.c();
        this.f17832r = eVarC;
        if (eVarC == null) {
            Log.w("CodeEditor", "Language(" + this.N0.toString() + ") returned null for symbol pairs. It is a mistake.");
            this.f17832r = new n7.e((w) null);
        }
        this.f17832r.f12174t = this.f17805d1.f17855i;
        this.f17811g1.a();
        invalidate();
    }

    public void setExtracting(ExtractedTextRequest extractedTextRequest) {
        getProps().getClass();
        this.Y0 = extractedTextRequest;
    }

    public void setFirstLineNumberAlwaysVisible(boolean z3) {
        this.f17837t0 = z3;
        if (this.V) {
            invalidate();
        }
    }

    public void setFontFeatureSettings(String str) {
        xe.c cVar = this.f17813h1.f17906b;
        cVar.setFontFeatureSettings(str);
        cVar.b();
        this.f17813h1.f17907c.setFontFeatureSettings(str);
        this.f17813h1.f17911g.setFontFeatureSettings(str);
        this.f17813h1.G();
        invalidate();
    }

    public void setFormatTip(String str) {
        Objects.requireNonNull(str);
        this.M0 = str;
    }

    public void setHardwareAcceleratedDrawAllowed(boolean z3) {
        this.f17816i1 = z3;
        if (!z3 || this.V) {
            return;
        }
        this.f17811g1.a();
    }

    public void setHighlightBracketPair(boolean z3) {
        this.f17842w0 = z3;
        if (z3) {
            n7.e eVar = this.f17840v;
            eVar.getClass();
            eVar.D(new androidx.activity.b(14, eVar));
        } else {
            this.f17840v.f12173s = null;
        }
        invalidate();
    }

    public void setHighlightCurrentBlock(boolean z3) {
        this.f17823m0 = z3;
        if (z3) {
            this.B = I();
        } else {
            this.B = -1;
        }
        invalidate();
    }

    public void setHighlightCurrentLine(boolean z3) {
        this.f17825n0 = z3;
        invalidate();
    }

    public void setHighlightTexts(ff.c cVar) {
        new q.o();
    }

    @Override // android.view.View
    public void setHorizontalScrollBarEnabled(boolean z3) {
        this.f17829p0 = z3;
    }

    @Override // android.view.View
    public void setHorizontalScrollbarThumbDrawable(Drawable drawable) {
        this.f17813h1.f17922s = drawable;
    }

    @Override // android.view.View
    public void setHorizontalScrollbarTrackDrawable(Drawable drawable) {
        this.f17813h1.f17923t = drawable;
    }

    public void setInlayHints(gf.a aVar) {
        mf.a aVar2 = new mf.a(new q.o());
        if (this.f17804d0) {
            z(true);
        } else {
            this.f17847z.f(aVar2);
        }
        this.f17811g1.a();
    }

    public void setInputType(int i10) {
        this.D = i10;
        f0();
    }

    public void setInterceptParentHorizontalScrollIfNeeded(boolean z3) {
        ViewParent parent;
        this.f17821l0 = z3;
        if (z3 || (parent = getParent()) == null) {
            return;
        }
        parent.requestDisallowInterceptTouchEvent(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLayoutBusy(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.f17804d0
            if (r0 == 0) goto L76
            if (r11 != 0) goto L76
            boolean r11 = r10.V
            r0 = 0
            if (r11 == 0) goto L62
            uf.s r11 = r10.R0
            boolean r1 = r11.Q
            if (r1 == 0) goto L62
            r11.Q = r0
            long r1 = r11.P
            r11 = 32
            long r3 = r1 >> r11
            int r11 = (int) r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            int r1 = (int) r1
            xf.d r2 = r10.f17847z
            xf.q r2 = (xf.q) r2
            int r11 = r2.x(r11, r1)
            int r1 = r10.getRowHeight()
            int r1 = r1 * r11
            float r11 = (float) r1
            uf.s r1 = r10.R0
            float r2 = r1.R
            float r11 = r11 - r2
            uf.o r2 = r1.f17942b
            we.v r3 = new we.v
            android.widget.OverScroller r1 = r2.f17930b
            int r5 = r1.getCurrX()
            android.widget.OverScroller r1 = r2.f17930b
            int r6 = r1.getCurrY()
            int r4 = (int) r11
            r9 = 5
            r7 = 0
            r8 = r4
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r1 = r4
            r4 = r8
            we.p r11 = r1.f17845y
            r11.a(r3)
            r6 = 0
            r3 = 0
            r5 = 0
            r2.b(r3, r4, r5, r6, r7)
            android.widget.OverScroller r11 = r2.f17930b
            r11.abortAnimation()
            r2.a()
            goto L63
        L62:
            r1 = r10
        L63:
            r1.f17804d0 = r0
            r10.f0()
            r10.postInvalidate()
            we.a r11 = new we.a
            r11.<init>(r10)
            we.p r0 = r1.f17845y
            r0.a(r11)
            return
        L76:
            r1 = r10
            boolean r0 = r1.f17804d0
            if (r0 != r11) goto L7c
            return
        L7c:
            r1.f17804d0 = r11
            we.a r11 = new we.a
            r11.<init>(r10)
            we.p r0 = r1.f17845y
            r0.a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.setLayoutBusy(boolean):void");
    }

    public void setLigatureEnabled(boolean z3) {
        setFontFeatureSettings(z3 ? null : "'liga' 0,'calt' 0,'hlig' 0,'dlig' 0,'clig' 0");
    }

    public void setLineInfoTextSize(float f9) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException();
        }
        this.N = f9;
    }

    public void setLineNumberAlign(Paint.Align align) {
        if (align == null) {
            align = Paint.Align.LEFT;
        }
        this.S0 = align;
        invalidate();
    }

    public void setLineNumberEnabled(boolean z3) {
        if (z3 != this.f17817j0 && this.V) {
            z(true);
        }
        this.f17817j0 = z3;
        invalidate();
    }

    public void setLineNumberMarginLeft(float f9) {
        this.Q = f9;
        e0();
        invalidate();
    }

    public void setLineNumberTipTextProvider(cg.c cVar) {
        Objects.requireNonNull(cVar, "Provider can not be null");
        this.L0 = cVar;
        invalidate();
    }

    public void setLineSeparator(pf.o oVar) {
        Objects.requireNonNull(oVar);
        if (oVar == pf.o.NONE) {
            throw new IllegalArgumentException();
        }
        this.f17826n1 = oVar;
    }

    public void setLineSpacingExtra(float f9) {
        this.P = f9;
        invalidate();
    }

    public void setLineSpacingMultiplier(float f9) {
        this.O = f9;
        invalidate();
    }

    public void setLnPanelPosition(int i10) {
        this.f17808f0 = i10;
        invalidate();
    }

    public void setLnPanelPositionMode(int i10) {
        this.f17810g0 = i10;
        invalidate();
    }

    public void setNonPrintablePaintingFlags(int i10) {
        int i11 = this.E;
        this.E = i10;
        if ((i11 & 128) != (i10 & 128)) {
            z(true);
        }
        invalidate();
    }

    public void setPinLineNumber(boolean z3) {
        this.f17833r0 = z3;
        if (this.f17817j0) {
            invalidate();
        }
    }

    public void setRenderFunctionCharacters(boolean z3) {
        if (this.f17848z0 != z3) {
            this.f17848z0 = z3;
            this.f17813h1.C();
            e0();
            z(true);
            invalidate();
        }
    }

    public void setScalable(boolean z3) {
        this.T = z3;
    }

    public void setScrollBarEnabled(boolean z3) {
        this.f17829p0 = z3;
        this.f17827o0 = z3;
        invalidate();
    }

    public void setSelectionHandleStyle(cg.e eVar) {
        Objects.requireNonNull(eVar);
        this.f17801b1 = eVar;
        invalidate();
    }

    public void setSoftKeyboardEnabled(boolean z3) {
        if (this.A0 == z3) {
            return;
        }
        this.A0 = z3;
        this.G0.hideSoftInputFromWindow(getWindowToken(), 0);
        f0();
    }

    public void setStickyTextSelection(boolean z3) {
        this.f17841v0 = z3;
    }

    public void setStyles(ff.f fVar) {
        this.f17809f1 = fVar;
        if (this.f17823m0) {
            this.B = I();
        }
        this.f17811g1.a();
        this.f17813h1.G();
        invalidate();
    }

    public void setTabWidth(int i10) {
        if (i10 < 1) {
            throw new IllegalArgumentException("width can not be under 1");
        }
        this.A = i10;
        this.f17811g1.a();
        this.f17813h1.G();
        e0();
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = PredefinedUICustomizationFont.defaultFamily;
        }
        pf.h hVar = this.I0;
        if (hVar != null) {
            hVar.f13392r.remove(this);
            this.I0.f13395u = 0;
        }
        this.f17807e1 = new Bundle();
        if (charSequence instanceof pf.h) {
            pf.h hVar2 = (pf.h) charSequence;
            this.I0 = hVar2;
            hVar2.f13395u = 0;
            this.f17813h1.G();
        } else {
            this.I0 = new pf.h(charSequence, true);
        }
        n7.e eVar = this.f17840v;
        eVar.f12173s = null;
        eVar.f12174t = null;
        this.f17809f1 = null;
        pf.l lVarM = this.I0.m();
        this.H0 = lVarM;
        this.w = lVarM.f13408d.a();
        s sVar = this.R0;
        sVar.f17942b.b(0, 0, 0, 0, 0);
        sVar.f17956q = false;
        sVar.f17957r = false;
        sVar.f17945e = -1;
        sVar.e();
        sVar.f17944d.a();
        this.I0.a(this);
        this.I0.z(this.W);
        pf.h hVar3 = this.I0;
        hVar3.f13397x.f13901r = true;
        int size = hVar3.f13391i.size();
        af.a aVar = this.f17811g1.f20434a;
        q.m mVar = (q.m) aVar.f597c;
        int i10 = mVar.f13586b;
        if (i10 > size) {
            mVar.c(size, i10);
        } else if (i10 < size) {
            int i11 = size - i10;
            for (int i12 = 0; i12 < i11; i12++) {
                mVar.a(mVar.f13586b + 1);
                int[] iArr = mVar.f13585a;
                int i13 = mVar.f13586b;
                iArr[i13] = 0;
                mVar.f13586b = i13 + 1;
            }
        }
        kh.c cVarB = gh.a.F(0, mVar.f13586b).iterator();
        while (cVarB.f9626s) {
            int iNextInt = cVarB.nextInt();
            if (iNextInt < 0 || iNextInt >= mVar.f13586b) {
                throw new IndexOutOfBoundsException("Index must be between 0 and size");
            }
            int[] iArr2 = mVar.f13585a;
            int i14 = iArr2[iNextInt];
            iArr2[iNextInt] = 0;
        }
        ((ArrayList) aVar.f598d).clear();
        n nVar = this.f17813h1;
        c cVar = nVar.f17919p;
        nVar.D = cVar.getCursor();
        nVar.F = cVar.getText();
        ze.c cVar2 = this.N0;
        if (cVar2 != null) {
            cVar2.b().G(new pf.k(this.I0), this.f17807e1);
            this.N0.getClass();
        }
        this.f17845y.a(new we.d(this, 1, new pf.c(), this.I0.n().B(getLineCount() - 1, this.I0.o(getLineCount() - 1).f13401r), this.I0, false));
        z(true);
        InputMethodManager inputMethodManager = this.G0;
        if (inputMethodManager != null) {
            inputMethodManager.restartInput(this);
        }
        requestLayout();
        this.f17811g1.a();
        invalidate();
    }

    public void setTextBorderWidth(float f9) {
        if (f9 < 0.0f) {
            throw new IllegalArgumentException("width can not be under zero");
        }
        this.L = f9;
        invalidate();
    }

    public void setTextLetterSpacing(float f9) {
        n nVar = this.f17813h1;
        nVar.f17906b.setLetterSpacing(f9);
        nVar.f17907c.setLetterSpacing(f9);
        nVar.C();
        e0();
    }

    public void setTextScaleX(float f9) {
        n nVar = this.f17813h1;
        nVar.f17906b.setTextScaleX(f9);
        nVar.f17907c.setTextScaleX(f9);
        nVar.C();
    }

    public void setTextSize(float f9) {
        Context context = getContext();
        setTextSizePx(TypedValue.applyDimension(2, f9, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setTextSizePx(float f9) {
        setTextSizePxDirect(f9);
        e0();
        z(true);
        invalidate();
    }

    public void setTextSizePxDirect(float f9) {
        getTextSizePx();
        n nVar = this.f17813h1;
        xe.c cVar = nVar.f17906b;
        cVar.setTextSize(f9);
        cVar.b();
        xe.c cVar2 = nVar.f17907c;
        cVar2.setTextSize(f9);
        xe.c cVar3 = nVar.f17911g;
        c cVar4 = nVar.f17919p;
        Objects.requireNonNull(cVar4.getProps());
        cVar3.setTextSize(f9 * 0.85f);
        nVar.f17921r = cVar.getFontMetricsInt();
        nVar.A = cVar2.getFontMetricsInt();
        nVar.B = cVar3.getFontMetricsInt();
        cVar4.getRenderContext().a();
        nVar.G();
        this.f17845y.a(new we.y(this));
    }

    public void setTypefaceLineNumber(Typeface typeface) {
        n nVar = this.f17813h1;
        xe.c cVar = nVar.f17907c;
        if (typeface == null) {
            typeface = Typeface.MONOSPACE;
        }
        cVar.setTypeface(typeface);
        nVar.A = cVar.getFontMetricsInt();
        nVar.f17919p.invalidate();
        e0();
    }

    public void setTypefaceText(Typeface typeface) {
        n nVar = this.f17813h1;
        xe.c cVar = nVar.f17906b;
        c cVar2 = nVar.f17919p;
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        cVar.setTypeface(typeface);
        cVar.b();
        nVar.f17921r = cVar.getFontMetricsInt();
        cVar2.getRenderContext().a();
        nVar.G();
        cVar2.z(true);
        cVar2.invalidate();
        e0();
    }

    public void setUndoEnabled(boolean z3) {
        this.W = z3;
        pf.h hVar = this.I0;
        if (hVar != null) {
            hVar.z(z3);
        }
    }

    public void setVerticalExtraSpaceFactor(float f9) {
        if (f9 < 0.0f || f9 > 1.0f) {
            throw new IllegalArgumentException("the factor should be in range [0.0, 1.0]");
        }
        this.R = f9;
        this.R0.j(0.0f, 0.0f, false);
    }

    @Override // android.view.View
    public void setVerticalScrollBarEnabled(boolean z3) {
        this.f17827o0 = z3;
    }

    @Override // android.view.View
    public void setVerticalScrollbarThumbDrawable(Drawable drawable) {
        this.f17813h1.f17924u = drawable;
    }

    @Override // android.view.View
    public void setVerticalScrollbarTrackDrawable(Drawable drawable) {
        this.f17813h1.f17925v = drawable;
    }

    public void setWordwrap(boolean z3) {
        n0(z3, true);
    }

    public final void u() {
        ViewGroup.LayoutParams layoutParams;
        if (!this.f17846y0 || (layoutParams = getLayoutParams()) == null) {
            return;
        }
        if (layoutParams.width == -2) {
            requestLayout();
        } else {
            if (layoutParams.height != -2 || getHeight() == this.f17847z.c()) {
                return;
            }
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v() {
        /*
            r4 = this;
            boolean r0 = r4.B0
            if (r0 == 0) goto L21
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r0 != 0) goto Ld
        Lb:
            r3 = r1
            goto L1e
        Ld:
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r2 = r0.keyboard
            r3 = 1
            if (r2 != r3) goto L1e
            int r0 = r0.hardKeyboardHidden
            if (r0 != r3) goto Lb
        L1e:
            if (r3 == 0) goto L21
            return r1
        L21:
            boolean r0 = r4.A0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.v():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0226  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.lang.CharSequence r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 583
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.c.w(java.lang.CharSequence, boolean):void");
    }

    public final void x(boolean z3) {
        if (this.H0.a()) {
            pf.h text = getText();
            pf.l lVar = this.H0;
            y(lVar.f13407c.f13383a, lVar.f13408d.f13383a, text);
        } else {
            if (!z3) {
                String str = getLineSeparator().f13422i;
                y(0, str.length(), str);
                return;
            }
            pf.l cursor = getCursor();
            if (cursor.a()) {
                x(true);
                return;
            }
            int i10 = cursor.f13407c.a().f13384b;
            l0(i10, 0, i10, getText().o(i10).f13401r);
            x(false);
        }
    }

    public final void y(int i10, int i11, CharSequence charSequence) {
        if (i11 < i10) {
            return;
        }
        int i12 = i11 - i10;
        int i13 = this.f17805d1.O;
        int i14 = R.string.sora_editor_clip_text_length_too_large;
        if (i12 > i13) {
            Context context = getContext();
            int i15 = ve.a.f18651a.get(R.string.sora_editor_clip_text_length_too_large);
            if (i15 != 0) {
                i14 = i15;
            }
            Toast.makeText(context, i14, 0).show();
            return;
        }
        try {
            String strC = charSequence instanceof pf.h ? ((pf.h) charSequence).C(i10, i11) : charSequence.subSequence(i10, i11).toString();
            this.F0.setPrimaryClip(ClipData.newPlainText(strC, strC));
        } catch (RuntimeException e8) {
            if (!(e8.getCause() instanceof TransactionTooLargeException)) {
                Log.w("CodeEditor", e8);
                Toast.makeText(getContext(), e8.getClass().toString(), 0).show();
                return;
            }
            Context context2 = getContext();
            int i16 = ve.a.f18651a.get(R.string.sora_editor_clip_text_length_too_large);
            if (i16 != 0) {
                i14 = i16;
            }
            Toast.makeText(context2, i14, 0).show();
        }
    }

    public final void z(boolean z3) {
        c cVar;
        xf.d dVar = this.f17847z;
        if (dVar == null) {
            cVar = this;
        } else {
            if ((dVar instanceof xf.i) && !this.V) {
                xf.i iVar = (xf.i) dVar;
                iVar.f19706r = this.I0;
                iVar.f19719t.getAndIncrement();
                xe.d dVar2 = new xe.d(iVar.f19705i.getTabWidth());
                iVar.w = dVar2;
                dVar2.f19627e = iVar.f19705i.f17848z0;
                try {
                    if (!iVar.f19720u.f17168a.tryLock(5L, TimeUnit.MILLISECONDS)) {
                        tf.c cVar2 = new tf.c();
                        iVar.f19720u = cVar2;
                        tf.c cVar3 = new tf.c();
                        iVar.f19721v = cVar3;
                        iVar.u(cVar2, cVar3);
                        return;
                    }
                    iVar.f19720u.f17168a.unlock();
                    tf.c cVar4 = iVar.f19720u;
                    cVar4.getClass();
                    cVar4.f17174g = new tf.a(cVar4);
                    cVar4.f17172e = 0;
                    cVar4.f17171d.clear();
                    cVar4.f17176i = null;
                    cVar4.f17175h = 0;
                    tf.c cVar5 = iVar.f19721v;
                    cVar5.getClass();
                    cVar5.f17174g = new tf.a(cVar5);
                    cVar5.f17172e = 0;
                    cVar5.f17171d.clear();
                    cVar5.f17176i = null;
                    cVar5.f17175h = 0;
                    iVar.u(iVar.f19720u, iVar.f19721v);
                    return;
                } catch (InterruptedException e8) {
                    throw new RuntimeException("Unable to wait for lock", e8);
                }
            }
            if ((dVar instanceof xf.q) && this.V) {
                xf.q qVar = new xf.q(this, this.I0, this.f17835s0, (xf.q) this.f17847z, z3);
                this.f17847z.n();
                this.f17847z = qVar;
                return;
            }
            cVar = this;
            dVar.n();
        }
        if (cVar.V) {
            cVar.f17813h1.C = (int) T();
            cVar.f17847z = new xf.q(cVar, cVar.I0, cVar.f17835s0, null, false);
        } else {
            cVar.f17847z = new xf.i(this, cVar.I0);
        }
        s sVar = cVar.R0;
        if (sVar != null) {
            sVar.j(0.0f, 0.0f, false);
        }
    }
}
