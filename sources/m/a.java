package m;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements m3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f10222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f10223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Intent f10224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public char f10225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public char f10227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f10229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f10230i;
    public CharSequence j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f10231k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f10232l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f10233m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10234n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10235o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10236p;

    @Override // m3.a
    public final m3.a a(m mVar) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        Drawable drawable = this.f10229h;
        if (drawable != null) {
            if (this.f10234n || this.f10235o) {
                this.f10229h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.f10229h = drawableMutate;
                if (this.f10234n) {
                    l3.b.h(drawableMutate, this.f10232l);
                }
                if (this.f10235o) {
                    l3.b.i(this.f10229h, this.f10233m);
                }
            }
        }
    }

    @Override // m3.a
    public final m c() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f10228g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f10227f;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f10229h;
    }

    @Override // m3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f10232l;
    }

    @Override // m3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f10233m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f10224c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f10226e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f10225d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f10222a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10223b;
        return charSequence != null ? charSequence : this.f10222a;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f10231k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f10236p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f10236p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f10236p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f10236p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f10227f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f10236p = (z3 ? 1 : 0) | (this.f10236p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f10236p = (z3 ? 2 : 0) | (this.f10236p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f10236p = (z3 ? 16 : 0) | (this.f10236p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f10229h = drawable;
        b();
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10232l = colorStateList;
        this.f10234n = true;
        b();
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10233m = mode;
        this.f10235o = true;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f10224c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f10225d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f10225d = c10;
        this.f10227f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f10222a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10223b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f10231k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f10236p = (this.f10236p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f10227f = Character.toLowerCase(c10);
        this.f10228g = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        this.f10225d = c10;
        this.f10226e = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        this.f10222a = this.f10230i.getResources().getString(i10);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setTooltipText(CharSequence charSequence) {
        this.f10231k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f10229h = i3.b.b(this.f10230i, i10);
        b();
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10225d = c10;
        this.f10226e = KeyEvent.normalizeMetaState(i10);
        this.f10227f = Character.toLowerCase(c11);
        this.f10228g = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        return this;
    }
}
