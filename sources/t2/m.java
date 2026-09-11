package t2;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import v1.y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f16403i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.c f16404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.m f16405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x0.j f16406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f16407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ View f16408v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context, eh.c cVar, o0.m mVar, x0.j jVar, int i10, View view) {
        super(0);
        this.f16403i = context;
        this.f16404r = cVar;
        this.f16405s = mVar;
        this.f16406t = jVar;
        this.f16407u = i10;
        this.f16408v = view;
    }

    @Override // eh.a
    public final Object invoke() {
        KeyEvent.Callback callback = this.f16408v;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.node.Owner", callback);
        return new n(this.f16403i, this.f16404r, this.f16405s, this.f16406t, this.f16407u, (y0) callback).getLayoutNode();
    }
}
