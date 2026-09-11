package d8;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b8.i {
    @Override // b8.f
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder, "com.google.android.gms.common.internal.service.ICommonService", 2);
    }

    @Override // b8.f
    public final String x() {
        return "com.google.android.gms.common.internal.service.ICommonService";
    }

    @Override // b8.f
    public final String y() {
        return "com.google.android.gms.common.service.START";
    }
}
