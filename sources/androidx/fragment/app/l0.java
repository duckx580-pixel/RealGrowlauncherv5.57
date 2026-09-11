package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new android.support.v4.media.a(13);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f1728i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f1729r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b[] f1730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f1732u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f1733v;
    public ArrayList w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f1734x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1728i);
        parcel.writeStringList(this.f1729r);
        parcel.writeTypedArray(this.f1730s, i10);
        parcel.writeInt(this.f1731t);
        parcel.writeString(this.f1732u);
        parcel.writeStringList(this.f1733v);
        parcel.writeTypedList(this.w);
        parcel.writeTypedList(this.f1734x);
    }
}
