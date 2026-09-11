package com.usercentrics.sdk.ui;

import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.predefinedUI.PredefinedUIConsentManager;
import com.usercentrics.sdk.v2.banner.service.BannerViewDataService;
import com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIApplicationManager {
    private final BannerViewDataService bannerViewDataService;
    private final PredefinedUIConsentManager consentManager;
    private final UsercentricsCookieInformationService cookieInformationService;
    private final UsercentricsLogger logger;

    public PredefinedUIApplicationManager(PredefinedUIConsentManager predefinedUIConsentManager, UsercentricsLogger usercentricsLogger, UsercentricsCookieInformationService usercentricsCookieInformationService, BannerViewDataService bannerViewDataService) {
        l.f("consentManager", predefinedUIConsentManager);
        l.f("logger", usercentricsLogger);
        l.f("cookieInformationService", usercentricsCookieInformationService);
        l.f("bannerViewDataService", bannerViewDataService);
        this.consentManager = predefinedUIConsentManager;
        this.logger = usercentricsLogger;
        this.cookieInformationService = usercentricsCookieInformationService;
        this.bannerViewDataService = bannerViewDataService;
    }

    public final BannerViewDataService getBannerViewDataService() {
        return this.bannerViewDataService;
    }

    public final PredefinedUIConsentManager getConsentManager() {
        return this.consentManager;
    }

    public final UsercentricsCookieInformationService getCookieInformationService() {
        return this.cookieInformationService;
    }

    public final UsercentricsLogger getLogger() {
        return this.logger;
    }
}
