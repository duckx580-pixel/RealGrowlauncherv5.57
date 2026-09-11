package t6;

import android.content.Context;
import java.util.HashMap;
import java.util.Observable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p4 extends Observable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f16991c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f16994f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f16993e = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16992d = 1;

    public p4(String str, String str2, Runnable runnable) {
        this.f16994f = runnable;
        this.f16991c = str2;
        this.f16989a = str;
    }

    public void a() {
        this.f16993e.put("latency", Long.valueOf(System.currentTimeMillis() - this.f16990b));
    }

    public final void b() {
        String str = this.f16991c;
        HashMap map = this.f16993e;
        map.put("source", str);
        map.put("type", this.f16989a);
        a();
        this.f16992d = 3;
        setChanged();
        notifyObservers();
    }

    public abstract void c(Context context);
}
