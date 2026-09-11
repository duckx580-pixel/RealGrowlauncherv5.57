package zc;

import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f21108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f21109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Looper f21110c;

    public s1(Object obj, Thread thread, Looper looper) {
        this.f21108a = obj;
        this.f21109b = thread;
        this.f21110c = looper;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Thread threadCurrentThread = Thread.currentThread();
        Object obj2 = this.f21108a;
        Thread thread = this.f21109b;
        if (thread == threadCurrentThread) {
            return method.invoke(obj2, objArr);
        }
        if (!method.getReturnType().equals(Void.TYPE)) {
            throw new UnsupportedOperationException("method not return void: " + method.getName());
        }
        r1 r1Var = new r1(this, method, objArr, 0);
        Looper looper = this.f21110c;
        if (looper == null || !new Handler(looper).post(r1Var)) {
            WeakReference weakReference = (WeakReference) w4.f21238e.f21376a;
            if (thread == ((Thread) (weakReference != null ? weakReference.get() : null))) {
                WeakReference weakReference2 = (WeakReference) w4.f21237d.f21376a;
                GLSurfaceView gLSurfaceView = (GLSurfaceView) (weakReference2 != null ? weakReference2.get() : null);
                if (gLSurfaceView != null) {
                    gLSurfaceView.queueEvent(r1Var);
                    return null;
                }
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null || !new Handler(mainLooper).post(r1Var)) {
                return method.invoke(obj2, objArr);
            }
        }
        return null;
    }
}
