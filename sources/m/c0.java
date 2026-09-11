package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends j implements SubMenu {
    public final l A;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final j f10248z;

    public c0(Context context, j jVar, l lVar) {
        super(context);
        this.f10248z = jVar;
        this.A = lVar;
    }

    @Override // m.j
    public final boolean d(l lVar) {
        return this.f10248z.d(lVar);
    }

    @Override // m.j
    public final boolean e(j jVar, MenuItem menuItem) {
        return super.e(jVar, menuItem) || this.f10248z.e(jVar, menuItem);
    }

    @Override // m.j
    public final boolean f(l lVar) {
        return this.f10248z.f(lVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // m.j
    public final String j() {
        l lVar = this.A;
        int i10 = lVar != null ? lVar.f10297a : 0;
        if (i10 == 0) {
            return null;
        }
        return k0.g.d(i10, "android:menu:actionviewstates:");
    }

    @Override // m.j
    public final j k() {
        return this.f10248z.k();
    }

    @Override // m.j
    public final boolean m() {
        return this.f10248z.m();
    }

    @Override // m.j
    public final boolean n() {
        return this.f10248z.n();
    }

    @Override // m.j
    public final boolean o() {
        return this.f10248z.o();
    }

    @Override // m.j, android.view.Menu
    public final void setGroupDividerEnabled(boolean z3) {
        this.f10248z.setGroupDividerEnabled(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // m.j, android.view.Menu
    public final void setQwertyMode(boolean z3) {
        this.f10248z.setQwertyMode(z3);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i10) {
        u(0, null, i10, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i10) {
        u(i10, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i10) {
        this.A.setIcon(i10);
        return this;
    }
}
