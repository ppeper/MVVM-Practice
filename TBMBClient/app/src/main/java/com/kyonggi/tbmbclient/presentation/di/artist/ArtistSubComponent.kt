package com.kyonggi.tbmbclient.presentation.di.artist

import com.kyonggi.tbmbclient.presentation.artist.ArtistActivity
import dagger.Subcomponent

@ArtistScope
@Subcomponent(modules = [ArtistModule::class])
interface ArtistSubComponent {
    fun inject(artistActivity: ArtistActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): ArtistSubComponent
    }
}