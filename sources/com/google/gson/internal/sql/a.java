package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.gson.internal.bind.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10, Class cls) {
        super(cls);
        this.f4498c = i10;
    }

    @Override // com.google.gson.internal.bind.b
    public final Date b(Date date) {
        switch (this.f4498c) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
