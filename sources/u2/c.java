package u2;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f17570r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f17571s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final c f17572t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17573i;

    static {
        int i10 = 0;
        f17570r = new c(i10, 0);
        f17571s = new c(i10, 1);
        f17572t = new c(i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, int i11) {
        super(i10);
        this.f17573i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17573i) {
        }
        return UUID.randomUUID();
    }
}
