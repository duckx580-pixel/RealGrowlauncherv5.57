package com.google.firebase.database.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.a;
import java.util.List;
import sb.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public final class FirebaseDatabaseKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        return c.C(a.a.n("fire-db-ktx", "20.0.6"));
    }
}
