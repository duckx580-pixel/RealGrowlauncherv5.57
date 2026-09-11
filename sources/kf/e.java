package kf;

import org.eclipse.tm4e.languageconfiguration.internal.model.EnterAction;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f9605a;

    static {
        int[] iArr = new int[EnterAction.IndentAction.values().length];
        f9605a = iArr;
        try {
            iArr[EnterAction.IndentAction.None.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f9605a[EnterAction.IndentAction.Indent.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f9605a[EnterAction.IndentAction.IndentOutdent.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f9605a[EnterAction.IndentAction.Outdent.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
