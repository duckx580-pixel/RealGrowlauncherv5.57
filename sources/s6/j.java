package s6;

import java.util.HashMap;
import org.json.JSONObject;
import t6.b0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static j f15219e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15221b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15222c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15223d;

    public static j b() {
        if (f15219e == null) {
            f15219e = new j();
        }
        return f15219e;
    }

    public final boolean a(String str, boolean z3) {
        String strC = c(str);
        return strC == null ? z3 : Boolean.parseBoolean(strC);
    }

    public final String c(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.f15221b.get(str);
        }
        return str2;
    }

    public final void d(b0 b0Var) {
        synchronized (this) {
            this.f15221b.remove("AppsFlyerKey");
            b0Var.j("savedProperties", new JSONObject(this.f15221b).toString());
        }
    }

    public final void e(String str, String str2) {
        synchronized (this) {
            this.f15221b.put(str, str2);
        }
    }
}
