package pf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends s {
    public static final Parcelable.Creator<w> CREATOR = new f.a(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public u f13445r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f13446s;

    @Override // pf.s
    public final boolean a(s sVar) {
        return false;
    }

    @Override // pf.s
    public final void b(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // pf.s
    public final void c(h hVar) {
        this.f13446s.c(hVar);
        this.f13445r.c(hVar);
    }

    @Override // pf.s
    public final void d(h hVar) {
        this.f13445r.d(hVar);
        this.f13446s.d(hVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ReplaceAction{insert=" + this.f13445r + ", delete=" + this.f13446s + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f13445r, i10);
        parcel.writeParcelable(this.f13446s, i10);
    }
}
