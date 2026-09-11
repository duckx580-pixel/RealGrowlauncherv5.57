package com.usercentrics.sdk.v2.location.service;

import com.usercentrics.sdk.v2.location.data.LocationData;
import com.usercentrics.sdk.v2.location.data.UsercentricsLocation;
import com.usercentrics.sdk.v2.location.repository.ILocationRepository;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class LocationService implements ILocationService {
    private UsercentricsLocation location;
    private final ILocationRepository locationRepository;

    public LocationService(ILocationRepository iLocationRepository) {
        l.f("locationRepository", iLocationRepository);
        this.locationRepository = iLocationRepository;
        this.location = new UsercentricsLocation((String) null, (String) null, 3, (g) null);
    }

    private final boolean isInvalidLocation(UsercentricsLocation usercentricsLocation) {
        return usercentricsLocation == null || usercentricsLocation.isEmpty();
    }

    @Override // com.usercentrics.sdk.v2.location.service.ILocationService
    public UsercentricsLocation getLocation() {
        return this.location;
    }

    @Override // com.usercentrics.sdk.v2.location.service.ILocationService
    public boolean loadLocation() {
        LocationData injectedLocation = this.locationRepository.getInjectedLocation();
        UsercentricsLocation clientLocation = injectedLocation != null ? injectedLocation.getClientLocation() : null;
        if (isInvalidLocation(clientLocation)) {
            LocationData cachedLocation = this.locationRepository.getCachedLocation();
            clientLocation = cachedLocation != null ? cachedLocation.getClientLocation() : null;
        }
        if (isInvalidLocation(clientLocation)) {
            return false;
        }
        l.c(clientLocation);
        set(clientLocation);
        return true;
    }

    @Override // com.usercentrics.sdk.v2.location.service.ILocationService
    public void set(UsercentricsLocation usercentricsLocation) {
        l.f("location", usercentricsLocation);
        if (isInvalidLocation(usercentricsLocation)) {
            return;
        }
        setLocation(usercentricsLocation);
        this.locationRepository.storeLocation(usercentricsLocation);
    }

    public void setLocation(UsercentricsLocation usercentricsLocation) {
        l.f("<set-?>", usercentricsLocation);
        this.location = usercentricsLocation;
    }
}
