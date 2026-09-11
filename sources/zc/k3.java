package zc;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class k3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f20942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f20943f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f20938a = Executors.newScheduledThreadPool(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CountDownLatch f20939b = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ac.b f20941d = new ac.b(10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CountDownLatch f20940c = new CountDownLatch(1);
}
