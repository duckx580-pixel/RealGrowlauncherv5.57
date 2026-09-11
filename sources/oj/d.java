package oj;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class d extends h0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f13067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Condition f13068i;
    public static final long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f13069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static d f13070l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f13072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f13073g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f13067h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.l.e("newCondition(...)", conditionNewCondition);
        f13068i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        f13069k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j10 = this.f13082c;
        boolean z3 = this.f13080a;
        if (j10 != 0 || z3) {
            ReentrantLock reentrantLock = f13067h;
            reentrantLock.lock();
            try {
                if (this.f13071e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f13071e = 1;
                b8.l.i(this, j10, z3);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f13067h;
        reentrantLock.lock();
        try {
            int i10 = this.f13071e;
            this.f13071e = 0;
            if (i10 != 1) {
                return i10 == 2;
            }
            d dVar = f13070l;
            while (dVar != null) {
                d dVar2 = dVar.f13072f;
                if (dVar2 == this) {
                    dVar.f13072f = this.f13072f;
                    this.f13072f = null;
                    return false;
                }
                dVar = dVar2;
            }
            throw new IllegalStateException("node was not found in the queue");
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j() {
    }
}
