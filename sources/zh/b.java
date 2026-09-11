package zh;

import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f21342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lh.c f21343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21344c;

    public b(h hVar, lh.c cVar) {
        this.f21342a = hVar;
        this.f21343b = cVar;
        this.f21344c = hVar.f21355a + '<' + ((Object) ((kotlin.jvm.internal.f) cVar).b()) + '>';
    }

    @Override // zh.g
    public final String a() {
        return this.f21344c;
    }

    @Override // zh.g
    public final boolean c() {
        return false;
    }

    @Override // zh.g
    public final int d(String str) {
        l.f("name", str);
        return this.f21342a.d(str);
    }

    @Override // zh.g
    public final xd.c e() {
        return this.f21342a.f21356b;
    }

    public final boolean equals(Object obj) {
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f21342a.equals(bVar.f21342a) && bVar.f21343b.equals(this.f21343b);
    }

    @Override // zh.g
    public final int f() {
        return this.f21342a.f21357c;
    }

    @Override // zh.g
    public final String g(int i10) {
        return this.f21342a.f21359e[i10];
    }

    @Override // zh.g
    public final List h(int i10) {
        return this.f21342a.f21361g[i10];
    }

    public final int hashCode() {
        return this.f21344c.hashCode() + (((kotlin.jvm.internal.f) this.f21343b).hashCode() * 31);
    }

    @Override // zh.g
    public final g i(int i10) {
        return this.f21342a.f21360f[i10];
    }

    @Override // zh.g
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.f21343b + ", original: " + this.f21342a + ')';
    }
}
