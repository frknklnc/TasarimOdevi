package com.example.kisileruygulamasi.data.entity

import com.google.gson.annotations.SerializedName

data class CRUDCevap(@SerializedName ("success")var suscess:Int,
                     @SerializedName ("message")var message:String) {
}