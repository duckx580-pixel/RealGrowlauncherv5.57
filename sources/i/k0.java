package i;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.l3;
import androidx.appcompat.widget.s3;
import java.util.ArrayList;
import java.util.WeakHashMap;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f7851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f7852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kb.c f7853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f7857g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a8.q f7858h = new a8.q(16, this);

    public k0(Toolbar toolbar, CharSequence charSequence, w wVar) {
        u5.l lVar = new u5.l(this);
        s3 s3Var = new s3(toolbar, false);
        this.f7851a = s3Var;
        wVar.getClass();
        this.f7852b = wVar;
        s3Var.f1009k = wVar;
        toolbar.setOnMenuItemClickListener(lVar);
        if (!s3Var.f1006g) {
            s3Var.f1007h = charSequence;
            if ((s3Var.f1001b & 8) != 0) {
                toolbar.setTitle(charSequence);
                if (s3Var.f1006g) {
                    z0.l(toolbar.getRootView(), charSequence);
                }
            }
        }
        this.f7853c = new kb.c(this);
    }

    @Override // i.a
    public final boolean a() {
        androidx.appcompat.widget.m mVar;
        ActionMenuView actionMenuView = this.f7851a.f1000a.f810i;
        return (actionMenuView == null || (mVar = actionMenuView.f784u) == null || !mVar.g()) ? false : true;
    }

    @Override // i.a
    public final boolean b() {
        m.l lVar;
        l3 l3Var = this.f7851a.f1000a.f807f0;
        if (l3Var == null || (lVar = l3Var.f923r) == null) {
            return false;
        }
        if (l3Var == null) {
            lVar = null;
        }
        if (lVar == null) {
            return true;
        }
        lVar.collapseActionView();
        return true;
    }

    @Override // i.a
    public final void c(boolean z3) {
        if (z3 == this.f7856f) {
            return;
        }
        this.f7856f = z3;
        ArrayList arrayList = this.f7857g;
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    @Override // i.a
    public final int d() {
        return this.f7851a.f1001b;
    }

    @Override // i.a
    public final Context e() {
        return this.f7851a.f1000a.getContext();
    }

    @Override // i.a
    public final boolean f() {
        s3 s3Var = this.f7851a;
        Toolbar toolbar = s3Var.f1000a;
        a8.q qVar = this.f7858h;
        toolbar.removeCallbacks(qVar);
        Toolbar toolbar2 = s3Var.f1000a;
        WeakHashMap weakHashMap = z0.f15140a;
        s3.i0.m(toolbar2, qVar);
        return true;
    }

    @Override // i.a
    public final void h() {
        this.f7851a.f1000a.removeCallbacks(this.f7858h);
    }

    @Override // i.a
    public final boolean i(int i10, KeyEvent keyEvent) {
        Menu menuP = p();
        if (menuP == null) {
            return false;
        }
        menuP.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuP.performShortcut(i10, keyEvent, 0);
    }

    @Override // i.a
    public final boolean j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            k();
        }
        return true;
    }

    @Override // i.a
    public final boolean k() {
        return this.f7851a.f1000a.u();
    }

    @Override // i.a
    public final void n(CharSequence charSequence) {
        s3 s3Var = this.f7851a;
        if (s3Var.f1006g) {
            return;
        }
        Toolbar toolbar = s3Var.f1000a;
        s3Var.f1007h = charSequence;
        if ((s3Var.f1001b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (s3Var.f1006g) {
                z0.l(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final Menu p() {
        boolean z3 = this.f7855e;
        s3 s3Var = this.f7851a;
        if (!z3) {
            b9.b bVar = new b9.b(3, this);
            ae.c cVar = new ae.c(this);
            Toolbar toolbar = s3Var.f1000a;
            toolbar.f808g0 = bVar;
            toolbar.f809h0 = cVar;
            ActionMenuView actionMenuView = toolbar.f810i;
            if (actionMenuView != null) {
                actionMenuView.f785v = bVar;
                actionMenuView.w = cVar;
            }
            this.f7855e = true;
        }
        return s3Var.f1000a.getMenu();
    }

    @Override // i.a
    public final void g() {
    }

    @Override // i.a
    public final void l(boolean z3) {
    }

    @Override // i.a
    public final void m(boolean z3) {
    }
}
