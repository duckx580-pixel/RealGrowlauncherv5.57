package ll;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 implements GenericArrayType {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Type f10182i;

    public o0(Type type) {
        this.f10182i = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && r0.c(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f10182i;
    }

    public final int hashCode() {
        return this.f10182i.hashCode();
    }

    public final String toString() {
        return r0.p(this.f10182i) + "[]";
    }
}
