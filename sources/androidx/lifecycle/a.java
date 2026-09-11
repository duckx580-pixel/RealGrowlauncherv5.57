package androidx.lifecycle;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f1853b;

    public a(Application application) {
        this.f1853b = application;
    }

    public final Application e() {
        Application application = this.f1853b;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication", application);
        return application;
    }
}
