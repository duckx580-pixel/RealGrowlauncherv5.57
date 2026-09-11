package p4;

import androidx.lifecycle.d0;
import androidx.lifecycle.v;
import androidx.lifecycle.z0;
import java.io.PrintWriter;
import ka.a1;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f13319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13320b;

    public d(v vVar, z0 z0Var) {
        this.f13319a = vVar;
        this.f13320b = (c) new mf.a(z0Var, c.f13316d).l(y.a(c.class));
    }

    public final void a(String str, PrintWriter printWriter) {
        c cVar = this.f13320b;
        if (cVar.f13317b.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i10 = 0; i10 < cVar.f13317b.f(); i10++) {
                b bVar = (b) cVar.f13317b.g(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.f13317b.d(i10));
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(bVar.f13313l);
                x7.c cVar2 = bVar.f13313l;
                String str3 = str2 + "  ";
                cVar2.getClass();
                printWriter.print(str3);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mListener=");
                printWriter.println(cVar2.f19473a);
                if (cVar2.f19474b || cVar2.f19477e) {
                    printWriter.print(str3);
                    printWriter.print("mStarted=");
                    printWriter.print(cVar2.f19474b);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(cVar2.f19477e);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (cVar2.f19475c || cVar2.f19476d) {
                    printWriter.print(str3);
                    printWriter.print("mAbandoned=");
                    printWriter.print(cVar2.f19475c);
                    printWriter.print(" mReset=");
                    printWriter.println(cVar2.f19476d);
                }
                if (cVar2.f19479g != null) {
                    printWriter.print(str3);
                    printWriter.print("mTask=");
                    printWriter.print(cVar2.f19479g);
                    printWriter.print(" waiting=");
                    cVar2.f19479g.getClass();
                    printWriter.println(false);
                }
                if (cVar2.f19480h != null) {
                    printWriter.print(str3);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(cVar2.f19480h);
                    printWriter.print(" waiting=");
                    cVar2.f19480h.getClass();
                    printWriter.println(false);
                }
                if (bVar.f13315n != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(bVar.f13315n);
                    b9.b bVar2 = bVar.f13315n;
                    bVar2.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar2.f2879r);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                x7.c cVar3 = bVar.f13313l;
                Object obj = bVar.f1877e;
                Object obj2 = obj != d0.f1872k ? obj : null;
                cVar3.getClass();
                StringBuilder sb2 = new StringBuilder(64);
                a1.j(obj2, sb2);
                sb2.append("}");
                printWriter.println(sb2.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(bVar.f1875c > 0);
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        a1.j(this.f13319a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
