###### Class k3.f (k3.f)
.class public final Lk3/f;
.super Lp3/b;
.source "r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3"


# instance fields
.field public b:Lj3/b;


# virtual methods
.method public final b(I)V
    .registers 3

    .line 1
    iget-object v0, p0, Lk3/f;->b:Lj3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lj3/b;->g(I)V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
.end method

.method public final c(Landroid/graphics/Typeface;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lk3/f;->b:Lj3/b;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lj3/b;->h(Landroid/graphics/Typeface;)V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
.end method
