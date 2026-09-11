package n9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements v {
    public static final Paint M;
    public final Region A;
    public final Region B;
    public k C;
    public final Paint D;
    public final Paint E;
    public final m9.a F;
    public final mf.a G;
    public final m H;
    public PorterDuffColorFilter I;
    public PorterDuffColorFilter J;
    public final RectF K;
    public final boolean L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public f f12200i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t[] f12201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t[] f12202s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BitSet f12203t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12204u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Matrix f12205v;
    public final Path w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Path f12206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final RectF f12207y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final RectF f12208z;

    static {
        Paint paint = new Paint(1);
        M = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f12200i;
        this.H.a(fVar.f12185a, fVar.f12193i, rectF, this.G, path);
        if (this.f12200i.f12192h != 1.0f) {
            Matrix matrix = this.f12205v;
            matrix.reset();
            float f9 = this.f12200i.f12192h;
            matrix.setScale(f9, f9, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.K, true);
    }

    public final int b(int i10) {
        int i11;
        f fVar = this.f12200i;
        float f9 = fVar.f12196m + 0.0f + fVar.f12195l;
        h9.a aVar = fVar.f12186b;
        if (aVar == null || !aVar.f7653a || k3.a.g(i10, 255) != aVar.f7656d) {
            return i10;
        }
        float fMin = (aVar.f7657e <= 0.0f || f9 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f9 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iQ = gh.a.q(k3.a.g(i10, 255), fMin, aVar.f7654b);
        if (fMin > 0.0f && (i11 = aVar.f7655c) != 0) {
            iQ = k3.a.d(k3.a.g(i11, h9.a.f7652f), iQ);
        }
        return k3.a.g(iQ, iAlpha);
    }

    public final void c(Canvas canvas) {
        if (this.f12203t.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f12200i.f12198o;
        Path path = this.w;
        m9.a aVar = this.F;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f11633a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            t tVar = this.f12201r[i11];
            int i12 = this.f12200i.f12197n;
            Matrix matrix = t.f12260a;
            tVar.a(matrix, aVar, i12, canvas);
            this.f12202s[i11].a(matrix, aVar, this.f12200i.f12197n, canvas);
        }
        if (this.L) {
            double d10 = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d10)) * ((double) this.f12200i.f12198o));
            int iCos = (int) (Math.cos(Math.toRadians(d10)) * ((double) this.f12200i.f12198o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, M);
            canvas.translate(iSin, iCos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.f12226f.a(rectF) * this.f12200i.f12193i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.I;
        Paint paint = this.D;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i10 = this.f12200i.f12194k;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.J;
        Paint paint2 = this.E;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f12200i.j);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f12200i.f12194k;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.f12204u;
        Path path = this.w;
        if (z3) {
            float f9 = -(g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f12200i.f12185a;
            j jVarE = kVar.e();
            c bVar = kVar.f12225e;
            if (!(bVar instanceof h)) {
                bVar = new b(f9, bVar);
            }
            jVarE.f12214e = bVar;
            c bVar2 = kVar.f12226f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f9, bVar2);
            }
            jVarE.f12215f = bVar2;
            c bVar3 = kVar.f12228h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f9, bVar3);
            }
            jVarE.f12217h = bVar3;
            c bVar4 = kVar.f12227g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f9, bVar4);
            }
            jVarE.f12216g = bVar4;
            k kVarA = jVarE.a();
            this.C = kVarA;
            float f10 = this.f12200i.f12193i;
            RectF rectFF = f();
            RectF rectF = this.f12208z;
            rectF.set(rectFF);
            float strokeWidth = g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.H.a(kVarA, f10, rectF, null, this.f12206x);
            a(f(), path);
            this.f12204u = false;
        }
        f fVar = this.f12200i;
        fVar.getClass();
        if (fVar.f12197n > 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (!this.f12200i.f12185a.d(f()) && !path.isConvex() && i12 < 29) {
                canvas.save();
                double d10 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d10)) * ((double) this.f12200i.f12198o)), (int) (Math.cos(Math.toRadians(d10)) * ((double) this.f12200i.f12198o)));
                if (this.L) {
                    RectF rectF2 = this.K;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f12200i.f12197n * 2) + ((int) rectF2.width()) + iWidth, (this.f12200i.f12197n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f11 = (getBounds().left - this.f12200i.f12197n) - iWidth;
                    float f12 = (getBounds().top - this.f12200i.f12197n) - iHeight;
                    canvas2.translate(-f11, -f12);
                    c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    c(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f12200i;
        Paint.Style style = fVar2.f12199p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f12185a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        k kVar = this.C;
        RectF rectFF = f();
        RectF rectF = this.f12208z;
        rectF.set(rectFF);
        boolean zG = g();
        Paint paint = this.E;
        float strokeWidth = zG ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        d(canvas, paint, this.f12206x, kVar, rectF);
    }

    public final RectF f() {
        Rect bounds = getBounds();
        RectF rectF = this.f12207y;
        rectF.set(bounds);
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f12200i.f12199p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.E.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12200i.f12194k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f12200i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f12200i.getClass();
        if (this.f12200i.f12185a.d(f())) {
            outline.setRoundRect(getBounds(), this.f12200i.f12185a.f12225e.a(f()) * this.f12200i.f12193i);
            return;
        }
        RectF rectFF = f();
        Path path = this.w;
        a(rectFF, path);
        if (path.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f12200i.f12191g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.A;
        region.set(bounds);
        RectF rectFF = f();
        Path path = this.w;
        a(rectFF, path);
        Region region2 = this.B;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f12200i.f12186b = new h9.a(context);
        m();
    }

    public final void i(float f9) {
        f fVar = this.f12200i;
        if (fVar.f12196m != f9) {
            fVar.f12196m = f9;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f12204u = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f12200i.f12189e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f12200i.getClass();
        ColorStateList colorStateList2 = this.f12200i.f12188d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f12200i.f12187c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f12200i;
        if (fVar.f12187c != colorStateList) {
            fVar.f12187c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f12200i.f12187c == null || color2 == (colorForState2 = this.f12200i.f12187c.getColorForState(iArr, (color2 = (paint2 = this.D).getColor())))) {
            z3 = false;
        } else {
            paint2.setColor(colorForState2);
            z3 = true;
        }
        if (this.f12200i.f12188d == null || color == (colorForState = this.f12200i.f12188d.getColorForState(iArr, (color = (paint = this.E).getColor())))) {
            return z3;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.I;
        PorterDuffColorFilter porterDuffColorFilter3 = this.J;
        f fVar = this.f12200i;
        ColorStateList colorStateList = fVar.f12189e;
        PorterDuff.Mode mode = fVar.f12190f;
        if (colorStateList == null || mode == null) {
            int color = this.D.getColor();
            int iB = b(color);
            porterDuffColorFilter = iB != color ? new PorterDuffColorFilter(iB, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.I = porterDuffColorFilter;
        this.f12200i.getClass();
        this.J = null;
        this.f12200i.getClass();
        return (r3.b.a(porterDuffColorFilter2, this.I) && r3.b.a(porterDuffColorFilter3, this.J)) ? false : true;
    }

    public final void m() {
        f fVar = this.f12200i;
        float f9 = fVar.f12196m + 0.0f;
        fVar.f12197n = (int) Math.ceil(0.75f * f9);
        this.f12200i.f12198o = (int) Math.ceil(f9 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        f fVar = this.f12200i;
        f fVar2 = new f();
        fVar2.f12187c = null;
        fVar2.f12188d = null;
        fVar2.f12189e = null;
        fVar2.f12190f = PorterDuff.Mode.SRC_IN;
        fVar2.f12191g = null;
        fVar2.f12192h = 1.0f;
        fVar2.f12193i = 1.0f;
        fVar2.f12194k = 255;
        fVar2.f12195l = 0.0f;
        fVar2.f12196m = 0.0f;
        fVar2.f12197n = 0;
        fVar2.f12198o = 0;
        fVar2.f12199p = Paint.Style.FILL_AND_STROKE;
        fVar2.f12185a = fVar.f12185a;
        fVar2.f12186b = fVar.f12186b;
        fVar2.j = fVar.j;
        fVar2.f12187c = fVar.f12187c;
        fVar2.f12188d = fVar.f12188d;
        fVar2.f12190f = fVar.f12190f;
        fVar2.f12189e = fVar.f12189e;
        fVar2.f12194k = fVar.f12194k;
        fVar2.f12192h = fVar.f12192h;
        fVar2.f12198o = fVar.f12198o;
        fVar2.f12193i = fVar.f12193i;
        fVar2.f12195l = fVar.f12195l;
        fVar2.f12196m = fVar.f12196m;
        fVar2.f12197n = fVar.f12197n;
        fVar2.f12199p = fVar.f12199p;
        if (fVar.f12191g != null) {
            fVar2.f12191g = new Rect(fVar.f12191g);
        }
        this.f12200i = fVar2;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f12204u = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z3 = k(iArr) || l();
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        f fVar = this.f12200i;
        if (fVar.f12194k != i10) {
            fVar.f12194k = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f12200i.getClass();
        super.invalidateSelf();
    }

    @Override // n9.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f12200i.f12185a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f12200i.f12189e = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f12200i;
        if (fVar.f12190f != mode) {
            fVar.f12190f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.b(context, attributeSet, i10, i11).a());
    }

    public g(k kVar) {
        f fVar = new f();
        fVar.f12187c = null;
        fVar.f12188d = null;
        fVar.f12189e = null;
        fVar.f12190f = PorterDuff.Mode.SRC_IN;
        fVar.f12191g = null;
        fVar.f12192h = 1.0f;
        fVar.f12193i = 1.0f;
        fVar.f12194k = 255;
        fVar.f12195l = 0.0f;
        fVar.f12196m = 0.0f;
        fVar.f12197n = 0;
        fVar.f12198o = 0;
        fVar.f12199p = Paint.Style.FILL_AND_STROKE;
        fVar.f12185a = kVar;
        fVar.f12186b = null;
        this(fVar);
    }

    public g(f fVar) {
        m mVar;
        this.f12201r = new t[4];
        this.f12202s = new t[4];
        this.f12203t = new BitSet(8);
        this.f12205v = new Matrix();
        this.w = new Path();
        this.f12206x = new Path();
        this.f12207y = new RectF();
        this.f12208z = new RectF();
        this.A = new Region();
        this.B = new Region();
        Paint paint = new Paint(1);
        this.D = paint;
        Paint paint2 = new Paint(1);
        this.E = paint2;
        this.F = new m9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f12232a;
        } else {
            mVar = new m();
        }
        this.H = mVar;
        this.K = new RectF();
        this.L = true;
        this.f12200i = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.G = new mf.a(17, this);
    }
}
