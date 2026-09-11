package t6;

import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16710i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final u5.l f16711r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(int i10, u5.l lVar) {
        super(0);
        this.f16710i = i10;
        this.f16711r = lVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16710i) {
            case 0:
                return ((Intent) this.f16711r.f17672i).getParcelableExtra("android.intent.extra.REFERRER");
            default:
                return Boolean.valueOf(((Intent) this.f16711r.f17672i).hasExtra("af_consumed"));
        }
    }
}
