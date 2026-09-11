package n9;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f12185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h9.a f12186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f12187c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f12188d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorStateList f12189e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f12190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f12191g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f12193i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12194k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f12195l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f12196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f12197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12198o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Paint.Style f12199p;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f12204u = true;
        return gVar;
    }
}
