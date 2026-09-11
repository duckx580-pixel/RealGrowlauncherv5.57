package b8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends c8.a {
    public static final Parcelable.Creator<n> CREATOR = new android.support.v4.media.a(18);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2837i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f2838r;

    public n(int i10, List list) {
        this.f2837i = i10;
        this.f2838r = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f2837i);
        w9.a.I(parcel, 2, this.f2838r);
        w9.a.K(parcel, iJ);
    }
}
