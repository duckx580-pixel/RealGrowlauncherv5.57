package com.usercentrics.sdk.models.api;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class ApiErrors {
    public static final String AVAILABLE_LANGUAGES_SETTINGS_NOT_FOUND = "Unable to initialise due to wrong configuration, please make sure your settingsID correct.";
    public static final String FETCH_AVAILABLE_LANGUAGES = "Unable to initialise due to poor or no network connection while fetching the available languages.";
    public static final String FETCH_DATA_PROCESSING_SERVICES = "Unable to initialise due to poor or no network connection while fetching the processing services.";
    public static final String FETCH_RULE_SET = "Unable to initialise due to poor or no network connection while fetching the rule Set.";
    public static final String FETCH_SETTINGS = "Unable to initialise due to poor or no network connection while fetching the settings.";
    public static final String FETCH_TCF_DATA = "Unable to initialise due to poor or no network connection while fetching the TCF data.";
    public static final ApiErrors INSTANCE = new ApiErrors();
    public static final String LOCATION_NOT_AVAILABLE = "Unable to initialise because location is not available; check permission or connectivity.";
    public static final String RULE_SET_NOT_FOUND = "Unable to initialise due to wrong configuration, please make sure your settingsID/ruleSetID is correct.";

    private ApiErrors() {
    }
}
