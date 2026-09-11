package org.eclipse.tm4e.languageconfiguration.internal.model;

import ak.a;
import hk.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class OnEnterRule {
    public final EnterAction action;
    public final RegExPattern afterText;
    public final RegExPattern beforeText;
    public final RegExPattern previousLineText;

    public OnEnterRule(RegExPattern regExPattern, RegExPattern regExPattern2, RegExPattern regExPattern3, EnterAction enterAction) {
        this.beforeText = regExPattern;
        this.afterText = regExPattern2;
        this.previousLineText = regExPattern3;
        this.action = enterAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toString$0(StringBuilder sb2) {
        sb2.append("beforeText=");
        sb2.append(this.beforeText);
        sb2.append(", ");
        sb2.append("afterText=");
        sb2.append(this.afterText);
        sb2.append(", ");
        sb2.append("previousLineText=");
        sb2.append(this.previousLineText);
        sb2.append(", ");
        sb2.append("action=");
        sb2.append(this.action);
    }

    public String toString() {
        return e.e(this, new a(11, this));
    }

    public OnEnterRule(String str, String str2, String str3, EnterAction enterAction) {
        this.beforeText = RegExPattern.of(str);
        this.afterText = str2 == null ? null : RegExPattern.of(str2);
        this.previousLineText = str3 != null ? RegExPattern.of(str3) : null;
        this.action = enterAction;
    }
}
