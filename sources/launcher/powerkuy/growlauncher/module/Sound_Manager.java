package launcher.powerkuy.growlauncher.module;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import androidx.activity.n;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import d.g;
import kotlin.jvm.internal.l;
import nh.h;
import o0.n0;
import o0.p;
import o0.z0;
import ui.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class Sound_Manager extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final z0 f9879i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final z0 f9880r;

    static {
        n0 n0Var = n0.f12510u;
        f9879i = p.I(PredefinedUICustomizationFont.defaultFamily, n0Var);
        p.I(PredefinedUICustomizationFont.defaultFamily, n0Var);
        f9880r = p.I(PredefinedUICustomizationFont.defaultFamily, n0Var);
    }

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

    @Override // androidx.activity.n, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (intent != null) {
            String strValueOf = String.valueOf(intent.getStringExtra("fileClicked"));
            z0 z0Var = f9879i;
            z0Var.setValue(strValueOf);
            if (l.a(z0Var.getValue(), "null")) {
                return;
            }
            f9880r.setValue(z0Var.getValue());
        }
    }

    @Override // androidx.activity.n, h3.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        g.a(this, a.f18000i);
    }
}
