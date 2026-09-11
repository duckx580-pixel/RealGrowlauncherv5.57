package launcher.powerkuy.growlauncher.script;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class Startopia {
    public static final int $stable = 0;
    private final int error;
    private final String message;
    private final int status_code;

    public Startopia(int i10, int i11, String str) {
        l.f("message", str);
        this.status_code = i10;
        this.error = i11;
        this.message = str;
    }

    public final int getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getStatus_code() {
        return this.status_code;
    }
}
