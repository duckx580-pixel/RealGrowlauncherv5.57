package t6;

import android.net.TrafficStats;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d1 implements Comparable, Callable {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final AtomicInteger f16756y = new AtomicInteger();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f16757i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Throwable f16758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f16760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f16761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final HashSet f16762v;
    public n1 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h1 f16763x;

    public d1(h1 h1Var, h1[] h1VarArr, String str) {
        HashSet hashSet = new HashSet();
        this.f16757i = hashSet;
        this.f16762v = new HashSet();
        int iIncrementAndGet = f16756y.incrementAndGet();
        this.f16759s = iIncrementAndGet;
        this.f16761u = false;
        this.f16763x = h1Var;
        Collections.addAll(hashSet, h1VarArr);
        if (str != null) {
            this.f16760t = str;
        } else {
            this.f16760t = String.valueOf(iIncrementAndGet);
        }
    }

    public abstract long a();

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final n1 call() {
        TrafficStats.setThreadStatsTag(82339054);
        this.w = null;
        this.f16758r = null;
        System.currentTimeMillis();
        try {
            n1 n1VarH = h();
            this.w = n1VarH;
            return n1VarH;
        } finally {
        }
    }

    public void e() {
        this.f16761u = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f16763x != d1Var.f16763x) {
            return false;
        }
        return this.f16760t.equals(d1Var.f16760t);
    }

    public abstract boolean f();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int compareTo(d1 d1Var) {
        int i10 = this.f16763x.f16849i - d1Var.f16763x.f16849i;
        if (i10 != 0) {
            return i10;
        }
        if (this.f16760t.equals(d1Var.f16760t)) {
            return 0;
        }
        return this.f16759s - d1Var.f16759s;
    }

    public abstract n1 h();

    public final int hashCode() {
        return this.f16760t.hashCode() + (this.f16763x.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16763x);
        sb2.append("-");
        String str = this.f16760t;
        sb2.append(str);
        String string = sb2.toString();
        int i10 = this.f16759s;
        if (String.valueOf(i10).equals(str)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("-");
        sb3.append(i10);
        return sb3.toString();
    }

    public void d() {
    }

    public void b(Throwable th2) {
    }
}
