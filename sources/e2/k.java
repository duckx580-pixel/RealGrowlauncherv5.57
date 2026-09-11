package e2;

import android.os.Build;
import android.text.StaticLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements p {
    @Override // e2.p
    public StaticLayout a(q qVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(qVar.f5244a, 0, qVar.f5245b, qVar.f5246c, qVar.f5247d);
        builderObtain.setTextDirection(qVar.f5248e);
        builderObtain.setAlignment(qVar.f5249f);
        builderObtain.setMaxLines(qVar.f5250g);
        builderObtain.setEllipsize(qVar.f5251h);
        builderObtain.setEllipsizedWidth(qVar.f5252i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(qVar.f5253k);
        builderObtain.setBreakStrategy(qVar.f5254l);
        builderObtain.setHyphenationFrequency(qVar.f5257o);
        builderObtain.setIndents(null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            l.a(builderObtain, qVar.j);
        }
        if (i10 >= 28) {
            m.a(builderObtain, true);
        }
        if (i10 >= 33) {
            n.b(builderObtain, qVar.f5255m, qVar.f5256n);
        }
        return builderObtain.build();
    }
}
