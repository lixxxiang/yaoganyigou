package com.android.lixiang.yaoganyigou.presenter.data.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HomePageSlideBean {

    /**
     * data : [{"dataType":"110","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/go/1.png"},{"dataType":"3","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/go/2.jpg","link":"orderData.html","productId":"JL103B_MSS_20171006162735_100002453_101_001_L1B_MSS"},{"dataType":"3","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/go/3.jpg","link":"Geosight.html"},{"dataType":"3","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/go/5.png","link":"masterIndex.html?status=2","productId":"JL101A_PMS_20170101164550_000017266_204_0013_001_L1_PAN"},{"dataType":"3","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/go/6.png","link":"http://mall.charmingglobe.com/"}]
     * message : success
     * status : 200
     */

    private String message;
    private int status;
    private List<DataBean> data;

    public static HomePageSlideBean objectFromData(String str) {

        return new Gson().fromJson(str, HomePageSlideBean.class);
    }

    public static HomePageSlideBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HomePageSlideBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HomePageSlideBean> arrayHomePageSlideBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomePageSlideBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HomePageSlideBean> arrayHomePageSlideBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HomePageSlideBean>>() {
            }.getType();

            return new Gson().fromJson(jsonObject.getString(str), listType);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return new ArrayList();


    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * dataType : 110
         * imageUrl : http://59.110.164.214:8086/ygyg/ygyg_index_pic/go/1.png
         * link : orderData.html
         * productId : JL103B_MSS_20171006162735_100002453_101_001_L1B_MSS
         */

        private String dataType;
        private String imageUrl;
        private String link;
        private String productId;

        public static DataBean objectFromData(String str) {

            return new Gson().fromJson(str, DataBean.class);
        }

        public static DataBean objectFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);

                return new Gson().fromJson(jsonObject.getString(str), DataBean.class);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        public static List<DataBean> arrayDataBeanFromData(String str) {

            Type listType = new TypeToken<ArrayList<DataBean>>() {
            }.getType();

            return new Gson().fromJson(str, listType);
        }

        public static List<DataBean> arrayDataBeanFromData(String str, String key) {

            try {
                JSONObject jsonObject = new JSONObject(str);
                Type listType = new TypeToken<ArrayList<DataBean>>() {
                }.getType();

                return new Gson().fromJson(jsonObject.getString(str), listType);

            } catch (JSONException e) {
                e.printStackTrace();
            }

            return new ArrayList();


        }

        public String getDataType() {
            return dataType;
        }

        public void setDataType(String dataType) {
            this.dataType = dataType;
        }

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }
    }
}
