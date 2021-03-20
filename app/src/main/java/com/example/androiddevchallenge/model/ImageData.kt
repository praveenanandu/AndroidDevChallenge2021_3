package com.example.androiddevchallenge.model

data class ImageData(
    val title : String,
    val imagePath : String,
    val subTitle : String = "This is a description",
    val selected : Boolean = false)

