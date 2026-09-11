package l8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f9844d;

    public b(IBinder iBinder) {
        this.f9844d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f9844d;
    }

    public final Parcel c(Parcel parcel, int i10) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f9844d.transact(i10, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e8) {
                parcelObtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }
}
