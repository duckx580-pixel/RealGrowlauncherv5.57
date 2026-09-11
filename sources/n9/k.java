package n9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public qj.b f12221a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qj.b f12222b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public qj.b f12223c = new i();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qj.b f12224d = new i();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f12225e = new a(0.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f12226f = new a(0.0f);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f12227g = new a(0.0f);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f12228h = new a(0.0f);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e f12229i;
    public e j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f12230k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f12231l;

    public k() {
        int i10 = 0;
        this.f12229i = new e(i10);
        this.j = new e(i10);
        this.f12230k = new e(i10);
        this.f12231l = new e(i10);
    }

    public static j a(Context context, int i10, int i11, a aVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, w8.a.w);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(3, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(2, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(1, i12);
            c cVarC = c(typedArrayObtainStyledAttributes, 5, aVar);
            c cVarC2 = c(typedArrayObtainStyledAttributes, 8, cVarC);
            c cVarC3 = c(typedArrayObtainStyledAttributes, 9, cVarC);
            c cVarC4 = c(typedArrayObtainStyledAttributes, 7, cVarC);
            c cVarC5 = c(typedArrayObtainStyledAttributes, 6, cVarC);
            j jVar = new j();
            jVar.f12210a = rk.a.P(i13);
            jVar.f12214e = cVarC2;
            jVar.f12211b = rk.a.P(i14);
            jVar.f12215f = cVarC3;
            jVar.f12212c = rk.a.P(i15);
            jVar.f12216g = cVarC4;
            jVar.f12213d = rk.a.P(i16);
            jVar.f12217h = cVarC5;
            return jVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w8.a.f19122q, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new h(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z3 = this.f12231l.getClass().equals(e.class) && this.j.getClass().equals(e.class) && this.f12229i.getClass().equals(e.class) && this.f12230k.getClass().equals(e.class);
        float fA = this.f12225e.a(rectF);
        return z3 && ((this.f12226f.a(rectF) > fA ? 1 : (this.f12226f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f12228h.a(rectF) > fA ? 1 : (this.f12228h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f12227g.a(rectF) > fA ? 1 : (this.f12227g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f12222b instanceof i) && (this.f12221a instanceof i) && (this.f12223c instanceof i) && (this.f12224d instanceof i));
    }

    public final j e() {
        j jVar = new j();
        jVar.f12210a = this.f12221a;
        jVar.f12211b = this.f12222b;
        jVar.f12212c = this.f12223c;
        jVar.f12213d = this.f12224d;
        jVar.f12214e = this.f12225e;
        jVar.f12215f = this.f12226f;
        jVar.f12216g = this.f12227g;
        jVar.f12217h = this.f12228h;
        jVar.f12218i = this.f12229i;
        jVar.j = this.j;
        jVar.f12219k = this.f12230k;
        jVar.f12220l = this.f12231l;
        return jVar;
    }
}
