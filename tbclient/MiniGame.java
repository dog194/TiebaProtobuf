package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class MiniGame extends Message {
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final String DEFAULT_RESOURCE_KEY = "";
    public static final String DEFAULT_SHOW_TAG = "";

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long app_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String app_name;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer app_type;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String icon;

    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer is_recommend;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String jump_url;

    @ProtoField(label = Message.Label.REPEATED, tag = 11)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String resource_key;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String show_tag;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer source;
    public static final Long DEFAULT_APP_ID = 0L;
    public static final Integer DEFAULT_APP_TYPE = 0;
    public static final Integer DEFAULT_SOURCE = 0;
    public static final Integer DEFAULT_IS_RECOMMEND = 0;
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<MiniGame> {
        public Long app_id;
        public String app_name;
        public Integer app_type;
        public String icon;
        public Integer is_recommend;
        public String jump_url;
        public List<FeedKV> log_param;
        public String resource_key;
        public String show_tag;
        public Integer source;

        public Builder() {
        }

        public Builder(MiniGame miniGame) {
            super(miniGame);
            if (miniGame == null) {
                return;
            }
            this.app_id = miniGame.app_id;
            this.app_name = miniGame.app_name;
            this.app_type = miniGame.app_type;
            this.icon = miniGame.icon;
            this.resource_key = miniGame.resource_key;
            this.source = miniGame.source;
            this.is_recommend = miniGame.is_recommend;
            this.show_tag = miniGame.show_tag;
            this.jump_url = miniGame.jump_url;
            this.log_param = Message.copyOf(miniGame.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public MiniGame build(boolean z) {
            return new MiniGame(this, z);
        }
    }

    public MiniGame(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.app_id;
            if (l == null) {
                this.app_id = DEFAULT_APP_ID;
            } else {
                this.app_id = l;
            }
            String str = builder.app_name;
            if (str == null) {
                this.app_name = "";
            } else {
                this.app_name = str;
            }
            Integer num = builder.app_type;
            if (num == null) {
                this.app_type = DEFAULT_APP_TYPE;
            } else {
                this.app_type = num;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
            } else {
                this.icon = str2;
            }
            String str3 = builder.resource_key;
            if (str3 == null) {
                this.resource_key = "";
            } else {
                this.resource_key = str3;
            }
            Integer num2 = builder.source;
            if (num2 == null) {
                this.source = DEFAULT_SOURCE;
            } else {
                this.source = num2;
            }
            Integer num3 = builder.is_recommend;
            if (num3 == null) {
                this.is_recommend = DEFAULT_IS_RECOMMEND;
            } else {
                this.is_recommend = num3;
            }
            String str4 = builder.show_tag;
            if (str4 == null) {
                this.show_tag = "";
            } else {
                this.show_tag = str4;
            }
            String str5 = builder.jump_url;
            if (str5 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str5;
            }
            List<FeedKV> list = builder.log_param;
            if (list == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list);
                return;
            }
        }
        this.app_id = builder.app_id;
        this.app_name = builder.app_name;
        this.app_type = builder.app_type;
        this.icon = builder.icon;
        this.resource_key = builder.resource_key;
        this.source = builder.source;
        this.is_recommend = builder.is_recommend;
        this.show_tag = builder.show_tag;
        this.jump_url = builder.jump_url;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}