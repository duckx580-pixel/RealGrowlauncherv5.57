package ki;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static Handler b(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static final String c(int i10) {
        String strReplace = String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)).replace(',', '.');
        l.e("replace(...)", strReplace);
        return strReplace;
    }

    public static final long d(Context context) throws PackageManager.NameNotFoundException {
        l.f("<this>", context);
        return Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode() : r2.versionCode;
    }
}
