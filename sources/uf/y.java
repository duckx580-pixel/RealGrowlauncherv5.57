package uf;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final y f17979f = new y(PredefinedUICustomizationFont.defaultFamily, PredefinedUICustomizationFont.defaultFamily);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f17982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17984e;

    public y(String str, String str2) {
        this.f17980a = str;
        this.f17981b = str2;
    }

    public y(String str, String str2, x xVar) {
        this(str, str2);
        this.f17982c = xVar;
    }
}
