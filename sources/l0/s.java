package l0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import g1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends RippleDrawable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9785i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t f9786r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f9787s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9788t;

    public s(boolean z3) {
        super(ColorStateList.valueOf(-16777216), null, z3 ? new ColorDrawable(-1) : null);
        this.f9785i = z3;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f9785i) {
            this.f9788t = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        kotlin.jvm.internal.l.e("super.getDirtyBounds()", dirtyBounds);
        this.f9788t = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f9788t;
    }
}
