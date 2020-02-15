package `in`.co.droidcon.ktor

import `in`.co.droidcon.response.BreedResult

interface KtorApi {
    suspend fun getJsonFromApi(): BreedResult
}