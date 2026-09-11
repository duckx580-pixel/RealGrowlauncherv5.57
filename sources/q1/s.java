package q1;

import java.util.ArrayList;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f13700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f13706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f13707i;
    public final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13708k;

    public s(long j, long j10, long j11, long j12, boolean z3, float f9, int i10, boolean z10, ArrayList arrayList, long j13, long j14) {
        this.f13699a = j;
        this.f13700b = j10;
        this.f13701c = j11;
        this.f13702d = j12;
        this.f13703e = z3;
        this.f13704f = f9;
        this.f13705g = i10;
        this.f13706h = z10;
        this.f13707i = arrayList;
        this.j = j13;
        this.f13708k = j14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p.a(this.f13699a, sVar.f13699a) && this.f13700b == sVar.f13700b && f1.c.b(this.f13701c, sVar.f13701c) && f1.c.b(this.f13702d, sVar.f13702d) && this.f13703e == sVar.f13703e && Float.compare(this.f13704f, sVar.f13704f) == 0 && this.f13705g == sVar.f13705g && this.f13706h == sVar.f13706h && this.f13707i.equals(sVar.f13707i) && f1.c.b(this.j, sVar.j) && f1.c.b(this.f13708k, sVar.f13708k);
    }

    public final int hashCode() {
        int iB = h0.b(Long.hashCode(this.f13699a) * 31, 31, this.f13700b);
        int i10 = f1.c.f5976e;
        return Long.hashCode(this.f13708k) + h0.b((this.f13707i.hashCode() + h0.c(android.support.v4.media.session.a.z(this.f13705g, h0.a(h0.c(h0.b(h0.b(iB, 31, this.f13701c), 31, this.f13702d), 31, this.f13703e), this.f13704f, 31), 31), 31, this.f13706h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputEventData(id=");
        sb2.append((Object) p.b(this.f13699a));
        sb2.append(", uptime=");
        sb2.append(this.f13700b);
        sb2.append(", positionOnScreen=");
        sb2.append((Object) f1.c.i(this.f13701c));
        sb2.append(", position=");
        sb2.append((Object) f1.c.i(this.f13702d));
        sb2.append(", down=");
        sb2.append(this.f13703e);
        sb2.append(", pressure=");
        sb2.append(this.f13704f);
        sb2.append(", type=");
        int i10 = this.f13705g;
        sb2.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb2.append(", issuesEnterExit=");
        sb2.append(this.f13706h);
        sb2.append(", historical=");
        sb2.append(this.f13707i);
        sb2.append(", scrollDelta=");
        sb2.append((Object) f1.c.i(this.j));
        sb2.append(", originalEventPosition=");
        sb2.append((Object) f1.c.i(this.f13708k));
        sb2.append(')');
        return sb2.toString();
    }
}
