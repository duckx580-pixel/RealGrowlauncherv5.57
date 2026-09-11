package j$.time.format;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import j$.time.z;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.b f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j$.time.temporal.n f8573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j$.time.chrono.m f8574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j$.time.x f8575d;

    public q(j$.time.chrono.b bVar, j$.time.temporal.n nVar, j$.time.chrono.m mVar, j$.time.x xVar) {
        this.f8572a = bVar;
        this.f8573b = nVar;
        this.f8574c = mVar;
        this.f8575d = xVar;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.f8572a;
        if (bVar != null && rVar.isDateBased()) {
            return bVar.f(rVar);
        }
        return this.f8573b.f(rVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v k(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.f8572a;
        if (bVar != null && rVar.isDateBased()) {
            return bVar.k(rVar);
        }
        return this.f8573b.k(rVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.r rVar) {
        j$.time.chrono.b bVar = this.f8572a;
        if (bVar != null && rVar.isDateBased()) {
            return bVar.g(rVar);
        }
        return this.f8573b.g(rVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(z zVar) {
        if (zVar == j$.time.temporal.s.f8651b) {
            return this.f8574c;
        }
        if (zVar == j$.time.temporal.s.f8650a) {
            return this.f8575d;
        }
        if (zVar == j$.time.temporal.s.f8652c) {
            return this.f8573b.b(zVar);
        }
        return zVar.j(this);
    }

    public final String toString() {
        String str;
        String str2 = PredefinedUICustomizationFont.defaultFamily;
        j$.time.chrono.m mVar = this.f8574c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = PredefinedUICustomizationFont.defaultFamily;
        }
        j$.time.x xVar = this.f8575d;
        if (xVar != null) {
            str2 = " with zone " + xVar;
        }
        return this.f8573b + str + str2;
    }
}
