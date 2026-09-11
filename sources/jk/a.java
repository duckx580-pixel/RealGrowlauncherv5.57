package jk;

import java.util.function.Predicate;
import org.eclipse.tm4e.languageconfiguration.internal.model.AutoClosingPair;
import org.eclipse.tm4e.languageconfiguration.internal.model.AutoClosingPairConditional;
import org.eclipse.tm4e.languageconfiguration.internal.model.CharacterPair;
import org.eclipse.tm4e.languageconfiguration.internal.model.LanguageConfiguration;
import org.eclipse.tm4e.languageconfiguration.internal.model.OnEnterRule;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8943a;

    public /* synthetic */ a(int i10) {
        this.f8943a = i10;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f8943a) {
            case 0:
                return ((CharacterPair) obj) != null;
            case 1:
                return LanguageConfiguration.lambda$load$8((AutoClosingPairConditional) obj);
            case 2:
                return LanguageConfiguration.lambda$load$9((CharacterPair) obj);
            case 3:
                return LanguageConfiguration.lambda$load$10((OnEnterRule) obj);
            case 4:
                return LanguageConfiguration.lambda$load$11((AutoClosingPair) obj);
            default:
                return LanguageConfiguration.lambda$load$12((CharacterPair) obj);
        }
    }
}
