package u8;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import z7.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c8.a implements n {
    public static final Parcelable.Creator<b> CREATOR = new f.a(11);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17728i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Intent f17730s;

    public b(int i10, int i11, Intent intent) {
        this.f17728i = i10;
        this.f17729r = i11;
        this.f17730s = intent;
    }

    @Override // z7.n
    public final Status b() {
        return this.f17729r == 0 ? Status.f3665v : Status.f3668z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f17728i);
        w9.a.L(parcel, 2, 4);
        parcel.writeInt(this.f17729r);
        w9.a.F(parcel, 3, this.f17730s, i10);
        w9.a.K(parcel, iJ);
    }
}
