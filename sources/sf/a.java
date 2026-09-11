package sf;

import android.text.Editable;
import android.text.method.MetaKeyKeyListener;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import uf.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MetaKeyKeyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f15757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Editable f15758b = Editable.Factory.getInstance().newEditable(PredefinedUICustomizationFont.defaultFamily);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15759c = false;

    public a(c cVar) {
        this.f15757a = cVar;
    }

    public final boolean a() {
        return MetaKeyKeyListener.getMetaState(this.f15758b, 2) == 1;
    }

    public final boolean b() {
        return MetaKeyKeyListener.getMetaState(this.f15758b, 1) == 1;
    }
}
