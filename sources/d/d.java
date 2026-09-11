package d;

import androidx.activity.r;
import kotlin.jvm.internal.m;
import qg.o;
import w1.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4787i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f4788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f4789s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, boolean z3) {
        super(0);
        this.f4789s = fVar;
        this.f4788r = z3;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f4787i) {
            case 0:
                f fVar = (f) this.f4789s;
                fVar.f707a = this.f4788r;
                r rVar = fVar.f709c;
                if (rVar != null) {
                    rVar.invoke();
                }
                break;
            default:
                t tVar = (t) this.f4789s;
                if (this.f4788r) {
                    tVar.clearFocus();
                } else {
                    tVar.requestFocus();
                }
                break;
        }
        return o.f13926a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z3, t tVar) {
        super(0);
        this.f4788r = z3;
        this.f4789s = tVar;
    }
}
