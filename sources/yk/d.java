package yk;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20473i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20474r;

    public d(int i10, int i11) {
        this.f20473i = i10;
        this.f20474r = i11;
    }

    public final String toString() {
        return "Version{major=" + this.f20473i + ", minor=" + this.f20474r + "}";
    }
}
