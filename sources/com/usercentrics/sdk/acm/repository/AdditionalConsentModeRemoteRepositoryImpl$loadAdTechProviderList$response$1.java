package com.usercentrics.sdk.acm.repository;

import androidx.work.v;
import com.usercentrics.sdk.acm.api.AdditionalConsentModeApi;
import com.usercentrics.sdk.domain.api.http.HttpResponse;
import eh.c;
import java.util.Map;
import qg.o;
import vg.a;
import wg.e;
import wg.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.sdk.acm.repository.AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1", f = "AdditionalConsentModeRemoteRepositoryImpl.kt", l = {22}, m = "invokeSuspend")
public final class AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1 extends i implements c {
    int label;
    final AdditionalConsentModeRemoteRepositoryImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1(AdditionalConsentModeRemoteRepositoryImpl additionalConsentModeRemoteRepositoryImpl, ug.c<? super AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1> cVar) {
        super(1, cVar);
        this.this$0 = additionalConsentModeRemoteRepositoryImpl;
    }

    @Override // wg.a
    public final ug.c<o> create(ug.c<?> cVar) {
        return new AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1(this.this$0, cVar);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f18663i;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.B(obj);
            return obj;
        }
        v.B(obj);
        AdditionalConsentModeApi additionalConsentModeApi = this.this$0.api;
        Map<String, String> apiHeaders = this.this$0.getApiHeaders();
        this.label = 1;
        Object objLoadAdTechProviderList = additionalConsentModeApi.loadAdTechProviderList(apiHeaders, this);
        return objLoadAdTechProviderList == aVar ? aVar : objLoadAdTechProviderList;
    }

    @Override // eh.c
    public final Object invoke(ug.c<? super HttpResponse> cVar) {
        return ((AdditionalConsentModeRemoteRepositoryImpl$loadAdTechProviderList$response$1) create(cVar)).invokeSuspend(o.f13926a);
    }
}
