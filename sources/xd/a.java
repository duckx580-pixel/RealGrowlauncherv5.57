package xd;

import android.text.TextUtils;
import com.usercentrics.sdk.models.api.ApiConstants;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import u5.s;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f19571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f19572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f19575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f19576h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Class[] f19577i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f19579l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public double f19580m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f19581n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f19582o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Class[] f19583p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f19584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f19585r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f19586s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f19587t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f19588u;

    public a() {
        this.f19577i = new Class[]{c.class, qd.a.class, ud.a.class, vd.a.class, te.a.class};
        this.f19571c = new s();
        d(new JSONObject(), false);
    }

    public final void a(Class cls) {
        try {
            if (cls.newInstance() == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (Exception unused) {
        }
    }

    public final void b(JSONObject jSONObject, boolean z3) throws JSONException, MalformedURLException {
        String string = !jSONObject.isNull("url") ? jSONObject.getString("url") : null;
        if (TextUtils.isEmpty(string)) {
            throw new MalformedURLException("WebView URL is null or empty");
        }
        this.f19587t = string;
        try {
            this.f19586s = !jSONObject.isNull("hash") ? jSONObject.getString("hash") : null;
        } catch (JSONException unused) {
            this.f19586s = null;
        }
        this.f19582o = !jSONObject.isNull("tkn") ? jSONObject.optString("tkn") : null;
        this.f19581n = jSONObject.isNull("sid") ? null : jSONObject.optString("sid");
        if (!jSONObject.isNull("sTkn")) {
            jSONObject.optString("sTkn");
        }
        d(jSONObject, z3);
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (!next.equalsIgnoreCase("tkn") && !next.equalsIgnoreCase("sid") && !next.equalsIgnoreCase("srr") && !next.equalsIgnoreCase("sTkn")) {
                jSONObject2.put(next, objOpt);
            }
        }
        this.f19572d = jSONObject2.toString();
    }

    public final void c() {
        i8.a.m(new File(oe.c.c()), this.f19572d);
    }

    public final void d(JSONObject jSONObject, boolean z3) {
        this.f19588u = jSONObject.optString("version", null);
        jSONObject.optBoolean("dwu", false);
        this.f19578k = jSONObject.optInt("rwt", 10000);
        this.f19573e = jSONObject.optInt("mr", 6);
        this.f19579l = jSONObject.optLong("rd", ApiConstants.MINIMUM_TIMEOUT_MILLIS);
        this.f19580m = jSONObject.optDouble("rcf", 2.0d);
        this.f19570b = jSONObject.optInt("cet", 10000);
        this.f19574f = jSONObject.optInt("mce", 500);
        this.j = jSONObject.optLong("net", 60000L);
        jSONObject.optString("sdkv", PredefinedUICustomizationFont.defaultFamily);
        jSONObject.optInt("sto", 10000);
        jSONObject.optInt("lto", 30000);
        jSONObject.optInt("wto", 5000);
        jSONObject.optString("murl", PredefinedUICustomizationFont.defaultFamily);
        this.f19575g = jSONObject.optDouble("msr", 100.0d);
        this.f19584q = jSONObject.optLong("wct", 60000L);
        jSONObject.optInt("tto", 5000);
        jSONObject.optInt("prwto", 3000);
        jSONObject.optString("src", null);
        jSONObject.optString("scurl", "https://scar.unityads.unity3d.com/v1/capture-scar-signals");
        this.f19576h = Boolean.valueOf(this.f19575g >= ((double) (new Random().nextInt(99) + 1)));
        Object fVar = jSONObject.has("expo") ? new f(jSONObject.optJSONObject("expo")) : new g(jSONObject.optJSONObject("exp"));
        if (z3) {
            s sVar = this.f19571c;
            synchronized (sVar) {
                sVar.f17713r = fVar;
            }
        } else {
            s sVar2 = this.f19571c;
            synchronized (sVar2) {
                sVar2.f17712i = fVar;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, s sVar) {
        this();
        jj.l lVarI = sVar.i();
        this.f19569a = str;
        new u5.e(22, this, null);
        s sVar2 = this.f19571c;
        synchronized (sVar2) {
            sVar2.f17712i = lVarI;
        }
        this.f19571c = sVar;
    }

    public a(JSONObject jSONObject) throws JSONException, MalformedURLException {
        this.f19577i = new Class[]{c.class, qd.a.class, ud.a.class, vd.a.class, te.a.class};
        this.f19571c = new s();
        b(jSONObject, false);
    }
}
