package t6;

import android.os.OutcomeReceiver;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.x f16902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CountDownLatch f16903b;

    public final /* synthetic */ void onError(Throwable th2) {
        Exception exc = (Exception) th2;
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, exc);
        s6.h.f15212b.f(2, android.support.v4.media.session.a.m("Error occurred: ", exc.getMessage()), exc, false, false, false, true);
        this.f16903b.countDown();
    }

    public final void onResult(Object obj) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, obj);
        this.f16902a.f9667i = n1.f16935r;
        s6.h.f15212b.a(2, "Privacy Sandbox trigger has been registered successfully. ");
        this.f16903b.countDown();
    }
}
