package pf;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public enum o {
    NONE(PredefinedUICustomizationFont.defaultFamily),
    LF("\n"),
    CR("\r"),
    CRLF("\r\n");


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f13422i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13423r;

    o(String str) {
        this.f13422i = str;
        this.f13423r = str.length();
        str.toCharArray();
    }
}
