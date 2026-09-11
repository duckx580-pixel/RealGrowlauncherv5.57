package com.usercentrics.sdk.v2.location.repository;

import ci.b;
import com.usercentrics.sdk.core.json.JsonParser;
import com.usercentrics.sdk.core.json.JsonParserKt;
import com.usercentrics.sdk.v2.location.cache.ILocationCache;
import com.usercentrics.sdk.v2.location.data.LocationData;
import com.usercentrics.sdk.v2.location.data.LocationDataResponse;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationRepository implements ILocationRepository {
    private final JsonParser jsonParser;
    private final ILocationCache locationCache;

    public LocationRepository(ILocationCache iLocationCache, JsonParser jsonParser) {
        l.f("locationCache", iLocationCache);
        l.f("jsonParser", jsonParser);
        this.locationCache = iLocationCache;
        this.jsonParser = jsonParser;
    }

    private final LocationData parseJson(String str) {
        return ((LocationDataResponse) JsonParserKt.json.a(LocationDataResponse.Companion.serializer(), str)).getData();
    }

    @Override // com.usercentrics.sdk.v2.location.repository.ILocationRepository
    public LocationData getCachedLocation() {
        String cachedLocation = this.locationCache.getCachedLocation();
        if (cachedLocation == null) {
            return null;
        }
        return parseJson(cachedLocation);
    }

    @Override // com.usercentrics.sdk.v2.location.repository.ILocationRepository
    public LocationData getInjectedLocation() {
        String injectedLocation = this.locationCache.getInjectedLocation();
        if (injectedLocation == null) {
            return null;
        }
        return parseJson(injectedLocation);
    }

    @Override // com.usercentrics.sdk.v2.location.repository.ILocationRepository
    public void storeLocation(UsercentricsLocation usercentricsLocation) {
        l.f("location", usercentricsLocation);
        ILocationCache iLocationCache = this.locationCache;
        LocationDataResponse locationDataResponse = new LocationDataResponse(new LocationData(usercentricsLocation));
        b bVar = JsonParserKt.json;
        iLocationCache.storeLocation(bVar.b(qj.b.q(bVar.f3529b, y.b(LocationDataResponse.class)), locationDataResponse));
    }
}
