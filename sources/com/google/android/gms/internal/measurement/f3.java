package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t3 f3775b;

    public f3(Context context, t3 t3Var) {
        this.f3774a = context;
        this.f3775b = t3Var;
    }

    public final boolean equals(Object obj) {
        t3 t3Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f3) {
            f3 f3Var = (f3) obj;
            t3 t3Var2 = f3Var.f3775b;
            if (this.f3774a.equals(f3Var.f3774a) && ((t3Var = this.f3775b) != null ? t3Var.equals(t3Var2) : t3Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3774a.hashCode() ^ 1000003) * 1000003;
        t3 t3Var = this.f3775b;
        return iHashCode ^ (t3Var == null ? 0 : t3Var.hashCode());
    }

    public final String toString() {
        return k0.g.g("FlagsContext{context=", this.f3774a.toString(), ", hermeticFileOverrides=", String.valueOf(this.f3775b), "}");
    }
}
