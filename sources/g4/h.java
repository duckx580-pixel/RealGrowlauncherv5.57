package g4;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends e4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f6975a;

    public h(EditText editText) {
        this.f6975a = new WeakReference(editText);
    }

    @Override // e4.h
    public final void b() {
        i.a((EditText) this.f6975a.get(), 1);
    }
}
