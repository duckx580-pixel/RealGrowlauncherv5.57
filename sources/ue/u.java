package ue;

import com.google.protobuf.kotlin.DslList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f17779a;

    public u(w wVar) {
        this.f17779a = wVar;
    }

    public final void a() {
        List listUnmodifiableList = Collections.unmodifiableList(((x) this.f17779a.f4674r).o());
        kotlin.jvm.internal.l.e("_builder.getOptionsList()", listUnmodifiableList);
        new DslList(listUnmodifiableList);
    }
}
