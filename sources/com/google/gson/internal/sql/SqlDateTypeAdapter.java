package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.s;
import com.google.gson.y;
import com.google.gson.z;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
final class SqlDateTypeAdapter extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f4492b = new z() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, qb.a aVar) {
            if (aVar.f13890a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f4493a;

    public /* synthetic */ SqlDateTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.y
    public final Object b(rb.a aVar) throws IOException {
        Date date;
        if (aVar.i0() == 9) {
            aVar.e0();
            return null;
        }
        String strG0 = aVar.g0();
        synchronized (this) {
            TimeZone timeZone = this.f4493a.getTimeZone();
            try {
                try {
                    date = new Date(this.f4493a.parse(strG0).getTime());
                } catch (ParseException e8) {
                    throw new s("Failed parsing '" + strG0 + "' as SQL Date; at path " + aVar.n(true), e8);
                }
            } finally {
                this.f4493a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // com.google.gson.y
    public final void c(rb.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.n();
            return;
        }
        synchronized (this) {
            str = this.f4493a.format((java.util.Date) date);
        }
        bVar.c0(str);
    }

    private SqlDateTypeAdapter() {
        this.f4493a = new SimpleDateFormat("MMM d, yyyy");
    }
}
