package s5;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConnectivityManager f15189f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i6.f f15190g;

    public g(Context context, n7.e eVar) {
        super(context, eVar);
        Object systemService = this.f15183a.getSystemService("connectivity");
        l.d("null cannot be cast to non-null type android.net.ConnectivityManager", systemService);
        this.f15189f = (ConnectivityManager) systemService;
        this.f15190g = new i6.f(1, this);
    }

    @Override // s5.e
    public final Object b() {
        return h.a(this.f15189f);
    }

    @Override // s5.e
    public final void f() {
        try {
            p.d().a(h.f15191a, "Registering network callback");
            v5.i.a(this.f15189f, this.f15190g);
        } catch (IllegalArgumentException e8) {
            p.d().c(h.f15191a, "Received exception while registering network callback", e8);
        } catch (SecurityException e10) {
            p.d().c(h.f15191a, "Received exception while registering network callback", e10);
        }
    }

    @Override // s5.e
    public final void g() {
        try {
            p.d().a(h.f15191a, "Unregistering network callback");
            v5.g.c(this.f15189f, this.f15190g);
        } catch (IllegalArgumentException e8) {
            p.d().c(h.f15191a, "Received exception while unregistering network callback", e8);
        } catch (SecurityException e10) {
            p.d().c(h.f15191a, "Received exception while unregistering network callback", e10);
        }
    }
}
