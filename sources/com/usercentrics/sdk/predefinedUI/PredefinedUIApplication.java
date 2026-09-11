package com.usercentrics.sdk.predefinedUI;

import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.models.common.UsercentricsLoggerLevel;
import com.usercentrics.sdk.v2.cookie.service.UsercentricsCookieInformationService;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIApplication {
    private final UsercentricsCookieInformationService cookieInformationService;
    private final UsercentricsLogger logger;
    private final UsercentricsLoggerLevel loggerLevel;

    public PredefinedUIApplication(UsercentricsCookieInformationService usercentricsCookieInformationService, UsercentricsLogger usercentricsLogger, UsercentricsLoggerLevel usercentricsLoggerLevel) {
        l.f("cookieInformationService", usercentricsCookieInformationService);
        l.f("logger", usercentricsLogger);
        l.f("loggerLevel", usercentricsLoggerLevel);
        this.cookieInformationService = usercentricsCookieInformationService;
        this.logger = usercentricsLogger;
        this.loggerLevel = usercentricsLoggerLevel;
    }

    public final UsercentricsCookieInformationService getCookieInformationService() {
        return this.cookieInformationService;
    }

    public final UsercentricsLogger getLogger() {
        return this.logger;
    }

    public final UsercentricsLoggerLevel getLoggerLevel() {
        return this.loggerLevel;
    }
}
