package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Commerce extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_ICON_URL = "";
    public static final String DEFAULT_IOS_SCHEMA = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SLOGAN = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String icon_url;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String ios_schema;

    @ProtoField(tag = 7, type = Message.Datatype.BOOL)
    public final Boolean is_num_smart;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer need_filter;

    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long red_point_version;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String slogan;
    public static final Long DEFAULT_RED_POINT_VERSION = 0L;
    public static final Boolean DEFAULT_IS_NUM_SMART = Boolean.FALSE;
    public static final Integer DEFAULT_NEED_FILTER = 0;

    public static final class Builder extends Message.Builder<Commerce> {
        public String content;
        public String icon;
        public String icon_url;
        public String ios_schema;
        public Boolean is_num_smart;
        public String name;
        public Integer need_filter;
        public Long red_point_version;
        public String schema;
        public String slogan;

        public Builder() {
        }

        public Builder(Commerce commerce) {
            super(commerce);
            if (commerce == null) {
                return;
            }
            this.content = commerce.content;
            this.name = commerce.name;
            this.icon = commerce.icon;
            this.schema = commerce.schema;
            this.slogan = commerce.slogan;
            this.red_point_version = commerce.red_point_version;
            this.is_num_smart = commerce.is_num_smart;
            this.need_filter = commerce.need_filter;
            this.ios_schema = commerce.ios_schema;
            this.icon_url = commerce.icon_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public Commerce build(boolean z) {
            return new Commerce(this, z);
        }
    }

    public Commerce(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            String str2 = builder.name;
            if (str2 == null) {
                this.name = "";
            } else {
                this.name = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            String str4 = builder.schema;
            if (str4 == null) {
                this.schema = "";
            } else {
                this.schema = str4;
            }
            String str5 = builder.slogan;
            if (str5 == null) {
                this.slogan = "";
            } else {
                this.slogan = str5;
            }
            Long l = builder.red_point_version;
            if (l == null) {
                this.red_point_version = DEFAULT_RED_POINT_VERSION;
            } else {
                this.red_point_version = l;
            }
            Boolean bool = builder.is_num_smart;
            if (bool == null) {
                this.is_num_smart = DEFAULT_IS_NUM_SMART;
            } else {
                this.is_num_smart = bool;
            }
            Integer num = builder.need_filter;
            if (num == null) {
                this.need_filter = DEFAULT_NEED_FILTER;
            } else {
                this.need_filter = num;
            }
            String str6 = builder.ios_schema;
            if (str6 == null) {
                this.ios_schema = "";
            } else {
                this.ios_schema = str6;
            }
            String str7 = builder.icon_url;
            if (str7 == null) {
                this.icon_url = "";
                return;
            } else {
                this.icon_url = str7;
                return;
            }
        }
        this.content = builder.content;
        this.name = builder.name;
        this.icon = builder.icon;
        this.schema = builder.schema;
        this.slogan = builder.slogan;
        this.red_point_version = builder.red_point_version;
        this.is_num_smart = builder.is_num_smart;
        this.need_filter = builder.need_filter;
        this.ios_schema = builder.ios_schema;
        this.icon_url = builder.icon_url;
    }
}