package xh;

import java.util.List;
import kotlin.jvm.internal.l;
import rg.k;
import zh.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f19753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zh.b f19755c;

    public a(kotlin.jvm.internal.f fVar, c cVar, c[] cVarArr) {
        this.f19753a = cVar;
        this.f19754b = k.m0(cVarArr);
        this.f19755c = new zh.b(w9.a.i("kotlinx.serialization.ContextualSerializer", i.f21364b, new zh.g[0]), fVar);
    }

    @Override // xh.b
    public final Object deserialize(ai.c cVar) {
        l.f("decoder", cVar);
        cVar.a().getClass();
        l.f("typeArgumentsSerializers", this.f19754b);
        return cVar.x(this.f19753a);
    }

    @Override // xh.h, xh.b
    public final zh.g getDescriptor() {
        return this.f19755c;
    }

    @Override // xh.h
    public final void serialize(ai.d dVar, Object obj) {
        l.f("value", obj);
        dVar.a().getClass();
        l.f("typeArgumentsSerializers", this.f19754b);
        dVar.j(this.f19753a, obj);
    }
}
