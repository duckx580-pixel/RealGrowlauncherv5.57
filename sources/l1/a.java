package l1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.l;
import org.xmlpull.v1.XmlPullParser;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f9789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9790b = 0;

    public a(XmlResourceParser xmlResourceParser) {
        this.f9789a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f9) {
        if (j3.b.c(this.f9789a, str)) {
            f9 = typedArray.getFloat(i10, f9);
        }
        b(typedArray.getChangingConfigurations());
        return f9;
    }

    public final void b(int i10) {
        this.f9790b = i10 | this.f9790b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f9789a, aVar.f9789a) && this.f9790b == aVar.f9790b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9790b) + (this.f9789a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f9789a);
        sb2.append(", config=");
        return h0.g(sb2, this.f9790b, ')');
    }
}
