package br.senai.sp.jandira.reqres_retrofit

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(

    @SerializedName("data")
    var data: T? = null

)