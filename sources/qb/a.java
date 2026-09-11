package qb;

import com.google.gson.internal.g;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f13890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Type f13891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13892c;

    public a() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                Type typeA = g.a(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    a(typeA);
                }
                this.f13891b = typeA;
                this.f13890a = g.g(typeA);
                this.f13892c = typeA.hashCode();
                return;
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static void a(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            a(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i10 = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                a(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i10 < length) {
                a(actualTypeArguments[i10]);
                i10++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            a(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i10 < length2) {
            a(upperBounds[i10]);
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return g.d(this.f13891b, ((a) obj).f13891b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13892c;
    }

    public final String toString() {
        return g.k(this.f13891b);
    }

    public a(Type type) {
        Objects.requireNonNull(type);
        Type typeA = g.a(type);
        this.f13891b = typeA;
        this.f13890a = g.g(typeA);
        this.f13892c = typeA.hashCode();
    }
}
