package x7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c8.a {
    public static final Parcelable.Creator<a> CREATOR = new f.a(15);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19466i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f19467r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f19468s;

    public a(int i10, int i11, Bundle bundle) {
        this.f19466i = i10;
        this.f19467r = i11;
        this.f19468s = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f19466i);
        w9.a.L(parcel, 2, 4);
        parcel.writeInt(this.f19467r);
        w9.a.D(parcel, 3, this.f19468s);
        w9.a.K(parcel, iJ);
    }
}
