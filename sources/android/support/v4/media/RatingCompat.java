package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a(3);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f655i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f656r;

    public RatingCompat(float f9, int i10) {
        this.f655i = i10;
        this.f656r = f9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f655i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f655i);
        sb2.append(" rating=");
        float f9 = this.f656r;
        sb2.append(f9 < 0.0f ? "unrated" : String.valueOf(f9));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f655i);
        parcel.writeFloat(this.f656r);
    }
}
