package ru.k2d.k2dquotes.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.k2d.k2dquotes.data.repository.MyRepositoryImpl
import ru.k2d.k2dquotes.domain.repository.MyRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindMyRepository(
        myRepositoryImpl: MyRepositoryImpl
    ) : MyRepository
}