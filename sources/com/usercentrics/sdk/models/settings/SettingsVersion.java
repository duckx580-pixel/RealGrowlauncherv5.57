package com.usercentrics.sdk.models.settings;

import o1.c;
import xg.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SettingsVersion {
    private static final a $ENTRIES;
    private static final SettingsVersion[] $VALUES;
    public static final SettingsVersion MAJOR = new SettingsVersion("MAJOR", 0);
    public static final SettingsVersion MINOR = new SettingsVersion("MINOR", 1);
    public static final SettingsVersion PATCH = new SettingsVersion("PATCH", 2);

    private static final /* synthetic */ SettingsVersion[] $values() {
        return new SettingsVersion[]{MAJOR, MINOR, PATCH};
    }

    static {
        SettingsVersion[] settingsVersionArr$values = $values();
        $VALUES = settingsVersionArr$values;
        $ENTRIES = c.p(settingsVersionArr$values);
    }

    private SettingsVersion(String str, int i10) {
    }

    public static a getEntries() {
        return $ENTRIES;
    }

    public static SettingsVersion valueOf(String str) {
        return (SettingsVersion) Enum.valueOf(SettingsVersion.class, str);
    }

    public static SettingsVersion[] values() {
        return (SettingsVersion[]) $VALUES.clone();
    }
}
