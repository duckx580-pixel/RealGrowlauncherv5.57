package xd;

import com.google.android.gms.internal.measurement.j3;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.security.auth.x500.X500Principal;
import org.json.JSONObject;
import t6.s3;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19589a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.e f19590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ke.c f19591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f19592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19593e;

    public b(u5.e eVar, qe.e eVar2, ke.c cVar) {
        this.f19592d = (a) eVar.f17654r;
        this.f19590b = eVar;
        this.f19593e = eVar2;
        this.f19591c = cVar;
    }

    public final void a(h hVar) {
        String str;
        s3 s3Var;
        String str2;
        me.c cVarA;
        int i10 = 2;
        switch (this.f19589a) {
            case 0:
                a aVar = (a) this.f19592d;
                try {
                    me.b bVarP = qd.a.p(this.f19590b.n());
                    j jVarC = j.c();
                    jVarC.getClass();
                    jVarC.f19602b = System.nanoTime();
                    me.c cVarA2 = this.f19591c.a(bVarP);
                    String string = cVarA2.f11674a.toString();
                    if (cVarA2.f11678e / 100 == 2) {
                        try {
                            aVar.b(new JSONObject(string), true);
                            String str3 = aVar.f19582o;
                            String str4 = aVar.f19581n;
                            if (str4 == null) {
                                str4 = PredefinedUICustomizationFont.defaultFamily;
                            }
                            qe.e eVar = (qe.e) this.f19593e;
                            if (str3 == null || str3.isEmpty()) {
                                eVar.a(new qe.a(4, "native_missing_token", (Object) null));
                            }
                            if (str4.isEmpty()) {
                                eVar.a(new qe.a(4, "native_missing_state_id", (Object) null));
                            }
                            hVar.b(aVar);
                            return;
                        } catch (Exception unused) {
                            str = "Could not create web request";
                        }
                    } else {
                        str = "Non 2xx HTTP status received from ads configuration request.";
                    }
                } catch (Exception e8) {
                    str = "Could not create web request: " + e8;
                }
                hVar.e(str);
                return;
            default:
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                x7.h hVar2 = (x7.h) this.f19593e;
                synchronized (hVar2) {
                    s3Var = (s3) hVar2.f19489s;
                }
                if (s3Var.f17031a == 1) {
                    j3 j3Var = new j3(23, this, atomicBoolean);
                    try {
                        me.b bVarP2 = qd.a.p(this.f19590b.n());
                        j jVarC2 = j.c();
                        jVarC2.getClass();
                        jVarC2.f19603c = System.nanoTime();
                        cVarA = this.f19591c.a(bVarP2);
                    } catch (Exception e10) {
                        str2 = "Could not create web request: " + e10;
                    }
                    try {
                        int i11 = cVarA.f11678e;
                        if (i11 / 100 == 2) {
                            j.c().b(true);
                            JSONObject jSONObject = new JSONObject(cVarA.f11674a.toString());
                            s3 s3Var2 = new s3();
                            if (!jSONObject.optBoolean("pas", false)) {
                                i10 = 3;
                            }
                            s3Var2.f17031a = i10;
                            s3Var2.f17032b = jSONObject.optBoolean("snb", false);
                            hVar2.I(s3Var2);
                        } else if (i11 == 423) {
                            j.c().b(false);
                            X500Principal x500Principal = oe.a.f12831a;
                            j3Var.r(2, "Game ID is disabled null");
                        } else {
                            j.c().b(false);
                            j3Var.r(1, "Privacy request failed with code: " + cVarA.f11678e);
                        }
                    } catch (Exception unused2) {
                        j.c().b(false);
                        str2 = "Could not create web request";
                        j3Var.r(1, str2);
                    }
                    break;
                }
                if (atomicBoolean.get()) {
                    throw new ge.a("Game is disabled");
                }
                ((b) this.f19592d).a(hVar);
                return;
        }
    }

    public b(b bVar, u5.e eVar, x7.h hVar, ke.c cVar) {
        this.f19592d = bVar;
        this.f19590b = eVar;
        this.f19593e = hVar;
        this.f19591c = cVar;
    }
}
