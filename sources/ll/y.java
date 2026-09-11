package ll;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f10218c;

    public y(String str) {
        a aVar = a.f10094r;
        Objects.requireNonNull(str, "name == null");
        this.f10217b = str;
        this.f10218c = aVar;
    }

    @Override // ll.r0
    public final void a(h0 h0Var, Object obj) {
        if (obj == null) {
            return;
        }
        this.f10218c.getClass();
        String string = obj.toString();
        if (string == null) {
            return;
        }
        h0Var.b(this.f10217b, string);
    }
}
