package xcrash;

import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19540a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f19540a) {
            case 0:
                f fVar = f.f19542h;
                return str.startsWith("placeholder_") && str.endsWith(".dirty.xcrash");
            case 1:
                f fVar2 = f.f19542h;
                return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
            case 2:
                f fVar3 = f.f19542h;
                return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
            case 3:
                f fVar4 = f.f19542h;
                return str.startsWith("placeholder_") && str.endsWith(".dirty.xcrash");
            case 4:
                f fVar5 = f.f19542h;
                return str.startsWith("placeholder_") && str.endsWith(".clean.xcrash");
            default:
                return TextUtils.isDigitsOnly(str);
        }
    }
}
