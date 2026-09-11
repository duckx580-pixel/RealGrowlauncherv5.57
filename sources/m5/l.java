package m5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends xd.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f11597g = androidx.work.p.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f11598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f11601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11602f;

    public l(p pVar, List list) {
        super(1);
        this.f11598b = pVar;
        this.f11599c = list;
        this.f11600d = new ArrayList(list.size());
        this.f11601e = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((androidx.work.q) list.get(i10)).f2391a.toString();
            kotlin.jvm.internal.l.e("id.toString()", string);
            this.f11600d.add(string);
            this.f11601e.add(string);
        }
    }

    public static HashSet w(l lVar) {
        HashSet hashSet = new HashSet();
        lVar.getClass();
        return hashSet;
    }
}
