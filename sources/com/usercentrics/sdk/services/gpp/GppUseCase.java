package com.usercentrics.sdk.services.gpp;

import com.usercentrics.gpp.core.GppModel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface GppUseCase {
    void clear();

    List<Integer> getApplicableSections();

    Object getFieldValue(String str, String str2);

    GppData getGppData();

    GppModel getGppModel();

    String getGppString();

    boolean hasSection(int i10);

    boolean hasSectionByName(String str);

    void restore(String str);

    void save();

    void setFieldValue(String str, String str2, Object obj);
}
