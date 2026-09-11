package nh;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Pattern f12308i;

    public g(String str) {
        Pattern patternCompile = Pattern.compile(str);
        kotlin.jvm.internal.l.e("compile(...)", patternCompile);
        this.f12308i = patternCompile;
    }

    public final String toString() {
        String string = this.f12308i.toString();
        kotlin.jvm.internal.l.e("toString(...)", string);
        return string;
    }
}
