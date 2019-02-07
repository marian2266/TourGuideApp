/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.tourguideapp;

public class Place {

    private int mImageResourceId;
    private String mNameId;
    private String mAdressId;
    private String mTaxId;
    private String mProgramId;

    public Place(int ImageResourceId, String NameId, String AdressId, String TaxId, String ProgramId) {
        mImageResourceId = ImageResourceId;
        mNameId = NameId;
        mAdressId = AdressId;
        mTaxId = TaxId;
        mProgramId = ProgramId;
    }

    public Place(int ImageResourceId, String NameId, String AdressId) {
        mImageResourceId = ImageResourceId;
        mNameId = NameId;
        mAdressId = AdressId;
    }

    public Place(int ImageResourceId, String NameId, String AdressId, String ProgramId) {
        mImageResourceId = ImageResourceId;
        mNameId = NameId;
        mAdressId = AdressId;
        mProgramId = ProgramId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getNameId() {
        return mNameId;
    }

    public String getAdressId() {
        return mAdressId;
    }

    public String getTaxId() {
        return mTaxId;
    }

    public String getProgramId() {
        return mProgramId;
    }
}