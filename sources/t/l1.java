package t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface l1 {
    boolean a();

    long b(o oVar, o oVar2, o oVar3);

    o d(long j, o oVar, o oVar2, o oVar3);

    default o n(o oVar, o oVar2, o oVar3) {
        return r(b(oVar, oVar2, oVar3), oVar, oVar2, oVar3);
    }

    o r(long j, o oVar, o oVar2, o oVar3);
}
