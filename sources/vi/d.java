package vi;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d4.e f18717b = new d4.e("lua_active");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f18718a;

    public d(Application application) {
        l.f("context", application);
        this.f18718a = application;
    }
}
