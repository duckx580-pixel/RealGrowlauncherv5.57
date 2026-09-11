package com.usercentrics.sdk;

import ai.a;
import ai.b;
import ai.d;
import bi.o0;
import bi.q0;
import bi.w;
import java.util.List;
import kotlin.jvm.internal.l;
import xh.c;
import zh.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UserDecisionWrapper$$serializer implements w {
    public static final UserDecisionWrapper$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        UserDecisionWrapper$$serializer userDecisionWrapper$$serializer = new UserDecisionWrapper$$serializer();
        INSTANCE = userDecisionWrapper$$serializer;
        q0 q0Var = new q0("com.usercentrics.sdk.UserDecisionWrapper", userDecisionWrapper$$serializer, 1);
        q0Var.j("decisions", false);
        descriptor = q0Var;
    }

    private UserDecisionWrapper$$serializer() {
    }

    @Override // bi.w
    public c[] childSerializers() {
        return new c[]{UserDecisionWrapper.$childSerializers[0]};
    }

    @Override // xh.b
    public UserDecisionWrapper deserialize(ai.c cVar) {
        l.f("decoder", cVar);
        g descriptor2 = getDescriptor();
        a aVarD = cVar.d(descriptor2);
        c[] cVarArr = UserDecisionWrapper.$childSerializers;
        List list = null;
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
                list = (List) aVarD.k(descriptor2, 0, cVarArr[0], list);
                i10 = 1;
            }
        }
        aVarD.b(descriptor2);
        return new UserDecisionWrapper(i10, list, null);
    }

    @Override // xh.h, xh.b
    public g getDescriptor() {
        return descriptor;
    }

    @Override // xh.h
    public void serialize(d dVar, UserDecisionWrapper userDecisionWrapper) {
        l.f("encoder", dVar);
        l.f("value", userDecisionWrapper);
        g descriptor2 = getDescriptor();
        b bVarD = dVar.d(descriptor2);
        bVarD.z(descriptor2, 0, UserDecisionWrapper.$childSerializers[0], userDecisionWrapper.decisions);
        bVarD.b(descriptor2);
    }

    @Override // bi.w
    public c[] typeParametersSerializers() {
        return o0.f3002b;
    }
}
