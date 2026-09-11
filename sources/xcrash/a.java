package xcrash;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19534i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f19535r;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b bVar = b.f19536c;
        bVar.f19537a.addFirst(activity);
        if (bVar.f19537a.size() > 100) {
            bVar.f19537a.removeLast();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b.f19536c.f19537a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i10 = this.f19534i + 1;
        this.f19534i = i10;
        if (i10 != 1 || this.f19535r) {
            return;
        }
        b.f19536c.f19538b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        boolean zIsChangingConfigurations = activity.isChangingConfigurations();
        this.f19535r = zIsChangingConfigurations;
        int i10 = this.f19534i - 1;
        this.f19534i = i10;
        if (i10 != 0 || zIsChangingConfigurations) {
            return;
        }
        b.f19536c.f19538b = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
