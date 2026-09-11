package bh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements mh.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2933b;

    public /* synthetic */ p(int i10, Object obj) {
        this.f2932a = i10;
        this.f2933b = obj;
    }

    @Override // mh.i
    public final Iterator iterator() {
        switch (this.f2932a) {
            case 0:
                return new o(this);
            case 1:
                return (Iterator) this.f2933b;
            case 2:
                return kotlin.jvm.internal.l.i((Object[]) this.f2933b);
            default:
                return ((Iterable) this.f2933b).iterator();
        }
    }
}
