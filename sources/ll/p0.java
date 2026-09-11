package ll;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements ParameterizedType {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Type f10185i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Type f10186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Type[] f10187s;

    public p0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            r0.b(type3);
        }
        this.f10185i = type;
        this.f10186r = type2;
        this.f10187s = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && r0.c(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f10187s.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f10185i;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f10186r;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f10187s) ^ this.f10186r.hashCode();
        Type type = this.f10185i;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.f10187s;
        int length = typeArr.length;
        Type type = this.f10186r;
        if (length == 0) {
            return r0.p(type);
        }
        StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
        sb2.append(r0.p(type));
        sb2.append("<");
        sb2.append(r0.p(typeArr[0]));
        for (int i10 = 1; i10 < typeArr.length; i10++) {
            sb2.append(", ");
            sb2.append(r0.p(typeArr[i10]));
        }
        sb2.append(">");
        return sb2.toString();
    }
}
