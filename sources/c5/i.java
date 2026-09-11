package c5;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h implements b5.d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final SQLiteStatement f3371r;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f3371r = sQLiteStatement;
    }

    public final int a() {
        return this.f3371r.executeUpdateDelete();
    }
}
