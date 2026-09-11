package ml;

import al.h;
import com.google.gson.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import ll.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f11824a;

    public a(j jVar) {
        this.f11824a = jVar;
    }

    @Override // ll.i
    public final ll.j a(Type type) {
        qb.a aVar = new qb.a(type);
        j jVar = this.f11824a;
        return new b(jVar, jVar.c(aVar));
    }

    @Override // ll.i
    public final ll.j b(Type type, Annotation[] annotationArr, h hVar) {
        qb.a aVar = new qb.a(type);
        j jVar = this.f11824a;
        return new x7.h(14, jVar, jVar.c(aVar));
    }
}
