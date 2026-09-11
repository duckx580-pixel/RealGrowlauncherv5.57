package qe;

import java.util.Map;
import kotlin.jvm.internal.l;
import rg.t;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f13894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13895c;

    public /* synthetic */ a(int i10, String str, Object obj) {
        this(str, (i10 & 2) != 0 ? null : obj, t.f14665i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f13893a, aVar.f13893a) && l.a(this.f13895c, aVar.f13895c) && l.a(this.f13894b, aVar.f13894b);
    }

    public final int hashCode() {
        String str = this.f13893a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Object obj = this.f13895c;
        return this.f13894b.hashCode() + (((iHashCode * 31) + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Metric(name=" + this.f13893a + ", value=" + this.f13895c + ", tags=" + this.f13894b + ')';
    }

    public a(String str, Object obj, Map map) {
        this.f13893a = str;
        this.f13895c = obj;
        this.f13894b = map;
    }
}
