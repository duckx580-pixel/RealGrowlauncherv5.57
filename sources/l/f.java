package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements m.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Context f9677s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ActionBarContextView f9678t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x7.h f9679u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f9680v;
    public boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m.j f9681x;

    @Override // l.b
    public final void a() {
        if (this.w) {
            return;
        }
        this.w = true;
        this.f9679u.d(this);
    }

    @Override // l.b
    public final View b() {
        WeakReference weakReference = this.f9680v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.b
    public final m.j c() {
        return this.f9681x;
    }

    @Override // l.b
    public final MenuInflater d() {
        return new j(this.f9678t.getContext());
    }

    @Override // l.b
    public final CharSequence e() {
        return this.f9678t.getSubtitle();
    }

    @Override // m.h
    public final void f(m.j jVar) {
        h();
        androidx.appcompat.widget.m mVar = this.f9678t.f765t;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // l.b
    public final CharSequence g() {
        return this.f9678t.getTitle();
    }

    @Override // l.b
    public final void h() {
        this.f9679u.c(this, this.f9681x);
    }

    @Override // l.b
    public final boolean i() {
        return this.f9678t.I;
    }

    @Override // l.b
    public final void j(View view) {
        this.f9678t.setCustomView(view);
        this.f9680v = view != null ? new WeakReference(view) : null;
    }

    @Override // m.h
    public final boolean k(m.j jVar, MenuItem menuItem) {
        return ((a) this.f9679u.f19488r).i(this, menuItem);
    }

    @Override // l.b
    public final void l(int i10) {
        m(this.f9677s.getString(i10));
    }

    @Override // l.b
    public final void m(CharSequence charSequence) {
        this.f9678t.setSubtitle(charSequence);
    }

    @Override // l.b
    public final void n(int i10) {
        o(this.f9677s.getString(i10));
    }

    @Override // l.b
    public final void o(CharSequence charSequence) {
        this.f9678t.setTitle(charSequence);
    }

    @Override // l.b
    public final void p(boolean z3) {
        this.f9670r = z3;
        this.f9678t.setTitleOptional(z3);
    }
}
