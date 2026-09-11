package zc;

import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f20894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8.e2 f20895b;

    public i2(s8.e2 e2Var, CountDownLatch countDownLatch) {
        this.f20895b = e2Var;
        this.f20894a = countDownLatch;
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        x1.f21242b.deleteObserver(this);
        this.f20895b.f15319s = Boolean.TRUE.equals(obj);
        this.f20894a.countDown();
    }
}
