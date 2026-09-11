package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f1955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1956b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1955a.equals(((AudioAttributesImplApi21) obj).f1955a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1955a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1955a;
    }
}
