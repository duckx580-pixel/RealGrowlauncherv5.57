###### Class uk.a (uk.a)
.class public interface abstract Luk/a;
.super Ljava/lang/Object;
.source "r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3"


# static fields
.field public static final n:Ljava/lang/String;

.field public static final o:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 1
    sget-boolean v0, Lsk/g;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    const-string v1, "invalid backref number/name"

    .line 6
    .line 7
    goto :goto_9

    .line 8
    :cond_7
    const-string v1, "invalid backref number"

    .line 9
    .line 10
    :goto_9
    sput-object v1, Luk/a;->n:Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    const-string v0, "invalid char in group name <%n>"

    .line 15
    .line 16
    goto :goto_12

    .line 17
    :cond_10
    const-string v0, "invalid char in group number <%n>"

    .line 18
    .line 19
    :goto_12
    sput-object v0, Luk/a;->o:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method
