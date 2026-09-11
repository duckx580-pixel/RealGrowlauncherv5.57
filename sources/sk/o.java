package sk;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final short[] f15928e = {5, 1, 1, 1, 1, 1, 1, 1, 1, 10, 10, 1, 1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 12, 4, 7, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5, 6, 5, 5, 5, 5, 6, 6, 6, 6, 7, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 5, 5, 5, 5, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Cloneable f15932d;

    /* JADX WARN: Type inference failed for: r0v3, types: [byte[], java.lang.Cloneable] */
    public o() {
        this.f15930b = new j();
        this.f15931c = new j();
        this.f15932d = new byte[g.f15868b];
    }

    public static void e(StringBuilder sb2, int i10, int i11, byte[] bArr, int i12) {
        int i13 = i11 * i10;
        sb2.append(":T:");
        sb2.append(i10);
        sb2.append(':');
        while (true) {
            int i14 = i13 - 1;
            if (i13 <= 0) {
                return;
            }
            sb2.append(new String(bArr, i12, 1));
            i13 = i14;
            i12++;
        }
    }

    public static int g(int i10, lk.a aVar) {
        if (i10 >= 128) {
            return 4;
        }
        if (i10 != 0 || aVar.f10072i <= 1) {
            return f15928e[i10];
        }
        return 20;
    }

    public void a(byte b4, lk.a aVar) {
        int i10 = b4 & 255;
        byte[] bArr = (byte[]) this.f15932d;
        if (bArr[i10] == 0) {
            bArr[i10] = 1;
            this.f15929a = g(i10, aVar) + this.f15929a;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(java.lang.StringBuilder r17, int r18) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.o.b(java.lang.StringBuilder, int):int");
    }

    public void c(o oVar) {
        j jVar = (j) this.f15930b;
        j jVar2 = (j) oVar.f15930b;
        jVar.f15908a = jVar2.f15908a;
        jVar.f15909b = jVar2.f15909b;
        j jVar3 = (j) this.f15931c;
        j jVar4 = (j) oVar.f15931c;
        jVar3.f15908a = jVar4.f15908a;
        jVar3.f15909b = jVar4.f15909b;
        this.f15929a = oVar.f15929a;
        byte[] bArr = (byte[]) oVar.f15932d;
        System.arraycopy(bArr, 0, (byte[]) this.f15932d, 0, bArr.length);
    }

    public void d(StringBuilder sb2, int i10, int i11, int i12) {
        int i13 = i11 * i10;
        sb2.append(':');
        sb2.append(i10);
        sb2.append(':');
        while (true) {
            int i14 = i13 - 1;
            if (i13 <= 0) {
                return;
            }
            sb2.append(new String(new byte[]{(byte) ((int[]) this.f15930b)[i12]}));
            i13 = i14;
            i12++;
        }
    }

    public void f(StringBuilder sb2, int i10, int i11) {
        sb2.append(':');
        while (true) {
            int i12 = i10 - 1;
            if (i10 <= 0) {
                return;
            }
            sb2.append(new String(new byte[]{(byte) ((int[]) this.f15930b)[i11]}));
            i10 = i12;
            i11++;
        }
    }

    public o(p pVar) {
        this.f15930b = pVar.f15933a;
        this.f15929a = pVar.f15934b;
        this.f15931c = pVar.G;
        this.f15932d = pVar.f15947p;
    }
}
