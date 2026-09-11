package o1;

import a1.m;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m implements d {
    public eh.c D;
    public eh.c E;

    @Override // o1.d
    public final boolean B(KeyEvent keyEvent) {
        eh.c cVar = this.D;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // o1.d
    public final boolean k(KeyEvent keyEvent) {
        eh.c cVar = this.E;
        if (cVar != null) {
            return ((Boolean) cVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
