package l5;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f9818a;

    static {
        t lVar;
        try {
            lVar = new u5.l((WebViewProviderFactoryBoundaryInterface) qj.b.e(WebViewProviderFactoryBoundaryInterface.class, jj.l.k()));
        } catch (ClassNotFoundException unused) {
            lVar = new l();
        } catch (IllegalAccessException e8) {
            throw new RuntimeException(e8);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
        f9818a = lVar;
    }
}
