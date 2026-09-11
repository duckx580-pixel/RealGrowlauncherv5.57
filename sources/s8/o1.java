package s8;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15524i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f15525r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f15526s;

    public /* synthetic */ o1(v1 v1Var, AtomicReference atomicReference, int i10) {
        this.f15524i = i10;
        this.f15526s = v1Var;
        this.f15525r = atomicReference;
    }

    private final void a() {
        synchronized (this.f15525r) {
            try {
                try {
                    AtomicReference atomicReference = this.f15525r;
                    y0 y0Var = (y0) this.f15526s.f3470r;
                    atomicReference.set(Integer.valueOf(y0Var.w.x(y0Var.o().x(), z.M)));
                } finally {
                    this.f15525r.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f15524i) {
            case 0:
                synchronized (this.f15525r) {
                    try {
                        try {
                            AtomicReference atomicReference = this.f15525r;
                            y0 y0Var = (y0) this.f15526s.f3470r;
                            atomicReference.set(Boolean.valueOf(y0Var.w.C(y0Var.o().x(), z.J)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                synchronized (this.f15525r) {
                    try {
                        try {
                            AtomicReference atomicReference2 = this.f15525r;
                            y0 y0Var2 = (y0) this.f15526s.f3470r;
                            g gVar = y0Var2.w;
                            String strX = y0Var2.o().x();
                            y yVar = z.K;
                            if (strX == null) {
                                gVar.getClass();
                                str = (String) yVar.a(null);
                            } else {
                                str = (String) yVar.a(gVar.f15343t.i(strX, yVar.f15652a));
                            }
                            atomicReference2.set(str);
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                synchronized (this.f15525r) {
                    try {
                        try {
                            AtomicReference atomicReference3 = this.f15525r;
                            y0 y0Var3 = (y0) this.f15526s.f3470r;
                            atomicReference3.set(Long.valueOf(y0Var3.w.z(y0Var3.o().x(), z.L)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                a();
                return;
            default:
                synchronized (this.f15525r) {
                    try {
                        try {
                            AtomicReference atomicReference4 = this.f15525r;
                            y0 y0Var4 = (y0) this.f15526s.f3470r;
                            atomicReference4.set(Double.valueOf(y0Var4.w.v(y0Var4.o().x(), z.N)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
