package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(11);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f1669i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f1670r;

    public c(Parcel parcel) {
        this.f1669i = parcel.createStringArrayList();
        this.f1670r = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f1669i);
        parcel.writeTypedList(this.f1670r);
    }
}
