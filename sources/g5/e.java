package g5;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6991a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f6992b;

    public e(ViewGroup viewGroup) {
        this.f6992b = viewGroup;
    }

    @Override // g5.s, g5.q
    public final void onTransitionCancel(r rVar) {
        f5.a.b(this.f6992b, false);
        this.f6991a = true;
    }

    @Override // g5.q
    public final void onTransitionEnd(r rVar) {
        if (!this.f6991a) {
            f5.a.b(this.f6992b, false);
        }
        rVar.w(this);
    }

    @Override // g5.s, g5.q
    public final void onTransitionPause(r rVar) {
        f5.a.b(this.f6992b, false);
    }

    @Override // g5.s, g5.q
    public final void onTransitionResume(r rVar) {
        f5.a.b(this.f6992b, true);
    }
}
