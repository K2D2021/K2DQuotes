package ru.k2d.k2dquotes.domain.repository

interface MyRepository {

    suspend fun doNetworkCall()
}