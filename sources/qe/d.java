package qe;

import java.util.concurrent.atomic.AtomicBoolean;
import zd.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f13898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f13899b;

    static {
        new AtomicBoolean(false);
    }

    public static b a() {
        b bVar;
        synchronized (d.class) {
            try {
                if (f13899b == null) {
                    f13899b = new c();
                }
                if (f13898a == null) {
                    f13898a = new b(f13899b, new h());
                }
                bVar = f13898a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }
}
