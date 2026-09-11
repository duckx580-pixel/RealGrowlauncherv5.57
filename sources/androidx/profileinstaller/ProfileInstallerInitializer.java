package androidx.profileinstaller;

import android.content.Context;
import cb.f;
import e5.b;
import i.l;
import java.util.Collections;
import java.util.List;
import v4.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // e5.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // e5.b
    public final Object b(Context context) {
        e.a(new l(this, context.getApplicationContext()));
        return new f(16);
    }
}
