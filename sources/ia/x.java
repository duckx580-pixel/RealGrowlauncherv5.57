package ia;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f8257g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f8258h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mf.a f8259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f8260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final eb.d f8262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.f f8263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f8264f;

    public x(Context context, String str, eb.d dVar, c3.f fVar) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f8260b = context;
        this.f8261c = str;
        this.f8262d = dVar;
        this.f8263e = fVar;
        this.f8259a = new mf.a(13, false);
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : f8257g.matcher(string).replaceAll(PredefinedUICustomizationFont.defaultFamily).toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    public final synchronized String c() {
        String strB;
        try {
            String str = this.f8264f;
            if (str != null) {
                return str;
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Determining Crashlytics installation ID...", null);
            }
            SharedPreferences sharedPreferences = this.f8260b.getSharedPreferences("com.google.firebase.crashlytics", 0);
            String string = sharedPreferences.getString("firebase.installation.id", null);
            String str2 = "Cached Firebase Installation ID: " + string;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str2, null);
            }
            if (this.f8263e.g()) {
                try {
                    strB = (String) a0.a(((eb.c) this.f8262d).b());
                } catch (Exception e8) {
                    Log.w("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e8);
                    strB = null;
                }
                String str3 = "Fetched Firebase Installation ID: " + strB;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str3, null);
                }
                if (strB == null) {
                    strB = string == null ? b() : string;
                }
                if (strB.equals(string)) {
                    this.f8264f = sharedPreferences.getString("crashlytics.installation.id", null);
                } else {
                    this.f8264f = a(sharedPreferences, strB);
                }
            } else if (string == null || !string.startsWith("SYN_")) {
                this.f8264f = a(sharedPreferences, b());
            } else {
                this.f8264f = sharedPreferences.getString("crashlytics.installation.id", null);
            }
            if (this.f8264f == null) {
                Log.w("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
                this.f8264f = a(sharedPreferences, b());
            }
            String str4 = "Crashlytics installation ID: " + this.f8264f;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str4, null);
            }
            return this.f8264f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String d() {
        String str;
        mf.a aVar = this.f8259a;
        Context context = this.f8260b;
        synchronized (aVar) {
            try {
                if (((String) aVar.f11698r) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = PredefinedUICustomizationFont.defaultFamily;
                    }
                    aVar.f11698r = installerPackageName;
                }
                str = PredefinedUICustomizationFont.defaultFamily.equals((String) aVar.f11698r) ? null : (String) aVar.f11698r;
            } finally {
            }
        }
        return str;
    }
}
