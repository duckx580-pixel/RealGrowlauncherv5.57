package pb;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f13365a = Class.class.getMethod("isRecord", null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f13366b = Class.class.getMethod("getRecordComponents", null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f13367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f13368d;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f13367c = cls.getMethod("getName", null);
        this.f13368d = cls.getMethod("getType", null);
    }

    @Override // o1.c
    public final boolean A(Class cls) {
        try {
            return ((Boolean) this.f13365a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e8) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e8);
        }
    }

    @Override // o1.c
    public final Method t(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e8) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e8);
        }
    }

    @Override // o1.c
    public final Constructor v(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f13366b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                clsArr[i10] = (Class) this.f13368d.invoke(objArr[i10], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e8) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e8);
        }
    }

    @Override // o1.c
    public final String[] w(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f13366b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i10 = 0; i10 < objArr.length; i10++) {
                strArr[i10] = (String) this.f13367c.invoke(objArr[i10], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e8) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e8);
        }
    }
}
