package androidx.compose.foundation;

import a1.k;
import a1.m;
import a1.n;
import u.f0;
import v1.o0;
import x.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FocusableKt$FocusableInNonTouchModeElement$1 f1133a = new o0() { // from class: androidx.compose.foundation.FocusableKt$FocusableInNonTouchModeElement$1
        public final boolean equals(Object obj) {
            return this == obj;
        }

        @Override // v1.o0
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // v1.o0
        public final m m() {
            return new f0();
        }

        @Override // v1.o0
        public final /* bridge */ /* synthetic */ void n(m mVar) {
        }
    };

    public static final n a(n nVar, l lVar, boolean z3) {
        return nVar.j(z3 ? new FocusableElement(lVar).j(new o0() { // from class: androidx.compose.ui.focus.FocusTargetNode$FocusTargetElement
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // v1.o0
            public final int hashCode() {
                return 1739042953;
            }

            @Override // v1.o0
            public final m m() {
                return new e1.n();
            }

            @Override // v1.o0
            public final /* bridge */ /* synthetic */ void n(m mVar) {
            }
        }) : k.f196a);
    }
}
