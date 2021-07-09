package com.thyagoneves.daggerhiltexample

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @ActivityScoped
    @Provides
    @Named("String2")
    fun provideTestString1(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String
    ) = "${context.getString(R.string.string_we_will_inject)} - $testString1"
}