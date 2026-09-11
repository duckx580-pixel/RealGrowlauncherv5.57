package nf;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AssetManager f12286b;

    @Override // nf.c
    public final InputStream a(String str) {
        try {
            return this.f12286b.open(str);
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
