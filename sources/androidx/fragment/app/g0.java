package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new android.support.v4.media.a(12);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f1691i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1692r;

    public g0(String str, int i10) {
        this.f1691i = str;
        this.f1692r = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1691i);
        parcel.writeInt(this.f1692r);
    }
}
