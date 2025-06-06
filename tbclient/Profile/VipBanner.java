package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class VipBanner extends Message {
    public static final String DEFAULT_BACKGROUND_DAY = "";
    public static final String DEFAULT_BACKGROUND_NIGHT = "";
    public static final String DEFAULT_BANNER_PIC = "";
    public static final String DEFAULT_BUBBLE = "";
    public static final String DEFAULT_BUTTON_LABLE = "";
    public static final String DEFAULT_BUTTON_PIC = "";
    public static final String DEFAULT_BUTTON_URL = "";
    public static final String DEFAULT_IOS_BANNER_BACKGROUND = "";
    public static final String DEFAULT_IOS_BANNER_EMOJI = "";
    public static final String DEFAULT_SUB_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIP_ICON = "";

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String background_day;

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String background_night;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String banner_pic;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String bubble;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_lable;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String button_pic;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String button_url;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String ios_banner_background;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String ios_banner_emoji;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_title;

    @ProtoField(label = Message.Label.REPEATED, tag = 7, type = Message.Datatype.STRING)
    public final List<String> sub_title_list;

    @ProtoField(tag = 13)
    public final VipBannerThemeColorInfo theme_color_info;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer topic_mode;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String url;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String vip_icon;

    @ProtoField(tag = 12, type = Message.Datatype.INT32)
    public final Integer vip_status;
    public static final List<String> DEFAULT_SUB_TITLE_LIST = Collections.emptyList();
    public static final Integer DEFAULT_TOPIC_MODE = 0;
    public static final Integer DEFAULT_VIP_STATUS = 0;

    public static final class Builder extends Message.Builder<VipBanner> {
        public String background_day;
        public String background_night;
        public String banner_pic;
        public String bubble;
        public String button_lable;
        public String button_pic;
        public String button_url;
        public String ios_banner_background;
        public String ios_banner_emoji;
        public String sub_title;
        public List<String> sub_title_list;
        public VipBannerThemeColorInfo theme_color_info;
        public String title;
        public Integer topic_mode;
        public String url;
        public String vip_icon;
        public Integer vip_status;

        public Builder() {
        }

        public Builder(VipBanner vipBanner) {
            super(vipBanner);
            if (vipBanner == null) {
                return;
            }
            this.title = vipBanner.title;
            this.sub_title = vipBanner.sub_title;
            this.button_lable = vipBanner.button_lable;
            this.bubble = vipBanner.bubble;
            this.url = vipBanner.url;
            this.button_url = vipBanner.button_url;
            this.sub_title_list = Message.copyOf(vipBanner.sub_title_list);
            this.button_pic = vipBanner.button_pic;
            this.banner_pic = vipBanner.banner_pic;
            this.background_day = vipBanner.background_day;
            this.topic_mode = vipBanner.topic_mode;
            this.vip_status = vipBanner.vip_status;
            this.theme_color_info = vipBanner.theme_color_info;
            this.vip_icon = vipBanner.vip_icon;
            this.background_night = vipBanner.background_night;
            this.ios_banner_background = vipBanner.ios_banner_background;
            this.ios_banner_emoji = vipBanner.ios_banner_emoji;
        }

        @Override // com.squareup.wire.Message.Builder
        public VipBanner build(boolean z) {
            return new VipBanner(this, z);
        }
    }

    public VipBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str2;
            }
            String str3 = builder.button_lable;
            if (str3 == null) {
                this.button_lable = "";
            } else {
                this.button_lable = str3;
            }
            String str4 = builder.bubble;
            if (str4 == null) {
                this.bubble = "";
            } else {
                this.bubble = str4;
            }
            String str5 = builder.url;
            if (str5 == null) {
                this.url = "";
            } else {
                this.url = str5;
            }
            String str6 = builder.button_url;
            if (str6 == null) {
                this.button_url = "";
            } else {
                this.button_url = str6;
            }
            List<String> list = builder.sub_title_list;
            if (list == null) {
                this.sub_title_list = DEFAULT_SUB_TITLE_LIST;
            } else {
                this.sub_title_list = Message.immutableCopyOf(list);
            }
            String str7 = builder.button_pic;
            if (str7 == null) {
                this.button_pic = "";
            } else {
                this.button_pic = str7;
            }
            String str8 = builder.banner_pic;
            if (str8 == null) {
                this.banner_pic = "";
            } else {
                this.banner_pic = str8;
            }
            String str9 = builder.background_day;
            if (str9 == null) {
                this.background_day = "";
            } else {
                this.background_day = str9;
            }
            Integer num = builder.topic_mode;
            if (num == null) {
                this.topic_mode = DEFAULT_TOPIC_MODE;
            } else {
                this.topic_mode = num;
            }
            Integer num2 = builder.vip_status;
            if (num2 == null) {
                this.vip_status = DEFAULT_VIP_STATUS;
            } else {
                this.vip_status = num2;
            }
            this.theme_color_info = builder.theme_color_info;
            String str10 = builder.vip_icon;
            if (str10 == null) {
                this.vip_icon = "";
            } else {
                this.vip_icon = str10;
            }
            String str11 = builder.background_night;
            if (str11 == null) {
                this.background_night = "";
            } else {
                this.background_night = str11;
            }
            String str12 = builder.ios_banner_background;
            if (str12 == null) {
                this.ios_banner_background = "";
            } else {
                this.ios_banner_background = str12;
            }
            String str13 = builder.ios_banner_emoji;
            if (str13 == null) {
                this.ios_banner_emoji = "";
                return;
            } else {
                this.ios_banner_emoji = str13;
                return;
            }
        }
        this.title = builder.title;
        this.sub_title = builder.sub_title;
        this.button_lable = builder.button_lable;
        this.bubble = builder.bubble;
        this.url = builder.url;
        this.button_url = builder.button_url;
        this.sub_title_list = Message.immutableCopyOf(builder.sub_title_list);
        this.button_pic = builder.button_pic;
        this.banner_pic = builder.banner_pic;
        this.background_day = builder.background_day;
        this.topic_mode = builder.topic_mode;
        this.vip_status = builder.vip_status;
        this.theme_color_info = builder.theme_color_info;
        this.vip_icon = builder.vip_icon;
        this.background_night = builder.background_night;
        this.ios_banner_background = builder.ios_banner_background;
        this.ios_banner_emoji = builder.ios_banner_emoji;
    }
}