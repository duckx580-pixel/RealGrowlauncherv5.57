package t6;

import android.content.Context;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f17030a;

    public s0(u uVar) {
        this.f17030a = uVar;
    }

    public final File a() {
        Context context = (Context) this.f17030a.f17063i;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final void b(int i10, int i11) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File fileA = a();
                if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, name);
                        int iU = ka.a1.u(name);
                        if (i10 > iU || iU > i11) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(rg.m.O(arrayList, 10));
                    for (File file2 : arrayList) {
                        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, file2);
                        arrayList2.add(Boolean.valueOf(bh.l.B(file2)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c(String... strArr) {
        boolean zB;
        synchronized (this) {
            try {
                File fileA = a();
                zB = true;
                if (fileA != null) {
                    if (strArr.length == 0) {
                        s6.h.f15212b.m(16, "delete all exceptions", true);
                        zB = bh.l.B(fileA);
                    } else {
                        s6.h.f15212b.m(16, "delete all exceptions except for: " + rg.k.H0(62, strArr), true);
                        File[] fileArrListFiles = fileA.listFiles();
                        if (fileArrListFiles != null) {
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!rg.k.o0(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(rg.m.O(arrayList, 10));
                            for (File file2 : arrayList) {
                                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, file2);
                                arrayList2.add(Boolean.valueOf(bh.l.B(file2)));
                            }
                            Set setB0 = rg.l.B0(arrayList2);
                            if (setB0.isEmpty()) {
                                setB0 = te.a.z(Boolean.TRUE);
                            }
                            Set set = setB0;
                            if (set.size() != 1 || !((Boolean) rg.l.b0(set)).booleanValue()) {
                                zB = false;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zB;
    }

    public final List d() {
        List listP;
        File[] fileArrListFiles;
        ArrayList arrayList;
        File[] fileArrListFiles2;
        synchronized (this) {
            try {
                File fileA = a();
                listP = null;
                if (fileA != null && (fileArrListFiles = fileA.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            fileArrListFiles2 = file.listFiles();
                        } catch (Throwable th2) {
                            s6.h.f15212b.m(16, "Could not get stored exceptions\n " + th2.getMessage(), true);
                        }
                        if (fileArrListFiles2 != null) {
                            arrayList = new ArrayList();
                            for (File file2 : fileArrListFiles2) {
                                kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, file2);
                                o oVarL = ud.a.l(bh.l.E(file2));
                                if (oVarL != null) {
                                    arrayList.add(oVarL);
                                }
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listP = rg.m.P(arrayList2);
                }
                if (listP == null) {
                    listP = rg.s.f14664i;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return listP;
    }
}
