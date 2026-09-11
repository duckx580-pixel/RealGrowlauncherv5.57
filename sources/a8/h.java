package a8;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface h {
    LifecycleCallback a(Class cls, String str);

    Activity b();

    void c(String str, n nVar);

    void startActivityForResult(Intent intent, int i10);
}
