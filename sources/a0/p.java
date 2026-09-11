package a0;

import o0.d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.r implements lh.g {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f127r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i10, int i11, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i10);
        this.f127r = i11;
    }

    @Override // kotlin.jvm.internal.d
    public final lh.b computeReflected() {
        kotlin.jvm.internal.y.f9668a.getClass();
        return this;
    }

    @Override // lh.g
    public final Object get() {
        switch (this.f127r) {
            case 0:
                return ((d2) this.receiver).getValue();
            case 1:
                return this.receiver.getClass().getSimpleName();
            default:
                return ((d2) this.receiver).getValue();
        }
    }

    @Override // eh.a
    public final Object invoke() {
        return get();
    }
}
