package d0;

import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4801i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f4802r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f4803s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, eh.c cVar, boolean z3) {
        super(0);
        this.f4801i = i10;
        this.f4802r = cVar;
        this.f4803s = z3;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4801i) {
            case 0:
                this.f4802r.invoke(Boolean.valueOf(!this.f4803s));
                break;
            default:
                this.f4802r.invoke(Boolean.valueOf(!this.f4803s));
                break;
        }
        return o.f13926a;
    }
}
