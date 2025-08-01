package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class App extends Message {
    public static final String DEFAULT_ABTEST = "";
    public static final String DEFAULT_AD_ID = "";
    public static final String DEFAULT_APK_NAME = "";
    public static final String DEFAULT_APK_URL = "";
    public static final String DEFAULT_APP_DESC = "";
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_BUSINESS_TYPE = "";
    public static final String DEFAULT_DEEP_URL = "";
    public static final String DEFAULT_EXT_INFO = "";
    public static final String DEFAULT_FIRST_NAME = "";
    public static final String DEFAULT_ICON_LINK = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_ID = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_IOS_URL = "";
    public static final String DEFAULT_LOC_CODE = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PLATFORM_TYPE = "";
    public static final String DEFAULT_POS_NAME = "";
    public static final String DEFAULT_PRICE = "";
    public static final String DEFAULT_P_NAME = "";
    public static final String DEFAULT_P_URL = "";
    public static final String DEFAULT_SECOND_NAME = "";
    public static final String DEFAULT_TOUCH_TYPE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_USER_ID = "";
    public static final String DEFAULT_VERIFY = "";
    public static final String DEFAULT_WEB_URL = "";

    @ProtoField(tag = 24, type = Message.Datatype.STRING)
    public final String abtest;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ad_id;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String apk_name;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String apk_url;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String app_desc;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String app_name;

    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer app_time;

    @ProtoField(tag = 33, type = Message.Datatype.STRING)
    public final String business_type;

    @ProtoField(tag = 23, type = Message.Datatype.INT32)
    public final Integer cpid;

    @ProtoField(tag = 32, type = Message.Datatype.STRING)
    public final String deep_url;

    @ProtoField(tag = 29, type = Message.Datatype.STRING)
    public final String ext_info;

    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String first_name;

    @ProtoField(tag = 35)
    public final GameAd game_ad;

    @ProtoField(label = Message.Label.REPEATED, tag = 30)
    public final List<GoodsInfo> goods_info;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon_link;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String id;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String img_url;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String ios_url;

    @ProtoField(tag = 38)
    public final LiveAdData live_ad;

    @ProtoField(tag = 31, type = Message.Datatype.STRING)
    public final String loc_code;

    @ProtoField(label = Message.Label.REPEATED, tag = 36)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String p_name;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String p_url;

    @ProtoField(tag = 25, type = Message.Datatype.INT32)
    public final Integer plan_id;

    @ProtoField(tag = 39, type = Message.Datatype.STRING)
    public final String platform_type;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer pos;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String pos_name;

    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String price;

    @ProtoField(tag = 22, type = Message.Datatype.STRING)
    public final String second_name;

    @ProtoField(tag = 37, type = Message.Datatype.INT32)
    public final Integer touch_level;

    @ProtoField(tag = 40, type = Message.Datatype.STRING)
    public final String touch_type;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String url;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer url_type;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String user_id;

    @ProtoField(tag = 28, type = Message.Datatype.STRING)
    public final String verify;

    @ProtoField(tag = 34)
    public final VipAd vip_ad;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String web_url;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Integer DEFAULT_POS = 0;
    public static final Integer DEFAULT_APP_TIME = 0;
    public static final Integer DEFAULT_URL_TYPE = 0;
    public static final Integer DEFAULT_CPID = 0;
    public static final Integer DEFAULT_PLAN_ID = 0;
    public static final List<GoodsInfo> DEFAULT_GOODS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();
    public static final Integer DEFAULT_TOUCH_LEVEL = 0;

    public static final class Builder extends Message.Builder<App> {
        public String abtest;
        public String ad_id;
        public String apk_name;
        public String apk_url;
        public String app_desc;
        public String app_name;
        public Integer app_time;
        public String business_type;
        public Integer cpid;
        public String deep_url;
        public String ext_info;
        public String first_name;
        public GameAd game_ad;
        public List<GoodsInfo> goods_info;
        public String icon_link;
        public String icon_url;
        public String id;
        public String img_url;
        public String ios_url;
        public LiveAdData live_ad;
        public String loc_code;
        public List<FeedKV> log_param;
        public String name;
        public String p_name;
        public String p_url;
        public Integer plan_id;
        public String platform_type;
        public Integer pos;
        public String pos_name;
        public String price;
        public String second_name;
        public Integer touch_level;
        public String touch_type;
        public Integer type;
        public String url;
        public Integer url_type;
        public String user_id;
        public String verify;
        public VipAd vip_ad;
        public String web_url;

        public Builder() {
        }

        public Builder(App app) {
            super(app);
            if (app == null) {
                return;
            }
            this.type = app.type;
            this.pos = app.pos;
            this.icon_url = app.icon_url;
            this.icon_link = app.icon_link;
            this.app_name = app.app_name;
            this.app_desc = app.app_desc;
            this.p_name = app.p_name;
            this.p_url = app.p_url;
            this.img_url = app.img_url;
            this.app_time = app.app_time;
            this.web_url = app.web_url;
            this.ad_id = app.ad_id;
            this.id = app.id;
            this.name = app.name;
            this.url_type = app.url_type;
            this.url = app.url;
            this.ios_url = app.ios_url;
            this.apk_url = app.apk_url;
            this.apk_name = app.apk_name;
            this.pos_name = app.pos_name;
            this.first_name = app.first_name;
            this.second_name = app.second_name;
            this.cpid = app.cpid;
            this.abtest = app.abtest;
            this.plan_id = app.plan_id;
            this.user_id = app.user_id;
            this.price = app.price;
            this.verify = app.verify;
            this.ext_info = app.ext_info;
            this.goods_info = Message.copyOf(app.goods_info);
            this.loc_code = app.loc_code;
            this.deep_url = app.deep_url;
            this.business_type = app.business_type;
            this.vip_ad = app.vip_ad;
            this.game_ad = app.game_ad;
            this.log_param = Message.copyOf(app.log_param);
            this.touch_level = app.touch_level;
            this.live_ad = app.live_ad;
            this.platform_type = app.platform_type;
            this.touch_type = app.touch_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public App build(boolean z) {
            return new App(this, z);
        }
    }

    public App(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Integer num2 = builder.pos;
            if (num2 == null) {
                this.pos = DEFAULT_POS;
            } else {
                this.pos = num2;
            }
            String str = builder.icon_url;
            if (str == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str;
            }
            String str2 = builder.icon_link;
            if (str2 == null) {
                this.icon_link = "";
            } else {
                this.icon_link = str2;
            }
            String str3 = builder.app_name;
            if (str3 == null) {
                this.app_name = "";
            } else {
                this.app_name = str3;
            }
            String str4 = builder.app_desc;
            if (str4 == null) {
                this.app_desc = "";
            } else {
                this.app_desc = str4;
            }
            String str5 = builder.p_name;
            if (str5 == null) {
                this.p_name = "";
            } else {
                this.p_name = str5;
            }
            String str6 = builder.p_url;
            if (str6 == null) {
                this.p_url = "";
            } else {
                this.p_url = str6;
            }
            String str7 = builder.img_url;
            if (str7 == null) {
                this.img_url = "";
            } else {
                this.img_url = str7;
            }
            Integer num3 = builder.app_time;
            if (num3 == null) {
                this.app_time = DEFAULT_APP_TIME;
            } else {
                this.app_time = num3;
            }
            String str8 = builder.web_url;
            if (str8 == null) {
                this.web_url = "";
            } else {
                this.web_url = str8;
            }
            String str9 = builder.ad_id;
            if (str9 == null) {
                this.ad_id = "";
            } else {
                this.ad_id = str9;
            }
            String str10 = builder.id;
            if (str10 == null) {
                this.id = "";
            } else {
                this.id = str10;
            }
            String str11 = builder.name;
            if (str11 == null) {
                this.name = "";
            } else {
                this.name = str11;
            }
            Integer num4 = builder.url_type;
            if (num4 == null) {
                this.url_type = DEFAULT_URL_TYPE;
            } else {
                this.url_type = num4;
            }
            String str12 = builder.url;
            if (str12 == null) {
                this.url = "";
            } else {
                this.url = str12;
            }
            String str13 = builder.ios_url;
            if (str13 == null) {
                this.ios_url = "";
            } else {
                this.ios_url = str13;
            }
            String str14 = builder.apk_url;
            if (str14 == null) {
                this.apk_url = "";
            } else {
                this.apk_url = str14;
            }
            String str15 = builder.apk_name;
            if (str15 == null) {
                this.apk_name = "";
            } else {
                this.apk_name = str15;
            }
            String str16 = builder.pos_name;
            if (str16 == null) {
                this.pos_name = "";
            } else {
                this.pos_name = str16;
            }
            String str17 = builder.first_name;
            if (str17 == null) {
                this.first_name = "";
            } else {
                this.first_name = str17;
            }
            String str18 = builder.second_name;
            if (str18 == null) {
                this.second_name = "";
            } else {
                this.second_name = str18;
            }
            Integer num5 = builder.cpid;
            if (num5 == null) {
                this.cpid = DEFAULT_CPID;
            } else {
                this.cpid = num5;
            }
            String str19 = builder.abtest;
            if (str19 == null) {
                this.abtest = "";
            } else {
                this.abtest = str19;
            }
            Integer num6 = builder.plan_id;
            if (num6 == null) {
                this.plan_id = DEFAULT_PLAN_ID;
            } else {
                this.plan_id = num6;
            }
            String str20 = builder.user_id;
            if (str20 == null) {
                this.user_id = "";
            } else {
                this.user_id = str20;
            }
            String str21 = builder.price;
            if (str21 == null) {
                this.price = "";
            } else {
                this.price = str21;
            }
            String str22 = builder.verify;
            if (str22 == null) {
                this.verify = "";
            } else {
                this.verify = str22;
            }
            String str23 = builder.ext_info;
            if (str23 == null) {
                this.ext_info = "";
            } else {
                this.ext_info = str23;
            }
            List<GoodsInfo> list = builder.goods_info;
            if (list == null) {
                this.goods_info = DEFAULT_GOODS_INFO;
            } else {
                this.goods_info = Message.immutableCopyOf(list);
            }
            String str24 = builder.loc_code;
            if (str24 == null) {
                this.loc_code = "";
            } else {
                this.loc_code = str24;
            }
            String str25 = builder.deep_url;
            if (str25 == null) {
                this.deep_url = "";
            } else {
                this.deep_url = str25;
            }
            String str26 = builder.business_type;
            if (str26 == null) {
                this.business_type = "";
            } else {
                this.business_type = str26;
            }
            this.vip_ad = builder.vip_ad;
            this.game_ad = builder.game_ad;
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
            }
            Integer num7 = builder.touch_level;
            if (num7 == null) {
                this.touch_level = DEFAULT_TOUCH_LEVEL;
            } else {
                this.touch_level = num7;
            }
            this.live_ad = builder.live_ad;
            String str27 = builder.platform_type;
            if (str27 == null) {
                this.platform_type = "";
            } else {
                this.platform_type = str27;
            }
            String str28 = builder.touch_type;
            if (str28 == null) {
                this.touch_type = "";
                return;
            } else {
                this.touch_type = str28;
                return;
            }
        }
        this.type = builder.type;
        this.pos = builder.pos;
        this.icon_url = builder.icon_url;
        this.icon_link = builder.icon_link;
        this.app_name = builder.app_name;
        this.app_desc = builder.app_desc;
        this.p_name = builder.p_name;
        this.p_url = builder.p_url;
        this.img_url = builder.img_url;
        this.app_time = builder.app_time;
        this.web_url = builder.web_url;
        this.ad_id = builder.ad_id;
        this.id = builder.id;
        this.name = builder.name;
        this.url_type = builder.url_type;
        this.url = builder.url;
        this.ios_url = builder.ios_url;
        this.apk_url = builder.apk_url;
        this.apk_name = builder.apk_name;
        this.pos_name = builder.pos_name;
        this.first_name = builder.first_name;
        this.second_name = builder.second_name;
        this.cpid = builder.cpid;
        this.abtest = builder.abtest;
        this.plan_id = builder.plan_id;
        this.user_id = builder.user_id;
        this.price = builder.price;
        this.verify = builder.verify;
        this.ext_info = builder.ext_info;
        this.goods_info = Message.immutableCopyOf(builder.goods_info);
        this.loc_code = builder.loc_code;
        this.deep_url = builder.deep_url;
        this.business_type = builder.business_type;
        this.vip_ad = builder.vip_ad;
        this.game_ad = builder.game_ad;
        this.log_param = Message.immutableCopyOf(builder.log_param);
        this.touch_level = builder.touch_level;
        this.live_ad = builder.live_ad;
        this.platform_type = builder.platform_type;
        this.touch_type = builder.touch_type;
    }
}