package yc;

import android.content.Context;
import android.content.SharedPreferences;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f20375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f20380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f20381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Boolean f20382h;

    public final boolean a() {
        SharedPreferences sharedPreferences = this.f20375a.getSharedPreferences("tjcPrefrences", 0);
        return (sharedPreferences.contains("optout_advertising_id") && sharedPreferences.getBoolean("optout_advertising_id", false)) ? false : true;
    }

    public final boolean b() {
        Context context = this.f20375a;
        if (this.f20382h == null) {
            try {
                this.f20379e = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.google.android.gms.version");
                this.f20382h = Boolean.TRUE;
            } catch (Exception unused) {
                this.f20382h = Boolean.FALSE;
            }
        }
        return this.f20382h.booleanValue();
    }

    public final boolean c() {
        if (this.f20381g == null) {
            try {
                this.f20375a.getClassLoader().loadClass("com.google.android.gms.ads.identifier.AdvertisingIdClient");
                this.f20381g = Boolean.TRUE;
            } catch (Error | Exception unused) {
                this.f20381g = Boolean.FALSE;
            }
        }
        return this.f20381g.booleanValue();
    }

    public final void d(boolean z3) {
        boolean z10;
        boolean z11;
        Context context = this.f20375a;
        c0.a(4, "TapjoyGpsHelper", "Looking for Google Play Services...");
        if (!c() || !b()) {
            c0.a(4, "TapjoyGpsHelper", "Google Play Services not found");
            return;
        }
        c0.a(4, "TapjoyGpsHelper", "Packaged Google Play Services found, fetching advertisingID...");
        c0.a(4, "TapjoyGpsHelper", "Packaged Google Play Services version: " + this.f20379e);
        String str = null;
        if (a()) {
            try {
                b8.n0 n0VarA = u7.a.a(context);
                str = n0VarA.f2840b;
                z10 = !n0VarA.f2841c;
                z11 = true;
            } catch (Error | Exception unused) {
                z10 = false;
                z11 = false;
            }
            this.f20380f = z11;
        } else {
            this.f20380f = false;
            z10 = false;
        }
        try {
            this.f20378d = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            c0.a(4, "TapjoyGpsHelper", "Device's Google Play Services version: " + this.f20378d);
        } catch (Exception unused2) {
            c0.a(4, "TapjoyGpsHelper", "Error getting device's Google Play Services version");
        }
        if (this.f20380f) {
            this.f20377c = z10;
            this.f20376b = str;
            c0.a(4, "TapjoyGpsHelper", "Found advertising ID: " + this.f20376b);
            c0.a(4, "TapjoyGpsHelper", "Is ad tracking enabled: " + Boolean.toString(this.f20377c));
            return;
        }
        c0.a(4, "TapjoyGpsHelper", "Error getting advertisingID from Google Play Services");
        if (z3) {
            this.f20377c = false;
            if (a()) {
                this.f20376b = "00000000-0000-0000-0000-000000000000";
                this.f20380f = true;
            } else {
                this.f20376b = PredefinedUICustomizationFont.defaultFamily;
                this.f20380f = false;
            }
        }
    }
}
