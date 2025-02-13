// Generated by Ktorfit
@file:Suppress("warnings")

package com.determent.apofiz_sample.common.feature_star_wars.`data`.remote

import com.determent.apofiz_sample.common.feature_star_wars.`data`.model.PersonModel
import de.jensklingenberg.ktorfit.Call
import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.Response
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Int
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlinx.coroutines.flow.Flow

@OptIn(InternalKtorfitApi::class)
public class _StarWarsApiImpl(
  private val _ktorfit: Ktorfit,
) : StarWarsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun getPersonByIdResponse(peopleId: Int): PersonModel {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "people/${"$peopleId".encodeURLPath()}/")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<PersonModel>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override fun getPeopleByIdFlowResponse(peopleId: Int, world: String?): Flow<PersonModel> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "people/${"$peopleId".encodeURLPath()}/")
        world?.let{ parameter("hello", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Flow<PersonModel>>(),
    )
    return _helper.request(_typeData,_ext)!!
  }

  override fun getPeopleByIdCallResponse(peopleId: Int): Call<PersonModel> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "people/${"$peopleId".encodeURLPath()}/")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Call<PersonModel>>(),
    )
    return _helper.request(_typeData,_ext)!!
  }

  override fun queryTest(peopleId: Int, world: String?): Call<PersonModel> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "people/${"$peopleId".encodeURLPath()}/")
        world?.let{ parameter("hello", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Call<PersonModel>>(),
    )
    return _helper.request(_typeData,_ext)!!
  }

  override suspend fun getPersonResponse(personId: Int): Response<PersonModel> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "people/${"$personId".encodeURLPath()}/")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Response<PersonModel>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _StarWarsApiProvider : ClassProvider<StarWarsApi> {
  override fun create(_ktorfit: Ktorfit): StarWarsApi = _StarWarsApiImpl(_ktorfit)
}

public fun Ktorfit.createStarWarsApi(): StarWarsApi = _StarWarsApiImpl(this)
