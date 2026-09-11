package z9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import s8.f1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f20676a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f20677b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f20678c = Arrays.asList("auto", "app", "am");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f20679d = Arrays.asList("_r", "_dbg");

    static {
        String[][] strArr = {f1.f15335i, f1.j};
        int length = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            length += strArr[i10].length;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr[0], length);
        int length2 = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, objArrCopyOf, length2, strArr2.length);
        Arrays.asList((String[]) objArrCopyOf);
        Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
