package th;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17229a = 0;

    static {
        Object objI;
        Object objI2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objI = wg.a.class.getCanonicalName();
        } catch (Throwable th2) {
            objI = androidx.work.v.i(th2);
        }
        if (qg.i.a(objI) != null) {
            objI = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objI2 = s.class.getCanonicalName();
        } catch (Throwable th3) {
            objI2 = androidx.work.v.i(th3);
        }
        if (qg.i.a(objI2) != null) {
            objI2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
