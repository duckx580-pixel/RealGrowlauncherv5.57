package vg;

import androidx.work.v;
import eh.e;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.l;
import wg.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18667i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f18668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ug.c f18669s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ug.c cVar, ug.c cVar2) {
        super(cVar);
        this.f18668r = eVar;
        this.f18669s = cVar2;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18667i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f18667i = 2;
            v.B(obj);
            return obj;
        }
        this.f18667i = 1;
        v.B(obj);
        e eVar = this.f18668r;
        l.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>", eVar);
        a0.c(2, eVar);
        return eVar.invoke(this.f18669s, this);
    }
}
