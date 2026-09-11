package yk;

import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f20455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f20456c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20457a;

    static {
        HashSet hashSet = new HashSet();
        f20455b = hashSet;
        f20456c = Pattern.compile("\\s");
        hashSet.add('[');
        hashSet.add(']');
        hashSet.add('{');
        hashSet.add('}');
        hashSet.add(',');
        hashSet.add('*');
        hashSet.add('&');
    }

    public a(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty anchor.");
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (f20455b.contains(Character.valueOf(cCharAt))) {
                throw new dl.c("Invalid character '" + cCharAt + "' in the anchor: " + str);
            }
        }
        if (f20456c.matcher(str).find()) {
            throw new dl.c("Anchor may not contain spaces: ".concat(str));
        }
        this.f20457a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f20457a, ((a) obj).f20457a);
    }

    public final int hashCode() {
        return Objects.hash(this.f20457a);
    }

    public final String toString() {
        return this.f20457a;
    }
}
