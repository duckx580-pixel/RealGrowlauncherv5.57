package mh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f11732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg.a f11733c;

    /* JADX WARN: Multi-variable type inference failed */
    public h(i iVar, eh.c cVar, int i10) {
        this.f11731a = i10;
        switch (i10) {
            case 2:
                this.f11732b = iVar;
                this.f11733c = cVar;
                break;
            default:
                this.f11732b = iVar;
                this.f11733c = (kotlin.jvm.internal.m) cVar;
                break;
        }
    }

    @Override // mh.i
    public final Iterator iterator() {
        switch (this.f11731a) {
            case 0:
                return new g(this);
            case 1:
                return new bh.h(this);
            case 2:
                return new n(this);
            default:
                return new nh.b(this);
        }
    }

    public h(androidx.activity.c cVar, eh.c cVar2) {
        this.f11731a = 0;
        kotlin.jvm.internal.l.f("getNextValue", cVar2);
        this.f11732b = cVar;
        this.f11733c = cVar2;
    }

    public h(CharSequence charSequence, eh.e eVar) {
        this.f11731a = 3;
        kotlin.jvm.internal.l.f("input", charSequence);
        this.f11732b = charSequence;
        this.f11733c = eVar;
    }
}
