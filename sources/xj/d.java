package xj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f19892b = Pattern.compile("([LR]:|[\\w\\.:][\\w\\.:\\-]*|[\\,\\|\\-\\(\\)])");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matcher f19893a;

    public d(CharSequence charSequence) {
        this.f19893a = f19892b.matcher(charSequence);
    }

    public final String a() {
        Matcher matcher = this.f19893a;
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }
}
