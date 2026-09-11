package aa;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.jvm.internal.l;
import w9.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f580b = new Object();

    public static final FirebaseAnalytics a() {
        if (f579a == null) {
            synchronized (f580b) {
                if (f579a == null) {
                    f fVarB = f.b();
                    fVarB.a();
                    f579a = FirebaseAnalytics.getInstance(fVarB.f19149a);
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = f579a;
        l.c(firebaseAnalytics);
        return firebaseAnalytics;
    }
}
