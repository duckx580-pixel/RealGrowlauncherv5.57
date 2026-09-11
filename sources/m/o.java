package m;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements MenuItem.OnActionExpandListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f10324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10325b;

    public o(q qVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f10325b = qVar;
        this.f10324a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f10324a.onMenuItemActionCollapse(this.f10325b.v(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f10324a.onMenuItemActionExpand(this.f10325b.v(menuItem));
    }
}
