package zc;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class a1 extends e implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SQLiteDatabase f20702i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mc.a f20703r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20704s;

    public a1(File file, mc.a aVar) {
        Cursor cursorRawQuery = null;
        SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
        this.f20702i = sQLiteDatabaseOpenOrCreateDatabase;
        this.f20703r = aVar;
        if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 1) {
            this.f20702i.beginTransaction();
            try {
                this.f20702i.execSQL("CREATE TABLE IF NOT EXISTS List(value BLOB)");
                this.f20702i.setVersion(1);
                this.f20702i.setTransactionSuccessful();
            } finally {
                this.f20702i.endTransaction();
            }
        }
        try {
            cursorRawQuery = this.f20702i.rawQuery("SELECT COUNT(1) FROM List", null);
            this.f20704s = cursorRawQuery.moveToNext() ? cursorRawQuery.getInt(0) : 0;
        } finally {
            n(cursorRawQuery);
        }
    }

    public static void n(Cursor cursor) {
        if (cursor != null) {
            cursor.close();
        }
    }

    @Override // zc.h
    public final Object C(int i10) {
        if (i10 < 0 || i10 >= this.f20704s) {
            throw new IndexOutOfBoundsException();
        }
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.f20702i.rawQuery("SELECT value FROM List ORDER BY rowid LIMIT " + i10 + ",1", null);
            if (!cursorRawQuery.moveToNext()) {
                throw new NoSuchElementException();
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(cursorRawQuery.getBlob(0));
            try {
                try {
                    return this.f20703r.h(byteArrayInputStream);
                } catch (IOException e8) {
                    throw new IllegalStateException(e8);
                }
            } finally {
                r2.a(byteArrayInputStream);
            }
        } finally {
            n(cursorRawQuery);
        }
    }

    @Override // zc.h
    public final void K(int i10) throws Throwable {
        int i11;
        if (i10 <= 0 || i10 > (i11 = this.f20704s)) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == i11) {
            clear();
            return;
        }
        Cursor cursor = null;
        try {
            SQLiteDatabase sQLiteDatabase = this.f20702i;
            StringBuilder sb2 = new StringBuilder("SELECT rowid FROM List ORDER BY rowid LIMIT ");
            sb2.append(i10 - 1);
            sb2.append(",1");
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb2.toString(), null);
            try {
                if (!cursorRawQuery.moveToNext()) {
                    throw new IllegalStateException();
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                int iDelete = this.f20702i.delete("List", "rowid <= ".concat(String.valueOf(j)), null);
                this.f20704s -= iDelete;
                if (iDelete == i10) {
                    return;
                }
                throw new IllegalStateException("Try to delete " + i10 + ", but deleted " + iDelete);
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorRawQuery;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        n(cursor);
        throw th;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20702i.delete("List", "1", null);
        this.f20704s = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.f20702i;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
            this.f20702i = null;
        }
    }

    public final void finalize() throws Throwable {
        close();
        super.finalize();
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        obj.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                this.f20703r.d(byteArrayOutputStream, obj);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                r2.a(byteArrayOutputStream);
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", byteArray);
                if (this.f20702i.insert("List", null, contentValues) == -1) {
                    return false;
                }
                this.f20704s++;
                return true;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8);
            }
        } catch (Throwable th2) {
            r2.a(byteArrayOutputStream);
            throw th2;
        }
    }

    @Override // java.util.Queue
    public final Object peek() {
        if (this.f20704s > 0) {
            return C(0);
        }
        return null;
    }

    @Override // java.util.Queue
    public final Object poll() throws Throwable {
        if (this.f20704s <= 0) {
            return null;
        }
        Object objPeek = peek();
        K(1);
        return objPeek;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20704s;
    }
}
