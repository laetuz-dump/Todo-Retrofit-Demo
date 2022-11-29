package com.neotica.retrofitdemo

import retrofit2.Response
import retrofit2.http.GET

//Step 7
interface TodoApi {
    //Step 8: Create a function to get the response from the data class.
    /*fun getTodos(): Response<Todo>*/
    //Step 10: Annotate a @GET requests.
    //Step 11: Specify parentheses.
    @GET("/u/0/uc?id=1Sw1_wDka4nfeEgwYGSVgM12A6Qa366C2")
    //Step 9: We have multiple todos, nest the Todo in a Lists.
    //Step 12: Suspend.
    suspend fun getTodos(): Response<List<Todo>>
}