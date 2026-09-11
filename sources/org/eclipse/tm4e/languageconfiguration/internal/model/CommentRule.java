package org.eclipse.tm4e.languageconfiguration.internal.model;

import ak.a;
import hk.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CommentRule {
    public final CharacterPair blockComment;
    public final String lineComment;

    public CommentRule(String str, CharacterPair characterPair) {
        this.lineComment = str;
        this.blockComment = characterPair;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$toString$0(StringBuilder sb2) {
        sb2.append("lineComment=");
        sb2.append(this.lineComment);
        sb2.append(", ");
        sb2.append("blockComment=");
        sb2.append(this.blockComment);
    }

    public String toString() {
        return e.e(this, new a(6, this));
    }
}
