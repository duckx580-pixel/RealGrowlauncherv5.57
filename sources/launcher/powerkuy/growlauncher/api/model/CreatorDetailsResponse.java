package launcher.powerkuy.growlauncher.api.model;

import kotlin.jvm.internal.l;
import nb.b;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class CreatorDetailsResponse {
    public static final int $stable = 8;

    @b("creator")
    private final Creator creator;

    @b("success")
    private final boolean success;

    public CreatorDetailsResponse(boolean z3, Creator creator) {
        l.f("creator", creator);
        this.success = z3;
        this.creator = creator;
    }

    public static /* synthetic */ CreatorDetailsResponse copy$default(CreatorDetailsResponse creatorDetailsResponse, boolean z3, Creator creator, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z3 = creatorDetailsResponse.success;
        }
        if ((i10 & 2) != 0) {
            creator = creatorDetailsResponse.creator;
        }
        return creatorDetailsResponse.copy(z3, creator);
    }

    public final boolean component1() {
        return this.success;
    }

    public final Creator component2() {
        return this.creator;
    }

    public final CreatorDetailsResponse copy(boolean z3, Creator creator) {
        l.f("creator", creator);
        return new CreatorDetailsResponse(z3, creator);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorDetailsResponse)) {
            return false;
        }
        CreatorDetailsResponse creatorDetailsResponse = (CreatorDetailsResponse) obj;
        return this.success == creatorDetailsResponse.success && l.a(this.creator, creatorDetailsResponse.creator);
    }

    public final Creator getCreator() {
        return this.creator;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return this.creator.hashCode() + (Boolean.hashCode(this.success) * 31);
    }

    public String toString() {
        return "CreatorDetailsResponse(success=" + this.success + ", creator=" + this.creator + ")";
    }
}
