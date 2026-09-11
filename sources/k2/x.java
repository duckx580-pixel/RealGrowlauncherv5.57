package k2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f9206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mf.e f9207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f9208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.m f9210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.m f9211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public u f9212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f9213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f9214i;
    public final Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f9215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f9216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q0.f f9217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.activity.b f9218n;

    public x(View view, w1.t tVar) {
        mf.e eVar = new mf.e(view);
        y yVar = new y(Choreographer.getInstance());
        this.f9206a = view;
        this.f9207b = eVar;
        this.f9208c = yVar;
        this.f9210e = d.f9148t;
        this.f9211f = d.f9149u;
        this.f9212g = new u(4, d2.w.f4916b, PredefinedUICustomizationFont.defaultFamily);
        this.f9213h = m.f9178d;
        this.f9214i = new ArrayList();
        this.j = android.support.v4.media.session.b.p(qg.e.f13909r, new a4.v(22, this));
        this.f9216l = new e(tVar, eVar);
        this.f9217m = new q0.f(new w[16]);
    }

    public final void a(w wVar) {
        this.f9217m.b(wVar);
        if (this.f9218n == null) {
            androidx.activity.b bVar = new androidx.activity.b(8, this);
            this.f9208c.execute(bVar);
            this.f9218n = bVar;
        }
    }
}
