package t6;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f16732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f16734g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f16736i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f16737k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16728a = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f16735h = new HashMap();

    public b3(String str, String str2, Boolean bool) {
        this.f16729b = str;
        this.f16731d = str2;
        this.j = bool != null ? bool.booleanValue() : true;
    }

    public abstract h1 a();

    public final void b(int i10) {
        this.f16733f = i10;
        synchronized (this.f16728a) {
            try {
                if (this.f16728a.containsKey("counter")) {
                    this.f16728a.put("counter", Integer.toString(i10));
                }
                if (this.f16728a.containsKey("launch_counter")) {
                    this.f16728a.put("launch_counter", Integer.toString(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Map map) {
        synchronized (map) {
            this.f16728a.putAll(map);
        }
    }

    public boolean d() {
        return this instanceof x2;
    }

    public boolean e() {
        return !(this instanceof q2);
    }

    public final void f(String str, Object obj) {
        synchronized (this.f16728a) {
            this.f16728a.put(str, obj);
        }
    }

    public final boolean g() {
        return this.f16729b == null && this.f16732e == null;
    }
}
