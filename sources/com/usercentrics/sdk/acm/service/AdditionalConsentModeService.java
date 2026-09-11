package com.usercentrics.sdk.acm.service;

import com.usercentrics.sdk.AdTechProvider;
import com.usercentrics.sdk.AdditionalConsentModeData;
import java.util.List;
import qg.o;
import ug.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface AdditionalConsentModeService {
    void acceptAll();

    void denyAll();

    boolean didATPSChange(List<Integer> list);

    String getAcString();

    List<AdTechProvider> getAdTechProviderList();

    AdditionalConsentModeData getData();

    Object load(List<Integer> list, c<? super o> cVar);

    void reset();

    void save(String str);

    void save(List<Integer> list);

    void setAcString(String str);

    void setAdTechProviderList(List<AdTechProvider> list);
}
