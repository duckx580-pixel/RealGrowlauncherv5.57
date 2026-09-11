package com.google.gson.internal.sql;

import com.google.gson.j;
import com.google.gson.y;
import com.google.gson.z;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class SqlTimestampTypeAdapter extends y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f4496b = new z() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.z
        public final y a(j jVar, qb.a aVar) {
            if (aVar.f13890a != Timestamp.class) {
                return null;
            }
            jVar.getClass();
            return new SqlTimestampTypeAdapter(jVar.c(new qb.a(Date.class)));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f4497a;

    public SqlTimestampTypeAdapter(y yVar) {
        this.f4497a = yVar;
    }

    @Override // com.google.gson.y
    public final Object b(rb.a aVar) {
        Date date = (Date) this.f4497a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.y
    public final void c(rb.b bVar, Object obj) {
        this.f4497a.c(bVar, (Timestamp) obj);
    }
}
