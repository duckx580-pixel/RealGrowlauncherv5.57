package l;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.r3;
import java.util.ArrayList;
import java.util.Iterator;
import s3.h1;
import s3.i1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Interpolator f9719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i1 f9720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9721e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9718b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r3 f9722f = new r3(this);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9717a = new ArrayList();

    public final void a() {
        if (this.f9721e) {
            Iterator it = this.f9717a.iterator();
            while (it.hasNext()) {
                ((h1) it.next()).b();
            }
            this.f9721e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f9721e) {
            return;
        }
        for (h1 h1Var : this.f9717a) {
            long j = this.f9718b;
            if (j >= 0) {
                h1Var.c(j);
            }
            Interpolator interpolator = this.f9719c;
            if (interpolator != null && (view = (View) h1Var.f15072a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f9720d != null) {
                h1Var.d(this.f9722f);
            }
            View view2 = (View) h1Var.f15072a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f9721e = true;
    }
}
