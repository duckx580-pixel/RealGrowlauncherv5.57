package vi;

import qg.o;
import rh.h;
import rh.i;
import rh.q;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q f18716i;

    public c(q qVar) {
        this.f18716i = qVar;
    }

    @Override // rh.h
    public final Object collect(i iVar, ug.c cVar) throws Throwable {
        Object objCollect = this.f18716i.collect(new b(iVar), cVar);
        return objCollect == vg.a.f18663i ? objCollect : o.f13926a;
    }
}
