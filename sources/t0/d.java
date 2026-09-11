package t0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Iterator, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l[] f16236i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16237r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f16238s = true;

    public d(k kVar, l[] lVarArr) {
        this.f16236i = lVarArr;
        lVarArr[0].a(kVar.f16256d, Integer.bitCount(kVar.f16253a) * 2, 0);
        this.f16237r = 0;
        a();
    }

    public final void a() {
        int i10 = this.f16237r;
        l[] lVarArr = this.f16236i;
        l lVar = lVarArr[i10];
        if (lVar.f16259s < lVar.f16258r) {
            return;
        }
        while (-1 < i10) {
            int iB = b(i10);
            if (iB == -1) {
                l lVar2 = lVarArr[i10];
                int i11 = lVar2.f16259s;
                Object[] objArr = lVar2.f16257i;
                if (i11 < objArr.length) {
                    int length = objArr.length;
                    lVar2.f16259s = i11 + 1;
                    iB = b(i10);
                }
            }
            if (iB != -1) {
                this.f16237r = iB;
                return;
            }
            if (i10 > 0) {
                l lVar3 = lVarArr[i10 - 1];
                int i12 = lVar3.f16259s;
                int length2 = lVar3.f16257i.length;
                lVar3.f16259s = i12 + 1;
            }
            lVarArr[i10].a(k.f16252e.f16256d, 0, 0);
            i10--;
        }
        this.f16238s = false;
    }

    public final int b(int i10) {
        l[] lVarArr = this.f16236i;
        l lVar = lVarArr[i10];
        int i11 = lVar.f16259s;
        if (i11 < lVar.f16258r) {
            return i10;
        }
        Object[] objArr = lVar.f16257i;
        if (i11 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i11];
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>", obj);
        k kVar = (k) obj;
        if (i10 == 6) {
            l lVar2 = lVarArr[i10 + 1];
            Object[] objArr2 = kVar.f16256d;
            lVar2.a(objArr2, objArr2.length, 0);
        } else {
            lVarArr[i10 + 1].a(kVar.f16256d, Integer.bitCount(kVar.f16253a) * 2, 0);
        }
        return b(i10 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f16238s;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f16238s) {
            throw new NoSuchElementException();
        }
        Object next = this.f16236i[this.f16237r].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
