package kd;

import com.unity3d.ads.core.domain.work.UniversalRequestJob;

/* JADX INFO: loaded from: classes.dex */
public final class c extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public UniversalRequestJob f9565i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f9566r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9567s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f9568t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final UniversalRequestJob f9569u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(UniversalRequestJob universalRequestJob, wg.c cVar) {
        super(cVar);
        this.f9569u = universalRequestJob;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f9568t = obj;
        this.f9567s |= Integer.MIN_VALUE;
        return UniversalRequestJob.b(this.f9569u, this);
    }
}
