package b2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2543a;

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f2543a == ((g) obj).f2543a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2543a);
    }

    public final String toString() {
        int i10 = this.f2543a;
        return i10 == 0 ? "Button" : i10 == 1 ? "Checkbox" : i10 == 2 ? "Switch" : i10 == 3 ? "RadioButton" : i10 == 4 ? "Tab" : i10 == 5 ? "Image" : i10 == 6 ? "DropdownList" : "Unknown";
    }
}
