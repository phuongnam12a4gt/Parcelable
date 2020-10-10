package com.example.demoparcelable.model

import android.os.Parcel
import android.os.Parcelable

class PhieuChi : Parcelable {
    public var mdata:String?=null
    constructor(data:String)
    {
        this.mdata=data
    }
    constructor(parcel: Parcel) {
        mdata = parcel.readString()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(mdata)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PhieuChi> {
        override fun createFromParcel(parcel: Parcel): PhieuChi {
            return PhieuChi(parcel)
        }

        override fun newArray(size: Int): Array<PhieuChi?> {
            return arrayOfNulls(size)
        }
    }
}