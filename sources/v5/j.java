package v5;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18592a = androidx.work.p.f("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z3) {
        String str = f18592a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z3 ? 1 : 2, 1);
            androidx.work.p pVarD = androidx.work.p.d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(" ");
            sb2.append(z3 ? "enabled" : "disabled");
            pVarD.a(str, sb2.toString());
        } catch (Exception e8) {
            androidx.work.p pVarD2 = androidx.work.p.d();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            sb3.append(z3 ? "enabled" : "disabled");
            String string = sb3.toString();
            if (pVarD2.f2390a <= 3) {
                Log.d(str, string, e8);
            }
        }
    }
}
