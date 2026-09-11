package o0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements rh.i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12393i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e1 f12394r;

    public /* synthetic */ b2(e1 e1Var, int i10) {
        this.f12393i = i10;
        this.f12394r = e1Var;
    }

    @Override // rh.i
    public final Object emit(Object obj, ug.c cVar) {
        switch (this.f12393i) {
            case 0:
                this.f12394r.setValue(obj);
                break;
            default:
                this.f12394r.setValue(obj);
                break;
        }
        return qg.o.f13926a;
    }
}
