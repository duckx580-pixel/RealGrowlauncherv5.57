package jj;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f8928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8929c;

    public i(ArrayList arrayList) {
        this.f8929c = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        kotlin.jvm.internal.l.f("proxy", obj);
        kotlin.jvm.internal.l.f("method", method);
        if (objArr == null) {
            objArr = new Object[0];
        }
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (kotlin.jvm.internal.l.a(name, "supports") && kotlin.jvm.internal.l.a(Boolean.TYPE, returnType)) {
            return Boolean.TRUE;
        }
        if (kotlin.jvm.internal.l.a(name, "unsupported") && kotlin.jvm.internal.l.a(Void.TYPE, returnType)) {
            this.f8927a = true;
            return null;
        }
        boolean zA = kotlin.jvm.internal.l.a(name, "protocols");
        ArrayList arrayList = this.f8929c;
        if (zA && objArr.length == 0) {
            return arrayList;
        }
        if ((kotlin.jvm.internal.l.a(name, "selectProtocol") || kotlin.jvm.internal.l.a(name, "select")) && String.class.equals(returnType) && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                if (size >= 0) {
                    int i10 = 0;
                    while (true) {
                        Object obj3 = list.get(i10);
                        if (obj3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        String str = (String) obj3;
                        if (!arrayList.contains(str)) {
                            if (i10 == size) {
                                break;
                            }
                            i10++;
                        } else {
                            this.f8928b = str;
                            return str;
                        }
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f8928b = str2;
                return str2;
            }
        }
        if ((!kotlin.jvm.internal.l.a(name, "protocolSelected") && !kotlin.jvm.internal.l.a(name, "selected")) || objArr.length != 1) {
            return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
        }
        Object obj4 = objArr[0];
        if (obj4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        this.f8928b = (String) obj4;
        return null;
    }
}
