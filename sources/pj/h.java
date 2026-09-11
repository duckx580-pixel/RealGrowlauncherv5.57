package pj;

import java.io.IOException;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.w;
import oj.z;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s f13545i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f13546r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f13547s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f13548t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ w f13549u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w f13550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(s sVar, long j, w wVar, z zVar, w wVar2, w wVar3) {
        super(2);
        this.f13545i = sVar;
        this.f13546r = j;
        this.f13547s = wVar;
        this.f13548t = zVar;
        this.f13549u = wVar2;
        this.f13550v = wVar3;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        if (iIntValue == 1) {
            s sVar = this.f13545i;
            if (sVar.f9662i) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            sVar.f9662i = true;
            if (jLongValue < this.f13546r) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            w wVar = this.f13547s;
            long jG = wVar.f9666i;
            z zVar = this.f13548t;
            if (jG == 4294967295L) {
                jG = zVar.g();
            }
            wVar.f9666i = jG;
            w wVar2 = this.f13549u;
            wVar2.f9666i = wVar2.f9666i == 4294967295L ? zVar.g() : 0L;
            w wVar3 = this.f13550v;
            wVar3.f9666i = wVar3.f9666i == 4294967295L ? zVar.g() : 0L;
        }
        return o.f13926a;
    }
}
