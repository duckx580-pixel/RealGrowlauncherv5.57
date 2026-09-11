package wh;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19259i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f19260r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i10) {
        super(1);
        this.f19259i = i10;
        this.f19260r = dVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f19259i) {
            case 0:
                this.f19260r.d(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f19263h;
                d dVar = this.f19260r;
                atomicReferenceFieldUpdater.set(dVar, null);
                dVar.d(null);
                break;
        }
        return o.f13926a;
    }
}
