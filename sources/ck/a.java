package ck;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ArrayList implements c {
    @Override // ck.c
    public final void setProperty(String str, Object obj) {
        int i10 = Integer.parseInt(str);
        if (i10 == size()) {
            add(obj);
        } else {
            set(i10, obj);
        }
    }
}
