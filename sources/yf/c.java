package yf;

import android.os.Build;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final af.a f20434a = new af.a(16, (byte) 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f20435b;

    public c(uf.c cVar) {
        this.f20435b = Build.VERSION.SDK_INT >= 29 ? new e(cVar) : null;
    }

    public final void a() {
        e eVar;
        if (Build.VERSION.SDK_INT < 29 || (eVar = this.f20435b) == null) {
            return;
        }
        Iterator it = eVar.f20440b.iterator();
        while (it.hasNext()) {
            ((d) it.next()).f20438c = true;
        }
    }
}
