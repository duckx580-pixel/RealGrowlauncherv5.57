package k8;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends x {
    public final j8.a C(j8.b bVar, String str, int i10) {
        Parcel parcelZ = z();
        o8.a.c(parcelZ, bVar);
        parcelZ.writeString(str);
        parcelZ.writeInt(i10);
        Parcel parcelY = y(parcelZ, 2);
        j8.a aVarB = j8.b.B(parcelY.readStrongBinder());
        parcelY.recycle();
        return aVarB;
    }

    public final j8.a D(j8.b bVar, String str, int i10, j8.b bVar2) {
        Parcel parcelZ = z();
        o8.a.c(parcelZ, bVar);
        parcelZ.writeString(str);
        parcelZ.writeInt(i10);
        o8.a.c(parcelZ, bVar2);
        Parcel parcelY = y(parcelZ, 8);
        j8.a aVarB = j8.b.B(parcelY.readStrongBinder());
        parcelY.recycle();
        return aVarB;
    }

    public final j8.a E(j8.b bVar, String str, int i10) {
        Parcel parcelZ = z();
        o8.a.c(parcelZ, bVar);
        parcelZ.writeString(str);
        parcelZ.writeInt(i10);
        Parcel parcelY = y(parcelZ, 4);
        j8.a aVarB = j8.b.B(parcelY.readStrongBinder());
        parcelY.recycle();
        return aVarB;
    }

    public final j8.a F(j8.b bVar, String str, boolean z3, long j) {
        Parcel parcelZ = z();
        o8.a.c(parcelZ, bVar);
        parcelZ.writeString(str);
        parcelZ.writeInt(z3 ? 1 : 0);
        parcelZ.writeLong(j);
        Parcel parcelY = y(parcelZ, 7);
        j8.a aVarB = j8.b.B(parcelY.readStrongBinder());
        parcelY.recycle();
        return aVarB;
    }
}
