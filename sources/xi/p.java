package xi;

import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19852i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f19853r;

    public /* synthetic */ p(s0 s0Var, int i10) {
        this.f19852i = i10;
        this.f19853r = s0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f19852i) {
            case 0:
                this.f19853r.setValue("Public");
                break;
            case 1:
                this.f19853r.setValue("Public");
                break;
            case 2:
                this.f19853r.setValue("Private");
                break;
            case 3:
                this.f19853r.setValue("Private");
                break;
            case 4:
                this.f19853r.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                break;
            case 5:
                this.f19853r.setValue(Boolean.FALSE);
                break;
            case 6:
                this.f19853r.setValue(Boolean.FALSE);
                break;
            default:
                this.f19853r.setValue(Boolean.FALSE);
                break;
        }
        return qg.o.f13926a;
    }
}
