package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0.d f11166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0.d f11167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0.d f11168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0.d f11169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e0.d f11170e;

    public q4() {
        e0.d dVar = p4.f11118a;
        e0.d dVar2 = p4.f11119b;
        e0.d dVar3 = p4.f11120c;
        e0.d dVar4 = p4.f11121d;
        e0.d dVar5 = p4.f11122e;
        kotlin.jvm.internal.l.f("extraSmall", dVar);
        kotlin.jvm.internal.l.f("small", dVar2);
        kotlin.jvm.internal.l.f("medium", dVar3);
        kotlin.jvm.internal.l.f("large", dVar4);
        kotlin.jvm.internal.l.f("extraLarge", dVar5);
        this.f11166a = dVar;
        this.f11167b = dVar2;
        this.f11168c = dVar3;
        this.f11169d = dVar4;
        this.f11170e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return kotlin.jvm.internal.l.a(this.f11166a, q4Var.f11166a) && kotlin.jvm.internal.l.a(this.f11167b, q4Var.f11167b) && kotlin.jvm.internal.l.a(this.f11168c, q4Var.f11168c) && kotlin.jvm.internal.l.a(this.f11169d, q4Var.f11169d) && kotlin.jvm.internal.l.a(this.f11170e, q4Var.f11170e);
    }

    public final int hashCode() {
        return this.f11170e.hashCode() + ((this.f11169d.hashCode() + ((this.f11168c.hashCode() + ((this.f11167b.hashCode() + (this.f11166a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f11166a + ", small=" + this.f11167b + ", medium=" + this.f11168c + ", large=" + this.f11169d + ", extraLarge=" + this.f11170e + ')';
    }
}
