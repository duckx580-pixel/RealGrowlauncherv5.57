package we;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f19184c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q[][] f19186e = new q[5][];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f19187f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19182a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantReadWriteLock f19183b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Vector f19185d = new Vector();

    public p(p pVar) {
        this.f19184c = pVar;
        if (pVar != null) {
            pVar.f19185d.add(this);
        }
    }

    public final int a(com.google.protobuf.j jVar) {
        int i10;
        LinkedList linkedList;
        q[] qVarArr;
        p pVar;
        if (!this.f19187f) {
            return jVar.f4611a;
        }
        o oVarB = b(jVar.getClass());
        oVarB.f19180a.readLock().lock();
        try {
            int size = oVarB.f19181b.size();
            synchronized (this) {
                int i11 = 0;
                while (true) {
                    try {
                        q[][] qVarArr2 = this.f19186e;
                        linkedList = null;
                        if (i11 >= qVarArr2.length) {
                            qVarArr = null;
                            break;
                        }
                        qVarArr = qVarArr2[i11];
                        if (qVarArr != null && qVarArr.length >= size) {
                            qVarArr2[i11] = null;
                            break;
                        }
                        i11++;
                    } finally {
                    }
                }
            }
            if (qVarArr == null) {
                qVarArr = new q[size];
            }
            oVarB.f19181b.toArray(qVarArr);
            try {
                n6.i iVar = new n6.i();
                iVar.f12147a = false;
                LinkedList linkedList2 = null;
                for (int i12 = 0; i12 < size; i12++) {
                    try {
                        if ((jVar.f4611a & 1) != 0) {
                            break;
                        }
                        q qVar = qVarArr[i12];
                        qVar.c(jVar, iVar);
                        if (iVar.f12147a) {
                            if (linkedList2 == null) {
                                linkedList2 = new LinkedList();
                            }
                            linkedList2.add(qVar);
                        }
                        iVar.f12147a = false;
                    } catch (Throwable th2) {
                        th = th2;
                        linkedList = linkedList2;
                        if (linkedList != null) {
                            oVarB.f19180a.writeLock().lock();
                            try {
                                oVarB.f19181b.removeAll(linkedList);
                            } finally {
                            }
                        }
                        c(qVarArr);
                        throw th;
                    }
                }
                if (linkedList2 != null) {
                    oVarB.f19180a.writeLock().lock();
                    try {
                        oVarB.f19181b.removeAll(linkedList2);
                    } finally {
                    }
                }
                c(qVarArr);
                for (i10 = 0; i10 < this.f19185d.size() && (jVar.f4611a & 1) == 0; i10++) {
                    try {
                        pVar = (p) this.f19185d.get(i10);
                    } catch (IndexOutOfBoundsException unused) {
                        pVar = null;
                    }
                    if (pVar != null) {
                        pVar.a(jVar);
                    }
                }
                return jVar.f4611a;
            } catch (Throwable th3) {
                th = th3;
            }
        } finally {
            oVarB.f19180a.readLock().unlock();
        }
    }

    public final o b(Class cls) {
        HashMap map = this.f19182a;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f19183b;
        reentrantReadWriteLock.readLock().lock();
        try {
            o oVar = (o) map.get(cls);
            if (oVar != null) {
                return oVar;
            }
            reentrantReadWriteLock.writeLock().lock();
            try {
                o oVar2 = (o) map.get(cls);
                if (oVar2 == null) {
                    oVar2 = new o();
                    oVar2.f19180a = new ReentrantReadWriteLock();
                    oVar2.f19181b = new ArrayList();
                    map.put(cls, oVar2);
                }
                return oVar2;
            } finally {
                reentrantReadWriteLock.writeLock().unlock();
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        java.util.Arrays.fill(r4, (java.lang.Object) null);
        r3.f19186e[r0] = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void c(we.q[] r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 0
        L2:
            we.q[][] r1 = r3.f19186e     // Catch: java.lang.Throwable -> L14
            int r2 = r1.length     // Catch: java.lang.Throwable -> L14
            if (r0 >= r2) goto L19
            r1 = r1[r0]     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L16
            r1 = 0
            java.util.Arrays.fill(r4, r1)     // Catch: java.lang.Throwable -> L14
            we.q[][] r1 = r3.f19186e     // Catch: java.lang.Throwable -> L14
            r1[r0] = r4     // Catch: java.lang.Throwable -> L14
            goto L19
        L14:
            r4 = move-exception
            goto L1b
        L16:
            int r0 = r0 + 1
            goto L2
        L19:
            monitor-exit(r3)
            return
        L1b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: we.p.c(we.q[]):void");
    }

    public final void d(boolean z3) {
        if (this.f19184c == null && !z3) {
            throw new IllegalStateException("The event manager is set to be root, and can not be disabled");
        }
        this.f19187f = z3;
    }

    public final void e(Class cls, n nVar) {
        f(cls, new com.google.gson.internal.b(19, nVar));
    }

    public final n9.e f(Class cls, q qVar) {
        o oVarB = b(cls);
        ReentrantReadWriteLock reentrantReadWriteLock = oVarB.f19180a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ArrayList arrayList = oVarB.f19181b;
            if (arrayList.contains(qVar)) {
                return new n9.e(qVar);
            }
            arrayList.add(qVar);
            reentrantReadWriteLock.writeLock().unlock();
            return new n9.e(qVar);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}
