package com.tinyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by angel on 2017/11/13.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
