package kg;

import android.content.Context;
import android.telephony.TelephonyManager;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TelephonyManager f9618b;

    public b(Context context) {
        this.f9617a = context;
        this.f9618b = (TelephonyManager) context.getSystemService("phone");
    }

    public static String d(jg.a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isNetworkRoaming", aVar.f8899a);
            jSONObject.put("mcc", aVar.f8900b);
            jSONObject.put("mnc", aVar.f8901c);
            jSONObject.put("networkCountryIso", aVar.f8902d);
            jSONObject.put("networkOperatorName", aVar.f8903e);
            jSONObject.put("signalStrength", aVar.f8904f);
            jSONObject.put("simOperatorName", aVar.f8905g);
            jSONObject.put("simState", aVar.f8906h);
            jSONObject.put("simOperator", aVar.f8907i);
            jSONObject.put("simCountryIso", aVar.j);
            jSONObject.put("simCarrierIdName", aVar.f8908k);
            jSONObject.put("simCarrierId", aVar.f8909l);
            jSONObject.put("isDataCapable", aVar.f8910m);
            jSONObject.put("networkType", aVar.f8911n);
            jSONObject.put("isVpn", aVar.f8912o);
            return jSONObject.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final jg.a a() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.b.a():jg.a");
    }

    public final boolean b() {
        return this.f9617a.getPackageManager().hasSystemFeature("android.hardware.telephony.radio.access");
    }

    public final boolean c() {
        return this.f9617a.getPackageManager().hasSystemFeature("android.hardware.telephony.subscription");
    }
}
