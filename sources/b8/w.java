package b8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements IInterface {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IBinder f2874d;

    public w(IBinder iBinder) {
        this.f2874d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2874d;
    }

    public final void c(c0 c0Var, h hVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(c0Var);
            parcelObtain.writeInt(1);
            android.support.v4.media.a.a(hVar, parcelObtain, 0);
            this.f2874d.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
