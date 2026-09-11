package th;

import java.util.Arrays;
import java.util.Collection;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f17201a;

    static {
        try {
            f17201a = mh.k.x(mh.k.t(Arrays.asList(new ph.b()).iterator()));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
