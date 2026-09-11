package zc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.File;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements yc.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yc.k f21048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f21049c;

    public p0(r0 r0Var, Context context, yc.k kVar) {
        this.f21049c = r0Var;
        this.f21047a = context;
        this.f21048b = kVar;
    }

    @Override // yc.k
    public final void onConnectFailure() {
        yc.k kVar = this.f21048b;
        if (kVar != null) {
            kVar.onConnectFailure();
        }
    }

    @Override // yc.k
    public final void onConnectSuccess() {
        yc.g0 g0VarA;
        r0 r0Var = this.f21049c;
        Context context = this.f21047a;
        kg.a aVar = new kg.a();
        aVar.f9616a = context;
        r0Var.f21092b = aVar;
        t6.b bVar = new t6.b();
        if (t6.b.f16712u == null) {
            t6.b.f16712u = bVar;
            yc.f0 f0Var = new yc.f0();
            f0Var.f20296i = context;
            f0Var.f20297r = -1;
            bVar.f16713i = f0Var;
            bVar.f16714r = new Vector();
            bVar.f16715s = Executors.newFixedThreadPool(5);
            if (Environment.getExternalStorageDirectory() != null) {
                yc.q0.e(new File(Environment.getExternalStorageDirectory(), "tapjoy"));
                yc.q0.e(new File(Environment.getExternalStorageDirectory(), "tjcache/tmp/"));
            }
            File file = new File(context.getFilesDir() + "/Tapjoy/Cache/");
            bVar.f16716t = file;
            if (!file.exists()) {
                if (file.mkdirs()) {
                    yc.c0.a(3, "TapjoyCache", "Created directory at: " + file.getPath());
                } else {
                    yc.c0.d("TapjoyCache", "Error initalizing cache");
                    t6.b.f16712u = null;
                }
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("tapjoyCacheData", 0);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                File file2 = new File(entry.getKey());
                if (file2.exists() && file2.isFile()) {
                    try {
                        g0VarA = yc.g0.a(new JSONObject(entry.getValue().toString()));
                    } catch (JSONException unused) {
                        yc.c0.a(4, "TapjoyCachedAssetData", "Can not build TapjoyVideoObject -- error reading json string");
                        g0VarA = null;
                    }
                    if (g0VarA != null) {
                        yc.c0.a(3, "TapjoyCache", "Loaded Asset: " + g0VarA.f20302s);
                        String strC = t6.b.c(g0VarA.f20302s);
                        if (strC != null && !PredefinedUICustomizationFont.defaultFamily.equals(strC) && strC.length() > 0) {
                            if (g0VarA.f20305v < System.currentTimeMillis() / 1000) {
                                yc.c0.a(3, "TapjoyCache", "Asset expired, removing from cache: " + g0VarA.f20302s);
                                String str = g0VarA.f20303t;
                                if (str != null && str.length() > 0) {
                                    yc.q0.e(new File(g0VarA.f20303t));
                                }
                            } else {
                                ((yc.f0) bVar.f16713i).put(strC, g0VarA);
                            }
                        }
                    }
                    yc.c0.d("TapjoyCache", "Removing asset because deserialization failed.");
                    editorEdit.remove(entry.getKey()).apply();
                } else {
                    yc.c0.a(3, "TapjoyCache", "Removing reference to missing asset: " + entry.getKey());
                    editorEdit.remove(entry.getKey()).apply();
                }
            }
        }
        try {
            yc.s.a(this.f21047a);
            this.f21049c.f21091a = true;
            yc.k kVar = this.f21048b;
            if (kVar != null) {
                kVar.onConnectSuccess();
            }
        } catch (InterruptedException unused2) {
            onConnectFailure();
        } catch (RuntimeException e8) {
            yc.c0.a(5, "TapjoyAPI", e8.getMessage());
            onConnectFailure();
        }
    }
}
