package c5;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class h implements b5.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SQLiteProgram f3370i;

    public h(SQLiteProgram sQLiteProgram) {
        l.f("delegate", sQLiteProgram);
        this.f3370i = sQLiteProgram;
    }

    @Override // b5.d
    public final void M(double d10, int i10) {
        this.f3370i.bindDouble(i10, d10);
    }

    @Override // b5.d
    public final void O(int i10) {
        this.f3370i.bindNull(i10);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3370i.close();
    }

    @Override // b5.d
    public final void l(int i10, String str) {
        l.f("value", str);
        this.f3370i.bindString(i10, str);
    }

    @Override // b5.d
    public final void s(long j, int i10) {
        this.f3370i.bindLong(i10, j);
    }

    @Override // b5.d
    public final void z(int i10, byte[] bArr) {
        this.f3370i.bindBlob(i10, bArr);
    }
}
