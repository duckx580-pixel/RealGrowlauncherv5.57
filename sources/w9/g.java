package w9;

import android.content.Context;
import android.text.TextUtils;
import b8.a0;
import com.google.android.gms.internal.measurement.j3;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f19163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f19164g;

    public g(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i10 = g8.c.f7143a;
        a0.j("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f19159b = str;
        this.f19158a = str2;
        this.f19160c = str3;
        this.f19161d = str4;
        this.f19162e = str5;
        this.f19163f = str6;
        this.f19164g = str7;
    }

    public static g a(Context context) {
        u5.c cVar = new u5.c(context, 4);
        String strQ = cVar.q("google_app_id");
        if (TextUtils.isEmpty(strQ)) {
            return null;
        }
        return new g(strQ, cVar.q("google_api_key"), cVar.q("firebase_database_url"), cVar.q("ga_trackingId"), cVar.q("gcm_defaultSenderId"), cVar.q("google_storage_bucket"), cVar.q("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return a0.k(this.f19159b, gVar.f19159b) && a0.k(this.f19158a, gVar.f19158a) && a0.k(this.f19160c, gVar.f19160c) && a0.k(this.f19161d, gVar.f19161d) && a0.k(this.f19162e, gVar.f19162e) && a0.k(this.f19163f, gVar.f19163f) && a0.k(this.f19164g, gVar.f19164g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19159b, this.f19158a, this.f19160c, this.f19161d, this.f19162e, this.f19163f, this.f19164g});
    }

    public final String toString() {
        j3 j3Var = new j3(this);
        j3Var.d("applicationId", this.f19159b);
        j3Var.d("apiKey", this.f19158a);
        j3Var.d("databaseUrl", this.f19160c);
        j3Var.d("gcmSenderId", this.f19162e);
        j3Var.d("storageBucket", this.f19163f);
        j3Var.d("projectId", this.f19164g);
        return j3Var.toString();
    }
}
