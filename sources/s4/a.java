package s4;

import androidx.lifecycle.m0;
import androidx.lifecycle.v0;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends v0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15147b = "SaveableStateHolder_BackStackEntryKey";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UUID f15148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f15149d;

    public a(m0 m0Var) {
        Object obj;
        LinkedHashMap linkedHashMap = m0Var.f1898a;
        try {
            obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            if (m0Var.f1900c.remove("SaveableStateHolder_BackStackEntryKey") != null) {
                throw new ClassCastException();
            }
            m0Var.f1901d.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuidRandomUUID = (UUID) obj;
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
            m0Var.b(this.f15147b, uuidRandomUUID);
        }
        this.f15148c = uuidRandomUUID;
    }

    @Override // androidx.lifecycle.v0
    public final void d() {
        WeakReference weakReference = this.f15149d;
        if (weakReference == null) {
            kotlin.jvm.internal.l.l("saveableStateHolderRef");
            throw null;
        }
        x0.c cVar = (x0.c) weakReference.get();
        if (cVar != null) {
            cVar.e(this.f15148c);
        }
        WeakReference weakReference2 = this.f15149d;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            kotlin.jvm.internal.l.l("saveableStateHolderRef");
            throw null;
        }
    }
}
