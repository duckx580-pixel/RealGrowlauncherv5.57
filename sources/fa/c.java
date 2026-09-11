package fa;

import android.util.Log;
import da.p;
import java.util.concurrent.atomic.AtomicReference;
import ka.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f6045c = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f6046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f6047b = new AtomicReference(null);

    public c(p pVar) {
        this.f6046a = pVar;
        pVar.a(new com.google.gson.internal.b(4, this));
    }

    @Override // fa.a
    public final f a(String str) {
        a aVar = (a) this.f6047b.get();
        return aVar == null ? f6045c : aVar.a(str);
    }

    @Override // fa.a
    public final boolean b() {
        a aVar = (a) this.f6047b.get();
        return aVar != null && aVar.b();
    }

    @Override // fa.a
    public final boolean c(String str) {
        a aVar = (a) this.f6047b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // fa.a
    public final void d(String str, long j, s0 s0Var) {
        String strM = android.support.v4.media.session.a.m("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strM, null);
        }
        this.f6046a.a(new b(str, j, s0Var));
    }
}
