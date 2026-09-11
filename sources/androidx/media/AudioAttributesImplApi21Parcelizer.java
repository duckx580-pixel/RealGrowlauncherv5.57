package androidx.media;

import android.media.AudioAttributes;
import i5.a;
import i5.b;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1955a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f1955a, 1);
        audioAttributesImplApi21.f1956b = aVar.f(audioAttributesImplApi21.f1956b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f1955a;
        aVar.i(1);
        ((b) aVar).f8073e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f1956b, 2);
    }
}
