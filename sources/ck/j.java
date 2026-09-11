package ck;

import java.io.IOException;
import java.io.StringReader;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tf.e f3589a = tf.e.a(j.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f3590b = new j();

    public static c a(StringReader stringReader, d dVar) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
        sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
        xMLReader.setEntityResolver(new g());
        c cVarF = dVar.f();
        xMLReader.setContentHandler(new h(cVarF, dVar));
        xMLReader.parse(new InputSource(stringReader));
        return cVarF;
    }
}
