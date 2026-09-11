package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import ka.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements m3.a {
    public m A;
    public MenuItem.OnActionExpandListener B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f10301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f10302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f10303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f10304h;
    public char j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f10307l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f10309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c0 f10310o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f10311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f10312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f10313r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View f10320z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10305i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10306k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10308m = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f10314s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f10315t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f10316u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10317v = false;
    public boolean w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10318x = 16;
    public boolean C = false;

    public l(j jVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f10309n = jVar;
        this.f10297a = i11;
        this.f10298b = i10;
        this.f10299c = i12;
        this.f10300d = i13;
        this.f10301e = charSequence;
        this.f10319y = i14;
    }

    public static void b(int i10, int i11, String str, StringBuilder sb2) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    @Override // m3.a
    public final m3.a a(m mVar) {
        this.f10320z = null;
        this.A = mVar;
        this.f10309n.p(true);
        m mVar2 = this.A;
        if (mVar2 != null) {
            mVar2.f10322b = new u5.l(this);
            mVar2.f10321a.setVisibilityListener(mVar2);
        }
        return this;
    }

    @Override // m3.a
    public final m c() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f10319y & 8) == 0) {
            return false;
        }
        if (this.f10320z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f10309n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.w && (this.f10316u || this.f10317v)) {
            drawable = drawable.mutate();
            if (this.f10316u) {
                l3.b.h(drawable, this.f10314s);
            }
            if (this.f10317v) {
                l3.b.i(drawable, this.f10315t);
            }
            this.w = false;
        }
        return drawable;
    }

    public final boolean e() {
        m mVar;
        if ((this.f10319y & 8) == 0) {
            return false;
        }
        if (this.f10320z == null && (mVar = this.A) != null) {
            this.f10320z = mVar.a(this);
        }
        return this.f10320z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f10309n.f(this);
        }
        return false;
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f10318x |= 32;
        } else {
            this.f10318x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f10320z;
        if (view != null) {
            return view;
        }
        m mVar = this.A;
        if (mVar == null) {
            return null;
        }
        View viewA = mVar.a(this);
        this.f10320z = viewA;
        return viewA;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f10306k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f10312q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f10298b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f10307l;
        if (drawable != null) {
            return d(drawable);
        }
        int i10 = this.f10308m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableT = a1.t(this.f10309n.f10272a, i10);
        this.f10308m = 0;
        this.f10307l = drawableT;
        return d(drawableT);
    }

    @Override // m3.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f10314s;
    }

    @Override // m3.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f10315t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f10303g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f10297a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f10305i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f10304h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f10299c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f10310o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f10301e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f10302f;
        return charSequence != null ? charSequence : this.f10301e;
    }

    @Override // m3.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f10313r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f10310o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f10318x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f10318x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f10318x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        m mVar = this.A;
        return (mVar == null || !mVar.f10321a.overridesItemVisibility()) ? (this.f10318x & 8) == 0 : (this.f10318x & 8) == 0 && this.A.f10321a.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f10320z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i10 = this.f10297a) > 0) {
            view.setId(i10);
        }
        j jVar = this.f10309n;
        jVar.f10281k = true;
        jVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.j == c10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i10 = this.f10318x;
        int i11 = (z3 ? 1 : 0) | (i10 & (-2));
        this.f10318x = i11;
        if (i10 != i11) {
            this.f10309n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i10 = this.f10318x;
        int i11 = i10 & 4;
        j jVar = this.f10309n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z3 ? 2 : 0);
            this.f10318x = i12;
            if (i10 != i12) {
                jVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = jVar.f10277f;
        int size = arrayList.size();
        jVar.w();
        for (int i13 = 0; i13 < size; i13++) {
            l lVar = (l) arrayList.get(i13);
            if (lVar.f10298b == this.f10298b && (lVar.f10318x & 4) != 0 && lVar.isCheckable()) {
                boolean z10 = lVar == this;
                int i14 = lVar.f10318x;
                int i15 = (z10 ? 2 : 0) | (i14 & (-3));
                lVar.f10318x = i15;
                if (i14 != i15) {
                    lVar.f10309n.p(false);
                }
            }
        }
        jVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f10318x |= 16;
        } else {
            this.f10318x &= -17;
        }
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f10308m = 0;
        this.f10307l = drawable;
        this.w = true;
        this.f10309n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f10314s = colorStateList;
        this.f10316u = true;
        this.w = true;
        this.f10309n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f10315t = mode;
        this.f10317v = true;
        this.w = true;
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f10303g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f10304h == c10) {
            return this;
        }
        this.f10304h = c10;
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10311p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f10304h = c10;
        this.j = Character.toLowerCase(c11);
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f10319y = i10;
        j jVar = this.f10309n;
        jVar.f10281k = true;
        jVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f10301e = charSequence;
        this.f10309n.p(false);
        c0 c0Var = this.f10310o;
        if (c0Var != null) {
            c0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f10302f = charSequence;
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i10 = this.f10318x;
        int i11 = (z3 ? 0 : 8) | (i10 & (-9));
        this.f10318x = i11;
        if (i10 != i11) {
            j jVar = this.f10309n;
            jVar.f10279h = true;
            jVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f10301e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setContentDescription(CharSequence charSequence) {
        this.f10312q = charSequence;
        this.f10309n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final m3.a setTooltipText(CharSequence charSequence) {
        this.f10313r = charSequence;
        this.f10309n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.j == c10 && this.f10306k == i10) {
            return this;
        }
        this.j = Character.toLowerCase(c10);
        this.f10306k = KeyEvent.normalizeMetaState(i10);
        this.f10309n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f10304h == c10 && this.f10305i == i10) {
            return this;
        }
        this.f10304h = c10;
        this.f10305i = KeyEvent.normalizeMetaState(i10);
        this.f10309n.p(false);
        return this;
    }

    @Override // m3.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f10304h = c10;
        this.f10305i = KeyEvent.normalizeMetaState(i10);
        this.j = Character.toLowerCase(c11);
        this.f10306k = KeyEvent.normalizeMetaState(i11);
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f10307l = null;
        this.f10308m = i10;
        this.w = true;
        this.f10309n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f10309n.f10272a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        j jVar = this.f10309n;
        Context context = jVar.f10272a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f10320z = viewInflate;
        this.A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f10297a) > 0) {
            viewInflate.setId(i11);
        }
        jVar.f10281k = true;
        jVar.p(true);
        return this;
    }
}
