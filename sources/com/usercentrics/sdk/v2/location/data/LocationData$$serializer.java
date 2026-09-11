package com.usercentrics.sdk.v2.location.data;

import ai.a;
import ai.b;
import ai.d;
import bi.o0;
import bi.q0;
import bi.w;
import kotlin.jvm.internal.l;
import xh.c;
import zh.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationData$$serializer implements w {
    public static final LocationData$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        LocationData$$serializer locationData$$serializer = new LocationData$$serializer();
        INSTANCE = locationData$$serializer;
        q0 q0Var = new q0("com.usercentrics.sdk.v2.location.data.LocationData", locationData$$serializer, 1);
        q0Var.j("clientLocation", false);
        descriptor = q0Var;
    }

    private LocationData$$serializer() {
    }

    @Override // bi.w
    public c[] childSerializers() {
        return new c[]{UsercentricsLocation$$serializer.INSTANCE};
    }

    @Override // xh.b
    public LocationData deserialize(ai.c cVar) {
        l.f("decoder", cVar);
        g descriptor2 = getDescriptor();
        a aVarD = cVar.d(descriptor2);
        UsercentricsLocation usercentricsLocation = null;
        int i10 = 0;
        boolean z3 = true;
        while (z3) {
            int iU = aVarD.u(descriptor2);
            if (iU == -1) {
                z3 = false;
            } else {
                if (iU != 0) {
                    throw new di.g(iU);
                }
                usercentricsLocation = (UsercentricsLocation) aVarD.k(descriptor2, 0, UsercentricsLocation$$serializer.INSTANCE, usercentricsLocation);
                i10 = 1;
            }
        }
        aVarD.b(descriptor2);
        return new LocationData(i10, usercentricsLocation, null);
    }

    @Override // xh.h, xh.b
    public g getDescriptor() {
        return descriptor;
    }

    @Override // xh.h
    public void serialize(d dVar, LocationData locationData) {
        l.f("encoder", dVar);
        l.f("value", locationData);
        g descriptor2 = getDescriptor();
        b bVarD = dVar.d(descriptor2);
        bVarD.z(descriptor2, 0, UsercentricsLocation$$serializer.INSTANCE, locationData.clientLocation);
        bVarD.b(descriptor2);
    }

    @Override // bi.w
    public c[] typeParametersSerializers() {
        return o0.f3002b;
    }
}
