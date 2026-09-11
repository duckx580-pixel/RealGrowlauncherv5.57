package y7;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c8.a {
    public static final Parcelable.Creator<p> CREATOR = new f.a(19);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f20208i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f20209r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f20210s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f20211t;

    public p(boolean z3, String str, int i10, int i11) {
        this.f20208i = z3;
        this.f20209r = str;
        this.f20210s = v.D(i10) - 1;
        this.f20211t = android.support.v4.media.session.b.z(i11) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f20208i ? 1 : 0);
        w9.a.G(parcel, 2, this.f20209r);
        w9.a.L(parcel, 3, 4);
        parcel.writeInt(this.f20210s);
        w9.a.L(parcel, 4, 4);
        parcel.writeInt(this.f20211t);
        w9.a.K(parcel, iJ);
    }
}
