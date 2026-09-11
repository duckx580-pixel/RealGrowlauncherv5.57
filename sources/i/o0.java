package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends l.b implements m.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Context f7877s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m.j f7878t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public x7.h f7879u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f7880v;
    public final /* synthetic */ p0 w;

    public o0(p0 p0Var, Context context, x7.h hVar) {
        this.w = p0Var;
        this.f7877s = context;
        this.f7879u = hVar;
        m.j jVar = new m.j(context);
        jVar.f10282l = 1;
        this.f7878t = jVar;
        jVar.f10276e = this;
    }

    @Override // l.b
    public final void a() {
        p0 p0Var = this.w;
        if (p0Var.f7893i != this) {
            return;
        }
        if (p0Var.f7899p) {
            p0Var.j = this;
            p0Var.f7894k = this.f7879u;
        } else {
            this.f7879u.d(this);
        }
        this.f7879u = null;
        p0Var.p(false);
        ActionBarContextView actionBarContextView = p0Var.f7890f;
        if (actionBarContextView.A == null) {
            actionBarContextView.e();
        }
        p0Var.f7887c.setHideOnContentScrollEnabled(p0Var.f7904u);
        p0Var.f7893i = null;
    }

    @Override // l.b
    public final View b() {
        WeakReference weakReference = this.f7880v;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.b
    public final m.j c() {
        return this.f7878t;
    }

    @Override // l.b
    public final MenuInflater d() {
        return new l.j(this.f7877s);
    }

    @Override // l.b
    public final CharSequence e() {
        return this.w.f7890f.getSubtitle();
    }

    @Override // m.h
    public final void f(m.j jVar) {
        if (this.f7879u == null) {
            return;
        }
        h();
        androidx.appcompat.widget.m mVar = this.w.f7890f.f765t;
        if (mVar != null) {
            mVar.l();
        }
    }

    @Override // l.b
    public final CharSequence g() {
        return this.w.f7890f.getTitle();
    }

    @Override // l.b
    public final void h() {
        if (this.w.f7893i != this) {
            return;
        }
        m.j jVar = this.f7878t;
        jVar.w();
        try {
            this.f7879u.c(this, jVar);
        } finally {
            jVar.v();
        }
    }

    @Override // l.b
    public final boolean i() {
        return this.w.f7890f.I;
    }

    @Override // l.b
    public final void j(View view) {
        this.w.f7890f.setCustomView(view);
        this.f7880v = new WeakReference(view);
    }

    @Override // m.h
    public final boolean k(m.j jVar, MenuItem menuItem) {
        x7.h hVar = this.f7879u;
        if (hVar != null) {
            return ((l.a) hVar.f19488r).i(this, menuItem);
        }
        return false;
    }

    @Override // l.b
    public final void l(int i10) {
        m(this.w.f7885a.getResources().getString(i10));
    }

    @Override // l.b
    public final void m(CharSequence charSequence) {
        this.w.f7890f.setSubtitle(charSequence);
    }

    @Override // l.b
    public final void n(int i10) {
        o(this.w.f7885a.getResources().getString(i10));
    }

    @Override // l.b
    public final void o(CharSequence charSequence) {
        this.w.f7890f.setTitle(charSequence);
    }

    @Override // l.b
    public final void p(boolean z3) {
        this.f9670r = z3;
        this.w.f7890f.setTitleOptional(z3);
    }
}
