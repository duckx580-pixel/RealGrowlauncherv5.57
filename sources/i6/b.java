package i6;

import android.graphics.Bitmap;
import bj.c0;
import bj.o;
import java.io.EOFException;
import java.util.ArrayList;
import ka.a1;
import kotlin.jvm.internal.l;
import nh.h;
import oj.y;
import oj.z;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f8081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f8086f;

    public b(z zVar) throws EOFException {
        qg.e eVar = qg.e.f13909r;
        this.f8081a = android.support.v4.media.session.b.p(eVar, new a(this, 0));
        this.f8082b = android.support.v4.media.session.b.p(eVar, new a(this, 1 == true ? 1 : 0));
        this.f8083c = Long.parseLong(zVar.w(Long.MAX_VALUE));
        this.f8084d = Long.parseLong(zVar.w(Long.MAX_VALUE));
        this.f8085e = Integer.parseInt(zVar.w(Long.MAX_VALUE)) > 0;
        int i10 = Integer.parseInt(zVar.w(Long.MAX_VALUE));
        ArrayList arrayList = new ArrayList(20);
        for (int i11 = 0; i11 < i10; i11++) {
            String strW = zVar.w(Long.MAX_VALUE);
            Bitmap.Config[] configArr = n6.e.f12134a;
            int iT = h.T(strW, ':', 0, 6);
            if (iT == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strW).toString());
            }
            String strSubstring = strW.substring(0, iT);
            l.e("substring(...)", strSubstring);
            String string = h.r0(strSubstring).toString();
            String strSubstring2 = strW.substring(iT + 1);
            l.e("substring(...)", strSubstring2);
            l.f("name", string);
            a1.k(string);
            arrayList.add(string);
            arrayList.add(h.r0(strSubstring2).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        this.f8086f = new o((String[]) array);
    }

    public final void a(y yVar) {
        yVar.Z(this.f8083c);
        yVar.writeByte(10);
        yVar.Z(this.f8084d);
        yVar.writeByte(10);
        yVar.Z(this.f8085e ? 1L : 0L);
        yVar.writeByte(10);
        o oVar = this.f8086f;
        yVar.Z(oVar.size());
        yVar.writeByte(10);
        int size = oVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            yVar.B(oVar.j(i10));
            yVar.B(": ");
            yVar.B(oVar.l(i10));
            yVar.writeByte(10);
        }
    }

    public b(c0 c0Var) {
        qg.e eVar = qg.e.f13909r;
        this.f8081a = android.support.v4.media.session.b.p(eVar, new a(this, 0));
        this.f8082b = android.support.v4.media.session.b.p(eVar, new a(this, 1));
        this.f8083c = c0Var.B;
        this.f8084d = c0Var.C;
        this.f8085e = c0Var.f3093v != null;
        this.f8086f = c0Var.w;
    }
}
