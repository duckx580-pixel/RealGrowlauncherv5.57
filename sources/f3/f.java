package f3;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.o3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends x3.b {
    public static final Parcelable.Creator<f> CREATOR = new o3(4);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public SparseArray f6017s;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i10 = parcel.readInt();
        int[] iArr = new int[i10];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f6017s = new SparseArray(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            this.f6017s.append(iArr[i11], parcelableArray[i11]);
        }
    }

    @Override // x3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        SparseArray sparseArray = this.f6017s;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f6017s.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.f6017s.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i10);
    }
}
