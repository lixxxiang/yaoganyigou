package com.android.lixiang.yaoganyigou.presenter.data.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HomePageUnitsBean {

    /**
     * data : [{"description":"2019年度光谱星数据开放购买","pieces":[{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/1.png","posDescription":"光谱星数据","posMark":"开放购买","posTitle":"开放购买","position":"1","price":"1000.00"},{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/2.png","posDescription":"高清影像","posMark":"高清影像","posTitle":"光学一级","position":"2","price":"高清放送"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/3.png","posDescription":"高清夜景","posMark":"夜光影像","posTitle":"夜光增强","position":"3","price":"点击查看","productId":"JL103B_MSS_20170225053328_100000855_101_0008_003_L1A_MSS"},{"dataType":"videoSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/4.png","posDescription":"高清视频","posMark":"卫星视频","posTitle":"视频1A+1B","position":"4","price":"开放购买","productId":"JL103B_MSS_20170718155220_100001831_103_001_L1B_MSS"},{"dataType":"programSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/5.png","posDescription":"定制影像","posMark":"定制影像","posTitle":"编程摄影","position":"5","price":"点击查看"}],"title":"光谱星数据","type":"1"},{"description":"更新，更清晰，更优惠","pieces":[{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_2/1.jpg","position":"1","price":"1000.00"},{"dataType":"videoSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_2/2.jpg","position":"2","price":"1000.00"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_2/3.jpg","position":"3","price":"1000.00"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_2/3.jpg","link":"","position":"4","price":"1000.00"}],"title":"数据专场","type":"2"},{"description":"遥感信息深度挖掘","pieces":[{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/2018/01/25/JL101A_PMS_20180125111229_000021270_102_001_L1_MSS/JL101A_PMS_20180125111229_000021270_102_0012_001_L1_MSS/JL101A_PMS_20180125111229_000021270_102_0012_001_L1_MSS.jpg","posDescription":"天津朝华中电物流有限公司三堆场","posTitle":"天津市滨海新区","position":"1","price":"1000.01","productId":"JL101A_PMS_20180125111229_000021270_102_0012_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"10","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"2","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160526105738_000009150_102_0021_001_L1_MSS.jpg","posDescription":"山东省青岛第十六中学","posTitle":"山东省青岛市市北区南宁路","position":"3","price":"17323.00","productId":"JL101A_PMS_20160526105738_000009150_102_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160430104224_000007984_201_0021_001_L1_MSS.jpg","posDescription":"正大乐城","posTitle":"上海市徐汇区龙华中路","position":"4","price":"18223.00","productId":"JL101A_PMS_20160430104224_000007984_201_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"5","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"6","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"7","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"8","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"},{"dataType":"scene","imageUrl":"http://59.110.162.194:8085/ygyg/101A/old/JL101A_PMS_20160529103836_000009239_202_0021_001_L1_MSS.jpg","posDescription":"长春开发区二道村民委员会","posTitle":"吉林省长春市二道区","position":"9","price":"11126.00","productId":"JL101A_PMS_20160529103836_000009239_202_0021_001_L1_PAN"}],"title":"推荐数据","type":"3"}]
     * message : success
     * status : 200
     */

    private String message;
    private int status;
    private List<DataBean> data;

    public static HomePageUnitsBean objectFromData(String str) {

        return new Gson().fromJson(str, HomePageUnitsBean.class);
    }

    public static HomePageUnitsBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), HomePageUnitsBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<HomePageUnitsBean> arrayHomePageUnitsBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<HomePageUnitsBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<HomePageUnitsBean> arrayHomePageUnitsBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<HomePageUnitsBean>>() {
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
         * description : 2019年度光谱星数据开放购买
         * pieces : [{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/1.png","posDescription":"光谱星数据","posMark":"开放购买","posTitle":"开放购买","position":"1","price":"1000.00"},{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/2.png","posDescription":"高清影像","posMark":"高清影像","posTitle":"光学一级","position":"2","price":"高清放送"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/3.png","posDescription":"高清夜景","posMark":"夜光影像","posTitle":"夜光增强","position":"3","price":"点击查看","productId":"JL103B_MSS_20170225053328_100000855_101_0008_003_L1A_MSS"},{"dataType":"videoSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/4.png","posDescription":"高清视频","posMark":"卫星视频","posTitle":"视频1A+1B","position":"4","price":"开放购买","productId":"JL103B_MSS_20170718155220_100001831_103_001_L1B_MSS"},{"dataType":"programSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/5.png","posDescription":"定制影像","posMark":"定制影像","posTitle":"编程摄影","position":"5","price":"点击查看"}]
         * title : 光谱星数据
         * type : 1
         */

        private String description;
        private String title;
        private String type;
        private List<PiecesBean> pieces;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public List<PiecesBean> getPieces() {
            return pieces;
        }

        public void setPieces(List<PiecesBean> pieces) {
            this.pieces = pieces;
        }

        public static class PiecesBean {
            /**
             * dataType : sceneSearch
             * imageUrl : http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/zone_1/1.png
             * posDescription : 光谱星数据
             * posMark : 开放购买
             * posTitle : 开放购买
             * position : 1
             * price : 1000.00
             * productId : JL103B_MSS_20170225053328_100000855_101_0008_003_L1A_MSS
             */

            private String dataType;
            private String imageUrl;
            private String posDescription;
            private String posMark;
            private String posTitle;
            private String position;
            private String price;
            private String productId;

            public static PiecesBean objectFromData(String str) {

                return new Gson().fromJson(str, PiecesBean.class);
            }

            public static PiecesBean objectFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);

                    return new Gson().fromJson(jsonObject.getString(str), PiecesBean.class);
                } catch (JSONException e) {
                    e.printStackTrace();
                }

                return null;
            }

            public static List<PiecesBean> arrayPiecesBeanFromData(String str) {

                Type listType = new TypeToken<ArrayList<PiecesBean>>() {
                }.getType();

                return new Gson().fromJson(str, listType);
            }

            public static List<PiecesBean> arrayPiecesBeanFromData(String str, String key) {

                try {
                    JSONObject jsonObject = new JSONObject(str);
                    Type listType = new TypeToken<ArrayList<PiecesBean>>() {
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

            public String getPosDescription() {
                return posDescription;
            }

            public void setPosDescription(String posDescription) {
                this.posDescription = posDescription;
            }

            public String getPosMark() {
                return posMark;
            }

            public void setPosMark(String posMark) {
                this.posMark = posMark;
            }

            public String getPosTitle() {
                return posTitle;
            }

            public void setPosTitle(String posTitle) {
                this.posTitle = posTitle;
            }

            public String getPosition() {
                return position;
            }

            public void setPosition(String position) {
                this.position = position;
            }

            public String getPrice() {
                return price;
            }

            public void setPrice(String price) {
                this.price = price;
            }

            public String getProductId() {
                return productId;
            }

            public void setProductId(String productId) {
                this.productId = productId;
            }
        }
    }
}
