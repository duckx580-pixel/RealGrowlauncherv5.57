package zh;

import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.l;
import rg.s;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f21338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f21339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f21340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f21341e;

    public a(String str) {
        l.f("serialName", str);
        this.f21337a = new ArrayList();
        this.f21338b = new HashSet();
        this.f21339c = new ArrayList();
        this.f21340d = new ArrayList();
        this.f21341e = new ArrayList();
    }

    public static void a(a aVar, String str, g gVar) {
        aVar.getClass();
        l.f("elementName", str);
        l.f("descriptor", gVar);
        if (!aVar.f21338b.add(str)) {
            throw new IllegalArgumentException(h0.f("Element with name '", str, "' is already registered").toString());
        }
        aVar.f21337a.add(str);
        aVar.f21339c.add(gVar);
        aVar.f21340d.add(s.f14664i);
        aVar.f21341e.add(false);
    }
}
