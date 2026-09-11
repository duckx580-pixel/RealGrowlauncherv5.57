package s3;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static i b(View view, i iVar) {
        ContentInfo contentInfoA = iVar.a();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoA);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoA ? iVar : new i(new e(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, z zVar) {
        if (zVar == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new w0(zVar));
        }
    }
}
