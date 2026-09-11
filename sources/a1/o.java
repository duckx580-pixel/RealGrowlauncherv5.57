package a1;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends CancellationException {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f206i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i10) {
        super(str);
        this.f206i = i10;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.f206i) {
            case 0:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 1:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 2:
                setStackTrace(new StackTraceElement[0]);
                break;
            case 3:
                setStackTrace(new StackTraceElement[0]);
                break;
            default:
                setStackTrace(new StackTraceElement[0]);
                break;
        }
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o() {
        super("The coroutine scope left the composition");
        this.f206i = 1;
    }
}
