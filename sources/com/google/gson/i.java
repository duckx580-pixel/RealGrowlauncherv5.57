package com.google.gson;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f4332d = new i(PredefinedUICustomizationFont.defaultFamily, PredefinedUICustomizationFont.defaultFamily, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4335c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z3) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f4333a = str;
        this.f4334b = str2;
        this.f4335c = z3;
    }
}
