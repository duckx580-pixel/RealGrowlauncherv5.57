package t6;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q3 f16858i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a8.q f16859r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ScheduledFuture f16860s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ScheduledExecutorService f16861t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f16862u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f16863v;
    public final com.google.android.gms.internal.measurement.j3 w;

    public j(ScheduledExecutorService scheduledExecutorService, b bVar, q3 q3Var, com.google.android.gms.internal.measurement.j3 j3Var) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, scheduledExecutorService);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, bVar);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, q3Var);
        this.f16861t = scheduledExecutorService;
        this.f16863v = bVar;
        this.f16858i = q3Var;
        this.w = j3Var;
        this.f16859r = new a8.q(24, this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null) {
            b bVar = this.f16863v;
            if (intent != ((Intent) bVar.f16713i)) {
                bVar.f16713i = intent;
            }
        }
        q3 q3Var = this.f16858i;
        q3Var.getClass();
        String str = q3Var.f17003a;
        if (str == null || str.length() == 0) {
            q3Var.f17003a = q3.a(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
        if (this.f16862u) {
            this.f16860s = this.f16861t.schedule(this.f16859r, 500L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
        if (!this.f16862u) {
            this.f16862u = true;
            this.f16861t.execute(new s8.o2(6, this, new n7.e(activity, this.f16858i)));
        } else {
            ScheduledFuture scheduledFuture = this.f16860s;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, activity);
    }
}
