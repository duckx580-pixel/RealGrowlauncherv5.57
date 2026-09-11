package yc;

import android.content.DialogInterface;
import com.tapjoy.TJAdUnitActivity;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TJAdUnitActivity f20285i;

    public e(TJAdUnitActivity tJAdUnitActivity) {
        this.f20285i = tJAdUnitActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.f20285i.b(false);
        dialogInterface.cancel();
    }
}
