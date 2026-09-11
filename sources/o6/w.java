package o6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.BillingResult;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import com.rtsoft.growtopia.IAPManager;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class w implements ServiceConnection {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f12752i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12753r = new Object();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final IAPManager f12754s;

    public /* synthetic */ w(b bVar, IAPManager iAPManager) {
        this.f12752i = bVar;
        this.f12754s = iAPManager;
    }

    public final /* synthetic */ void a() {
        Bundle bundle;
        int iZzr;
        synchronized (this.f12753r) {
        }
        if (TextUtils.isEmpty(null)) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putString("accountName", null);
        }
        int i10 = 3;
        try {
            String packageName = this.f12752i.f12702e.getPackageName();
            iZzr = 3;
            int i11 = 17;
            while (true) {
                if (i11 < 3) {
                    i11 = 0;
                    break;
                }
                if (bundle == null) {
                    try {
                        iZzr = this.f12752i.f12703f.zzr(i11, packageName, "subs");
                    } catch (Exception e8) {
                        e = e8;
                        i10 = iZzr;
                        zzb.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                        this.f12752i.f12698a = 0;
                        this.f12752i.f12703f = null;
                        iZzr = i10;
                    }
                } else {
                    iZzr = this.f12752i.f12703f.zzc(i11, packageName, "subs", bundle);
                }
                if (iZzr == 0) {
                    break;
                } else {
                    i11--;
                }
            }
            this.f12752i.getClass();
            boolean z3 = true;
            this.f12752i.f12705h = i11 >= 3;
            if (i11 < 3) {
                zzb.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
            }
            int i12 = 17;
            while (true) {
                if (i12 < 3) {
                    break;
                }
                iZzr = bundle == null ? this.f12752i.f12703f.zzr(i12, packageName, "inapp") : this.f12752i.f12703f.zzc(i12, packageName, "inapp", bundle);
                if (iZzr == 0) {
                    this.f12752i.f12706i = i12;
                    break;
                }
                i12--;
            }
            b bVar = this.f12752i;
            int i13 = bVar.f12706i;
            bVar.f12711o = i13 >= 17;
            bVar.f12710n = i13 >= 16;
            bVar.f12709m = i13 >= 15;
            bVar.f12708l = i13 >= 14;
            bVar.f12707k = i13 >= 9;
            if (i13 < 6) {
                z3 = false;
            }
            bVar.j = z3;
            if (i13 < 3) {
                zzb.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
            }
            if (iZzr == 0) {
                this.f12752i.f12698a = 2;
            } else {
                this.f12752i.f12698a = 0;
                this.f12752i.f12703f = null;
            }
        } catch (Exception e10) {
            e = e10;
        }
        b(iZzr == 0 ? x.f12761g : x.f12755a);
    }

    public final void b(BillingResult billingResult) {
        synchronized (this.f12753r) {
            this.f12754s.onBillingSetupFinished(billingResult);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzn("BillingClient", "Billing service connected.");
        this.f12752i.f12703f = zzd.zzo(iBinder);
        b bVar = this.f12752i;
        Callable callable = new Callable(this) { // from class: o6.u

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public final w f12749i;

            {
                this.f12749i = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f12749i.a();
                return null;
            }
        };
        v vVar = new v(0, this);
        bVar.getClass();
        if (bVar.g(callable, 30000L, vVar, Looper.myLooper() == null ? bVar.f12700c : new Handler(Looper.myLooper())) == null) {
            b bVar2 = this.f12752i;
            b((bVar2.f12698a == 0 || bVar2.f12698a == 3) ? x.f12762h : x.f12760f);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzo("BillingClient", "Billing service disconnected.");
        this.f12752i.f12703f = null;
        this.f12752i.f12698a = 0;
        synchronized (this.f12753r) {
            this.f12754s.onBillingServiceDisconnected();
        }
    }
}
