package com.google.gson;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.google.gson.internal.m f4533i = new com.google.gson.internal.m(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof q) && ((q) obj).f4533i.equals(this.f4533i);
        }
        return true;
    }

    public final int hashCode() {
        return this.f4533i.hashCode();
    }

    public final n n(String str) {
        return (n) this.f4533i.get(str);
    }
}
