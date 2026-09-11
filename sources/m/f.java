package m;

import a0.f0;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements w, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Context f10259i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayoutInflater f10260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j f10261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ExpandedMenuView f10262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public v f10263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f10264v;

    public f(ContextWrapper contextWrapper) {
        this.f10259i = contextWrapper;
        this.f10260r = LayoutInflater.from(contextWrapper);
    }

    @Override // m.w
    public final void a(j jVar, boolean z3) {
        v vVar = this.f10263u;
        if (vVar != null) {
            vVar.a(jVar, z3);
        }
    }

    @Override // m.w
    public final void c(Context context, j jVar) {
        if (this.f10259i != null) {
            this.f10259i = context;
            if (this.f10260r == null) {
                this.f10260r = LayoutInflater.from(context);
            }
        }
        this.f10261s = jVar;
        e eVar = this.f10264v;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // m.w
    public final boolean d() {
        return false;
    }

    @Override // m.w
    public final void e(v vVar) {
        throw null;
    }

    @Override // m.w
    public final void f() {
        e eVar = this.f10264v;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // m.w
    public final boolean h(l lVar) {
        return false;
    }

    @Override // m.w
    public final boolean j(c0 c0Var) {
        boolean zHasVisibleItems = c0Var.hasVisibleItems();
        Context context = c0Var.f10272a;
        if (!zHasVisibleItems) {
            return false;
        }
        k kVar = new k();
        kVar.f10294i = c0Var;
        f0 f0Var = new f0(context);
        i.d dVar = (i.d) f0Var.f60s;
        f fVar = new f(dVar.f7792a);
        kVar.f10296s = fVar;
        fVar.f10263u = kVar;
        c0Var.b(fVar, context);
        f fVar2 = kVar.f10296s;
        if (fVar2.f10264v == null) {
            fVar2.f10264v = new e(fVar2);
        }
        dVar.f7800i = fVar2.f10264v;
        dVar.j = kVar;
        View view = c0Var.f10285o;
        if (view != null) {
            dVar.f7796e = view;
        } else {
            dVar.f7794c = c0Var.f10284n;
            dVar.f7795d = c0Var.f10283m;
        }
        dVar.f7799h = kVar;
        i.h hVarI = f0Var.i();
        kVar.f10295r = hVarI;
        hVarI.setOnDismissListener(kVar);
        WindowManager.LayoutParams attributes = kVar.f10295r.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        kVar.f10295r.show();
        v vVar = this.f10263u;
        if (vVar == null) {
            return true;
        }
        vVar.j(c0Var);
        return true;
    }

    @Override // m.w
    public final boolean k(l lVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        this.f10261s.q(this.f10264v.getItem(i10), this, 0);
    }
}
