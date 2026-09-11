package i7;

import android.content.Context;
import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.a f8104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r7.a f8105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8106d;

    public b(Context context, r7.a aVar, r7.a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f8103a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f8104b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f8105c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f8106d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            b bVar = (b) ((c) obj);
            if (this.f8103a.equals(bVar.f8103a) && this.f8104b.equals(bVar.f8104b) && this.f8105c.equals(bVar.f8105c) && this.f8106d.equals(bVar.f8106d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f8103a.hashCode() ^ 1000003) * 1000003) ^ this.f8104b.hashCode()) * 1000003) ^ this.f8105c.hashCode()) * 1000003) ^ this.f8106d.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreationContext{applicationContext=");
        sb2.append(this.f8103a);
        sb2.append(", wallClock=");
        sb2.append(this.f8104b);
        sb2.append(", monotonicClock=");
        sb2.append(this.f8105c);
        sb2.append(", backendName=");
        return g.l(sb2, this.f8106d, "}");
    }
}
