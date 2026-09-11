package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import e4.j;
import e4.k;
import e4.n;
import e4.t;
import e5.a;
import e5.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // e5.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // e5.b
    public final Object b(Context context) {
        Object objB;
        n nVar = new n();
        nVar.f5304a = context.getApplicationContext();
        t tVar = new t(nVar);
        tVar.f2020a = 1;
        if (j.f5287k == null) {
            synchronized (j.j) {
                try {
                    if (j.f5287k == null) {
                        j.f5287k = new j(tVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f5340e) {
            try {
                objB = aVarC.f5341a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        p lifecycle = ((v) objB).getLifecycle();
        lifecycle.a(new k(this, lifecycle));
        return Boolean.TRUE;
    }
}
