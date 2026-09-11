package al;

import androidx.appcompat.widget.w3;
import java.util.Optional;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f634b;

    public e(h hVar) {
        this.f634b = hVar;
    }

    @Override // wk.a
    public final Object b(el.c cVar) {
        String str = ((el.e) cVar).f5565e;
        Optional optional = (Optional) ((w3) this.f634b.f643g).f1068v;
        if (!optional.isPresent()) {
            return str;
        }
        if (optional.get() != null) {
            throw new ClassCastException();
        }
        Matcher matcher = gl.a.f7237c.matcher(str);
        matcher.matches();
        String strGroup = matcher.group(1);
        matcher.group(3);
        matcher.group(2);
        System.getenv(strGroup);
        throw null;
    }
}
