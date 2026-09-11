package q3;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static Spanned a(String str, int i10) {
        return Html.fromHtml(str, i10);
    }

    public static Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i10, imageGetter, tagHandler);
    }

    public static String c(Spanned spanned, int i10) {
        return Html.toHtml(spanned, i10);
    }
}
