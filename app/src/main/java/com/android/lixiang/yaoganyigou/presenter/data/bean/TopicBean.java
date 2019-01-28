package com.android.lixiang.yaoganyigou.presenter.data.bean;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class TopicBean {

    /**
     * data : [{"pieces":[{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/1.png","link":"index.html?status=4","posDescription":"des1","posTitle":"title1","position":"1","price":"1000.00","productId":"JL103B_MSS_20170408221619_100001114_101_0013_001_L1A_MSS"},{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/2.png","link":"videoIndex.html","posDescription":"des2","posMark":"限时促销","posTitle":"视频1A+1B 专场","position":"2","price":"高清放送","productId":"JL101A_PMS_20160815162251_000012418_103_0010_001_L1_PAN"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/3.png","posDescription":"des3","posTitle":"第比利斯卫星视频","position":"3","price":"点击查看","productId":"JL103B_MSS_20170718155220_100001831_103_001_L1B_MSS"},{"dataType":"videoSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/4.png","link":"http://mall.charmingglobe.com","posDescription":"des4","posMark":"限时促销","posTitle":"夜光1A+1A_ENH 专场","position":"4","price":"开放购买","productId":"JL103B_MSS_20171015085935_100002557_102_001_L1B_MSS"},{"dataType":"programSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/5.png","link":"http://mall.charmingglobe.com","posDescription":"des5","posTitle":"巴黎夜光影像","position":"5","price":"点击查看","productId":"JL103B_MSS_20170225053328_100000855_101_0008_003_L1A_MSS"}],"type":"1"},{"pieces":[{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/down/1.png","link":"http://mall.charmingglobe.com","position":"1","price":"1000.00","productId":"JL101A_PMS_20170604135341_000019839_202_0010_002_L1_PAN"},{"dataType":"videoSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/down/2.png","link":"http://mall.charmingglobe.com","position":"2","price":"1000.00","productId":"JL101A_PMS_20170604170615_000019839_203_0002_002_L1_PAN"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/down/3.png","link":"http://mall.charmingglobe.com","position":"3","price":"1000.00","productId":"JL103B_MSS_20171006162735_100002453_101_001_L1B_MSS"},{"dataType":"programSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/down/4.png","link":"http://mall.charmingglobe.com","position":"4","price":"1000.00","productId":"JL103B_MSS_20171010124653_100002548_101_001_L1B_MSS"}],"type":"2"}]
     * message : success
     * status : 200
     */

    private String message;
    private int status;
    private List<DataBean> data;

    public static TopicBean objectFromData(String str) {

        return new Gson().fromJson(str, TopicBean.class);
    }

    public static TopicBean objectFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);

            return new Gson().fromJson(jsonObject.getString(str), TopicBean.class);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static List<TopicBean> arrayTopicBeanFromData(String str) {

        Type listType = new TypeToken<ArrayList<TopicBean>>() {
        }.getType();

        return new Gson().fromJson(str, listType);
    }

    public static List<TopicBean> arrayTopicBeanFromData(String str, String key) {

        try {
            JSONObject jsonObject = new JSONObject(str);
            Type listType = new TypeToken<ArrayList<TopicBean>>() {
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
         * pieces : [{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/1.png","link":"index.html?status=4","posDescription":"des1","posTitle":"title1","position":"1","price":"1000.00","productId":"JL103B_MSS_20170408221619_100001114_101_0013_001_L1A_MSS"},{"dataType":"sceneSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/2.png","link":"videoIndex.html","posDescription":"des2","posMark":"限时促销","posTitle":"视频1A+1B 专场","position":"2","price":"高清放送","productId":"JL101A_PMS_20160815162251_000012418_103_0010_001_L1_PAN"},{"dataType":"nightSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/3.png","posDescription":"des3","posTitle":"第比利斯卫星视频","position":"3","price":"点击查看","productId":"JL103B_MSS_20170718155220_100001831_103_001_L1B_MSS"},{"dataType":"videoSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/4.png","link":"http://mall.charmingglobe.com","posDescription":"des4","posMark":"限时促销","posTitle":"夜光1A+1A_ENH 专场","position":"4","price":"开放购买","productId":"JL103B_MSS_20171015085935_100002557_102_001_L1B_MSS"},{"dataType":"programSearch","imageUrl":"http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/5.png","link":"http://mall.charmingglobe.com","posDescription":"des5","posTitle":"巴黎夜光影像","position":"5","price":"点击查看","productId":"JL103B_MSS_20170225053328_100000855_101_0008_003_L1A_MSS"}]
         * type : 1
         */

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
             * imageUrl : http://59.110.164.214:8086/ygyg/ygyg_index_pic/app/topic/up/1.png
             * link : index.html?status=4
             * posDescription : des1
             * posTitle : title1
             * position : 1
             * price : 1000.00
             * productId : JL103B_MSS_20170408221619_100001114_101_0013_001_L1A_MSS
             * posMark : 限时促销
             */

            private String dataType;
            private String imageUrl;
            private String link;
            private String posDescription;
            private String posTitle;
            private String position;
            private String price;
            private String productId;
            private String posMark;

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

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getPosDescription() {
                return posDescription;
            }

            public void setPosDescription(String posDescription) {
                this.posDescription = posDescription;
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

            public String getPosMark() {
                return posMark;
            }

            public void setPosMark(String posMark) {
                this.posMark = posMark;
            }
        }
    }
}
