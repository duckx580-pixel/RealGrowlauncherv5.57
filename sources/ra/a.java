package ra;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import ia.f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.HashMap;
import ka.t0;
import ka.u0;
import ka.v0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f14598d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f14600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.b f14601c;

    public a(Context context, c cVar, na.b bVar) {
        this.f14599a = context;
        this.f14600b = cVar;
        this.f14601c = bVar;
    }

    public static File b(File file, String str) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.getName().endsWith(str)) {
                return file2;
            }
        }
        return null;
    }

    public static void f(na.b bVar, String str, String str2, String str3) throws Throwable {
        File file = new File(bVar.b(str), str3);
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), f14598d));
            try {
                bufferedWriter2.write(str2);
                f.b(bufferedWriter2, "Failed to close " + file);
            } catch (IOException unused) {
                bufferedWriter = bufferedWriter2;
                f.b(bufferedWriter, "Failed to close " + file);
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                f.b(bufferedWriter, "Failed to close " + file);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final d a(String str) {
        File fileB = this.f14601c.b(str);
        File file = new File(fileB, "pending");
        String str2 = "Minidump directory: " + file.getAbsolutePath();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        File fileB2 = b(file, ".dmp");
        String strConcat = "Minidump file ".concat((fileB2 == null || !fileB2.exists()) ? "does not exist" : "exists");
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strConcat, null);
        }
        d dVar = new d();
        if (fileB.exists() && file.exists()) {
            dVar.f14605a = b(file, ".dmp");
            dVar.f14606b = b(fileB, ".device_info");
            dVar.f14607c = new File(fileB, "session.json");
            dVar.f14608d = new File(fileB, "app.json");
            dVar.f14609e = new File(fileB, "device.json");
            dVar.f14610f = new File(fileB, "os.json");
        }
        d dVar2 = new d();
        dVar2.f14605a = dVar.f14605a;
        dVar2.f14606b = dVar.f14606b;
        dVar2.f14607c = dVar.f14607c;
        dVar2.f14608d = dVar.f14608d;
        dVar2.f14609e = dVar.f14609e;
        dVar2.f14610f = dVar.f14610f;
        return dVar2;
    }

    public final void c(long j, String str) throws Throwable {
        HashMap map = new HashMap();
        map.put("session_id", str);
        map.put("generator", "Crashlytics Android SDK/18.2.13");
        map.put("started_at_seconds", Long.valueOf(j));
        f(this.f14601c, str, new JSONObject(map).toString(), "session.json");
    }

    public final void d(String str, t0 t0Var) throws Throwable {
        String str2 = t0Var.f9512a;
        String str3 = t0Var.f9513b;
        String str4 = t0Var.f9514c;
        String str5 = t0Var.f9515d;
        int i10 = t0Var.f9516e;
        fa.d dVar = t0Var.f9517f;
        String str6 = (String) dVar.a().f6048a;
        String str7 = (String) dVar.a().f6049b;
        HashMap map = new HashMap();
        map.put("app_identifier", str2);
        map.put("version_code", str3);
        map.put("version_name", str4);
        map.put("install_uuid", str5);
        map.put("delivery_mechanism", Integer.valueOf(i10));
        if (str6 == null) {
            str6 = PredefinedUICustomizationFont.defaultFamily;
        }
        map.put("development_platform", str6);
        if (str7 == null) {
            str7 = PredefinedUICustomizationFont.defaultFamily;
        }
        map.put("development_platform_version", str7);
        f(this.f14601c, str, new JSONObject(map).toString(), "app.json");
    }

    public final void e(String str, u0 u0Var) throws Throwable {
        int i10 = u0Var.f9520a;
        String str2 = Build.MODEL;
        int i11 = u0Var.f9521b;
        long j = u0Var.f9522c;
        long j10 = u0Var.f9523d;
        boolean z3 = u0Var.f9524e;
        int i12 = u0Var.f9525f;
        String str3 = Build.MANUFACTURER;
        String str4 = Build.PRODUCT;
        HashMap map = new HashMap();
        map.put("arch", Integer.valueOf(i10));
        map.put("build_model", str2);
        map.put("available_processors", Integer.valueOf(i11));
        map.put("total_ram", Long.valueOf(j));
        map.put("disk_space", Long.valueOf(j10));
        map.put("is_emulator", Boolean.valueOf(z3));
        map.put("state", Integer.valueOf(i12));
        map.put("build_manufacturer", str3);
        map.put("build_product", str4);
        f(this.f14601c, str, new JSONObject(map).toString(), "device.json");
    }

    public final void g(String str, v0 v0Var) throws Throwable {
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        boolean z3 = v0Var.f9535a;
        HashMap map = new HashMap();
        map.put("version", str2);
        map.put("build_version", str3);
        map.put("is_rooted", Boolean.valueOf(z3));
        f(this.f14601c, str, new JSONObject(map).toString(), "os.json");
    }
}
