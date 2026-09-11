package n6;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import bj.o;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.Closeable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f12134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f12135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f12136c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f12134a = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f12135b = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
        Object[] array = new ArrayList(20).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        f12136c = new o((String[]) array);
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || nh.h.W(str)) {
            return null;
        }
        String strP0 = nh.h.p0(nh.h.p0(str, '#'), '?');
        return mimeTypeMap.getMimeTypeFromExtension(nh.h.n0(nh.h.n0(strP0, '/', strP0), '.', PredefinedUICustomizationFont.defaultFamily));
    }

    public static final boolean c(Uri uri) {
        return kotlin.jvm.internal.l.a(uri.getScheme(), "file") && kotlin.jvm.internal.l.a((String) rg.l.e0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(ud.a aVar, k6.e eVar) {
        if (aVar instanceof k6.a) {
            return ((k6.a) aVar).f9255i;
        }
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new a2.d();
    }
}
