package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(h1 h1Var) {
        z zVar = (z) this;
        int i10 = zVar.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int iJ = h1Var.j(this);
        zVar.memoizedSerializedSize = iJ;
        return iJ;
    }

    public abstract void c(n nVar);
}
