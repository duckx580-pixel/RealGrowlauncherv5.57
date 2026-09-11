package ck;

import java.io.ByteArrayInputStream;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements EntityResolver {
    @Override // org.xml.sax.EntityResolver
    public final InputSource resolveEntity(String str, String str2) {
        return new InputSource(new ByteArrayInputStream("<?xml version='1.0' encoding='UTF-8'?>".getBytes()));
    }
}
