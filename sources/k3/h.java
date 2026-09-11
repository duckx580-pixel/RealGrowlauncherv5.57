package k3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class h extends t6.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f9232b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f9233c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f9234d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f9235e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f9236f = false;

    public static boolean D(Object obj, String str, int i10, boolean z3) throws NoSuchMethodException {
        E();
        try {
            return ((Boolean) f9234d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static void E() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f9236f) {
            return;
        }
        f9236f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f9233c = constructor;
        f9232b = cls;
        f9234d = method2;
        f9235e = method;
    }

    @Override // t6.k
    public Typeface j(Context context, j3.f fVar, Resources resources, int i10) throws NoSuchMethodException {
        E();
        try {
            Object objNewInstance = f9233c.newInstance(null);
            for (j3.g gVar : fVar.f8744a) {
                File fileS = te.a.s(context);
                if (fileS == null) {
                    return null;
                }
                try {
                    if (!te.a.m(fileS, resources, gVar.f8750f)) {
                        return null;
                    }
                    if (!D(objNewInstance, fileS.getPath(), gVar.f8746b, gVar.f8747c)) {
                        return null;
                    }
                    fileS.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileS.delete();
                }
            }
            E();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f9232b, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f9235e.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e8) {
                throw new RuntimeException(e8);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // t6.k
    public Typeface k(Context context, p3.g[] gVarArr, int i10) {
        String str;
        if (gVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(n(gVarArr, i10).f13306a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceL = l(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceL;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }
}
