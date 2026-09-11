package com.usercentrics.sdk.errors;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LanguageNotAvailableException extends UsercentricsException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageNotAvailableException(String str) {
        super("Cannot change the language to '" + str + "' as it is not supported by your configuration. Please add it to your configuration at: Configuration Section > Setup Tab > Language Settings", null, 2, null);
        l.f("language", str);
    }
}
