package ll;

import android.os.Build;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends g0 {
    @Override // ll.g0
    public final Executor a() {
        return new h7.o(1);
    }

    @Override // ll.g0
    public final Object b(Object obj, Method method, Object... objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return super.b(obj, method, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
