package ll;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Pattern f10130x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Pattern f10131y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final al.h f10132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f10133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Annotation[] f10134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Annotation[][] f10135d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Type[] f10136e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10137f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10138g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10139h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10140i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f10144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f10148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public bj.o f10149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public bj.s f10150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public LinkedHashSet f10151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public r0[] f10152v;
    public boolean w;

    public i0(al.h hVar, Method method) {
        this.f10132a = hVar;
        this.f10133b = method;
        this.f10134c = method.getAnnotations();
        this.f10136e = method.getGenericParameterTypes();
        this.f10135d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    public final void b(String str, String str2, boolean z3) {
        String str3 = this.f10144n;
        Method method = this.f10133b;
        if (str3 != null) {
            throw r0.j(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f10144n = str;
        this.f10145o = z3;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f10130x;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw r0.j(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f10148r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f10151u = linkedHashSet;
    }

    public final void c(int i10, Type type) {
        if (r0.h(type)) {
            throw r0.k(this.f10133b, i10, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
