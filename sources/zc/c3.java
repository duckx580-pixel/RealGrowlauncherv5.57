package zc;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes.dex */
public final class c3 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z2 f20740i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e3 f20741r;

    public c3(e3 e3Var, z2 z2Var) {
        this.f20741r = e3Var;
        this.f20740i = z2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f20740i.d(this.f20741r.f20797e);
    }
}
