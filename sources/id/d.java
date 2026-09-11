package id;

import java.util.Map;
import ue.c0;

/* JADX INFO: loaded from: classes.dex */
public final class d extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f8268i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map f8269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Double f8270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c0 f8271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c0 f8272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c0 f8273v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f8274x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f8275y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, wg.c cVar) {
        super(cVar);
        this.f8275y = eVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f8274x = obj;
        this.w |= Integer.MIN_VALUE;
        return this.f8275y.a(null, null, null, this);
    }
}
