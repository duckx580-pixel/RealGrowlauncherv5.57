package zc;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21089a;

    public r(String str) {
        this.f21089a = str;
    }

    @Override // zc.q
    public final void a(StringWriter stringWriter) throws IOException {
        stringWriter.write(this.f21089a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f21089a.equals(((r) obj).f21089a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21089a.hashCode();
    }

    public final String toString() {
        return this.f21089a;
    }
}
