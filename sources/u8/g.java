package u8;

import android.os.Parcel;
import android.os.Parcelable;
import b8.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends c8.a {
    public static final Parcelable.Creator<g> CREATOR = new f.a(13);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17733i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y7.a f17734r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u f17735s;

    public g(int i10, y7.a aVar, u uVar) {
        this.f17733i = i10;
        this.f17734r = aVar;
        this.f17735s = uVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f17733i);
        w9.a.F(parcel, 2, this.f17734r, i10);
        w9.a.F(parcel, 3, this.f17735s, i10);
        w9.a.K(parcel, iJ);
    }
}
