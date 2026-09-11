package t6;

import android.content.Context;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 extends o3 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ExecutorService f16939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f16940i;

    public n3(n4 n4Var, ExecutorService executorService, a0 a0Var) {
        super("store", "google", a0Var, n4Var);
        this.f16940i = new HashMap();
        this.f16939h = executorService;
    }

    @Override // t6.p4
    public final void c(Context context) {
        if (d()) {
            try {
                if (!c4.e(context)) {
                    s6.h.f15212b.b(11, "Install referrer is not allowed");
                    return;
                }
                s6.h hVar = s6.h.f15212b;
                hVar.b(11, "Install referrer is allowed");
                this.f16990b = System.currentTimeMillis();
                this.f16992d = 2;
                addObserver(new o4(0, this));
                try {
                    di.h hVar2 = new di.h(context, 3);
                    hVar.b(11, "Connecting to Install Referrer Library...");
                    hVar2.T(new n7.e(this, hVar2, context));
                } catch (Throwable th2) {
                    s6.h.f15212b.c(11, "referrerClient -> startConnection", th2);
                }
            } catch (ClassNotFoundException e8) {
                s6.h.u("InstallReferrerClient not found", e8);
                s6.h hVar3 = s6.h.f15212b;
                k0.g.s(11, PredefinedUICustomizationFont.defaultFamily);
                hVar3.m(11, "Class com.android.installreferrer.api.InstallReferrerClient not found", true);
            } catch (Throwable th3) {
                s6.h.f15212b.c(11, "An error occurred while trying to verify manifest : ".concat("com.android.installreferrer.api.InstallReferrerClient"), th3);
            }
        }
    }
}
