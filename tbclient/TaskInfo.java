package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class TaskInfo extends Message {
    public static final String DEFAULT_BGIMG = "";
    public static final String DEFAULT_FLOOR_GOD_REPLY = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_OBJ_ID = "";
    public static final String DEFAULT_THEME_COLOR = "";
    public static final String DEFAULT_THREAD_IMG = "";
    public static final String DEFAULT_THREAD_IMG_SIZE = "";
    public static final String DEFAULT_TOP_BACKGROUND_IMG = "";
    public static final String DEFAULT_WEBVIEW_DATA = "";
    public static final String DEFAULT_WEBVIEW_URL = "";
    public static final String DEFAULT_WH_RATE = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String bgimg;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer card_type;

    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long end_time;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String floor_god_reply;

    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 13, type = Message.Datatype.INT32)
    public final Integer is_god_reply;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String obj_id;

    @ProtoField(tag = 12)
    public final RewardCard reward_card;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long start_time;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long task_id;

    @ProtoField(tag = 19, type = Message.Datatype.STRING)
    public final String theme_color;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long thread_id;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String thread_img;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String thread_img_size;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String top_background_img;

    @ProtoField(tag = 11)
    public final VoteSchema vote_schema;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String webview_data;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String webview_url;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String wh_rate;
    public static final Long DEFAULT_TASK_ID = 0L;
    public static final Long DEFAULT_THREAD_ID = 0L;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_IS_GOD_REPLY = 0;
    public static final Integer DEFAULT_CARD_TYPE = 0;

    public static final class Builder extends Message.Builder<TaskInfo> {
        public String bgimg;
        public Integer card_type;
        public Long end_time;
        public String floor_god_reply;
        public Long forum_id;
        public String forum_name;
        public Integer is_god_reply;
        public String obj_id;
        public RewardCard reward_card;
        public Long start_time;
        public Long task_id;
        public String theme_color;
        public Long thread_id;
        public String thread_img;
        public String thread_img_size;
        public String top_background_img;
        public VoteSchema vote_schema;
        public String webview_data;
        public String webview_url;
        public String wh_rate;

        public Builder() {
        }

        public Builder(TaskInfo taskInfo) {
            super(taskInfo);
            if (taskInfo == null) {
                return;
            }
            this.task_id = taskInfo.task_id;
            this.thread_id = taskInfo.thread_id;
            this.bgimg = taskInfo.bgimg;
            this.thread_img = taskInfo.thread_img;
            this.start_time = taskInfo.start_time;
            this.end_time = taskInfo.end_time;
            this.thread_img_size = taskInfo.thread_img_size;
            this.forum_id = taskInfo.forum_id;
            this.forum_name = taskInfo.forum_name;
            this.obj_id = taskInfo.obj_id;
            this.vote_schema = taskInfo.vote_schema;
            this.reward_card = taskInfo.reward_card;
            this.is_god_reply = taskInfo.is_god_reply;
            this.floor_god_reply = taskInfo.floor_god_reply;
            this.card_type = taskInfo.card_type;
            this.wh_rate = taskInfo.wh_rate;
            this.webview_url = taskInfo.webview_url;
            this.top_background_img = taskInfo.top_background_img;
            this.theme_color = taskInfo.theme_color;
            this.webview_data = taskInfo.webview_data;
        }

        @Override // com.squareup.wire.Message.Builder
        public TaskInfo build(boolean z) {
            return new TaskInfo(this, z);
        }
    }

    public TaskInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.task_id;
            if (l == null) {
                this.task_id = DEFAULT_TASK_ID;
            } else {
                this.task_id = l;
            }
            Long l2 = builder.thread_id;
            if (l2 == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l2;
            }
            String str = builder.bgimg;
            if (str == null) {
                this.bgimg = "";
            } else {
                this.bgimg = str;
            }
            String str2 = builder.thread_img;
            if (str2 == null) {
                this.thread_img = "";
            } else {
                this.thread_img = str2;
            }
            Long l3 = builder.start_time;
            if (l3 == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l3;
            }
            Long l4 = builder.end_time;
            if (l4 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l4;
            }
            String str3 = builder.thread_img_size;
            if (str3 == null) {
                this.thread_img_size = "";
            } else {
                this.thread_img_size = str3;
            }
            Long l5 = builder.forum_id;
            if (l5 == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l5;
            }
            String str4 = builder.forum_name;
            if (str4 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str4;
            }
            String str5 = builder.obj_id;
            if (str5 == null) {
                this.obj_id = "";
            } else {
                this.obj_id = str5;
            }
            this.vote_schema = builder.vote_schema;
            this.reward_card = builder.reward_card;
            Integer num = builder.is_god_reply;
            if (num == null) {
                this.is_god_reply = DEFAULT_IS_GOD_REPLY;
            } else {
                this.is_god_reply = num;
            }
            String str6 = builder.floor_god_reply;
            if (str6 == null) {
                this.floor_god_reply = "";
            } else {
                this.floor_god_reply = str6;
            }
            Integer num2 = builder.card_type;
            if (num2 == null) {
                this.card_type = DEFAULT_CARD_TYPE;
            } else {
                this.card_type = num2;
            }
            String str7 = builder.wh_rate;
            if (str7 == null) {
                this.wh_rate = "";
            } else {
                this.wh_rate = str7;
            }
            String str8 = builder.webview_url;
            if (str8 == null) {
                this.webview_url = "";
            } else {
                this.webview_url = str8;
            }
            String str9 = builder.top_background_img;
            if (str9 == null) {
                this.top_background_img = "";
            } else {
                this.top_background_img = str9;
            }
            String str10 = builder.theme_color;
            if (str10 == null) {
                this.theme_color = "";
            } else {
                this.theme_color = str10;
            }
            String str11 = builder.webview_data;
            if (str11 == null) {
                this.webview_data = "";
                return;
            } else {
                this.webview_data = str11;
                return;
            }
        }
        this.task_id = builder.task_id;
        this.thread_id = builder.thread_id;
        this.bgimg = builder.bgimg;
        this.thread_img = builder.thread_img;
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.thread_img_size = builder.thread_img_size;
        this.forum_id = builder.forum_id;
        this.forum_name = builder.forum_name;
        this.obj_id = builder.obj_id;
        this.vote_schema = builder.vote_schema;
        this.reward_card = builder.reward_card;
        this.is_god_reply = builder.is_god_reply;
        this.floor_god_reply = builder.floor_god_reply;
        this.card_type = builder.card_type;
        this.wh_rate = builder.wh_rate;
        this.webview_url = builder.webview_url;
        this.top_background_img = builder.top_background_img;
        this.theme_color = builder.theme_color;
        this.webview_data = builder.webview_data;
    }
}