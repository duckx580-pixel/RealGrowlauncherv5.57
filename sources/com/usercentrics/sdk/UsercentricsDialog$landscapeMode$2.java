package com.usercentrics.sdk;

import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UsercentricsDialog$landscapeMode$2 extends m implements a {
    final UsercentricsDialog this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsercentricsDialog$landscapeMode$2(UsercentricsDialog usercentricsDialog) {
        super(0);
        this.this$0 = usercentricsDialog;
    }

    @Override // eh.a
    public final Boolean invoke() {
        return Boolean.valueOf(this.this$0.isOrientationLandscape() || this.this$0.isTablet());
    }
}
