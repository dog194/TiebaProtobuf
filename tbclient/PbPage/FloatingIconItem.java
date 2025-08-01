package tbclient.PbPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FloatingIconItem extends Message {
    public static final String DEFAULT_ACTIVITY_ID = "";
    public static final String DEFAULT_CLICK_STATISTICS_URL = "";
    public static final String DEFAULT_DEEPLINK = "";
    public static final String DEFAULT_DISPLAY_AD_ICON = "";
    public static final String DEFAULT_FLOAT_TYPE = "";
    public static final String DEFAULT_FOLD_LOTTIE = "";
    public static final String DEFAULT_FOLD_NAME = "";
    public static final String DEFAULT_HIDE_CLOSE_ICON = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_PACKAGE_NAME = "";
    public static final String DEFAULT_SCHEME = "";
    public static final String DEFAULT_UNFOLD_LOTTIE = "";
    public static final String DEFAULT_UNFOLD_NAME = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VIEW_STATISTICS_URL = "";

    @ProtoField(tag = 15, type = Message.Datatype.STRING)
    public final String activity_id;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String click_statistics_url;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String deeplink;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String display_ad_icon;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String float_type;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String fold_lottie;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String fold_name;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String hide_close_icon;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_name;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String scheme;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String unfold_lottie;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String unfold_name;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String view_statistics_url;

    public static final class Builder extends Message.Builder<FloatingIconItem> {
        public String activity_id;
        public String click_statistics_url;
        public String deeplink;
        public String display_ad_icon;
        public String float_type;
        public String fold_lottie;
        public String fold_name;
        public String hide_close_icon;
        public String icon_url;
        public String package_name;
        public String scheme;
        public String unfold_lottie;
        public String unfold_name;
        public String url;
        public String view_statistics_url;

        public Builder() {
        }

        public Builder(FloatingIconItem floatingIconItem) {
            super(floatingIconItem);
            if (floatingIconItem == null) {
                return;
            }
            this.url = floatingIconItem.url;
            this.icon_url = floatingIconItem.icon_url;
            this.view_statistics_url = floatingIconItem.view_statistics_url;
            this.click_statistics_url = floatingIconItem.click_statistics_url;
            this.deeplink = floatingIconItem.deeplink;
            this.scheme = floatingIconItem.scheme;
            this.package_name = floatingIconItem.package_name;
            this.fold_lottie = floatingIconItem.fold_lottie;
            this.unfold_lottie = floatingIconItem.unfold_lottie;
            this.float_type = floatingIconItem.float_type;
            this.fold_name = floatingIconItem.fold_name;
            this.unfold_name = floatingIconItem.unfold_name;
            this.display_ad_icon = floatingIconItem.display_ad_icon;
            this.hide_close_icon = floatingIconItem.hide_close_icon;
            this.activity_id = floatingIconItem.activity_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public FloatingIconItem build(boolean z) {
            return new FloatingIconItem(this, z);
        }
    }

    public FloatingIconItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.icon_url;
            if (str2 == null) {
                this.icon_url = "";
            } else {
                this.icon_url = str2;
            }
            String str3 = builder.view_statistics_url;
            if (str3 == null) {
                this.view_statistics_url = "";
            } else {
                this.view_statistics_url = str3;
            }
            String str4 = builder.click_statistics_url;
            if (str4 == null) {
                this.click_statistics_url = "";
            } else {
                this.click_statistics_url = str4;
            }
            String str5 = builder.deeplink;
            if (str5 == null) {
                this.deeplink = "";
            } else {
                this.deeplink = str5;
            }
            String str6 = builder.scheme;
            if (str6 == null) {
                this.scheme = "";
            } else {
                this.scheme = str6;
            }
            String str7 = builder.package_name;
            if (str7 == null) {
                this.package_name = "";
            } else {
                this.package_name = str7;
            }
            String str8 = builder.fold_lottie;
            if (str8 == null) {
                this.fold_lottie = "";
            } else {
                this.fold_lottie = str8;
            }
            String str9 = builder.unfold_lottie;
            if (str9 == null) {
                this.unfold_lottie = "";
            } else {
                this.unfold_lottie = str9;
            }
            String str10 = builder.float_type;
            if (str10 == null) {
                this.float_type = "";
            } else {
                this.float_type = str10;
            }
            String str11 = builder.fold_name;
            if (str11 == null) {
                this.fold_name = "";
            } else {
                this.fold_name = str11;
            }
            String str12 = builder.unfold_name;
            if (str12 == null) {
                this.unfold_name = "";
            } else {
                this.unfold_name = str12;
            }
            String str13 = builder.display_ad_icon;
            if (str13 == null) {
                this.display_ad_icon = "";
            } else {
                this.display_ad_icon = str13;
            }
            String str14 = builder.hide_close_icon;
            if (str14 == null) {
                this.hide_close_icon = "";
            } else {
                this.hide_close_icon = str14;
            }
            String str15 = builder.activity_id;
            if (str15 == null) {
                this.activity_id = "";
                return;
            } else {
                this.activity_id = str15;
                return;
            }
        }
        this.url = builder.url;
        this.icon_url = builder.icon_url;
        this.view_statistics_url = builder.view_statistics_url;
        this.click_statistics_url = builder.click_statistics_url;
        this.deeplink = builder.deeplink;
        this.scheme = builder.scheme;
        this.package_name = builder.package_name;
        this.fold_lottie = builder.fold_lottie;
        this.unfold_lottie = builder.unfold_lottie;
        this.float_type = builder.float_type;
        this.fold_name = builder.fold_name;
        this.unfold_name = builder.unfold_name;
        this.display_ad_icon = builder.display_ad_icon;
        this.hide_close_icon = builder.hide_close_icon;
        this.activity_id = builder.activity_id;
    }
}