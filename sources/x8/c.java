package x8;

import android.animation.TimeInterpolator;
import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f19499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19501e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f19499c;
        return timeInterpolator != null ? timeInterpolator : a.f19492b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f19497a == cVar.f19497a && this.f19498b == cVar.f19498b && this.f19500d == cVar.f19500d && this.f19501e == cVar.f19501e) {
            return a().getClass().equals(cVar.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f19497a;
        long j10 = this.f19498b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f19500d) * 31) + this.f19501e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f19497a);
        sb2.append(" duration: ");
        sb2.append(this.f19498b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f19500d);
        sb2.append(" repeatMode: ");
        return g.i(sb2, this.f19501e, "}\n");
    }
}
