package com.usercentrics.sdk.ui.components.cookie;

import a0.f0;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.usercentrics.sdk.models.settings.PredefinedUIStorageInformationButtonInfo;
import com.usercentrics.sdk.ui.R;
import com.usercentrics.sdk.ui.extensions.ContextExtensionsKt;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import i.d;
import i.h;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UCCookiesDialog {
    private h dialog;
    private final PredefinedUIStorageInformationButtonInfo storageInformation;
    private final UCThemeData theme;

    public UCCookiesDialog(UCThemeData uCThemeData, PredefinedUIStorageInformationButtonInfo predefinedUIStorageInformationButtonInfo) {
        l.f("theme", uCThemeData);
        l.f("storageInformation", predefinedUIStorageInformationButtonInfo);
        this.theme = uCThemeData;
        this.storageInformation = predefinedUIStorageInformationButtonInfo;
    }

    private final h createDialog(Context context, View view) {
        f0 f0Var = new f0(context, R.style.DialogBaseTheme);
        d dVar = (d) f0Var.f60s;
        dVar.f7797f = true;
        dVar.f7801k = view;
        f0Var.i();
        h hVarI = f0Var.i();
        hVarI.show();
        Window window = hVarI.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        return hVarI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismissDialog() {
        h hVar = this.dialog;
        if (hVar != null) {
            hVar.dismiss();
        }
        this.dialog = null;
    }

    public final void show(Context context) {
        l.f("context", context);
        this.dialog = createDialog(context, new UCCookiesView(ContextExtensionsKt.themed(context), this.theme, new UCCookiesViewModelImpl(this.storageInformation, new UCCookiesDialog$show$cookiesViewModel$1(this))));
    }
}
