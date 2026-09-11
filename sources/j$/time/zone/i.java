package j$.time.zone;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f8703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentMap f8704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Set f8705d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f8706a;

    static {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        f8703b = copyOnWriteArrayList;
        f8704c = new ConcurrentHashMap(512, 0.75f, 2);
        ArrayList arrayList = new ArrayList();
        AccessController.doPrivileged(new h(arrayList));
        copyOnWriteArrayList.addAll(arrayList);
    }

    public static f a(String str) {
        Objects.requireNonNull(str, "zoneId");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) f8704c;
        i iVar = (i) concurrentHashMap.get(str);
        if (iVar == null) {
            if (concurrentHashMap.isEmpty()) {
                throw new g("No time-zone data files registered");
            }
            throw new g("Unknown time-zone ID: ".concat(str));
        }
        if (iVar.f8706a.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new g("Not a built-in time zone: ".concat(str));
    }

    public static void b(i iVar) {
        Objects.requireNonNull(iVar, "provider");
        synchronized (i.class) {
            try {
                for (String str : iVar.f8706a) {
                    Objects.requireNonNull(str, "zoneId");
                    if (((i) ((ConcurrentHashMap) f8704c).putIfAbsent(str, iVar)) != null) {
                        throw new g("Unable to register zone as one already registered with that ID: " + str + ", currently loading from provider: " + iVar);
                    }
                }
                f8705d = Collections.unmodifiableSet(new HashSet(((ConcurrentHashMap) f8704c).keySet()));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f8703b.add(iVar);
    }

    public i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f8706a = Collections.unmodifiableSet(linkedHashSet);
    }
}
