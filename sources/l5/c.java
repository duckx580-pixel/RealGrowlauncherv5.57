package l5;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f9803c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9805b;

    public c(String str, String str2) {
        this.f9804a = str;
        this.f9805b = str2;
        f9803c.add(this);
    }

    public abstract boolean a();

    public boolean b() {
        HashSet hashSet = a.f9801a;
        String str = this.f9805b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }
}
