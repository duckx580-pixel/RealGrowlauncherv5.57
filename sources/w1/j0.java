package w1;

import android.view.PointerIcon;
import android.view.View;
import com.usercentrics.sdk.extensions.TimeExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f18831a = new j0();

    public final void a(View view, q1.m mVar) {
        PointerIcon systemIcon = mVar instanceof q1.a ? PointerIcon.getSystemIcon(view.getContext(), ((q1.a) mVar).f13647b) : PointerIcon.getSystemIcon(view.getContext(), TimeExtensionsKt.MILLIS_PER_SECOND);
        if (kotlin.jvm.internal.l.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
