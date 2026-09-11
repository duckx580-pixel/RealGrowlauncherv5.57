package mh;

import bi.r;
import java.util.Iterator;
import o0.h0;
import o0.r1;
import o0.t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Iterable, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11737i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f11738r;

    public /* synthetic */ m(int i10, Object obj) {
        this.f11737i = i10;
        this.f11738r = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f11737i) {
            case 0:
                return new nh.b((h) this.f11738r);
            case 1:
                return new t1((r1) this.f11738r, null);
            case 2:
                return new b(kotlin.jvm.internal.l.i((Object[]) ((androidx.activity.c) this.f11738r).f683r));
            default:
                return new kotlin.jvm.internal.b((r) this.f11738r);
        }
    }

    public m(r1 r1Var, h0 h0Var) {
        this.f11737i = 1;
        this.f11738r = r1Var;
    }
}
