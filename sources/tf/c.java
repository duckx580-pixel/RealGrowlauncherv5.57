package tf;

import com.usercentrics.sdk.extensions.TimeExtensionsKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f17176i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17177k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f17168a = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f17170c = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17169b = TimeExtensionsKt.MILLIS_PER_SECOND;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17172e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17173f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f17174g = new a(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f17171d = new ArrayList(10);

    public final void a(int i10, int i11) {
        int i12;
        int[] iArr;
        a aVar;
        if (i10 < 0 || i10 > this.f17172e) {
            StringBuilder sbN = android.support.v4.media.session.a.n(i10, "index = ", ", length = ");
            sbN.append(this.f17172e);
            throw new ArrayIndexOutOfBoundsException(sbN.toString());
        }
        b(i10);
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f17171d;
            if (i13 >= arrayList.size()) {
                break;
            }
            if (((b) arrayList.get(i13)).f17167b >= i10) {
                arrayList.remove(i13);
                i13--;
            }
            i13++;
        }
        a aVar2 = this.f17176i;
        int i14 = this.f17175h;
        while (true) {
            i12 = aVar2.f17162b;
            iArr = aVar2.f17161a;
            if (i14 <= i12 || (aVar = aVar2.f17164d) == null) {
                break;
            }
            i14 -= i12;
            aVar2 = aVar;
        }
        System.arraycopy(iArr, i14, iArr, i14 + 1, i12 - i14);
        iArr[i14] = i11;
        int i15 = aVar2.f17162b + 1;
        aVar2.f17162b = i15;
        if (i11 > aVar2.f17163c) {
            aVar2.f17163c = i11;
        }
        this.f17172e++;
        if (i15 > this.f17169b) {
            a aVar3 = aVar2.f17164d;
            c cVar = aVar2.f17165e;
            ArrayList arrayList2 = cVar.f17170c;
            a aVar4 = arrayList2.isEmpty() ? new a(cVar) : (a) arrayList2.remove(arrayList2.size() - 1);
            int i16 = (cVar.f17169b * 3) / 4;
            System.arraycopy(iArr, i16, aVar4.f17161a, 0, aVar2.f17162b - i16);
            aVar4.f17162b = aVar2.f17162b - i16;
            aVar2.f17162b = i16;
            aVar2.f17164d = aVar4;
            aVar4.f17164d = aVar3;
            aVar2.a();
            aVar4.a();
        }
        this.f17173f++;
    }

    public final void b(int i10) {
        ArrayList arrayList;
        a aVar;
        int i11;
        a aVar2 = this.f17174g;
        int i12 = 0;
        int i13 = i10;
        int i14 = -1;
        int i15 = 0;
        while (true) {
            arrayList = this.f17171d;
            if (i15 >= arrayList.size()) {
                break;
            }
            b bVar = (b) arrayList.get(i15);
            int i16 = bVar.f17167b;
            if (i16 < i10 && (i11 = i10 - i16) < i13) {
                aVar2 = bVar.f17166a;
                i14 = i15;
                i13 = i11;
            }
            i15++;
        }
        if (i14 != -1) {
            Collections.swap(arrayList, 0, i14);
        }
        while (true) {
            int i17 = aVar2.f17162b;
            if (i13 < i17 || (aVar = aVar2.f17164d) == null) {
                break;
            }
            i13 -= i17;
            i12++;
            aVar2 = aVar;
        }
        if (i12 >= 30) {
            b bVar2 = new b();
            bVar2.f17167b = i10 - i13;
            bVar2.f17166a = aVar2;
            arrayList.add(bVar2);
        }
        if (arrayList.size() > 8) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.f17175h = i13;
        this.f17176i = aVar2;
    }

    public final int c(int i10) {
        if (i10 < 0 || i10 >= this.f17172e) {
            StringBuilder sbN = android.support.v4.media.session.a.n(i10, "index = ", ", length = ");
            sbN.append(this.f17172e);
            throw new ArrayIndexOutOfBoundsException(sbN.toString());
        }
        b(i10);
        a aVar = this.f17176i;
        return aVar.f17161a[this.f17175h];
    }

    public final void d(int i10, int i11) {
        if (i11 > this.f17172e || i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException();
        }
        a aVar = this.f17174g;
        a aVar2 = null;
        while (true) {
            int i12 = aVar.f17162b;
            if (i10 < i12) {
                break;
            }
            i10 -= i12;
            i11 -= i12;
            aVar2 = aVar;
            aVar = aVar.f17164d;
        }
        int i13 = i11 - i10;
        int i14 = i13;
        while (i14 > 0) {
            if (i10 != 0 || i14 < aVar.f17162b) {
                int iMin = Math.min(aVar.f17162b, i14);
                int[] iArr = aVar.f17161a;
                System.arraycopy(iArr, iMin, iArr, 0, aVar.f17162b - iMin);
                aVar.f17162b -= iMin;
                aVar.a();
                i14 -= iMin;
                aVar2 = aVar;
                aVar = aVar.f17164d;
                i10 = 0;
            } else {
                if (aVar2 != null) {
                    aVar2.f17164d = aVar.f17164d;
                    this.f17170c.add(aVar);
                }
                i14 -= aVar.f17162b;
                aVar.f17162b = 0;
                aVar = aVar.f17164d;
            }
        }
        this.f17172e -= i13;
    }

    public final void e(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f17172e) {
            StringBuilder sbN = android.support.v4.media.session.a.n(i10, "index = ", ", length = ");
            sbN.append(this.f17172e);
            throw new ArrayIndexOutOfBoundsException(sbN.toString());
        }
        b(i10);
        a aVar = this.f17176i;
        int i12 = this.f17175h;
        int[] iArr = aVar.f17161a;
        int i13 = iArr[i12];
        iArr[i12] = i11;
        int i14 = aVar.f17163c;
        if (i13 == i14) {
            if (i11 >= i13) {
                aVar.f17163c = i11;
            } else {
                aVar.a();
            }
        } else if (i11 > i14) {
            aVar.f17163c = i11;
        }
        this.f17173f++;
    }
}
