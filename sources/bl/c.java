package bl;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import j$.util.Base64;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends al.c {
    @Override // wk.a
    public final Object b(el.c cVar) {
        return Base64.getDecoder().decode(((el.e) cVar).f5565e.replaceAll("\\s", PredefinedUICustomizationFont.defaultFamily));
    }
}
