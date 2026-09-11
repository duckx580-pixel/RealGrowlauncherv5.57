package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import m.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f9683b;

    public g(Context context, b bVar) {
        this.f9682a = context;
        this.f9683b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f9683b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f9683b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new z(this.f9682a, this.f9683b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f9683b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f9683b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f9683b.f9669i;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f9683b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f9683b.f9670r;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f9683b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f9683b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f9683b.j(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f9683b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f9683b.f9669i = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f9683b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z3) {
        this.f9683b.p(z3);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i10) {
        this.f9683b.l(i10);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i10) {
        this.f9683b.n(i10);
    }
}
