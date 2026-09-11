package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import b8.a0;
import c8.a;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new f.a(20);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3663i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3664r;

    public Scope(int i10, String str) {
        a0.f(str, "scopeUri must not be null or empty");
        this.f3663i = i10;
        this.f3664r = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f3664r.equals(((Scope) obj).f3664r);
    }

    public final int hashCode() {
        return this.f3664r.hashCode();
    }

    public final String toString() {
        return this.f3664r;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        w9.a.L(parcel, 1, 4);
        parcel.writeInt(this.f3663i);
        w9.a.G(parcel, 2, this.f3664r);
        w9.a.K(parcel, iJ);
    }
}
