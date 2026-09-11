package pf;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends s {
    public static final Parcelable.Creator<u> CREATOR = new f.a(6);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13439r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13440s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13441t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13442u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final transient long f13443v = System.currentTimeMillis();
    public CharSequence w;

    @Override // pf.s
    public final boolean a(s sVar) {
        if (!(sVar instanceof u)) {
            return false;
        }
        u uVar = (u) sVar;
        if (uVar.f13441t == this.f13442u && uVar.f13439r == this.f13440s) {
            return this.w.length() + uVar.w.length() < 10000 && Math.abs(uVar.f13443v - this.f13443v) < 8000;
        }
        return false;
    }

    @Override // pf.s
    public final void b(s sVar) {
        StringBuilder sb2;
        if (!a(sVar)) {
            throw new IllegalArgumentException();
        }
        u uVar = (u) sVar;
        this.f13442u = uVar.f13442u;
        this.f13440s = uVar.f13440s;
        CharSequence charSequence = this.w;
        if (charSequence instanceof StringBuilder) {
            sb2 = (StringBuilder) charSequence;
        } else {
            StringBuilder sb3 = new StringBuilder(charSequence);
            this.w = sb3;
            sb2 = sb3;
        }
        sb2.append(uVar.w);
    }

    @Override // pf.s
    public final void c(h hVar) {
        hVar.r(this.f13439r, this.f13441t, this.w);
    }

    @Override // pf.s
    public final void d(h hVar) {
        hVar.h(this.f13439r, this.f13441t, this.f13440s, this.f13442u);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "InsertAction{startLine=" + this.f13439r + ", endLine=" + this.f13440s + ", startColumn=" + this.f13441t + ", endColumn=" + this.f13442u + ", createTime=" + this.f13443v + ", text=" + ((Object) this.w) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13439r);
        parcel.writeInt(this.f13441t);
        parcel.writeInt(this.f13440s);
        parcel.writeInt(this.f13442u);
        parcel.writeString(this.w.toString());
    }
}
