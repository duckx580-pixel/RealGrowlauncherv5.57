package f6;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import j6.m;
import kotlin.jvm.internal.l;
import n6.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    @Override // f6.b
    public final String a(Object obj, m mVar) {
        Uri uri = (Uri) obj;
        if (!l.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = mVar.f8843a.getResources().getConfiguration();
        Bitmap.Config[] configArr = e.f12134a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
