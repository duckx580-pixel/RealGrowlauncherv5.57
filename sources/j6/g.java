package j6;

import androidx.lifecycle.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.lifecycle.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g f8801b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f8802c = new f();

    @Override // androidx.lifecycle.p
    public final void a(u uVar) {
        if (!(uVar instanceof androidx.lifecycle.e)) {
            throw new IllegalArgumentException((uVar + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        androidx.lifecycle.e eVar = (androidx.lifecycle.e) uVar;
        f fVar = f8802c;
        kotlin.jvm.internal.l.f("owner", fVar);
        eVar.g(fVar);
        eVar.a(fVar);
    }

    @Override // androidx.lifecycle.p
    public final androidx.lifecycle.o b() {
        return androidx.lifecycle.o.f1910u;
    }

    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.lifecycle.p
    public final void c(u uVar) {
    }
}
