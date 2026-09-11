package zc;

import android.app.Activity;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q3 f20916t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l4 f20917u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e5 f20918v;

    public j4(Activity activity, q3 q3Var, l4 l4Var) {
        super(activity);
        this.f20916t = q3Var;
        this.f20917u = l4Var;
        addView(l4Var, new ViewGroup.LayoutParams(-1, -1));
        this.f20918v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ad  */
    @Override // zc.a, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.j4.onMeasure(int, int):void");
    }
}
