package sk;

import com.rtsoft.growtopia.R;
import org.joni.ast.QuantifierNode;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements uk.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f15859i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lk.a f15860r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f15861s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f15862t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15863u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[][] f15864v;
    public int w;

    public c(a aVar) {
        this.f15859i = aVar;
        p pVar = aVar.f15898z;
        this.f15861s = pVar;
        this.f15860r = pVar.f15947p;
    }

    public static boolean l(int i10) {
        return i10 == 7 || i10 == 11 || i10 == 12 || i10 == 13 || i10 == 15 || i10 == 99;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        int i12 = this.f15863u + i11;
        int[] iArr = this.f15862t;
        if (i12 >= iArr.length) {
            int length = iArr.length;
            do {
                length <<= 1;
            } while (length <= i12);
            int[] iArr2 = new int[length];
            int[] iArr3 = this.f15862t;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            this.f15862t = iArr2;
        }
        int i13 = i11 + i10;
        while (i10 < i13) {
            int[] iArr4 = this.f15862t;
            int i14 = this.f15863u;
            this.f15863u = i14 + 1;
            iArr4[i14] = bArr[i10];
            i10++;
        }
    }

    public final void b(byte[] bArr, int i10, int i11, int i12, boolean z3) {
        int iN = n(i11, i12, z3);
        d(iN);
        if (iN == 13) {
            d(i11);
        }
        if (l(iN)) {
            if (iN == 15 || iN == 99) {
                d(i12);
            } else {
                d(i12 / i11);
            }
        }
        if (!g.C || !l(iN)) {
            a(bArr, i10, i12);
            return;
        }
        d(this.w);
        d(i10);
        int i13 = this.w;
        if (i13 == 0) {
            this.f15864v = new byte[2][];
        } else {
            byte[][] bArr2 = this.f15864v;
            if (i13 == bArr2.length) {
                byte[][] bArr3 = new byte[i13 * 2][];
                System.arraycopy(bArr2, 0, bArr3, 0, i13);
                this.f15864v = bArr3;
            }
        }
        byte[][] bArr4 = this.f15864v;
        int i14 = this.w;
        this.w = i14 + 1;
        bArr4[i14] = bArr;
    }

    public final int c(int i10, int i11, boolean z3) {
        int i12;
        int iN = n(i10, i11, z3);
        if (g.C && l(iN)) {
            i12 = 4;
        } else {
            i12 = i11 + (l(iN) ? 2 : 1);
        }
        return iN == 13 ? i12 + 1 : i12;
    }

    public final void d(int i10) {
        int i11 = this.f15863u;
        int[] iArr = this.f15862t;
        if (i11 >= iArr.length) {
            int[] iArr2 = new int[iArr.length << 1];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f15862t = iArr2;
        }
        int[] iArr3 = this.f15862t;
        int i12 = this.f15863u;
        this.f15863u = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void e(int[] iArr, int i10) {
        int i11 = this.f15863u + i10;
        int[] iArr2 = this.f15862t;
        if (i11 >= iArr2.length) {
            int length = iArr2.length;
            do {
                length <<= 1;
            } while (length <= i11);
            int[] iArr3 = new int[length];
            int[] iArr4 = this.f15862t;
            System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
            this.f15862t = iArr3;
        }
        System.arraycopy(iArr, 0, this.f15862t, this.f15863u, i10);
        this.f15863u += i10;
    }

    public final void f(int i10, int i11) {
        d(i10);
        d(i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:232:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x024e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(org.joni.ast.j r12) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.c.g(org.joni.ast.j):int");
    }

    public final void h(QuantifierNode quantifierNode, int i10, int i11) {
        p pVar = this.f15861s;
        pVar.f15935c = true;
        int i12 = pVar.f15937e;
        d(quantifierNode.greedy ? 66 : 67);
        d(i12);
        pVar.f15937e++;
        d(i10 + 2);
        int i13 = quantifierNode.lower;
        int i14 = quantifierNode.upper;
        int[] iArr = pVar.f15944m;
        if (iArr == null) {
            pVar.f15944m = new int[8];
            pVar.f15945n = new int[8];
        } else if (i12 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 8];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            pVar.f15944m = iArr2;
            int[] iArr3 = pVar.f15945n;
            int[] iArr4 = new int[iArr3.length + 8];
            System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            pVar.f15945n = iArr4;
        }
        pVar.f15944m[i12] = i13;
        int[] iArr5 = pVar.f15945n;
        if (QuantifierNode.isRepeatInfinite(i14)) {
            i14 = Integer.MAX_VALUE;
        }
        iArr5[i12] = i14;
        j(quantifierNode.target, i11);
        if ((!g.f15872f || pVar.f15940h <= 0) && !quantifierNode.isInRepeat()) {
            d(quantifierNode.greedy ? 68 : 69);
        } else {
            d(quantifierNode.greedy ? 70 : 71);
        }
        d(i12);
    }

    public final void i(org.joni.ast.j jVar) {
        int i10;
        int i11;
        int type = jVar.getType();
        lk.a aVar = this.f15860r;
        int i12 = 0;
        p pVar = this.f15861s;
        switch (type) {
            case 0:
                org.joni.ast.m mVar = (org.joni.ast.m) jVar;
                if (mVar.d()) {
                    if (mVar.e() <= 0) {
                        return;
                    }
                    b(mVar.f13176a, mVar.f13177b, 1, mVar.e(), false);
                    return;
                }
                if (mVar.e() <= 0) {
                    return;
                }
                boolean zC = mVar.c();
                int i13 = mVar.f13177b;
                int i14 = mVar.f13178c;
                byte[] bArr = mVar.f13176a;
                int iS = aVar.s(bArr, i13, i14);
                int i15 = iS;
                int i16 = i13 + iS;
                int i17 = i13;
                int i18 = i15;
                while (i16 < i14) {
                    int iS2 = aVar.s(bArr, i16, i14);
                    if (iS2 == i18 || zC) {
                        i15 += iS2;
                    } else {
                        b(bArr, i17, i18, i15, zC);
                        i17 = i16;
                        i18 = iS2;
                        i15 = i18;
                    }
                    i16 += iS2;
                }
                b(bArr, i17, i18, i15, zC);
                return;
            case 1:
                org.joni.ast.d dVar = (org.joni.ast.d) jVar;
                bk.c cVar = dVar.f13147c;
                d dVar2 = dVar.f13146b;
                if (cVar == null) {
                    if (dVar.h()) {
                        d(19);
                    } else {
                        d(16);
                    }
                    e(dVar2.f15866a, 8);
                    return;
                }
                if (aVar.f10072i > 1 || dVar2.e()) {
                    if (dVar.h()) {
                        d(20);
                    } else {
                        d(17);
                    }
                    bk.c cVar2 = dVar.f13147c;
                    d(cVar2.f3252s);
                    e(cVar2.f3251r, cVar2.f3252s);
                    return;
                }
                if (dVar.h()) {
                    d(21);
                } else {
                    d(18);
                }
                e(dVar2.f15866a, 8);
                bk.c cVar3 = dVar.f13147c;
                d(cVar3.f3252s);
                e(cVar3.f3251r, cVar3.f3252s);
                return;
            case 2:
                org.joni.ast.e eVar = (org.joni.ast.e) jVar;
                int i19 = eVar.f13148a;
                boolean z3 = eVar.f13150c;
                if (i19 == 12) {
                    d(eVar.f13149b ? z3 ? 35 : 29 : z3 ? 34 : 28);
                    return;
                } else {
                    m();
                    throw null;
                }
            case 3:
                if (e.i(pVar.f15948q)) {
                    d(23);
                    return;
                } else {
                    d(22);
                    return;
                }
            case 4:
                org.joni.ast.c cVar4 = (org.joni.ast.c) jVar;
                int[] iArr = cVar4.f13142a;
                if (g.f15874h && cVar4.isNestLevel()) {
                    d(52);
                    d(pVar.f15948q & 1);
                    d(cVar4.f13144c);
                    d(cVar4.f13143b);
                    for (int i20 = cVar4.f13143b - 1; i20 >= 0; i20--) {
                        d(iArr[i20]);
                    }
                    return;
                }
                if (cVar4.f13143b != 1) {
                    if (e.h(pVar.f15948q)) {
                        d(51);
                    } else {
                        d(50);
                    }
                    d(cVar4.f13143b);
                    for (int i21 = cVar4.f13143b - 1; i21 >= 0; i21--) {
                        d(iArr[i21]);
                    }
                    return;
                }
                if (e.h(pVar.f15948q)) {
                    d(49);
                    d(iArr[0]);
                    return;
                }
                int i22 = iArr[0];
                if (i22 == 1) {
                    d(46);
                    return;
                } else if (i22 == 2) {
                    d(47);
                    return;
                } else {
                    d(48);
                    d(iArr[0]);
                    return;
                }
            case 5:
                if (!g.f15884s) {
                    QuantifierNode quantifierNode = (QuantifierNode) jVar;
                    pVar.f15935c = true;
                    boolean zIsRepeatInfinite = QuantifierNode.isRepeatInfinite(quantifierNode.upper);
                    int i23 = quantifierNode.targetEmptyInfo;
                    int iG = g(quantifierNode.target);
                    if (quantifierNode.isAnyCharStar()) {
                        k(quantifierNode.target, quantifierNode.lower);
                        if (quantifierNode.nextHeadExact == null) {
                            if (e.i(pVar.f15948q)) {
                                d(25);
                                return;
                            } else {
                                d(24);
                                return;
                            }
                        }
                        if (e.i(pVar.f15948q)) {
                            d(27);
                        } else {
                            d(26);
                        }
                        org.joni.ast.m mVar2 = (org.joni.ast.m) quantifierNode.nextHeadExact;
                        a(mVar2.f13176a, mVar2.f13177b, 1);
                        return;
                    }
                    int i24 = i23 != 0 ? iG + 4 : iG;
                    if (!zIsRepeatInfinite || ((i10 = quantifierNode.lower) > 1 && iG * i10 > 50)) {
                        int i25 = quantifierNode.upper;
                        if (i25 == 0 && quantifierNode.isRefered) {
                            f(61, iG);
                            i(quantifierNode.target);
                            return;
                        }
                        if (zIsRepeatInfinite || !quantifierNode.greedy || (i25 != 1 && (iG + 2) * i25 > 50)) {
                            if (quantifierNode.greedy || i25 != 1 || quantifierNode.lower != 0) {
                                h(quantifierNode, i24, i23);
                                return;
                            }
                            f(62, 2);
                            f(61, iG);
                            i(quantifierNode.target);
                            return;
                        }
                        int i26 = quantifierNode.lower;
                        int i27 = i25 - i26;
                        k(quantifierNode.target, i26);
                        for (int i28 = 0; i28 < i27; i28++) {
                            int i29 = i27 - i28;
                            f(62, ((i29 - 1) * 2) + (i29 * iG));
                            i(quantifierNode.target);
                        }
                        return;
                    }
                    if (i10 != 1 || iG <= 50) {
                        k(quantifierNode.target, i10);
                    } else if (!quantifierNode.greedy) {
                        f(61, 2);
                    } else if (quantifierNode.headExact == null && quantifierNode.nextHeadExact == null) {
                        f(61, 2);
                    } else {
                        f(61, 3);
                    }
                    if (!quantifierNode.greedy) {
                        f(61, i24);
                        j(quantifierNode.target, i23);
                        f(62, -(i24 + 2));
                        return;
                    }
                    if (quantifierNode.headExact != null) {
                        f(64, i24 + 2);
                        org.joni.ast.m mVar3 = (org.joni.ast.m) quantifierNode.headExact;
                        a(mVar3.f13176a, mVar3.f13177b, 1);
                        j(quantifierNode.target, i23);
                        f(61, -(i24 + 5));
                        return;
                    }
                    if (quantifierNode.nextHeadExact == null) {
                        f(62, i24 + 2);
                        j(quantifierNode.target, i23);
                        f(61, -(i24 + 4));
                        return;
                    } else {
                        f(65, i24 + 2);
                        org.joni.ast.m mVar4 = (org.joni.ast.m) quantifierNode.nextHeadExact;
                        a(mVar4.f13176a, mVar4.f13177b, 1);
                        j(quantifierNode.target, i23);
                        f(61, -(i24 + 5));
                        return;
                    }
                }
                QuantifierNode quantifierNode2 = (QuantifierNode) jVar;
                pVar.f15935c = true;
                boolean zIsRepeatInfinite2 = QuantifierNode.isRepeatInfinite(quantifierNode2.upper);
                int i30 = quantifierNode2.targetEmptyInfo;
                int iG2 = g(quantifierNode2.target);
                int i31 = pVar.f15939g > 0 ? quantifierNode2.combExpCheckNum : 0;
                if (quantifierNode2.isAnyCharStar()) {
                    k(quantifierNode2.target, quantifierNode2.lower);
                    if (quantifierNode2.nextHeadExact != null && i31 <= 0) {
                        if (e.i(pVar.f15948q)) {
                            d(27);
                        } else {
                            d(26);
                        }
                        if (i31 > 0) {
                            d(i31);
                        }
                        org.joni.ast.m mVar5 = (org.joni.ast.m) quantifierNode2.nextHeadExact;
                        a(mVar5.f13176a, mVar5.f13177b, 1);
                        return;
                    }
                    if (e.i(pVar.f15948q)) {
                        if (i31 > 0) {
                            d(95);
                        } else {
                            d(25);
                        }
                    } else if (i31 > 0) {
                        d(94);
                    } else {
                        d(24);
                    }
                    if (i31 > 0) {
                        d(i31);
                        return;
                    }
                    return;
                }
                int i32 = i30 != 0 ? iG2 + 4 : iG2;
                if (zIsRepeatInfinite2 && (i11 = quantifierNode2.lower) <= 1) {
                    if (quantifierNode2.greedy) {
                        if (i11 == 1) {
                            f(61, i31 > 0 ? 3 : 2);
                        }
                        if (i31 > 0) {
                            d(91);
                            d(i31);
                            d(i32 + 2);
                        } else {
                            f(62, i32 + 2);
                        }
                        j(quantifierNode2.target, i30);
                        f(61, -(i32 + 2 + (i31 <= 0 ? 2 : 3)));
                        return;
                    }
                    if (i11 == 0) {
                        f(61, i32);
                    }
                    j(quantifierNode2.target, i30);
                    if (i31 <= 0) {
                        f(62, -(i32 + 2));
                        return;
                    }
                    d(92);
                    d(i31);
                    d(-(i32 + 3));
                    return;
                }
                int i33 = quantifierNode2.upper;
                if (i33 == 0) {
                    if (quantifierNode2.isRefered) {
                        f(61, iG2);
                        i(quantifierNode2.target);
                        return;
                    }
                    return;
                }
                if (i33 == 1 && quantifierNode2.greedy) {
                    if (quantifierNode2.lower == 0) {
                        if (i31 > 0) {
                            d(91);
                            d(i31);
                            d(iG2);
                        } else {
                            f(62, iG2);
                        }
                    }
                    i(quantifierNode2.target);
                    return;
                }
                if (quantifierNode2.greedy || i33 != 1 || quantifierNode2.lower != 0) {
                    h(quantifierNode2, i32, i30);
                    if (i31 > 0) {
                        d(93);
                        d(i31);
                        return;
                    }
                    return;
                }
                if (i31 > 0) {
                    d(91);
                    d(i31);
                    d(2);
                } else {
                    f(62, 2);
                }
                f(61, iG2);
                i(quantifierNode2.target);
                return;
            case 6:
                org.joni.ast.g gVar = (org.joni.ast.g) jVar;
                int i34 = gVar.f13157a;
                if ((i34 & 2) != 0) {
                    int i35 = pVar.f15948q;
                    int i36 = g.f15867a;
                    pVar.f15948q = gVar.f13159c;
                    i(gVar.f13160d);
                    pVar.f15948q = i35;
                    return;
                }
                if (i34 == 1) {
                    boolean z10 = g.f15872f;
                    if (z10 && gVar.isCalled()) {
                        pVar.f15935c = true;
                        d(88);
                        gVar.f13161e = this.f15863u + 3;
                        gVar.setAddrFixed();
                        d(gVar.f13161e);
                        int iG3 = g(gVar.f13160d);
                        e.a(pVar.f15942k, gVar.f13158b);
                        f(61, iG3 + 5);
                    }
                    if (e.a(pVar.j, gVar.f13158b)) {
                        pVar.f15935c = true;
                        d(54);
                    } else {
                        d(53);
                    }
                    d(gVar.f13158b);
                    i(gVar.f13160d);
                    if (z10 && gVar.isCalled()) {
                        if (e.a(pVar.f15942k, gVar.f13158b)) {
                            d(gVar.isRecursion() ? 56 : 55);
                        } else {
                            d(gVar.isRecursion() ? 58 : 57);
                        }
                        d(gVar.f13158b);
                        d(89);
                        return;
                    }
                    if (z10 && gVar.isRecursion()) {
                        if (e.a(pVar.f15942k, gVar.f13158b)) {
                            d(56);
                        } else {
                            d(58);
                        }
                        d(gVar.f13158b);
                        return;
                    }
                    if (e.a(pVar.f15942k, gVar.f13158b)) {
                        d(55);
                    } else {
                        d(57);
                    }
                    d(gVar.f13158b);
                    return;
                }
                if (i34 == 4) {
                    pVar.f15935c = true;
                    if (!gVar.isStopBtSimpleRepeat()) {
                        d(80);
                        i(gVar.f13160d);
                        d(81);
                        return;
                    }
                    QuantifierNode quantifierNode3 = (QuantifierNode) gVar.f13160d;
                    k(quantifierNode3.target, quantifierNode3.lower);
                    int iG4 = g(quantifierNode3.target);
                    f(62, iG4 + 3);
                    i(quantifierNode3.target);
                    d(63);
                    f(61, -(iG4 + 5));
                    return;
                }
                if (i34 != 8) {
                    if (i34 != 16) {
                        m();
                        throw null;
                    }
                    pVar.f15935c = true;
                    int iG5 = g(gVar.f13160d);
                    d(85);
                    f(86, iG5 + 1);
                    i(gVar.f13160d);
                    d(87);
                    return;
                }
                d(90);
                d(gVar.f13158b);
                if (gVar.f13160d.getType() != 9) {
                    m();
                    throw null;
                }
                org.joni.ast.h hVar = (org.joni.ast.h) gVar.f13160d;
                int iG6 = g(hVar.f13166a);
                org.joni.ast.h hVar2 = hVar.f13167b;
                if (hVar2 == null) {
                    m();
                    throw null;
                }
                int iG7 = g(hVar2.f13166a);
                if (hVar2.f13167b != null) {
                    throw new uk.d("invalid conditional pattern");
                }
                org.joni.ast.h hVar3 = (org.joni.ast.h) gVar.f13160d;
                d(iG6 + 2);
                i(hVar3.f13166a);
                f(61, iG7);
                i(hVar3.f13167b.f13166a);
                return;
            case 7:
                org.joni.ast.a aVar2 = (org.joni.ast.a) jVar;
                int i37 = aVar2.f13138a;
                boolean z11 = aVar2.f13139b;
                if (i37 == 1) {
                    d(40);
                    return;
                }
                if (i37 == 2) {
                    d(42);
                    return;
                }
                a aVar3 = this.f15859i;
                switch (i37) {
                    case 4:
                        d(45);
                        return;
                    case 8:
                        d(41);
                        return;
                    case 16:
                        d(44);
                        return;
                    case R.styleable.AppCompatTheme_activityChooserViewStyle /* 32 */:
                        d(43);
                        return;
                    case R.styleable.AppCompatTheme_dropDownListViewStyle /* 64 */:
                        if (z11) {
                            d(36);
                            return;
                        } else {
                            d(30);
                            return;
                        }
                    case 128:
                        if (z11) {
                            d(37);
                            return;
                        } else {
                            d(31);
                            return;
                        }
                    case 256:
                        if (g.f15881p) {
                            if (z11) {
                                d(38);
                                return;
                            } else {
                                d(32);
                                return;
                            }
                        }
                        return;
                    case 512:
                        if (g.f15881p) {
                            if (z11) {
                                d(39);
                                return;
                            } else {
                                d(33);
                                return;
                            }
                        }
                        return;
                    case 1024:
                        pVar.f15935c = true;
                        d(76);
                        i(aVar2.f13140c);
                        d(77);
                        return;
                    case 2048:
                        pVar.f15935c = true;
                        f(78, g(aVar2.f13140c) + 1);
                        i(aVar2.f13140c);
                        d(79);
                        return;
                    case 4096:
                        d(82);
                        int iQ = aVar2.f13141d;
                        if (iQ < 0) {
                            iQ = aVar3.Q(aVar2.f13140c, 0);
                            if (aVar3.D != 0) {
                                throw new uk.d("invalid pattern in look-behind");
                            }
                        }
                        d(iQ);
                        i(aVar2.f13140c);
                        return;
                    case 8192:
                        pVar.f15935c = true;
                        f(83, g(aVar2.f13140c) + 1);
                        int iQ2 = aVar2.f13141d;
                        if (iQ2 < 0) {
                            iQ2 = aVar3.Q(aVar2.f13140c, 0);
                            if (aVar3.D != 0) {
                                throw new uk.d("invalid pattern in look-behind");
                            }
                        }
                        d(iQ2);
                        i(aVar2.f13140c);
                        d(84);
                        return;
                    case 65536:
                        d(59);
                        return;
                    default:
                        m();
                        throw null;
                }
            case 8:
                org.joni.ast.h hVar4 = (org.joni.ast.h) jVar;
                do {
                    i(hVar4.f13166a);
                    hVar4 = hVar4.f13167b;
                } while (hVar4 != null);
                return;
            case 9:
                org.joni.ast.h hVar5 = (org.joni.ast.h) jVar;
                org.joni.ast.h hVar6 = hVar5;
                do {
                    int iG8 = g(hVar6.f13166a) + i12;
                    hVar6 = hVar6.f13167b;
                    if (hVar6 != null) {
                        iG8 += 4;
                    }
                    i12 = iG8;
                } while (hVar6 != null);
                int i38 = this.f15863u + i12;
                do {
                    int iG9 = g(hVar5.f13166a);
                    if (hVar5.f13167b != null) {
                        pVar.f15935c = true;
                        f(62, iG9 + 2);
                    }
                    i(hVar5.f13166a);
                    if (hVar5.f13167b != null) {
                        f(61, i38 - (this.f15863u + 2));
                    }
                    hVar5 = hVar5.f13167b;
                } while (hVar5 != null);
                return;
            case 10:
                if (g.f15872f) {
                    org.joni.ast.f fVar = (org.joni.ast.f) jVar;
                    d(88);
                    af.a aVar4 = fVar.f13156f;
                    int i39 = this.f15863u;
                    org.joni.ast.g gVar2 = fVar.f13155e;
                    int i40 = aVar4.f596b;
                    if (i40 >= ((int[]) aVar4.f598d).length) {
                        org.joni.ast.g[] gVarArr = (org.joni.ast.g[]) aVar4.f597c;
                        org.joni.ast.g[] gVarArr2 = new org.joni.ast.g[gVarArr.length << 1];
                        System.arraycopy(gVarArr, 0, gVarArr2, 0, i40);
                        aVar4.f597c = gVarArr2;
                        int[] iArr2 = (int[]) aVar4.f598d;
                        int[] iArr3 = new int[iArr2.length << 1];
                        System.arraycopy(iArr2, 0, iArr3, 0, aVar4.f596b);
                        aVar4.f598d = iArr3;
                    }
                    org.joni.ast.g[] gVarArr3 = (org.joni.ast.g[]) aVar4.f597c;
                    int i41 = aVar4.f596b;
                    gVarArr3[i41] = gVar2;
                    ((int[]) aVar4.f598d)[i41] = i39;
                    aVar4.f596b = i41 + 1;
                    d(0);
                    return;
                }
                return;
            default:
                m();
                throw null;
        }
    }

    public final void j(org.joni.ast.j jVar, int i10) {
        p pVar = this.f15861s;
        int i11 = pVar.f15938f;
        if (i10 != 0) {
            pVar.f15935c = true;
            d(72);
            d(pVar.f15938f);
            pVar.f15938f++;
        }
        i(jVar);
        if (i10 != 0) {
            if (i10 == 1) {
                d(73);
            } else if (i10 == 2) {
                d(74);
            } else if (i10 == 3) {
                d(75);
            }
            d(i11);
        }
    }

    public final void k(org.joni.ast.j jVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            i(jVar);
        }
    }

    public final void m() {
        throw new uk.b("internal parser error (bug)");
    }

    public final int n(int i10, int i11, boolean z3) {
        int i12 = ((i11 + i10) - 1) / i10;
        if (z3) {
            lk.a aVar = this.f15860r;
            return i12 != 1 ? aVar.B() != null ? 99 : 15 : aVar.B() != null ? 98 : 14;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return i10 != 3 ? 13 : 12;
            }
            if (i12 == 1) {
                return 8;
            }
            if (i12 != 2) {
                return i12 != 3 ? 11 : 10;
            }
            return 9;
        }
        if (i12 == 1) {
            return 2;
        }
        if (i12 == 2) {
            return 3;
        }
        if (i12 == 3) {
            return 4;
        }
        if (i12 != 4) {
            return i12 != 5 ? 7 : 6;
        }
        return 5;
    }
}
