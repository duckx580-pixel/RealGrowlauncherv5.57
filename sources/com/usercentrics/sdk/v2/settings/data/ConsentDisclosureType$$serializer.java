package com.usercentrics.sdk.v2.settings.data;

import ai.d;
import bi.o0;
import bi.r;
import bi.w;
import kotlin.jvm.internal.l;
import xh.c;
import zh.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ConsentDisclosureType$$serializer implements w {
    public static final ConsentDisclosureType$$serializer INSTANCE = new ConsentDisclosureType$$serializer();
    private static final r descriptor;

    static {
        r rVar = new r("com.usercentrics.sdk.v2.settings.data.ConsentDisclosureType", 3);
        rVar.j("cookie", false);
        rVar.j("web", false);
        rVar.j("app", false);
        descriptor = rVar;
    }

    private ConsentDisclosureType$$serializer() {
    }

    @Override // bi.w
    public c[] childSerializers() {
        return new c[0];
    }

    @Override // xh.b
    public ConsentDisclosureType deserialize(ai.c cVar) {
        l.f("decoder", cVar);
        return ConsentDisclosureType.values()[cVar.g(getDescriptor())];
    }

    @Override // xh.h, xh.b
    public g getDescriptor() {
        return descriptor;
    }

    @Override // xh.h
    public void serialize(d dVar, ConsentDisclosureType consentDisclosureType) {
        l.f("encoder", dVar);
        l.f("value", consentDisclosureType);
        dVar.C(getDescriptor(), consentDisclosureType.ordinal());
    }

    @Override // bi.w
    public c[] typeParametersSerializers() {
        return o0.f3002b;
    }
}
