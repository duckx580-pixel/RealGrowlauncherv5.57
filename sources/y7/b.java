package y7;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import b8.a0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class b extends DialogFragment {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Dialog f20172i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DialogInterface.OnCancelListener f20173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AlertDialog f20174s;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f20173r;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f20172i;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f20174s == null) {
            Activity activity = getActivity();
            a0.h(activity);
            this.f20174s = new AlertDialog.Builder(activity).create();
        }
        return this.f20174s;
    }
}
