package com.usercentrics.sdk;

import com.usercentrics.sdk.errors.NotInitializedException;
import com.usercentrics.sdk.errors.NotReadyException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import qg.h;
import qg.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
abstract class UsercentricsInstanceState {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        private Companion() {
        }

        public final UsercentricsInstanceState from(UsercentricsSDK usercentricsSDK, i iVar) {
            Throwable thA = iVar != null ? i.a(iVar.f13914i) : null;
            return thA != null ? new Invalid(thA) : usercentricsSDK == null ? new Invalid(new NotInitializedException(null, null, 3, null)) : (iVar == null || !((iVar.f13914i instanceof h) ^ true)) ? new Invalid(new NotReadyException()) : new Valid(usercentricsSDK);
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Invalid extends UsercentricsInstanceState {
        private final Throwable cause;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Invalid(Throwable th2) {
            super(null);
            l.f("cause", th2);
            this.cause = th2;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Valid extends UsercentricsInstanceState {
        private final UsercentricsSDK value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Valid(UsercentricsSDK usercentricsSDK) {
            super(null);
            l.f("value", usercentricsSDK);
            this.value = usercentricsSDK;
        }

        public final UsercentricsSDK getValue() {
            return this.value;
        }
    }

    private UsercentricsInstanceState() {
    }

    public /* synthetic */ UsercentricsInstanceState(g gVar) {
        this();
    }
}
