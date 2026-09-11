package com.usercentrics.tcf.core.errors;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class TCModelError extends Throwable {
    private final String name;

    public /* synthetic */ TCModelError(String str, Object obj, String str2, int i10, g gVar) {
        this(str, obj, (i10 & 4) != 0 ? PredefinedUICustomizationFont.defaultFamily : str2);
    }

    public final String getName() {
        return this.name;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TCModelError(String str, Object obj, String str2) {
        super("invalid value " + obj + " passed for " + str + " " + str2);
        l.f("fieldName", str);
        l.f("passedValue", obj);
        l.f("msg", str2);
        this.name = "TCModelError";
    }
}
