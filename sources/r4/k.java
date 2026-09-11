package r4;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.lifecycle.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements androidx.lifecycle.v, a1, androidx.lifecycle.j, a5.h {
    public androidx.lifecycle.o A;
    public final s0 B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f14516i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f14517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f14518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.lifecycle.o f14519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p f14520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f14521v;
    public final Bundle w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final androidx.lifecycle.x f14522x = new androidx.lifecycle.x(this);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final a5.g f14523y = new a5.g(this);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14524z;

    public k(Context context, v vVar, Bundle bundle, androidx.lifecycle.o oVar, p pVar, String str, Bundle bundle2) {
        this.f14516i = context;
        this.f14517r = vVar;
        this.f14518s = bundle;
        this.f14519t = oVar;
        this.f14520u = pVar;
        this.f14521v = str;
        this.w = bundle2;
        qg.k kVarQ = android.support.v4.media.session.b.q(new j(this, 0));
        android.support.v4.media.session.b.q(new j(this, 1));
        this.A = androidx.lifecycle.o.f1907r;
        this.B = (s0) kVarQ.getValue();
    }

    public final Bundle a() {
        Bundle bundle = this.f14518s;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    public final void b(androidx.lifecycle.o oVar) {
        kotlin.jvm.internal.l.f("maxState", oVar);
        this.A = oVar;
        c();
    }

    public final void c() {
        if (!this.f14524z) {
            a5.g gVar = this.f14523y;
            gVar.a();
            this.f14524z = true;
            if (this.f14520u != null) {
                p0.e(this);
            }
            gVar.b(this.w);
        }
        int iOrdinal = this.f14519t.ordinal();
        int iOrdinal2 = this.A.ordinal();
        androidx.lifecycle.x xVar = this.f14522x;
        if (iOrdinal < iOrdinal2) {
            xVar.h(this.f14519t);
        } else {
            xVar.h(this.A);
        }
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            Bundle bundle = kVar.f14518s;
            if (kotlin.jvm.internal.l.a(this.f14521v, kVar.f14521v) && kotlin.jvm.internal.l.a(this.f14517r, kVar.f14517r) && kotlin.jvm.internal.l.a(this.f14522x, kVar.f14522x) && kotlin.jvm.internal.l.a(this.f14523y.f367b, kVar.f14523y.f367b)) {
                Bundle bundle2 = this.f14518s;
                if (kotlin.jvm.internal.l.a(bundle2, bundle)) {
                    return true;
                }
                if (bundle2 != null && (setKeySet = bundle2.keySet()) != null) {
                    Set<String> set = setKeySet;
                    if ((set instanceof Collection) && set.isEmpty()) {
                        return true;
                    }
                    for (String str : set) {
                        if (!kotlin.jvm.internal.l.a(bundle2.get(str), bundle != null ? bundle.get(str) : null)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.j
    public final m4.b getDefaultViewModelCreationExtras() {
        m4.c cVar = new m4.c(0);
        Context context = this.f14516i;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = cVar.f11568a;
        if (application != null) {
            linkedHashMap.put(w0.f1939v, application);
        }
        linkedHashMap.put(p0.f1913a, this);
        linkedHashMap.put(p0.f1914b, this);
        Bundle bundleA = a();
        if (bundleA != null) {
            linkedHashMap.put(p0.f1915c, bundleA);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.j
    public final x0 getDefaultViewModelProviderFactory() {
        return this.B;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.p getLifecycle() {
        return this.f14522x;
    }

    @Override // a5.h
    public final a5.f getSavedStateRegistry() {
        return this.f14523y.f367b;
    }

    @Override // androidx.lifecycle.a1
    public final z0 getViewModelStore() {
        if (!this.f14524z) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.f14522x.f1943d == androidx.lifecycle.o.f1906i) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        p pVar = this.f14520u;
        if (pVar == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        String str = this.f14521v;
        kotlin.jvm.internal.l.f("backStackEntryId", str);
        LinkedHashMap linkedHashMap = pVar.f14542b;
        z0 z0Var = (z0) linkedHashMap.get(str);
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0();
        linkedHashMap.put(str, z0Var2);
        return z0Var2;
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.f14517r.hashCode() + (this.f14521v.hashCode() * 31);
        Bundle bundle = this.f14518s;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i10 = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f14523y.f367b.hashCode() + ((this.f14522x.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("(" + this.f14521v + ')');
        sb2.append(" destination=");
        sb2.append(this.f14517r);
        String string = sb2.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
