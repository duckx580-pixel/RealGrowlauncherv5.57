package f4;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import s3.z0;
import sg.f;
import zd.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6020i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f6022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f6023t;

    public c() {
        if (h.f21329i == null) {
            h.f21329i = new h();
        }
    }

    public int a(int i10) {
        if (i10 < this.f6022s) {
            return ((ByteBuffer) this.f6023t).getShort(this.f6021r + i10);
        }
        return 0;
    }

    public void b() {
        if (((f) this.f6023t).f15784x != this.f6022s) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void e(View view, Object obj);

    public void f() {
        while (true) {
            int i10 = this.f6020i;
            f fVar = (f) this.f6023t;
            if (i10 >= fVar.f15783v || fVar.f15780s[i10] >= 0) {
                return;
            } else {
                this.f6020i = i10 + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f6021r) {
            e(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6021r) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f6020i);
            if (!((Class) this.f6023t).isInstance(tag)) {
                tag = null;
            }
        }
        if (h(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = z0.c(view);
            s3.c cVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof s3.a ? ((s3.a) accessibilityDelegateC).f15040a : new s3.c(accessibilityDelegateC);
            if (cVar == null) {
                cVar = new s3.c();
            }
            z0.k(view, cVar);
            view.setTag(this.f6020i, obj);
            z0.f(view, this.f6022s);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f6020i < ((f) this.f6023t).f15783v;
    }

    public void remove() {
        f fVar = (f) this.f6023t;
        b();
        if (this.f6021r == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fVar.c();
        fVar.m(this.f6021r);
        this.f6021r = -1;
        this.f6022s = fVar.f15784x;
    }
}
