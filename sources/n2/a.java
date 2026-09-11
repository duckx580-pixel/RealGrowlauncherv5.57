package n2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import l2.b;
import m2.d;
import rg.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12111a = new a();

    public final Object a(b bVar) {
        ArrayList arrayList = new ArrayList(m.O(bVar, 10));
        Iterator it = bVar.f9796i.iterator();
        while (it.hasNext()) {
            arrayList.add((Locale) ((l2.a) it.next()).f9795a.f17063i);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(d dVar, b bVar) {
        ArrayList arrayList = new ArrayList(m.O(bVar, 10));
        Iterator it = bVar.f9796i.iterator();
        while (it.hasNext()) {
            arrayList.add((Locale) ((l2.a) it.next()).f9795a.f17063i);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        dVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
