package na;

import android.util.Log;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import ia.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ka.e0;
import ka.g0;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f12268d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12269e = 15;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final la.a f12270f = new la.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final cf.b f12271g = new cf.b(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f12272h = new h(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f12273a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f12274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f12275c;

    public a(b bVar, e0 e0Var) {
        this.f12274b = bVar;
        this.f12275c = e0Var;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i10 = fileInputStream.read(bArr);
                if (i10 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f12268d);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i10);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f12268d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        b bVar = this.f12274b;
        arrayList.addAll(b.f(bVar.f12280e.listFiles()));
        arrayList.addAll(b.f(bVar.f12281f.listFiles()));
        cf.b bVar2 = f12271g;
        Collections.sort(arrayList, bVar2);
        List listF = b.f(bVar.f12279d.listFiles());
        Collections.sort(listF, bVar2);
        arrayList.addAll(listF);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(b.f(this.f12274b.f12278c.list())).descendingSet();
    }

    public final void d(g0 g0Var, String str, boolean z3) {
        b bVar = this.f12274b;
        int i10 = ((pa.b) ((AtomicReference) this.f12275c.f9363h).get()).f13359a.f9288i;
        f12270f.getClass();
        try {
            f(bVar.c(str, h0.f("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f12273a.getAndIncrement())), z3 ? "_" : PredefinedUICustomizationFont.defaultFamily)), la.a.f9848a.a(g0Var));
        } catch (IOException e8) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e8);
        }
        h hVar = new h(2);
        bVar.getClass();
        File file = new File(bVar.f12278c, str);
        file.mkdirs();
        List<File> listF = b.f(file.listFiles(hVar));
        Collections.sort(listF, new cf.b(8));
        int size = listF.size();
        for (File file2 : listF) {
            if (size <= i10) {
                return;
            }
            b.e(file2);
            size--;
        }
    }
}
