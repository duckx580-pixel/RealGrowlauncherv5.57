package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f10527i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f10528r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10529s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(float f9, long j, long j10) {
        super(1);
        this.f10527i = j;
        this.f10528r = f9;
        this.f10529s = j10;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        i1.d dVar = (i1.d) obj;
        kotlin.jvm.internal.l.f("$this$Canvas", dVar);
        float fB = f1.f.b(dVar.e());
        h4.e(dVar, 0.0f, 1.0f, this.f10527i, fB, 0);
        h4.e(dVar, 0.0f, this.f10528r, this.f10529s, fB, 0);
        return qg.o.f13926a;
    }
}
