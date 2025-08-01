package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThemeSkinPropMain extends Message {
    public static final String DEFAULT_ACTIVITY_URL = "";
    public static final String DEFAULT_EXAMPLE_URL = "";
    public static final String DEFAULT_PACKAGE_KEY = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_PACKAGE_URL = "";
    public static final String DEFAULT_PERMISSION = "";
    public static final String DEFAULT_PROPS_STATE_IMG = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String activity_url;

    @ProtoField(tag = 13, type = Message.Datatype.UINT32)
    public final Integer daily_privilege_status;

    @ProtoField(tag = 14, type = Message.Datatype.INT64)
    public final Long end_time;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String example_url;

    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer free_user_level;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_finished;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String package_key;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String package_size;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String package_url;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String permission;

    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String props_state_img;

    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer props_version;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String title;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_PROPS_VERSION = 0;
    public static final Integer DEFAULT_FREE_USER_LEVEL = 0;
    public static final Integer DEFAULT_IS_FINISHED = 0;
    public static final Integer DEFAULT_DAILY_PRIVILEGE_STATUS = 0;
    public static final Long DEFAULT_END_TIME = 0L;

    public static final class Builder extends Message.Builder<ThemeSkinPropMain> {
        public String activity_url;
        public Integer daily_privilege_status;
        public Long end_time;
        public String example_url;
        public Integer free_user_level;
        public Integer is_finished;
        public String package_key;
        public String package_size;
        public String package_url;
        public String permission;
        public Integer props_id;
        public String props_state_img;
        public Integer props_version;
        public String title;

        public Builder() {
        }

        public Builder(ThemeSkinPropMain themeSkinPropMain) {
            super(themeSkinPropMain);
            if (themeSkinPropMain == null) {
                return;
            }
            this.props_id = themeSkinPropMain.props_id;
            this.title = themeSkinPropMain.title;
            this.example_url = themeSkinPropMain.example_url;
            this.permission = themeSkinPropMain.permission;
            this.props_state_img = themeSkinPropMain.props_state_img;
            this.package_url = themeSkinPropMain.package_url;
            this.package_size = themeSkinPropMain.package_size;
            this.props_version = themeSkinPropMain.props_version;
            this.free_user_level = themeSkinPropMain.free_user_level;
            this.activity_url = themeSkinPropMain.activity_url;
            this.is_finished = themeSkinPropMain.is_finished;
            this.package_key = themeSkinPropMain.package_key;
            this.daily_privilege_status = themeSkinPropMain.daily_privilege_status;
            this.end_time = themeSkinPropMain.end_time;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThemeSkinPropMain build(boolean z) {
            return new ThemeSkinPropMain(this, z);
        }
    }

    public ThemeSkinPropMain(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.example_url;
            if (str2 == null) {
                this.example_url = "";
            } else {
                this.example_url = str2;
            }
            String str3 = builder.permission;
            if (str3 == null) {
                this.permission = "";
            } else {
                this.permission = str3;
            }
            String str4 = builder.props_state_img;
            if (str4 == null) {
                this.props_state_img = "";
            } else {
                this.props_state_img = str4;
            }
            String str5 = builder.package_url;
            if (str5 == null) {
                this.package_url = "";
            } else {
                this.package_url = str5;
            }
            String str6 = builder.package_size;
            if (str6 == null) {
                this.package_size = "";
            } else {
                this.package_size = str6;
            }
            Integer num2 = builder.props_version;
            if (num2 == null) {
                this.props_version = DEFAULT_PROPS_VERSION;
            } else {
                this.props_version = num2;
            }
            Integer num3 = builder.free_user_level;
            if (num3 == null) {
                this.free_user_level = DEFAULT_FREE_USER_LEVEL;
            } else {
                this.free_user_level = num3;
            }
            String str7 = builder.activity_url;
            if (str7 == null) {
                this.activity_url = "";
            } else {
                this.activity_url = str7;
            }
            Integer num4 = builder.is_finished;
            if (num4 == null) {
                this.is_finished = DEFAULT_IS_FINISHED;
            } else {
                this.is_finished = num4;
            }
            String str8 = builder.package_key;
            if (str8 == null) {
                this.package_key = "";
            } else {
                this.package_key = str8;
            }
            Integer num5 = builder.daily_privilege_status;
            if (num5 == null) {
                this.daily_privilege_status = DEFAULT_DAILY_PRIVILEGE_STATUS;
            } else {
                this.daily_privilege_status = num5;
            }
            Long l = builder.end_time;
            if (l == null) {
                this.end_time = DEFAULT_END_TIME;
                return;
            } else {
                this.end_time = l;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.title = builder.title;
        this.example_url = builder.example_url;
        this.permission = builder.permission;
        this.props_state_img = builder.props_state_img;
        this.package_url = builder.package_url;
        this.package_size = builder.package_size;
        this.props_version = builder.props_version;
        this.free_user_level = builder.free_user_level;
        this.activity_url = builder.activity_url;
        this.is_finished = builder.is_finished;
        this.package_key = builder.package_key;
        this.daily_privilege_status = builder.daily_privilege_status;
        this.end_time = builder.end_time;
    }
}