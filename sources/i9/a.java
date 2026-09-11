package i9;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends x3.b {
    public static final Parcelable.Creator<a> CREATOR = new o3(5);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f8114s;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8114s = parcel.readInt() == 1;
    }

    @Override // x3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f8114s ? 1 : 0);
    }
}
