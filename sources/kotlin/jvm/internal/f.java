package kotlin.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements lh.c, e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Map f9657r;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class f9658i;

    static {
        List listD = sb.c.D(eh.a.class, eh.c.class, eh.e.class, eh.f.class, eh.g.class, w0.a.class, w0.a.class, eh.h.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, eh.b.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, w0.a.class, eh.d.class);
        ArrayList arrayList = new ArrayList(rg.m.O(listD, 10));
        int i10 = 0;
        for (Object obj : listD) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                sb.c.N();
                throw null;
            }
            arrayList.add(new qg.g((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f9657r = rg.y.K(arrayList);
    }

    public f(Class cls) {
        l.f("jClass", cls);
        this.f9658i = cls;
    }

    @Override // kotlin.jvm.internal.e
    public final Class a() {
        return this.f9658i;
    }

    public final String b() {
        String strF;
        Class cls = this.f9658i;
        l.f("jClass", cls);
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strF2 = a0.f(cls.getName());
                return strF2 == null ? cls.getSimpleName() : strF2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strF = a0.f(componentType.getName())) != null) {
                strConcat = strF.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return nh.h.m0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return nh.h.l0(simpleName, '$', simpleName);
        }
        return nh.h.m0(simpleName, enclosingConstructor.getName() + '$');
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f) && a.a.x(this).equals(a.a.x((lh.c) obj));
    }

    public final int hashCode() {
        return a.a.x(this).hashCode();
    }

    public final String toString() {
        return this.f9658i.toString() + " (Kotlin reflection is not available)";
    }
}
