package r4;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14547i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Bundle f14548r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i10, Bundle bundle) {
        super(1);
        this.f14547i = i10;
        this.f14548r = bundle;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f14547i) {
            case 0:
                kotlin.jvm.internal.l.f("argName", (String) obj);
                return Boolean.valueOf(!this.f14548r.containsKey(r2));
            default:
                kotlin.jvm.internal.l.f("key", (String) obj);
                return Boolean.valueOf(!this.f14548r.containsKey(r2));
        }
    }
}
