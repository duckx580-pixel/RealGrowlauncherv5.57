package com.usercentrics.sdk.lifecycle;

import com.usercentrics.sdk.core.settings.SettingsOrchestrator;
import com.usercentrics.sdk.services.billing.BillingService;
import eh.a;
import eh.c;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class BillingSessionLifecycleCallback implements a {
    private final BillingService billingService;
    private final SettingsOrchestrator settingsOrchestrator;

    /* JADX INFO: renamed from: com.usercentrics.sdk.lifecycle.BillingSessionLifecycleCallback$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class AnonymousClass1 extends m implements c {
        final BillingSessionLifecycleCallback this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BillingSessionLifecycleCallback billingSessionLifecycleCallback) {
            super(1);
            this.this$0 = billingSessionLifecycleCallback;
        }

        @Override // eh.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return o.f13926a;
        }

        public final void invoke(String str) {
            l.f("it", str);
            this.this$0.billingService.reportSession(str);
        }
    }

    public BillingSessionLifecycleCallback(BillingService billingService, SettingsOrchestrator settingsOrchestrator) {
        l.f("billingService", billingService);
        l.f("settingsOrchestrator", settingsOrchestrator);
        this.billingService = billingService;
        this.settingsOrchestrator = settingsOrchestrator;
    }

    @Override // eh.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m62invoke();
        return o.f13926a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public void m62invoke() {
        this.settingsOrchestrator.getSettingsIdObservable().subscribe(new AnonymousClass1(this));
    }
}
