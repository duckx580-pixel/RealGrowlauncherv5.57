package x4;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends RemoteCallbackList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f19439a;

    public h(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f19439a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        kotlin.jvm.internal.l.f("callback", (d) iInterface);
        kotlin.jvm.internal.l.f("cookie", obj);
        this.f19439a.f2295r.remove((Integer) obj);
    }
}
