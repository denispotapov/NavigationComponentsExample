package com.example.navigationcomponentsexample

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.math.BigDecimal

@Parcelize

data class Money(var amount: BigDecimal): Parcelable {

}