package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m5 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10967i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o5 f10968r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5(o5 o5Var, int i10) {
        super(1);
        this.f10967i = i10;
        this.f10968r = o5Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        int i10 = this.f10967i;
        o5 o5Var = this.f10968r;
        switch (i10) {
            case 0:
                b2.j jVar = (b2.j) obj;
                kotlin.jvm.internal.l.f("$this$semantics", jVar);
                lh.j[] jVarArr = b2.t.f2617a;
                b2.u uVar = b2.r.j;
                lh.j jVar2 = b2.t.f2617a[3];
                uVar.a(jVar, new b2.e());
                jVar.j(b2.i.f2563s, new b2.a(null, new l5(o5Var, 0)));
                return qg.o.f13926a;
            default:
                t1 t1Var = (t1) obj;
                kotlin.jvm.internal.l.f("it", t1Var);
                return Boolean.valueOf(kotlin.jvm.internal.l.a(t1Var.f11280a, o5Var));
        }
    }
}
