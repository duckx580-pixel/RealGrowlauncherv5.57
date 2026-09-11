package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p3 extends x3.b {
    public static final Parcelable.Creator<p3> CREATOR = new o3(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f974t;

    public p3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f973s = parcel.readInt();
        this.f974t = parcel.readInt() != 0;
    }

    @Override // x3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeInt(this.f973s);
        parcel.writeInt(this.f974t ? 1 : 0);
    }
}
