package oj;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f13059a = new a0(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f13061c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f13060b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i10 = 0; i10 < iHighestOneBit; i10++) {
            atomicReferenceArr[i10] = new AtomicReference();
        }
        f13061c = atomicReferenceArr;
    }

    public static final void a(a0 a0Var) {
        kotlin.jvm.internal.l.f("segment", a0Var);
        if (a0Var.f13054f != null || a0Var.f13055g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (a0Var.f13052d) {
            return;
        }
        AtomicReference atomicReference = f13061c[(int) (Thread.currentThread().getId() & (((long) f13060b) - 1))];
        a0 a0Var2 = f13059a;
        a0 a0Var3 = (a0) atomicReference.getAndSet(a0Var2);
        if (a0Var3 == a0Var2) {
            return;
        }
        int i10 = a0Var3 != null ? a0Var3.f13051c : 0;
        if (i10 >= 65536) {
            atomicReference.set(a0Var3);
            return;
        }
        a0Var.f13054f = a0Var3;
        a0Var.f13050b = 0;
        a0Var.f13051c = i10 + 8192;
        atomicReference.set(a0Var);
    }

    public static final a0 b() {
        AtomicReference atomicReference = f13061c[(int) (Thread.currentThread().getId() & (((long) f13060b) - 1))];
        a0 a0Var = f13059a;
        a0 a0Var2 = (a0) atomicReference.getAndSet(a0Var);
        if (a0Var2 == a0Var) {
            return new a0();
        }
        if (a0Var2 == null) {
            atomicReference.set(null);
            return new a0();
        }
        atomicReference.set(a0Var2.f13054f);
        a0Var2.f13054f = null;
        a0Var2.f13051c = 0;
        return a0Var2;
    }
}
