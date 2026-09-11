###### Class cl.g (cl.g)
.class public abstract Lcl/g;
.super Ljava/lang/Object;
.source "r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3"


# instance fields
.field public final a:Ljava/util/Optional;

.field public final b:Ljava/util/Optional;


# direct methods
.method public constructor <init>(Ljava/util/Optional;Ljava/util/Optional;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/util/Optional;->isPresent()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_f

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/util/Optional;->isPresent()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1c

    .line 15
    .line 16
    :cond_f
    invoke-virtual {p1}, Ljava/util/Optional;->isPresent()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_24

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/util/Optional;->isPresent()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1c

    .line 27
    .line 28
    goto :goto_24

    .line 29
    :cond_1c
    new-instance p1, Ljava/lang/NullPointerException;

    .line 30
    .line 31
    const-string p2, "Both marks must be either present or absent."

    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_24
    :goto_24
    iput-object p1, p0, Lcl/g;->a:Ljava/util/Optional;

    .line 38
    .line 39
    iput-object p2, p0, Lcl/g;->b:Ljava/util/Optional;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method
