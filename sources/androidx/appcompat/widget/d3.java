package androidx.appcompat.widget;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 extends e4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f855a;

    public d3(e3 e3Var) {
        this.f855a = new WeakReference(e3Var);
    }

    @Override // e4.h
    public final void a() {
        e3 e3Var = (e3) this.f855a.get();
        if (e3Var != null) {
            e3Var.onEmojiCompatInitializedForSwitchText();
        }
    }

    @Override // e4.h
    public final void b() {
        e3 e3Var = (e3) this.f855a.get();
        if (e3Var != null) {
            e3Var.onEmojiCompatInitializedForSwitchText();
        }
    }
}
