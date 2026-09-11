package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends x implements o0 {
    public n0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final int b() {
        Parcel parcelA = A(z(), 2);
        int i10 = parcelA.readInt();
        parcelA.recycle();
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.o0
    public final void i(long j, Bundle bundle, String str, String str2) {
        Parcel parcelZ = z();
        parcelZ.writeString(str);
        parcelZ.writeString(str2);
        z.c(parcelZ, bundle);
        parcelZ.writeLong(j);
        B(parcelZ, 1);
    }
}
