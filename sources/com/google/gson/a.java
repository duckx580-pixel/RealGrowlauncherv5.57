package com.google.gson;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public enum a extends h {
    public a() {
        super("IDENTITY", 0);
    }

    @Override // com.google.gson.h
    public final String b(Field field) {
        return field.getName();
    }
}
