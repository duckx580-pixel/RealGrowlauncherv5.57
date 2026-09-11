package launcher.powerkuy.growlauncher;

import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.n;
import d.g;
import fi.z;
import kotlin.jvm.internal.l;
import nh.h;
import w0.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LuaManager extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9857i = 0;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) throws Exception {
        String message;
        l.f("ev", motionEvent);
        try {
            return super.dispatchGenericMotionEvent(motionEvent);
        } catch (Exception e8) {
            if ((e8 instanceof IllegalStateException) && (message = e8.getMessage()) != null && h.M(message, "ACTION_HOVER_EXIT", false)) {
                return false;
            }
            throw e8;
        }
    }

    @Override // androidx.activity.n, h3.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g.a(this, new a(-840106631, new z(this, 0), true));
    }
}
