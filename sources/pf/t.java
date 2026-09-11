package pf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {
    public static final Parcelable.Creator<t> CREATOR = new f.a(5);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13434r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13435s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13436t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13437u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient long f13438v = System.currentTimeMillis();
    public Object w;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // pf.s
    public final boolean a(s sVar) {
        if (!(sVar instanceof t)) {
            return false;
        }
        t tVar = (t) sVar;
        if (tVar.f13437u == this.f13436t && tVar.f13435s == this.f13434r) {
            return this.w.length() + tVar.w.length() < 10000 && Math.abs(tVar.f13438v - this.f13438v) < 8000;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // pf.s
    public final void b(s sVar) {
        StringBuilder sb2;
        if (!a(sVar)) {
            throw new IllegalArgumentException();
        }
        t tVar = (t) sVar;
        this.f13436t = tVar.f13436t;
        this.f13434r = tVar.f13434r;
        ?? r02 = this.w;
        if (r02 instanceof StringBuilder) {
            sb2 = (StringBuilder) r02;
        } else {
            StringBuilder sb3 = new StringBuilder((CharSequence) r02);
            this.w = sb3;
            sb2 = sb3;
        }
        sb2.insert(0, (CharSequence) tVar.w);
    }

    @Override // pf.s
    public final void c(h hVar) {
        hVar.h(this.f13434r, this.f13436t, this.f13435s, this.f13437u);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // pf.s
    public final void d(h hVar) {
        hVar.r(this.f13434r, this.f13436t, this.w);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "DeleteAction{startLine=" + this.f13434r + ", endLine=" + this.f13435s + ", startColumn=" + this.f13436t + ", endColumn=" + this.f13437u + ", createTime=" + this.f13438v + ", text=" + this.w + '}';
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13434r);
        parcel.writeInt(this.f13436t);
        parcel.writeInt(this.f13435s);
        parcel.writeInt(this.f13437u);
        parcel.writeString(this.w.toString());
    }
}
