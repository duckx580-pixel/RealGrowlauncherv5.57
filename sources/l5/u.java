package l5;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebkitToCompatConverterBoundaryInterface f9819a;

    public u(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f9819a = webkitToCompatConverterBoundaryInterface;
    }

    public final SafeBrowsingResponse a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f9819a.convertSafeBrowsingResponse(invocationHandler);
    }
}
