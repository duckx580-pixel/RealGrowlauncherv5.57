package m0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f10839i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f10840r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(float f9, float f10) {
        super(1);
        this.f10839i = f9;
        this.f10840r = f10;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        return Float.valueOf(((Boolean) obj).booleanValue() ? this.f10839i : this.f10840r);
    }
}
