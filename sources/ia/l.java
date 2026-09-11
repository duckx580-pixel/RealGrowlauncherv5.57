package ia;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import zc.c5;
import zc.p3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8196i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f8197r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Serializable f8198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f8199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f8200u;

    public l(p3 p3Var, URL url, ByteArrayInputStream byteArrayInputStream, long j) {
        this.f8200u = p3Var;
        this.f8198s = url;
        this.f8199t = byteArrayInputStream;
        this.f8197r = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8196i) {
            case 0:
                n nVar = (n) this.f8200u;
                s sVar = nVar.f8215m;
                if (sVar == null || !sVar.f8247e.get()) {
                    long j = this.f8197r / 1000;
                    String strF = nVar.f();
                    if (strF == null) {
                        Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", null);
                        return;
                    }
                    mf.c cVar = nVar.f8214l;
                    Throwable th2 = (Throwable) this.f8198s;
                    Thread thread = (Thread) this.f8199t;
                    cVar.getClass();
                    String strConcat = "Persisting non-fatal event for session ".concat(strF);
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", strConcat, null);
                    }
                    cVar.u(th2, thread, strF, "error", j, false);
                    return;
                }
                return;
            default:
                try {
                    File fileCreateTempFile = File.createTempFile("tj_", null, ((p3) this.f8200u).a());
                    if (fileCreateTempFile == null) {
                        return;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) this.f8199t;
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i10 = byteArrayInputStream.read(bArr);
                        if (i10 == -1) {
                            fileOutputStream.close();
                            long j10 = this.f8197r;
                            if (j10 > 604800) {
                                j10 = 604800;
                            }
                            long jB = c5.b();
                            synchronized (((p3) this.f8200u)) {
                                try {
                                    String strB = ((p3) this.f8200u).b((URL) this.f8198s);
                                    p3 p3Var = (p3) this.f8200u;
                                    p3Var.getClass();
                                    if (fileCreateTempFile.renameTo(new File(p3Var.a(), strB))) {
                                        ((p3) this.f8200u).f21057b.edit().putLong(strB, (j10 * 1000) + jB).commit();
                                    }
                                } finally {
                                }
                                break;
                            }
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                    }
                } catch (FileNotFoundException | IOException unused) {
                    return;
                }
                break;
        }
    }

    public l(n nVar, long j, Throwable th2, Thread thread) {
        this.f8200u = nVar;
        this.f8197r = j;
        this.f8198s = th2;
        this.f8199t = thread;
    }
}
