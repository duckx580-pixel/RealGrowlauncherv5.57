package x3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Parcelable f19413i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f19412r = new a();
    public static final Parcelable.Creator<b> CREATOR = new o3(7);

    public b() {
        this.f19413i = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f19413i, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f19413i = parcelable == f19412r ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f19413i = parcelable == null ? f19412r : parcelable;
    }
}
