package org.eclipse.tm4e.languageconfiguration.internal.model;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class IndentationRules {
    public final RegExPattern decreaseIndentPattern;
    public final RegExPattern increaseIndentPattern;
    public final RegExPattern indentNextLinePattern;
    public final RegExPattern unIndentedLinePattern;

    public IndentationRules(RegExPattern regExPattern, RegExPattern regExPattern2, RegExPattern regExPattern3, RegExPattern regExPattern4) {
        this.decreaseIndentPattern = regExPattern;
        this.increaseIndentPattern = regExPattern2;
        this.indentNextLinePattern = regExPattern3;
        this.unIndentedLinePattern = regExPattern4;
    }
}
