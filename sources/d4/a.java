package d4;

import java.util.Map;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f4924i = new a(1);

    @Override // eh.c
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        l.f("entry", entry);
        return "  " + ((e) entry.getKey()).f4932a + " = " + entry.getValue();
    }
}
