package pa;

import android.util.Log;
import ia.f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.UUID;
import org.json.JSONObject;
import zc.i3;
import zc.r2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f13358a;

    public a(File file) {
        this.f13358a = file;
    }

    public boolean a() {
        synchronized (this) {
            if (b() != null) {
                return false;
            }
            try {
                File file = this.f13358a;
                String string = UUID.randomUUID().toString();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, zc.b.f20718a);
                    outputStreamWriter.write(string);
                    outputStreamWriter.flush();
                    return b() != null;
                } finally {
                    r2.a(fileOutputStream);
                }
            } catch (IOException e8) {
                try {
                    this.f13358a.delete();
                    throw e8;
                } catch (IOException unused) {
                    return false;
                }
            }
        }
    }

    public String b() {
        File file = this.f13358a;
        if (!file.exists()) {
            return null;
        }
        try {
            String strB = i3.b(file, zc.b.f20718a);
            if (strB.length() > 0) {
                return strB;
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    public JSONObject c() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = this.f13358a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(f.m(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e8) {
                        e = e8;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        f.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    f.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            f.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            f.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public a(na.b bVar) {
        this.f13358a = new File(bVar.f12277b, "com.crashlytics.settings.json");
    }
}
