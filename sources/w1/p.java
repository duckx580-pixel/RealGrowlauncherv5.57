package w1;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.j implements eh.f {
    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        t tVar = (t) this.receiver;
        Resources resources = tVar.getContext().getResources();
        return Boolean.valueOf(h0.f18822a.a(tVar, null, new c1.a(new q2.c(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((f1.f) obj2).f5994a, (eh.c) obj3)));
    }
}
