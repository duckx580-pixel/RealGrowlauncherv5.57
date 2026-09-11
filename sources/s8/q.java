package s8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends c8.a {
    public static final Parcelable.Creator<q> CREATOR = new d(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f15538i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p f15539r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f15540s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f15541t;

    public q(String str, p pVar, String str2, long j) {
        this.f15538i = str;
        this.f15539r = pVar;
        this.f15540s = str2;
        this.f15541t = j;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15539r);
        StringBuilder sbO = k0.g.o("origin=", this.f15540s, ",name=", this.f15538i, ",params=");
        sbO.append(strValueOf);
        return sbO.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        d.a(this, parcel, i10);
    }

    public q(q qVar, long j) {
        b8.a0.h(qVar);
        this.f15538i = qVar.f15538i;
        this.f15539r = qVar.f15539r;
        this.f15540s = qVar.f15540s;
        this.f15541t = j;
    }
}
