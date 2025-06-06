package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.ThemeColorInfo;

/* loaded from: classes4.dex */
public final class AuxiliaryToolsInfo extends Message {
    public static final String DEFAULT_CLASS = "";
    public static final String DEFAULT_DARK_ICON = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_IOS_SCHEMA = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String _class;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String dark_icon;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ios_schema;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer need_filter;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long red_point_version;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 7)
    public final ThemeColorInfo theme_color_info;
    public static final Long DEFAULT_RED_POINT_VERSION = 0L;
    public static final Integer DEFAULT_NEED_FILTER = 0;

    public static final class Builder extends Message.Builder<AuxiliaryToolsInfo> {
        public String _class;
        public String dark_icon;
        public String icon;
        public String ios_schema;
        public String name;
        public Integer need_filter;
        public Long red_point_version;
        public String schema;
        public ThemeColorInfo theme_color_info;

        public Builder() {
        }

        public Builder(AuxiliaryToolsInfo auxiliaryToolsInfo) {
            super(auxiliaryToolsInfo);
            if (auxiliaryToolsInfo == null) {
                return;
            }
            this.name = auxiliaryToolsInfo.name;
            this.icon = auxiliaryToolsInfo.icon;
            this.schema = auxiliaryToolsInfo.schema;
            this._class = auxiliaryToolsInfo._class;
            this.red_point_version = auxiliaryToolsInfo.red_point_version;
            this.dark_icon = auxiliaryToolsInfo.dark_icon;
            this.theme_color_info = auxiliaryToolsInfo.theme_color_info;
            this.need_filter = auxiliaryToolsInfo.need_filter;
            this.ios_schema = auxiliaryToolsInfo.ios_schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public AuxiliaryToolsInfo build(boolean z) {
            return new AuxiliaryToolsInfo(this, z);
        }
    }

    public AuxiliaryToolsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.schema;
            if (str3 == null) {
                this.schema = "";
            } else {
                this.schema = str3;
            }
            String str4 = builder._class;
            if (str4 == null) {
                this._class = "";
            } else {
                this._class = str4;
            }
            Long l = builder.red_point_version;
            if (l == null) {
                this.red_point_version = DEFAULT_RED_POINT_VERSION;
            } else {
                this.red_point_version = l;
            }
            String str5 = builder.dark_icon;
            if (str5 == null) {
                this.dark_icon = "";
            } else {
                this.dark_icon = str5;
            }
            this.theme_color_info = builder.theme_color_info;
            Integer num = builder.need_filter;
            if (num == null) {
                this.need_filter = DEFAULT_NEED_FILTER;
            } else {
                this.need_filter = num;
            }
            String str6 = builder.ios_schema;
            if (str6 == null) {
                this.ios_schema = "";
                return;
            } else {
                this.ios_schema = str6;
                return;
            }
        }
        this.name = builder.name;
        this.icon = builder.icon;
        this.schema = builder.schema;
        this._class = builder._class;
        this.red_point_version = builder.red_point_version;
        this.dark_icon = builder.dark_icon;
        this.theme_color_info = builder.theme_color_info;
        this.need_filter = builder.need_filter;
        this.ios_schema = builder.ios_schema;
    }
}