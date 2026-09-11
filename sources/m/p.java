package m;

import android.view.MenuItem;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f10326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f10327b;

    public p(q qVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f10327b = qVar;
        this.f10326a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f10326a.onMenuItemClick(this.f10327b.v(menuItem));
    }
}
