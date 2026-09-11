package k3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import q.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends t6.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f9237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f9238c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f9239d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f9240e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi24Impl", e8.getClass().getName(), e8);
            cls = null;
            method = null;
            method2 = null;
        }
        f9238c = constructor;
        f9237b = cls;
        f9239d = method2;
        f9240e = method;
    }

    public static boolean D(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z3) {
        try {
            return ((Boolean) f9239d.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface E(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f9237b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f9240e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // t6.k
    public final Typeface j(Context context, j3.f fVar, Resources resources, int i10) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = f9238c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (j3.g gVar : fVar.f8744a) {
                int i11 = gVar.f8750f;
                File fileS = te.a.s(context);
                if (fileS != null) {
                    try {
                        if (te.a.m(fileS, resources, i11)) {
                            try {
                                fileInputStream = new FileInputStream(fileS);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && D(objNewInstance, map, gVar.f8749e, gVar.f8746b, gVar.f8747c)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileS.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return E(objNewInstance);
        }
        return null;
    }

    @Override // t6.k
    public final Typeface k(Context context, p3.g[] gVarArr, int i10) {
        Object objNewInstance;
        try {
            objNewInstance = f9238c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i11 = 0;
            x xVar = new x(0);
            int length = gVarArr.length;
            while (true) {
                if (i11 < length) {
                    p3.g gVar = gVarArr[i11];
                    Uri uri = gVar.f13306a;
                    ByteBuffer byteBufferW = (ByteBuffer) xVar.get(uri);
                    if (byteBufferW == null) {
                        byteBufferW = te.a.w(context, uri);
                        xVar.put(uri, byteBufferW);
                    }
                    if (byteBufferW == null || !D(objNewInstance, byteBufferW, gVar.f13307b, gVar.f13308c, gVar.f13309d)) {
                        break;
                    }
                    i11++;
                } else {
                    Typeface typefaceE = E(objNewInstance);
                    if (typefaceE != null) {
                        return Typeface.create(typefaceE, i10);
                    }
                }
            }
        }
        return null;
    }
}
