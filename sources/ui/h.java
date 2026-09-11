package ui;

import o0.d2;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18041i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.a f18042r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d2 f18043s;

    public /* synthetic */ h(eh.a aVar, s0 s0Var, int i10) {
        this.f18041i = i10;
        this.f18042r = aVar;
        this.f18043s = s0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f18041i) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.f18043s.getValue()).booleanValue();
                eh.a aVar = this.f18042r;
                if (zBooleanValue) {
                    aVar.invoke();
                } else {
                    aVar.invoke();
                }
                break;
            default:
                if (!((Boolean) this.f18043s.getValue()).booleanValue()) {
                    this.f18042r.invoke();
                }
                break;
        }
        return qg.o.f13926a;
    }
}
