package i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.locks.ReentrantLock;
import s8.e2;
import zc.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7920b;

    public /* synthetic */ y(int i10, Object obj) {
        this.f7919a = i10;
        this.f7920b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f7919a) {
            case 0:
                ((androidx.fragment.app.h) this.f7920b).D();
                return;
            case 1:
                kotlin.jvm.internal.l.f("context", context);
                kotlin.jvm.internal.l.f("intent", intent);
                s5.a aVar = (s5.a) this.f7920b;
                switch (aVar.f15179g) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        androidx.work.p.d().a(s5.b.f15180a, "Received ".concat(action));
                        switch (action.hashCode()) {
                            case -1886648615:
                                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                    aVar.e(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case -54942926:
                                if (action.equals("android.os.action.DISCHARGING")) {
                                    aVar.e(Boolean.FALSE);
                                    return;
                                }
                                return;
                            case 948344062:
                                if (action.equals("android.os.action.CHARGING")) {
                                    aVar.e(Boolean.TRUE);
                                    return;
                                }
                                return;
                            case 1019184907:
                                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                    aVar.e(Boolean.TRUE);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        androidx.work.p.d().a(s5.c.f15181a, "Received " + intent.getAction());
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int iHashCode = action2.hashCode();
                            if (iHashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    aVar.e(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.e(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        androidx.work.p.d().a(s5.i.f15192a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int iHashCode2 = action3.hashCode();
                            if (iHashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    aVar.e(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.e(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            default:
                q0 q0Var = (q0) ((e2) this.f7920b).f15318r;
                ReentrantLock reentrantLock = q0Var.f21066a;
                reentrantLock.lock();
                try {
                    q0Var.f21069d = 1000L;
                    q0Var.f21071f.signal();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
        }
    }
}
