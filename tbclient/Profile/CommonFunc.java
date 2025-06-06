package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class CommonFunc extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_IOS_SCHEMA = "";
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_SLOGAN = "";
    public static final String DEFAULT_TYPE = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String ios_schema;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long level_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer need_filter;

    @ProtoField(tag = 10, type = Message.Datatype.INT64)
    public final Long red_point_version;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long score;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String slogan;

    @ProtoField(tag = 7, type = Message.Datatype.INT64)
    public final Long target_score;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer task_page_sign_status;

    @ProtoField(tag = 9, type = Message.Datatype.INT64)
    public final Long tmoney;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;
    public static final Long DEFAULT_LEVEL_ID = 0L;
    public static final Long DEFAULT_SCORE = 0L;
    public static final Long DEFAULT_TARGET_SCORE = 0L;
    public static final Long DEFAULT_TMONEY = 0L;
    public static final Long DEFAULT_RED_POINT_VERSION = 0L;
    public static final Integer DEFAULT_NEED_FILTER = 0;
    public static final Integer DEFAULT_TASK_PAGE_SIGN_STATUS = 0;

    public static final class Builder extends Message.Builder<CommonFunc> {
        public String icon;
        public String ios_schema;
        public Long level_id;
        public String name;
        public Integer need_filter;
        public Long red_point_version;
        public String schema;
        public Long score;
        public String slogan;
        public Long target_score;
        public Integer task_page_sign_status;
        public Long tmoney;
        public String type;

        public Builder() {
        }

        public Builder(CommonFunc commonFunc) {
            super(commonFunc);
            if (commonFunc == null) {
                return;
            }
            this.type = commonFunc.type;
            this.name = commonFunc.name;
            this.icon = commonFunc.icon;
            this.schema = commonFunc.schema;
            this.level_id = commonFunc.level_id;
            this.score = commonFunc.score;
            this.target_score = commonFunc.target_score;
            this.slogan = commonFunc.slogan;
            this.tmoney = commonFunc.tmoney;
            this.red_point_version = commonFunc.red_point_version;
            this.need_filter = commonFunc.need_filter;
            this.ios_schema = commonFunc.ios_schema;
            this.task_page_sign_status = commonFunc.task_page_sign_status;
        }

        @Override // com.squareup.wire.Message.Builder
        public CommonFunc build(boolean z) {
            return new CommonFunc(this, z);
        }
    }

    public CommonFunc(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
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
            Long l = builder.level_id;
            if (l == null) {
                this.level_id = DEFAULT_LEVEL_ID;
            } else {
                this.level_id = l;
            }
            Long l2 = builder.score;
            if (l2 == null) {
                this.score = DEFAULT_SCORE;
            } else {
                this.score = l2;
            }
            Long l3 = builder.target_score;
            if (l3 == null) {
                this.target_score = DEFAULT_TARGET_SCORE;
            } else {
                this.target_score = l3;
            }
            String str5 = builder.slogan;
            if (str5 == null) {
                this.slogan = "";
            } else {
                this.slogan = str5;
            }
            Long l4 = builder.tmoney;
            if (l4 == null) {
                this.tmoney = DEFAULT_TMONEY;
            } else {
                this.tmoney = l4;
            }
            Long l5 = builder.red_point_version;
            if (l5 == null) {
                this.red_point_version = DEFAULT_RED_POINT_VERSION;
            } else {
                this.red_point_version = l5;
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
            Integer num2 = builder.task_page_sign_status;
            if (num2 == null) {
                this.task_page_sign_status = DEFAULT_TASK_PAGE_SIGN_STATUS;
                return;
            } else {
                this.task_page_sign_status = num2;
                return;
            }
        }
        this.type = builder.type;
        this.name = builder.name;
        this.icon = builder.icon;
        this.schema = builder.schema;
        this.level_id = builder.level_id;
        this.score = builder.score;
        this.target_score = builder.target_score;
        this.slogan = builder.slogan;
        this.tmoney = builder.tmoney;
        this.red_point_version = builder.red_point_version;
        this.need_filter = builder.need_filter;
        this.ios_schema = builder.ios_schema;
        this.task_page_sign_status = builder.task_page_sign_status;
    }
}