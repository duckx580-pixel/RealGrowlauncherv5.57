package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f3998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u5.n f3999b;

    public u(i iVar, u5.n nVar) {
        this.f3998a = iVar;
        this.f3999b = nVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        if (oVar instanceof s) {
            return !(oVar2 instanceof s) ? 1 : 0;
        }
        if (oVar2 instanceof s) {
            return -1;
        }
        i iVar = this.f3998a;
        return iVar == null ? oVar.d().compareTo(oVar2.d()) : (int) k3.a(iVar.c(this.f3999b, Arrays.asList(oVar, oVar2)).a().doubleValue());
    }
}
