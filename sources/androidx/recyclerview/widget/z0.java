package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends x3.b {
    public static final Parcelable.Creator<z0> CREATOR = new o3(1);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Parcelable f2293s;

    public z0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2293s = parcel.readParcelable(classLoader == null ? q0.class.getClassLoader() : classLoader);
    }

    @Override // x3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f2293s, 0);
    }
}
