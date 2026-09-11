package androidx.compose.ui.focus;

import a1.n;
import e1.j;
import eh.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final n a(n nVar, j jVar) {
        return nVar.j(new FocusRequesterElement(jVar));
    }

    public static final n b(n nVar, c cVar) {
        return nVar.j(new FocusChangedElement(cVar));
    }
}
