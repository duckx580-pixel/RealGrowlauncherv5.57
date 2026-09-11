package b8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends c8.a {
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(19);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2813i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2814r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2815s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f2816t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f2817u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f2818v;
    public final String w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f2819x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f2820y;

    public k(int i10, int i11, int i12, long j, long j10, String str, String str2, int i13, int i14) {
        this.f2813i = i10;
        this.f2814r = i11;
        this.f2815s = i12;
        this.f2816t = j;
        this.f2817u = j10;
        this.f2818v = str;
        this.w = str2;
        this.f2819x = i13;
        this.f2820y = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f2813i);
        w9.a.L(parcel, 2, 4);
        parcel.writeInt(this.f2814r);
        w9.a.L(parcel, 3, 4);
        parcel.writeInt(this.f2815s);
        w9.a.L(parcel, 4, 8);
        parcel.writeLong(this.f2816t);
        w9.a.L(parcel, 5, 8);
        parcel.writeLong(this.f2817u);
        w9.a.G(parcel, 6, this.f2818v);
        w9.a.G(parcel, 7, this.w);
        w9.a.L(parcel, 8, 4);
        parcel.writeInt(this.f2819x);
        w9.a.L(parcel, 9, 4);
        parcel.writeInt(this.f2820y);
        w9.a.K(parcel, iJ);
    }
}
