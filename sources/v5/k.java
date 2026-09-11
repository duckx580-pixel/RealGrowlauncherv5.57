package v5;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import androidx.work.v;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18593a;

    static {
        String strF = androidx.work.p.f("ProcessUtils");
        kotlin.jvm.internal.l.e("tagWithPrefix(\"ProcessUtils\")", strF);
        f18593a = strF;
    }

    public static final boolean a(Context context, androidx.work.b bVar) {
        String strA;
        Object next;
        Object objInvoke;
        kotlin.jvm.internal.l.f("context", context);
        kotlin.jvm.internal.l.f("configuration", bVar);
        if (Build.VERSION.SDK_INT >= 28) {
            strA = a.f18577a.a();
        } else {
            strA = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, v.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                kotlin.jvm.internal.l.c(objInvoke);
            } catch (Throwable th2) {
                if (androidx.work.p.d().f2390a <= 3) {
                    Log.d(f18593a, "Unable to check ActivityThread for processName", th2);
                }
            }
            if (objInvoke instanceof String) {
                strA = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.ActivityManager", systemService);
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strA = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return kotlin.jvm.internal.l.a(strA, context.getApplicationInfo().processName);
    }
}
