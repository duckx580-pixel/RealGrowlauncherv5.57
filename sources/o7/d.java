package o7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f12777i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f12778r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f12779s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ d[] f12780t;

    static {
        d dVar = new d("NETWORK_UNMETERED", 0);
        f12777i = dVar;
        d dVar2 = new d("DEVICE_IDLE", 1);
        f12778r = dVar2;
        d dVar3 = new d("DEVICE_CHARGING", 2);
        f12779s = dVar3;
        f12780t = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f12780t.clone();
    }
}
