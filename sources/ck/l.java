package ck;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends ArrayList implements e {
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new k(super.iterator());
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "/" + ((String) stream().map(new ak.c(3)).collect(Collectors.joining("/")));
    }
}
