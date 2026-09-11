package w1;

import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o0.z0 f18747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f18748z;

    public a1(ContextWrapper contextWrapper) {
        super(contextWrapper, null);
        this.f18747y = o0.p.I(null, o0.n0.f12510u);
    }

    @Override // w1.a
    public final void a(int i10, o0.o oVar) {
        oVar.V(420213850);
        eh.e eVar = (eh.e) this.f18747y.getValue();
        if (eVar != null) {
            eVar.invoke(oVar, 0);
        }
        o0.h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new a1.i(this, i10, 15);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return a1.class.getName();
    }

    @Override // w1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f18748z;
    }

    public final void setContent(eh.e eVar) {
        this.f18748z = true;
        this.f18747y.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f18740t == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            c();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
