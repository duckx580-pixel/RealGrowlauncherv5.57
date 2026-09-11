package z7;

import com.google.android.gms.common.api.Status;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Status f20645i;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Status status) {
        int i10 = status.f3670r;
        String str = status.f3671s;
        super(i10 + ": " + (str == null ? PredefinedUICustomizationFont.defaultFamily : str));
        this.f20645i = status;
    }
}
