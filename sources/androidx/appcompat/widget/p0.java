package androidx.appcompat.widget;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements v0, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.h f966i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public q0 f967r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f968s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ w0 f969t;

    public p0(w0 w0Var) {
        this.f969t = w0Var;
    }

    @Override // androidx.appcompat.widget.v0
    public final boolean b() {
        i.h hVar = this.f966i;
        if (hVar != null) {
            return hVar.isShowing();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.v0
    public final int c() {
        return 0;
    }

    @Override // androidx.appcompat.widget.v0
    public final void d(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void dismiss() {
        i.h hVar = this.f966i;
        if (hVar != null) {
            hVar.dismiss();
            this.f966i = null;
        }
    }

    @Override // androidx.appcompat.widget.v0
    public final CharSequence f() {
        return this.f968s;
    }

    @Override // androidx.appcompat.widget.v0
    public final Drawable h() {
        return null;
    }

    @Override // androidx.appcompat.widget.v0
    public final void j(CharSequence charSequence) {
        this.f968s = charSequence;
    }

    @Override // androidx.appcompat.widget.v0
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void n(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // androidx.appcompat.widget.v0
    public final void o(int i10, int i11) {
        if (this.f967r == null) {
            return;
        }
        w0 w0Var = this.f969t;
        a0.f0 f0Var = new a0.f0(w0Var.getPopupContext());
        i.d dVar = (i.d) f0Var.f60s;
        CharSequence charSequence = this.f968s;
        if (charSequence != null) {
            dVar.f7795d = charSequence;
        }
        q0 q0Var = this.f967r;
        int selectedItemPosition = w0Var.getSelectedItemPosition();
        dVar.f7800i = q0Var;
        dVar.j = this;
        dVar.f7803m = selectedItemPosition;
        dVar.f7802l = true;
        i.h hVarI = f0Var.i();
        this.f966i = hVarI;
        AlertController$RecycleListView alertController$RecycleListView = hVarI.f7843v.f7821e;
        n0.d(alertController$RecycleListView, i10);
        n0.c(alertController$RecycleListView, i11);
        this.f966i.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        w0 w0Var = this.f969t;
        w0Var.setSelection(i10);
        if (w0Var.getOnItemClickListener() != null) {
            w0Var.performItemClick(null, i10, this.f967r.getItemId(i10));
        }
        dismiss();
    }

    @Override // androidx.appcompat.widget.v0
    public final int p() {
        return 0;
    }

    @Override // androidx.appcompat.widget.v0
    public final void q(ListAdapter listAdapter) {
        this.f967r = (q0) listAdapter;
    }
}
