package s8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends c8.a {
    public static final Parcelable.Creator<c> CREATOR = new d(0);
    public final q A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f15265i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f15266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public b3 f15267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f15268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f15270v;
    public final q w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15271x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f15272y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f15273z;

    public c(String str, String str2, b3 b3Var, long j, boolean z3, String str3, q qVar, long j10, q qVar2, long j11, q qVar3) {
        this.f15265i = str;
        this.f15266r = str2;
        this.f15267s = b3Var;
        this.f15268t = j;
        this.f15269u = z3;
        this.f15270v = str3;
        this.w = qVar;
        this.f15271x = j10;
        this.f15272y = qVar2;
        this.f15273z = j11;
        this.A = qVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.G(parcel, 2, this.f15265i);
        w9.a.G(parcel, 3, this.f15266r);
        w9.a.F(parcel, 4, this.f15267s, i10);
        long j = this.f15268t;
        w9.a.L(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z3 = this.f15269u;
        w9.a.L(parcel, 6, 4);
        parcel.writeInt(z3 ? 1 : 0);
        w9.a.G(parcel, 7, this.f15270v);
        w9.a.F(parcel, 8, this.w, i10);
        long j10 = this.f15271x;
        w9.a.L(parcel, 9, 8);
        parcel.writeLong(j10);
        w9.a.F(parcel, 10, this.f15272y, i10);
        w9.a.L(parcel, 11, 8);
        parcel.writeLong(this.f15273z);
        w9.a.F(parcel, 12, this.A, i10);
        w9.a.K(parcel, iJ);
    }

    public c(c cVar) {
        b8.a0.h(cVar);
        this.f15265i = cVar.f15265i;
        this.f15266r = cVar.f15266r;
        this.f15267s = cVar.f15267s;
        this.f15268t = cVar.f15268t;
        this.f15269u = cVar.f15269u;
        this.f15270v = cVar.f15270v;
        this.w = cVar.w;
        this.f15271x = cVar.f15271x;
        this.f15272y = cVar.f15272y;
        this.f15273z = cVar.f15273z;
        this.A = cVar.A;
    }
}
