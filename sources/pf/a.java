package pf;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f13375i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f13376r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f13377s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f13378t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f13379u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f13380v;

    public a(h hVar) {
        c cVar = new c();
        cVar.f13385c = 0;
        cVar.f13384b = 0;
        cVar.f13383a = 0;
        this.f13376r = cVar;
        this.f13377s = new c();
        this.f13378t = new ArrayList();
        this.f13379u = 50;
        this.f13380v = 50;
        this.f13375i = hVar;
        D();
    }

    public static void t(c cVar, int i10, int i11) {
        if (cVar.f13384b != i10) {
            throw new IllegalArgumentException("can not find other lines with findInLine()");
        }
        cVar.f13383a = (cVar.f13383a - cVar.f13385c) + i11;
        cVar.f13385c = i11;
    }

    public final c A(int i10) {
        c cVar = new c();
        h hVar = this.f13375i;
        hVar.d(i10, 2);
        hVar.u(false);
        try {
            c cVarY = y(i10);
            int i11 = cVarY.f13383a;
            if (i11 == i10) {
                cVar.f13383a = i11;
                cVar.f13384b = cVarY.f13384b;
                cVar.f13385c = cVarY.f13385c;
            } else if (i11 < i10) {
                v(cVarY, i10, cVar);
            } else {
                u(cVarY, i10, cVar);
            }
            if (Math.abs(i10 - cVarY.f13383a) >= this.f13379u) {
                C(cVar.a());
            }
            hVar.E(false);
            return cVar;
        } catch (Throwable th2) {
            hVar.E(false);
            throw th2;
        }
    }

    public final c B(int i10, int i11) {
        c cVar = new c();
        h hVar = this.f13375i;
        hVar.f(i10, i11, 2);
        hVar.u(false);
        try {
            c cVarZ = z(i10);
            int i12 = cVarZ.f13384b;
            if (i12 == i10) {
                cVar.f13383a = cVarZ.f13383a;
                cVar.f13384b = i12;
                cVar.f13385c = cVarZ.f13385c;
                if (cVarZ.f13385c == i11) {
                    hVar.E(false);
                    return cVar;
                }
                t(cVar, i10, i11);
            } else if (i12 < i10) {
                x(cVarZ, i10, i11, cVar);
            } else {
                w(cVarZ, i10, i11, cVar);
            }
            if (Math.abs(cVarZ.f13384b - i10) > 50) {
                C(cVar.a());
            }
            hVar.E(false);
            return cVar;
        } catch (Throwable th2) {
            hVar.E(false);
            throw th2;
        }
    }

    public final synchronized void C(c cVar) {
        if (this.f13380v <= 0) {
            return;
        }
        this.f13378t.add(cVar);
        if (this.f13378t.size() > this.f13380v) {
            this.f13378t.remove(0);
        }
    }

    public final void D() {
        h hVar = this.f13375i;
        int i10 = hVar.f13394t;
        c cVar = this.f13377s;
        cVar.f13383a = i10;
        int size = hVar.f13391i.size() - 1;
        cVar.f13384b = size;
        cVar.f13385c = hVar.o(size).f13401r;
    }

    @Override // pf.j
    public final synchronized void i(h hVar, int i10, int i11, int i12, int i13, StringBuilder sb2) {
        try {
            ArrayList arrayList = new ArrayList();
            for (c cVar : this.f13378t) {
                int i14 = cVar.f13384b;
                if (i14 == i10) {
                    if (cVar.f13385c >= i11) {
                        arrayList.add(cVar);
                    }
                } else if (i14 > i10) {
                    if (i14 < i12) {
                        arrayList.add(cVar);
                    } else if (i14 == i12) {
                        arrayList.add(cVar);
                    } else {
                        cVar.f13383a -= sb2.length();
                        cVar.f13384b -= i12 - i10;
                    }
                }
            }
            this.f13378t.removeAll(arrayList);
            D();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // pf.j
    public final synchronized void m(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        try {
            for (c cVar : this.f13378t) {
                int i14 = cVar.f13384b;
                if (i14 == i10) {
                    if (cVar.f13385c >= i11) {
                        cVar.f13383a += charSequence.length();
                        cVar.f13384b = (i12 - i10) + cVar.f13384b;
                        cVar.f13385c = (cVar.f13385c + i13) - i11;
                    }
                } else if (i14 > i10) {
                    cVar.f13383a += charSequence.length();
                    cVar.f13384b = (i12 - i10) + cVar.f13384b;
                }
            }
            D();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void u(c cVar, int i10, c cVar2) {
        int i11 = cVar.f13383a;
        if (i11 < i10) {
            throw new IllegalArgumentException("Unable to find forward from method findIndexBackward()");
        }
        int i12 = cVar.f13384b;
        int iMax = cVar.f13385c;
        while (i11 > i10) {
            i11 -= iMax + 1;
            i12--;
            if (i12 == -1) {
                v(this.f13376r, i10, cVar2);
                return;
            } else {
                iMax = ((i) this.f13375i.f13391i.get(i12)).f13401r + Math.max(r5.d().f13423r - 1, 0);
            }
        }
        int i13 = i10 - i11;
        if (i13 > 0) {
            i12++;
            iMax = i13 - 1;
        }
        cVar2.f13385c = iMax;
        cVar2.f13384b = i12;
        cVar2.f13383a = i10;
    }

    public final void v(c cVar, int i10, c cVar2) {
        int i11 = cVar.f13383a;
        if (i11 > i10) {
            throw new IllegalArgumentException("Unable to find backward from method findIndexForward()");
        }
        int i12 = cVar.f13384b;
        int i13 = cVar.f13385c;
        h hVar = this.f13375i;
        ArrayList arrayList = hVar.f13391i;
        ArrayList arrayList2 = hVar.f13391i;
        int iMax = ((i) arrayList2.get(i12)).f13401r + Math.max(((i) arrayList.get(i12)).d().f13423r - 1, 0);
        int i14 = (iMax - i13) + i11;
        while (i14 < i10) {
            i12++;
            iMax = ((i) arrayList2.get(i12)).f13401r + Math.max(r0.d().f13423r - 1, 0);
            i14 += iMax + 1;
        }
        if (i14 > i10) {
            iMax -= i14 - i10;
        }
        cVar2.f13385c = iMax;
        cVar2.f13384b = i12;
        cVar2.f13383a = i10;
    }

    public final void w(c cVar, int i10, int i11, c cVar2) {
        int i12 = cVar.f13384b;
        if (i12 < i10) {
            throw new IllegalArgumentException("can not find forward from findLiCoBackward()");
        }
        int i13 = cVar.f13383a - cVar.f13385c;
        while (i12 > i10) {
            i iVar = (i) this.f13375i.f13391i.get(i12 - 1);
            i13 -= iVar.f13401r + iVar.d().f13423r;
            i12--;
        }
        cVar2.f13385c = 0;
        cVar2.f13384b = i12;
        cVar2.f13383a = i13;
        t(cVar2, i10, i11);
    }

    public final void x(c cVar, int i10, int i11, c cVar2) {
        int i12 = cVar.f13384b;
        if (i12 > i10) {
            throw new IllegalArgumentException("can not find backward from findLiCoForward()");
        }
        int i13 = cVar.f13383a - cVar.f13385c;
        while (i12 < i10) {
            i iVar = (i) this.f13375i.f13391i.get(i12);
            i13 += iVar.f13401r + iVar.d().f13423r;
            i12++;
        }
        cVar2.f13385c = 0;
        cVar2.f13384b = i12;
        cVar2.f13383a = i13;
        t(cVar2, i10, i11);
    }

    public final synchronized c y(int i10) {
        c cVar;
        try {
            cVar = this.f13376r;
            int i11 = i10;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f13378t.size(); i13++) {
                c cVar2 = (c) this.f13378t.get(i13);
                int iAbs = Math.abs(cVar2.f13383a - i10);
                if (iAbs < i11) {
                    i12 = i13;
                    cVar = cVar2;
                    i11 = iAbs;
                }
                if (iAbs <= this.f13379u) {
                    break;
                }
            }
            if (Math.abs(this.f13377s.f13383a - i10) < i11) {
                cVar = this.f13377s;
            }
            if (cVar != this.f13376r && cVar != this.f13377s) {
                Collections.swap(this.f13378t, i12, r7.size() - 1);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cVar;
    }

    public final synchronized c z(int i10) {
        c cVar;
        try {
            cVar = this.f13376r;
            int i11 = i10;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f13378t.size(); i13++) {
                c cVar2 = (c) this.f13378t.get(i13);
                int iAbs = Math.abs(cVar2.f13384b - i10);
                if (iAbs < i11) {
                    i12 = i13;
                    cVar = cVar2;
                    i11 = iAbs;
                }
                if (i11 <= 50) {
                    break;
                }
            }
            if (Math.abs(this.f13377s.f13384b - i10) < i11) {
                cVar = this.f13377s;
            }
            if (cVar != this.f13376r && cVar != this.f13377s) {
                Collections.swap(this.f13378t, i12, r7.size() - 1);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cVar;
    }

    @Override // pf.j
    public final void e(h hVar) {
    }
}
