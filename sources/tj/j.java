package tj;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import u5.s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f17365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yj.g f17366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m f17369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f17370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f17371g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f17372h;

    static {
        tf.e.a(j.class.getName());
    }

    public j(e eVar, yj.g gVar, boolean z3, int i10, m mVar, l lVar) {
        this.f17365a = eVar;
        this.f17366b = gVar;
        this.f17367c = z3;
        this.f17368d = i10;
        this.f17369e = mVar;
        this.f17370f = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(tj.e r22, yj.g r23, boolean r24, tj.m r25, tj.l r26, java.util.List r27, yj.a[] r28) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tj.j.a(tj.e, yj.g, boolean, tj.m, tj.l, java.util.List, yj.a[]):void");
    }

    public static mf.a b(e eVar, yj.g gVar, boolean z3, int i10, m mVar, l lVar, boolean z10, Duration duration) {
        long j;
        long j10;
        int i11;
        yj.a[] aVarArr;
        int i12;
        int i13;
        Object obj;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        String str;
        int i16;
        j jVar = new j(eVar, gVar, z3, i10, mVar, lVar);
        long millis = duration.toMillis();
        jVar.f17372h = false;
        if (z10) {
            boolean z13 = jVar.f17367c;
            int i17 = jVar.f17368d;
            m mVar2 = jVar.f17369e;
            int i18 = mVar2.f17382f ? 0 : -1;
            ArrayList arrayList = new ArrayList();
            for (m mVar3 = mVar2; mVar3 != null; mVar3 = mVar3.f17380d) {
                ek.j jVarD = eVar.d(mVar3.f17381e);
                if (jVarD instanceof ek.b) {
                    arrayList.add(new g(mVar3, (ek.b) jVarD));
                }
            }
            int i19 = i18;
            boolean z14 = z13;
            int i20 = i19;
            int i21 = i17;
            int size = arrayList.size() - 1;
            while (size >= 0) {
                g gVar2 = (g) arrayList.get(size);
                ek.b bVar = gVar2.f17361b;
                m mVar4 = gVar2.f17360a;
                af.a aVar = mVar4.f17385i;
                String str2 = mVar4.f17383g;
                int i22 = size;
                m mVar5 = mVar4.f17380d;
                boolean z15 = i20 == i21;
                ek.h hVar = bVar.f5521i;
                j = millis;
                boolean z16 = bVar.j;
                c6.a aVar2 = bVar.f5525n;
                if (aVar2 == null) {
                    z12 = z16;
                    str = str2;
                    aVar2 = new c6.a(1, false);
                    if (z12) {
                        hVar = new ek.h(hVar.f5537a, hVar.f5538b);
                    }
                    aVar2.a(hVar);
                    bVar.f5525n = aVar2;
                } else {
                    z12 = z16;
                    str = str2;
                }
                if (z12) {
                    aVar2.g(0, str == null ? "\uffff" : str);
                }
                ek.d dVarB = aVar2.b(z14, z15);
                zj.a aVarN = dVarB.f5527a.n(gVar, i21);
                if (aVarN != null) {
                    yj.a[] aVarArr2 = aVarN.f21373b;
                    if (-2 == dVarB.f5528b[aVarN.f21372a].f5556a) {
                        if (aVarArr2.length > 0) {
                            int i23 = aVarArr2[0].f20445a;
                            lVar.getClass();
                            lVar.b(aVar, i23);
                            i16 = i22;
                            a(eVar, gVar, z14, mVar4, lVar, gVar2.f17361b.f5520h, aVarN.f21373b);
                            lVar.b(aVar, aVarArr2[0].f20446b);
                            i20 = aVarArr2[0].f20446b;
                            if (i20 > i21) {
                                i21 = i20;
                                z14 = false;
                            }
                        } else {
                            i16 = i22;
                        }
                        size = i16 - 1;
                        millis = j;
                    }
                }
                mVar2 = mVar5;
                break;
            }
            j = millis;
            jVar.f17369e = mVar2;
            jVar.f17368d = i21;
            jVar.f17367c = z14;
            jVar.f17371g = i20;
        } else {
            j = millis;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (!jVar.f17372h) {
            if (j > 0 && System.currentTimeMillis() - jCurrentTimeMillis > j) {
                return new mf.a(jVar.f17369e, true);
            }
            yj.g gVar3 = jVar.f17366b;
            String str3 = gVar3.f20450a;
            boolean z17 = jVar.f17367c;
            int i24 = jVar.f17368d;
            m mVar6 = jVar.f17369e;
            int i25 = jVar.f17371g;
            ek.m mVar7 = mVar6.f17381e;
            e eVar2 = jVar.f17365a;
            ek.d dVarB2 = eVar2.d(mVar7).b(eVar2, mVar6.f17383g, z17, i24 == i25);
            zj.a aVarN2 = dVarB2.f5527a.n(gVar3, i24);
            s sVar = aVarN2 != null ? new s(dVarB2.f5528b[aVarN2.f21372a], aVarN2.f21373b, false) : null;
            ArrayList arrayList2 = (ArrayList) eVar2.c();
            if (arrayList2.isEmpty()) {
                j10 = jCurrentTimeMillis;
            } else {
                af.a aVar3 = mVar6.f17385i;
                Object objD = aVar3 != null ? ((x7.h) aVar3.f598d).D() : Collections.EMPTY_LIST;
                int size2 = arrayList2.size();
                int i26 = Integer.MAX_VALUE;
                ek.m mVar8 = ek.m.f5554c;
                int i27 = 0;
                int i28 = 0;
                yj.a[] aVarArr3 = null;
                while (true) {
                    if (i27 >= size2) {
                        j10 = jCurrentTimeMillis;
                        i11 = i28;
                        aVarArr = aVarArr3;
                        break;
                    }
                    f fVar = (f) arrayList2.get(i27);
                    j10 = jCurrentTimeMillis;
                    if (fVar.f17357b.a(objD)) {
                        obj = objD;
                        ek.d dVarB3 = eVar2.d(fVar.f17359d).b(eVar2, null, z17, i24 == i25);
                        zj.a aVarN3 = dVarB3.f5527a.n(gVar3, i24);
                        if (aVarN3 == null) {
                            z11 = z17;
                        } else {
                            yj.a[] aVarArr4 = aVarN3.f21373b;
                            z11 = z17;
                            int i29 = aVarArr4[0].f20445a;
                            i14 = i26;
                            if (i29 > i14) {
                                i26 = i14;
                            } else {
                                mVar8 = dVarB3.f5528b[aVarN3.f21372a];
                                i11 = fVar.f17358c;
                                if (i29 == i24) {
                                    aVarArr = aVarArr4;
                                    break;
                                }
                                i28 = i11;
                                i26 = i29;
                                aVarArr3 = aVarArr4;
                            }
                            i27++;
                            z17 = z11;
                            jCurrentTimeMillis = j10;
                            objD = obj;
                        }
                    } else {
                        z11 = z17;
                        obj = objD;
                    }
                    i14 = i26;
                    i26 = i14;
                    i27++;
                    z17 = z11;
                    jCurrentTimeMillis = j10;
                    objD = obj;
                }
                i iVar = aVarArr != null ? new i(mVar8, aVarArr, i11 == -1) : null;
                if (iVar != null && (sVar == null || (i13 = ((yj.a[]) iVar.f17712i)[0].f20445a) < (i12 = ((yj.a[]) sVar.f17712i)[0].f20445a) || (iVar.f17364s && i13 == i12))) {
                    sVar = iVar;
                }
            }
            if (sVar == null) {
                lVar.a(jVar.f17369e, str3.length());
                jVar.f17372h = true;
            } else {
                yj.a[] aVarArr5 = (yj.a[]) sVar.f17712i;
                ek.m mVar9 = (ek.m) sVar.f17713r;
                boolean z18 = aVarArr5.length > 0 && aVarArr5[0].f20446b > jVar.f17368d;
                if (mVar9.f5556a == -1) {
                    ek.a aVar4 = (ek.a) eVar2.d(jVar.f17369e.f17381e);
                    lVar.a(jVar.f17369e, aVarArr5[0].f20445a);
                    m mVar10 = jVar.f17369e;
                    m mVarB = mVar10.b(mVar10.f17384h);
                    jVar.f17369e = mVarB;
                    a(jVar.f17365a, gVar3, jVar.f17367c, mVarB, jVar.f17370f, aVar4.f5513i, aVarArr5);
                    lVar.a(jVar.f17369e, aVarArr5[0].f20446b);
                    m mVar11 = jVar.f17369e;
                    jVar.f17369e = mVar11.f17380d;
                    jVar.f17371g = mVar11.f17378b;
                    if (!z18 && mVar11.f17377a == jVar.f17368d) {
                        jVar.f17369e = mVar11;
                        lVar.b(mVar11.f17385i, str3.length());
                        jVar.f17372h = true;
                    }
                    if (aVarArr5.length <= 0 && (i15 = aVarArr5[0].f20446b) > jVar.f17368d) {
                        jVar.f17368d = i15;
                        jVar.f17367c = false;
                    }
                } else {
                    if (aVarArr5.length > 0) {
                        ek.j jVarD2 = eVar2.d(mVar9);
                        lVar.a(jVar.f17369e, aVarArr5[0].f20445a);
                        m mVar12 = jVar.f17369e;
                        af.a aVarR = jVar.f17369e.f17385i.r(jVarD2.c(str3, aVarArr5), eVar2);
                        m mVar13 = jVar.f17369e;
                        int i30 = jVar.f17368d;
                        int i31 = jVar.f17371g;
                        boolean z19 = aVarArr5[0].f20446b == str3.length();
                        mVar13.getClass();
                        m mVar14 = new m(mVar13, mVar9, i30, i31, z19, null, aVarR, aVarR);
                        jVar.f17369e = mVar14;
                        if (jVarD2 instanceof ek.a) {
                            ek.a aVar5 = (ek.a) jVarD2;
                            a(jVar.f17365a, gVar3, jVar.f17367c, mVar14, jVar.f17370f, aVar5.f5511g, aVarArr5);
                            lVar.a(jVar.f17369e, aVarArr5[0].f20446b);
                            jVar.f17371g = aVarArr5[0].f20446b;
                            String strB = aVar5.f5546d;
                            if (aVar5.f5547e && strB != null) {
                                strB = hk.d.b(strB, str3, aVarArr5);
                            }
                            m mVarB2 = jVar.f17369e.b(aVarR.r(strB, eVar2));
                            jVar.f17369e = mVarB2;
                            if (aVar5.j) {
                                jVar.f17369e = mVarB2.c(aVar5.f5512h.b(str3, aVarArr5));
                            }
                            if (!z18) {
                                m mVar15 = jVar.f17369e;
                                mVar12.getClass();
                                while (mVar12 != null && mVar12.f17377a == mVar15.f17377a) {
                                    if (mVar12.f17381e == mVar15.f17381e) {
                                        m mVar16 = jVar.f17369e.f17380d;
                                        jVar.f17369e = mVar16;
                                        lVar.a(mVar16, str3.length());
                                        jVar.f17372h = true;
                                    } else {
                                        mVar12 = mVar12.f17380d;
                                    }
                                }
                            }
                        } else if (jVarD2 instanceof ek.b) {
                            ek.b bVar2 = (ek.b) jVarD2;
                            a(jVar.f17365a, gVar3, jVar.f17367c, mVar14, jVar.f17370f, bVar2.f5519g, aVarArr5);
                            lVar.a(jVar.f17369e, aVarArr5[0].f20446b);
                            jVar.f17371g = aVarArr5[0].f20446b;
                            String strB2 = bVar2.f5546d;
                            if (bVar2.f5547e && strB2 != null) {
                                strB2 = hk.d.b(strB2, str3, aVarArr5);
                            }
                            m mVarB3 = jVar.f17369e.b(aVarR.r(strB2, eVar2));
                            jVar.f17369e = mVarB3;
                            if (bVar2.j) {
                                jVar.f17369e = mVarB3.c(bVar2.f5521i.b(str3, aVarArr5));
                            }
                            if (!z18) {
                                m mVar17 = jVar.f17369e;
                                mVar12.getClass();
                                while (mVar12 != null && mVar12.f17377a == mVar17.f17377a) {
                                    if (mVar12.f17381e == mVar17.f17381e) {
                                        m mVar18 = jVar.f17369e.f17380d;
                                        jVar.f17369e = mVar18;
                                        lVar.a(mVar18, str3.length());
                                        jVar.f17372h = true;
                                    } else {
                                        mVar12 = mVar12.f17380d;
                                    }
                                }
                            }
                        } else {
                            a(jVar.f17365a, gVar3, jVar.f17367c, mVar14, jVar.f17370f, ((ek.g) jVarD2).f5533g, aVarArr5);
                            lVar.a(jVar.f17369e, aVarArr5[0].f20446b);
                            m mVar19 = jVar.f17369e.f17380d;
                            jVar.f17369e = mVar19;
                            if (!z18) {
                                m mVar20 = mVar19.f17380d;
                                if (mVar20 != null) {
                                    mVar19 = mVar20;
                                }
                                jVar.f17369e = mVar19;
                                lVar.b(mVar19.f17385i, str3.length());
                                jVar.f17372h = true;
                            }
                        }
                    }
                    if (aVarArr5.length <= 0) {
                    }
                }
                jCurrentTimeMillis = j10;
            }
            jCurrentTimeMillis = j10;
        }
        return new mf.a(jVar.f17369e, false);
    }
}
