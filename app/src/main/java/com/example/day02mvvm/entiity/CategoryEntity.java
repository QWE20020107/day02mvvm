package com.example.day02mvvm.entiity;

import java.util.List;

public class CategoryEntity {
    /**
     * code : 200
     * msg : 请求成功
     * data : [{"id":1,"category_name":"电脑办公","category_icon":null,"parent_id":0,"data":[{"id":14,"category_name":"Apple","category_icon":"https://img13.360buyimg.com/n7/jfs/t2590/338/4222589387/237425/25e40fb/57b12ac6N61374a75.jpg","parent_id":1,"data":null},{"id":15,"category_name":"ThinkPad","category_icon":"https://img14.360buyimg.com/n7/jfs/t3556/223/2158676156/110226/59267230/584b5678Nbc9f1e70.jpg","parent_id":1,"data":null},{"id":16,"category_name":"惠普","category_icon":"https://img10.360buyimg.com/n7/jfs/t3157/231/5756125504/98807/97ab361d/588084a1N06efb01d.jpg","parent_id":1,"data":null},{"id":17,"category_name":"戴尔","category_icon":"https://img14.360buyimg.com/n7/jfs/t5971/255/1793524379/148460/f42e1432/59362fc2Nf55191b9.jpg","parent_id":1,"data":null},{"id":18,"category_name":"华硕","category_icon":"https://img12.360buyimg.com/n7/jfs/t5878/352/2479795637/201591/d23a1872/5931182fN31cfa389.jpg","parent_id":1,"data":null},{"id":19,"category_name":"神舟","category_icon":"https://img13.360buyimg.com/n7/jfs/t3052/126/5163722736/217313/f05d9003/5864c7dfNcfbc5e94.jpg","parent_id":1,"data":null},{"id":20,"category_name":"外星人","category_icon":"https://img11.360buyimg.com/n7/jfs/t4687/130/1245474410/58260/f12a15bd/58db17dbNf5371a02.jpg","parent_id":1,"data":null},{"id":21,"category_name":"微星","category_icon":"https://img12.360buyimg.com/n7/jfs/t6709/106/1129266372/226149/ab5f4641/594b8094Nb07793ab.jpg","parent_id":1,"data":null},{"id":22,"category_name":"宏基","category_icon":"https://img11.360buyimg.com/n7/jfs/t5737/312/4822081047/162369/70bbd1b2/5954b785N1787db72.jpg","parent_id":1,"data":null},{"id":23,"category_name":"雷神","category_icon":"https://img11.360buyimg.com/n7/jfs/t5671/2/2653805329/277901/cf0384f7/5932281fNeb08da02.jpg","parent_id":1,"data":null}]},{"id":2,"category_name":"手机数码","category_icon":null,"parent_id":0,"data":[{"id":24,"category_name":"Apple","category_icon":"https://img14.360buyimg.com/n7/jfs/t3268/124/2646283367/114153/f5704b88/57e4a358N9ccc6645.jpg","parent_id":2,"data":null},{"id":25,"category_name":"华为","category_icon":"https://img10.360buyimg.com/n7/jfs/t5890/341/1320350439/127171/2f9c4ddd/592535e0N2e102c09.jpg","parent_id":2,"data":null},{"id":26,"category_name":"小米","category_icon":"https://img14.360buyimg.com/n7/jfs/t5215/252/15502760/100416/cb06f1da/58f709adN45511018.jpg","parent_id":2,"data":null},{"id":27,"category_name":"魅族","category_icon":"https://img10.360buyimg.com/n7/jfs/t4366/71/2045605853/291379/56c87b03/58ca4dc5N1c303706.jpg","parent_id":2,"data":null},{"id":28,"category_name":"三星","category_icon":"https://img10.360buyimg.com/n7/jfs/t5905/106/1120548052/61075/6eafa3a5/592f8f7bN763e3d30.jpg","parent_id":2,"data":null},{"id":29,"category_name":"OPPO","category_icon":"https://img10.360buyimg.com/n7/jfs/t5785/24/2243796048/134801/923e11/592ea14fNec6d33c4.jpg","parent_id":2,"data":null},{"id":30,"category_name":"vivo","category_icon":"https://img11.360buyimg.com/n7/jfs/t5998/69/1052614141/116889/2f5ba58a/592f8ed9N49d8f07b.jpg","parent_id":2,"data":null},{"id":31,"category_name":"HTC","category_icon":"https://img13.360buyimg.com/n7/jfs/t5659/277/3541677944/291221/28bb44f8/593e10c9Nc3783014.jpg","parent_id":2,"data":null},{"id":32,"category_name":"摩托罗拉","category_icon":"https://img12.360buyimg.com/n7/jfs/t3109/185/1064081632/117451/2dba5e92/57c558e2N38a9e617.jpg","parent_id":2,"data":null},{"id":33,"category_name":"索尼","category_icon":"https://img10.360buyimg.com/n7/jfs/t5191/190/2535818793/70090/78c559f5/591ba9f0Nd3a41fcb.jpg","parent_id":2,"data":null}]},{"id":3,"category_name":"男装","category_icon":null,"parent_id":0,"data":[{"id":34,"category_name":"数据开发中","category_icon":"https://img10.360buyimg.com/n7/jfs/t5191/190/2535818793/70090/78c559f5/591ba9f0Nd3a41fcb.jpg","parent_id":3,"data":null}]},{"id":4,"category_name":"女装","category_icon":null,"parent_id":0,"data":[]},{"id":5,"category_name":"家用电器","category_icon":null,"parent_id":0,"data":[]},{"id":6,"category_name":"食品生鲜","category_icon":null,"parent_id":0,"data":[]},{"id":7,"category_name":"酒水饮料","category_icon":null,"parent_id":0,"data":[]},{"id":8,"category_name":"玩具乐器","category_icon":null,"parent_id":0,"data":[]},{"id":9,"category_name":"汽车用品","category_icon":null,"parent_id":0,"data":[]},{"id":10,"category_name":"家具家装","category_icon":null,"parent_id":0,"data":[]},{"id":11,"category_name":"礼品鲜花","category_icon":null,"parent_id":0,"data":[]},{"id":12,"category_name":"生活旅行","category_icon":null,"parent_id":0,"data":[]},{"id":13,"category_name":"二手商品","category_icon":null,"parent_id":0,"data":[]}]
     */

    private int code;
    private String msg;
    private List<DataBeanX> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBeanX> getData() {
        return data;
    }

    public void setData(List<DataBeanX> data) {
        this.data = data;
    }

    public static class DataBeanX {
        /**
         * id : 1
         * category_name : 电脑办公
         * category_icon : null
         * parent_id : 0
         * data : [{"id":14,"category_name":"Apple","category_icon":"https://img13.360buyimg.com/n7/jfs/t2590/338/4222589387/237425/25e40fb/57b12ac6N61374a75.jpg","parent_id":1,"data":null},{"id":15,"category_name":"ThinkPad","category_icon":"https://img14.360buyimg.com/n7/jfs/t3556/223/2158676156/110226/59267230/584b5678Nbc9f1e70.jpg","parent_id":1,"data":null},{"id":16,"category_name":"惠普","category_icon":"https://img10.360buyimg.com/n7/jfs/t3157/231/5756125504/98807/97ab361d/588084a1N06efb01d.jpg","parent_id":1,"data":null},{"id":17,"category_name":"戴尔","category_icon":"https://img14.360buyimg.com/n7/jfs/t5971/255/1793524379/148460/f42e1432/59362fc2Nf55191b9.jpg","parent_id":1,"data":null},{"id":18,"category_name":"华硕","category_icon":"https://img12.360buyimg.com/n7/jfs/t5878/352/2479795637/201591/d23a1872/5931182fN31cfa389.jpg","parent_id":1,"data":null},{"id":19,"category_name":"神舟","category_icon":"https://img13.360buyimg.com/n7/jfs/t3052/126/5163722736/217313/f05d9003/5864c7dfNcfbc5e94.jpg","parent_id":1,"data":null},{"id":20,"category_name":"外星人","category_icon":"https://img11.360buyimg.com/n7/jfs/t4687/130/1245474410/58260/f12a15bd/58db17dbNf5371a02.jpg","parent_id":1,"data":null},{"id":21,"category_name":"微星","category_icon":"https://img12.360buyimg.com/n7/jfs/t6709/106/1129266372/226149/ab5f4641/594b8094Nb07793ab.jpg","parent_id":1,"data":null},{"id":22,"category_name":"宏基","category_icon":"https://img11.360buyimg.com/n7/jfs/t5737/312/4822081047/162369/70bbd1b2/5954b785N1787db72.jpg","parent_id":1,"data":null},{"id":23,"category_name":"雷神","category_icon":"https://img11.360buyimg.com/n7/jfs/t5671/2/2653805329/277901/cf0384f7/5932281fNeb08da02.jpg","parent_id":1,"data":null}]
         */

        private int id;
        private String category_name;
        private Object category_icon;
        private int parent_id;
        private List<DataBean> data;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCategory_name() {
            return category_name;
        }

        public void setCategory_name(String category_name) {
            this.category_name = category_name;
        }

        public Object getCategory_icon() {
            return category_icon;
        }

        public void setCategory_icon(Object category_icon) {
            this.category_icon = category_icon;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * id : 14
             * category_name : Apple
             * category_icon : https://img13.360buyimg.com/n7/jfs/t2590/338/4222589387/237425/25e40fb/57b12ac6N61374a75.jpg
             * parent_id : 1
             * data : null
             */

            private int id;
            private String category_name;
            private String category_icon;
            private int parent_id;
            private Object data;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getCategory_name() {
                return category_name;
            }

            public void setCategory_name(String category_name) {
                this.category_name = category_name;
            }

            public String getCategory_icon() {
                return category_icon;
            }

            public void setCategory_icon(String category_icon) {
                this.category_icon = category_icon;
            }

            public int getParent_id() {
                return parent_id;
            }

            public void setParent_id(int parent_id) {
                this.parent_id = parent_id;
            }

            public Object getData() {
                return data;
            }

            public void setData(Object data) {
                this.data = data;
            }
        }
    }
}
