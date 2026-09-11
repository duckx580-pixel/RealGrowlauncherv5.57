package com.usercentrics.sdk.services.initialValues;

import com.usercentrics.sdk.models.common.InitialView;
import com.usercentrics.sdk.models.common.UsercentricsVariant;
import qg.o;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface InitialValuesStrategy {
    Object boot(boolean z3, String str, c<? super o> cVar);

    UsercentricsVariant getVariant();

    void loadConsents(boolean z3, String str);

    InitialView resolveInitialView();
}
