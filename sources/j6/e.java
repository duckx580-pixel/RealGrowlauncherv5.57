package j6;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f8798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f8800c;

    public e(Drawable drawable, i iVar, Throwable th2) {
        this.f8798a = drawable;
        this.f8799b = iVar;
        this.f8800c = th2;
    }

    @Override // j6.j
    public final i a() {
        return this.f8799b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.f8798a, eVar.f8798a) && kotlin.jvm.internal.l.a(this.f8799b, eVar.f8799b) && kotlin.jvm.internal.l.a(this.f8800c, eVar.f8800c);
    }

    public final int hashCode() {
        Drawable drawable = this.f8798a;
        return this.f8800c.hashCode() + ((this.f8799b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
