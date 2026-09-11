package y7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.j3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends c8.a {
    public static final Parcelable.Creator<c> CREATOR = new f.a(18);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f20175i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20176r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f20177s;

    public c() {
        this.f20175i = "CLIENT_TELEMETRY";
        this.f20177s = 1L;
        this.f20176r = -1;
    }

    public final long d() {
        long j = this.f20177s;
        return j == -1 ? this.f20176r : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            String str = cVar.f20175i;
            String str2 = this.f20175i;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && d() == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f20175i, Long.valueOf(d())});
    }

    public final String toString() {
        j3 j3Var = new j3(this);
        j3Var.d("name", this.f20175i);
        j3Var.d("version", Long.valueOf(d()));
        return j3Var.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.G(parcel, 1, this.f20175i);
        w9.a.L(parcel, 2, 4);
        parcel.writeInt(this.f20176r);
        long jD = d();
        w9.a.L(parcel, 3, 8);
        parcel.writeLong(jD);
        w9.a.K(parcel, iJ);
    }

    public c(int i10, long j, String str) {
        this.f20175i = str;
        this.f20176r = i10;
        this.f20177s = j;
    }
}
