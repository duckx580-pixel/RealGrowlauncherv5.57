package wf;

import android.content.Context;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f19233b = PredefinedUICustomizationFont.defaultFamily;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19234c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f19236e;

    public n(Context context) {
        this.f19232a = context;
    }

    public final void a(int i10) {
        String string = this.f19232a.getString(i10);
        kotlin.jvm.internal.l.e("getString(...)", string);
        this.f19233b = string;
    }
}
