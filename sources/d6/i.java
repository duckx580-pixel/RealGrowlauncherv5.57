package d6;

import android.webkit.MimeTypeMap;
import hd.b0;
import java.io.File;
import oj.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f4952a;

    public i(File file) {
        this.f4952a = file;
    }

    @Override // d6.h
    public final Object a(ug.c cVar) {
        String str = w.f13114r;
        File file = this.f4952a;
        return new n(new b6.n(b0.d(file), oj.l.f13094a, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(bh.l.C(file)), b6.f.f2729s);
    }
}
