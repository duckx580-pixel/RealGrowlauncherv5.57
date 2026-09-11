package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f1726i;

    public k(n nVar) {
        this.f1726i = nVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        n nVar = this.f1726i;
        Dialog dialog = nVar.f1747t0;
        if (dialog != null) {
            nVar.onCancel(dialog);
        }
    }
}
