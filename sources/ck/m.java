package ck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.IntFunction;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements IntFunction {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3593a;

    @Override // java.util.function.IntFunction
    public final Object apply(int i10) {
        switch (this.f3593a) {
            case 0:
                return new ArrayList(i10);
            case 1:
                return new HashMap(i10);
            case 2:
                return new HashSet(i10);
            case 3:
                return yk.b.a(String.valueOf(Character.toChars(i10)));
            case 4:
                return new ek.m[i10];
            case 5:
                return new ek.m[i10];
            default:
                return new String[i10];
        }
    }
}
