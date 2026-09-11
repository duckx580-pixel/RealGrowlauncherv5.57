package a0;

import java.util.List;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f129i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f130r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s0 s0Var, int i10) {
        super(0);
        this.f129i = i10;
        this.f130r = s0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f129i) {
            case 0:
                return new j((eh.c) this.f130r.getValue());
            case 1:
                return (b0.t) ((eh.a) this.f130r.getValue()).invoke();
            case 2:
                return (List) this.f130r.getValue();
            case 3:
                Boolean bool = (Boolean) this.f130r.getValue();
                bool.getClass();
                return bool;
            default:
                return new z.e((eh.c) this.f130r.getValue());
        }
    }
}
