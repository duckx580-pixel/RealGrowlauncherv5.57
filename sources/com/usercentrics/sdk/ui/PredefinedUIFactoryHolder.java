package com.usercentrics.sdk.ui;

import com.usercentrics.sdk.predefinedUI.PredefinedUIApplication;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class PredefinedUIFactoryHolder {
    private final PredefinedUIApplication uiApplication;
    private final PredefinedUIHolder uiHolder;

    public PredefinedUIFactoryHolder(PredefinedUIHolder predefinedUIHolder, PredefinedUIApplication predefinedUIApplication) {
        l.f("uiHolder", predefinedUIHolder);
        l.f("uiApplication", predefinedUIApplication);
        this.uiHolder = predefinedUIHolder;
        this.uiApplication = predefinedUIApplication;
    }

    public final PredefinedUIApplication getUiApplication() {
        return this.uiApplication;
    }

    public final PredefinedUIHolder getUiHolder() {
        return this.uiHolder;
    }
}
