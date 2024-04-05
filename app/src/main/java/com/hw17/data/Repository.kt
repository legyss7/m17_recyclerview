package com.hw17.data

import com.hw17.data.model.PhotosMarsModel
import javax.inject.Inject

class Repository @Inject constructor() {
    suspend fun loadMars(): PhotosMarsModel {
        return RetrofitServices.nasaApi.getListMars()
    }
}