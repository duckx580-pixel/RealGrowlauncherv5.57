package se;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a[] f15744i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f15745r;

    /* JADX INFO: Fake field, exist only in values array */
    a EF0;

    static {
        a aVar = new a("OK", 0);
        a aVar2 = new a("ERROR", 1);
        f15745r = aVar2;
        f15744i = new a[]{aVar, aVar2};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f15744i.clone();
    }
}
