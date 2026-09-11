package b0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2472i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ x0.j f2473r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(x0.j jVar, int i10) {
        super(1);
        this.f2472i = i10;
        this.f2473r = jVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f2472i) {
            case 0:
                x0.j jVar = this.f2473r;
                return Boolean.valueOf(jVar != null ? jVar.a(obj) : true);
            default:
                return new r0(this.f2473r, (Map) obj);
        }
    }
}
