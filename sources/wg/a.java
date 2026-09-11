package wg;

import androidx.work.v;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.l;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements ug.c, d, Serializable {
    private final ug.c<Object> completion;

    public a(ug.c cVar) {
        this.completion = cVar;
    }

    public ug.c<o> create(ug.c<?> cVar) {
        l.f("completion", cVar);
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        ug.c<Object> cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final ug.c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i10 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        kj.i iVar = f.f19257b;
        kj.i iVar2 = f.f19256a;
        if (iVar == null) {
            try {
                kj.i iVar3 = new kj.i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f19257b = iVar3;
                iVar = iVar3;
            } catch (Exception unused2) {
                f.f19257b = iVar2;
                iVar = iVar2;
            }
        }
        if (iVar != iVar2 && (method = iVar.f9641a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = iVar.f9642b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = iVar.f9643c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i10);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // ug.c
    public final void resumeWith(Object obj) {
        ug.c<Object> cVar = this;
        while (true) {
            a aVar = (a) cVar;
            ug.c<Object> cVar2 = aVar.completion;
            l.c(cVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == vg.a.f18663i) {
                    return;
                }
            } catch (Throwable th2) {
                obj = v.i(th2);
            }
            aVar.releaseIntercepted();
            if (!(cVar2 instanceof a)) {
                cVar2.resumeWith(obj);
                return;
            }
            cVar = cVar2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public ug.c<o> create(Object obj, ug.c<?> cVar) {
        l.f("completion", cVar);
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
