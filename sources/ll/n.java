package ll;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f10177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10178b;

    public n(Method method, ArrayList arrayList) {
        this.f10177a = method;
        this.f10178b = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        Method method = this.f10177a;
        return String.format("%s.%s() %s", method.getDeclaringClass().getName(), method.getName(), this.f10178b);
    }
}
