package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1864b;

    public c(int i10, Method method) {
        this.f1863a = i10;
        this.f1864b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1863a == cVar.f1863a && this.f1864b.getName().equals(cVar.f1864b.getName());
    }

    public final int hashCode() {
        return this.f1864b.getName().hashCode() + (this.f1863a * 31);
    }
}
