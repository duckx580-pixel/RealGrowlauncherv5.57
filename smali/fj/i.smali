###### Class fj.i (fj.i)
.class public final Lfj/i;
.super Loj/d;
.source "r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3"


# instance fields
.field public final synthetic m:Lfj/j;


# direct methods
.method public constructor <init>(Lfj/j;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfj/i;->m:Lfj/j;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j()V
    .registers 2

    .line 1
    iget-object v0, p0, Lfj/i;->m:Lfj/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lfj/j;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
