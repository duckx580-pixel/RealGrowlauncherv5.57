package d8;

import a8.a1;
import a8.u0;
import a8.w0;
import b8.n;
import com.google.android.gms.internal.measurement.f0;
import t6.u;
import v8.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends z7.g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final z7.d f4981k = new z7.d("ClientTelemetry.API", new b(1), new z7.c());

    public final l b(n nVar) {
        mf.a aVar = new mf.a(1, false);
        y7.c[] cVarArr = {n8.b.f12176a};
        aVar.f11698r = new u(nVar);
        w0 w0Var = new w0(aVar, cVarArr, false);
        v8.h hVar = new v8.h();
        a8.f fVar = this.j;
        fVar.getClass();
        a1 a1Var = new a1(w0Var, hVar, this.f20657i);
        f0 f0Var = fVar.f444n;
        f0Var.sendMessage(f0Var.obtainMessage(4, new u0(a1Var, fVar.f440i.get(), this)));
        return hVar.f18622a;
    }
}
