package i;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f7808a;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == -3 || i10 == -2 || i10 == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f7808a.get(), message.what);
        } else {
            if (i10 != 1) {
                return;
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
