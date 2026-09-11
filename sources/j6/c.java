package j6;

import android.graphics.Bitmap;
import oh.f0;
import oh.s;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f8785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f8786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f8787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f8788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m6.a f8789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k6.d f8790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f8791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f8793i;
    public final b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f8794k;

    public c() {
        vh.d dVar = f0.f12869a;
        ph.d dVar2 = th.m.f17224a.f13460v;
        vh.c cVar = f0.f12870b;
        k6.d dVar3 = k6.d.f9260s;
        Bitmap.Config config = n6.e.f12135b;
        b bVar = b.f8780s;
        this.f8785a = dVar2;
        this.f8786b = cVar;
        this.f8787c = cVar;
        this.f8788d = cVar;
        this.f8789e = m6.a.f11627a;
        this.f8790f = dVar3;
        this.f8791g = config;
        this.f8792h = true;
        this.f8793i = bVar;
        this.j = bVar;
        this.f8794k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.l.a(this.f8785a, cVar.f8785a) && kotlin.jvm.internal.l.a(this.f8786b, cVar.f8786b) && kotlin.jvm.internal.l.a(this.f8787c, cVar.f8787c) && kotlin.jvm.internal.l.a(this.f8788d, cVar.f8788d) && kotlin.jvm.internal.l.a(this.f8789e, cVar.f8789e) && this.f8790f == cVar.f8790f && this.f8791g == cVar.f8791g && this.f8792h == cVar.f8792h && this.f8793i == cVar.f8793i && this.j == cVar.j && this.f8794k == cVar.f8794k;
    }

    public final int hashCode() {
        int iHashCode = (this.f8788d.hashCode() + ((this.f8787c.hashCode() + ((this.f8786b.hashCode() + (this.f8785a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f8789e.getClass();
        return this.f8794k.hashCode() + ((this.j.hashCode() + ((this.f8793i.hashCode() + h0.c(h0.c((this.f8791g.hashCode() + ((this.f8790f.hashCode() + ((m6.a.class.hashCode() + iHashCode) * 31)) * 31)) * 31, 31, this.f8792h), 923521, false)) * 31)) * 31);
    }
}
