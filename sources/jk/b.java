package jk;

import android.util.Log;
import java.util.regex.Pattern;
import org.eclipse.tm4e.languageconfiguration.internal.model.CharacterPair;
import tf.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f8944c = Pattern.compile("\\B");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f8945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f8946b;

    public b(CharacterPair characterPair) {
        Pattern patternCompile;
        String str = characterPair.open;
        e eVar = kk.a.f9647a;
        StringBuilder sb2 = new StringBuilder(str.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"));
        String strValueOf = String.valueOf(sb2.charAt(0));
        Pattern pattern = f8944c;
        if (!pattern.matcher(strValueOf).find()) {
            sb2.insert(0, "\\b");
        }
        sb2.append("\\s*$");
        String string = sb2.toString();
        Pattern patternCompile2 = null;
        try {
            patternCompile = Pattern.compile(string);
        } catch (Exception e8) {
            Log.e(kk.a.f9647a.f17180a, android.support.v4.media.session.a.m("Failed to parse pattern: ", string), e8);
            patternCompile = null;
        }
        this.f8945a = patternCompile;
        StringBuilder sb3 = new StringBuilder(characterPair.close.replaceAll("[\\-\\\\\\{\\}\\*\\+\\?\\|\\^\\$\\.\\[\\]\\(\\)\\#]", "\\\\$0"));
        if (!pattern.matcher(String.valueOf(sb3.charAt(sb3.length() - 1))).find()) {
            sb3.append("\\b");
        }
        sb3.insert(0, "^\\s*");
        String string2 = sb3.toString();
        try {
            patternCompile2 = Pattern.compile(string2);
        } catch (Exception e10) {
            Log.e(kk.a.f9647a.f17180a, android.support.v4.media.session.a.m("Failed to parse pattern: ", string2), e10);
        }
        this.f8946b = patternCompile2;
    }
}
