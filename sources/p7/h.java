package p7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d, q7.c, c {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e7.a f13346v = new e7.a("proto");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f13347i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7.a f13348r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7.a f13349s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a f13350t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final j7.a f13351u;

    public h(r7.a aVar, r7.a aVar2, a aVar3, j jVar, j7.a aVar4) {
        this.f13347i = jVar;
        this.f13348r = aVar;
        this.f13349s = aVar2;
        this.f13350t = aVar3;
        this.f13351u = aVar4;
    }

    public static Long c(SQLiteDatabase sQLiteDatabase, h7.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f7628a, String.valueOf(s7.a.a(iVar.f7630c))));
        byte[] bArr = iVar.f7629b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String h(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f13338a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object i(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        j jVar = this.f13347i;
        Objects.requireNonNull(jVar);
        r7.a aVar = this.f13349s;
        long jA = aVar.a();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e8) {
                if (aVar.a() >= ((long) this.f13350t.f13335c) + jA) {
                    throw new q7.a("Timed out while trying to open db.", e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13347i.close();
    }

    public final Object e(f fVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        sQLiteDatabaseA.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseA);
            sQLiteDatabaseA.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA.endTransaction();
        }
    }

    public final void f(long j, l7.c cVar, String str) {
        e(new fa.b(j, str, cVar));
    }

    public final Object g(q7.b bVar) {
        SQLiteDatabase sQLiteDatabaseA = a();
        r7.a aVar = this.f13349s;
        long jA = aVar.a();
        while (true) {
            try {
                sQLiteDatabaseA.beginTransaction();
                try {
                    Object objG = bVar.g();
                    sQLiteDatabaseA.setTransactionSuccessful();
                    return objG;
                } finally {
                    sQLiteDatabaseA.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e8) {
                if (aVar.a() >= ((long) this.f13350t.f13335c) + jA) {
                    throw new q7.a("Timed out while trying to acquire the lock.", e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
