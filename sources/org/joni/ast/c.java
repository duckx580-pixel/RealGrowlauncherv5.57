package org.joni.ast;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import sk.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f13142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13144c;

    public c(int i10, int[] iArr, boolean z3, boolean z10, int i11, r rVar) {
        super(4);
        this.f13143b = i10;
        if (z3) {
            setNameRef();
        }
        int i12 = 0;
        while (true) {
            if (i12 < i10) {
                int i13 = iArr[i12];
                if (i13 <= rVar.j && rVar.f15968l[i13] == null) {
                    setRecursion();
                    break;
                }
                i12++;
            } else {
                break;
            }
        }
        this.f13142a = iArr;
        if (sk.g.f15874h && z10) {
            this.state |= 8192;
            this.f13144c = i11;
        }
    }

    @Override // org.joni.ast.j
    public final String getName() {
        return "Back Ref";
    }

    @Override // org.joni.ast.l, org.joni.ast.j
    public final String toString(int i10) {
        int i11 = 0;
        StringBuilder sb2 = new StringBuilder(super.toString(0));
        sb2.append("\n  backNum: " + this.f13143b);
        String strI = PredefinedUICustomizationFont.defaultFamily;
        while (true) {
            int[] iArr = this.f13142a;
            if (i11 >= iArr.length) {
                sb2.append("\n  back: " + strI);
                sb2.append("\n  nextLevel: " + this.f13144c);
                return sb2.toString();
            }
            strI = k0.g.i(k0.g.m(strI), iArr[i11], ", ");
            i11++;
        }
    }
}
