package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends wg.i implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ m f16484i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ m f16485r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f16486s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(u uVar, ug.c cVar) {
        super(3, cVar);
        this.f16486s = uVar;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f0 f0Var = new f0(this.f16486s, (ug.c) obj3);
        f0Var.f16484i = (m) obj;
        f0Var.f16485r = (m) obj2;
        return f0Var.invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        m mVar = this.f16484i;
        m mVar2 = this.f16485r;
        kotlin.jvm.internal.l.f("<this>", mVar2);
        kotlin.jvm.internal.l.f("previous", mVar);
        int i10 = mVar2.f16568a;
        int i11 = mVar.f16568a;
        return i10 > i11 ? true : i10 < i11 ? false : l.a(mVar2.f16569b, mVar.f16569b, this.f16486s) ? mVar2 : mVar;
    }
}
