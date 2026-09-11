package com.usercentrics.sdk.models.settings;

import eh.c;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUISimpleCardContent extends PredefinedUICardContent {
    private final String description;
    private final String title;
    private final String value;

    /* JADX INFO: renamed from: com.usercentrics.sdk.models.settings.PredefinedUISimpleCardContent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class AnonymousClass1 extends m implements c {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // eh.c
        public final CharSequence invoke(String str) {
            l.f("illustration", str);
            return "• ".concat(str);
        }
    }

    public /* synthetic */ PredefinedUISimpleCardContent(String str, String str2, String str3, int i10, g gVar) {
        this((i10 & 1) != 0 ? PredefinedUICustomizationFont.defaultFamily : str, (i10 & 2) != 0 ? PredefinedUICustomizationFont.defaultFamily : str2, str3);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedUISimpleCardContent(String str, String str2, String str3) {
        super(null);
        l.f("title", str);
        l.f("description", str2);
        l.f("value", str3);
        this.title = str;
        this.description = str2;
        this.value = str3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PredefinedUISimpleCardContent(String str, String str2, List<String> list) {
        this(str, str2, rg.l.j0(list, "\n\n", null, null, AnonymousClass1.INSTANCE, 30));
        l.f("title", str);
        l.f("description", str2);
        l.f("values", list);
    }
}
