package b9;

import a8.q;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import s3.i0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f2888c = new q(12, this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f2889d;

    public e(BottomSheetBehavior bottomSheetBehavior) {
        this.f2889d = bottomSheetBehavior;
    }

    public final void a(int i10) {
        BottomSheetBehavior bottomSheetBehavior = this.f2889d;
        WeakReference weakReference = bottomSheetBehavior.R;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f2886a = i10;
        if (this.f2887b) {
            return;
        }
        View view = (View) bottomSheetBehavior.R.get();
        WeakHashMap weakHashMap = z0.f15140a;
        i0.m(view, this.f2888c);
        this.f2887b = true;
    }
}
