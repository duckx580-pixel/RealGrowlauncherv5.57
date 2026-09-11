package ll;

import java.io.IOException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f10206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f10208d;

    public v(Method method, int i10, j jVar) {
        this.f10206b = method;
        this.f10207c = i10;
        this.f10208d = jVar;
    }

    @Override // ll.r0
    public final void a(h0 h0Var, Object obj) {
        int i10 = this.f10207c;
        Method method = this.f10206b;
        if (obj == null) {
            throw r0.k(method, i10, "Body parameter value must not be null.", new Object[0]);
        }
        try {
            h0Var.f10129k = (bj.a0) this.f10208d.b(obj);
        } catch (IOException e8) {
            throw r0.l(method, e8, i10, "Unable to convert " + obj + " to RequestBody", new Object[0]);
        }
    }
}
