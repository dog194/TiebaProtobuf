package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ThreadRecommendInfo extends Message {
    public static final String DEFAULT_BUSINESS_ID = "";
    public static final String DEFAULT_BUTTON_LINK = "";
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_FORUM_AVATAR = "";
    public static final String DEFAULT_FORUM_NAME = "";
    public static final String DEFAULT_JUMP_ICON = "";
    public static final String DEFAULT_JUMP_LINK = "";
    public static final String DEFAULT_JUMP_TEXT = "";
    public static final String DEFAULT_RECOMMEND_ICON = "";
    public static final String DEFAULT_RECOMMEND_ICON_BACKGROUND = "";
    public static final String DEFAULT_RECOMMEND_REASON = "";
    public static final String DEFAULT_RECOMMEND_TAIL = "";
    public static final String DEFAULT_RECOMMEND_TYPE = "";
    public static final String DEFAULT_SHOW_TYPE = "";
    public static final String DEFAULT_TOPIC_TAG = "";

    @ProtoField(tag = 13)
    public final ThemeColorInfo background_color;

    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String business_id;

    @ProtoField(label = Message.Label.REPEATED, tag = 25)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer business_type;

    @ProtoField(tag = 29)
    public final ThemeColorInfo button_color;

    @ProtoField(tag = 30, type = Message.Datatype.STRING)
    public final String button_link;

    @ProtoField(tag = 27, type = Message.Datatype.STRING)
    public final String button_text;

    @ProtoField(tag = 28)
    public final ThemeColorInfo button_text_color;

    @ProtoField(tag = 24)
    public final FeedCountdown countdown;

    @ProtoField(tag = 20)
    public final ThemeColorInfo dot_color;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String forum_avatar;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String forum_name;

    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String jump_icon;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String jump_link;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String jump_text;

    @ProtoField(tag = 19)
    public final ThemeColorInfo jump_text_color;

    @ProtoField(label = Message.Label.REPEATED, tag = 31)
    public final List<FeedKV> log_param;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String recommend_icon;

    @ProtoField(tag = 26, type = Message.Datatype.STRING)
    public final String recommend_icon_background;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String recommend_reason;

    @ProtoField(tag = 11)
    public final ThemeColorInfo recommend_reason_color;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String recommend_tail;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String recommend_type;

    @ProtoField(tag = 10)
    public final ThemeColorInfo recommend_type_color;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer show_num;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String show_type;

    @ProtoField(tag = 12)
    public final ThemeColorInfo strip_color;

    @ProtoField(tag = 22, type = Message.Datatype.INT32)
    public final Integer style_type;

    @ProtoField(tag = 21)
    public final ThemeColorInfo tail_color;

    @ProtoField(tag = 6, type = Message.Datatype.INT64)
    public final Long topic_id;

    @ProtoField(tag = 23, type = Message.Datatype.STRING)
    public final String topic_tag;
    public static final Integer DEFAULT_SHOW_NUM = 0;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_BUSINESS_TYPE = 0;
    public static final Integer DEFAULT_STYLE_TYPE = 0;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    public static final class Builder extends Message.Builder<ThreadRecommendInfo> {
        public ThemeColorInfo background_color;
        public String business_id;
        public List<FeedKV> business_info;
        public Integer business_type;
        public ThemeColorInfo button_color;
        public String button_link;
        public String button_text;
        public ThemeColorInfo button_text_color;
        public FeedCountdown countdown;
        public ThemeColorInfo dot_color;
        public String forum_avatar;
        public String forum_name;
        public String jump_icon;
        public String jump_link;
        public String jump_text;
        public ThemeColorInfo jump_text_color;
        public List<FeedKV> log_param;
        public String recommend_icon;
        public String recommend_icon_background;
        public String recommend_reason;
        public ThemeColorInfo recommend_reason_color;
        public String recommend_tail;
        public String recommend_type;
        public ThemeColorInfo recommend_type_color;
        public Integer show_num;
        public String show_type;
        public ThemeColorInfo strip_color;
        public Integer style_type;
        public ThemeColorInfo tail_color;
        public Long topic_id;
        public String topic_tag;

        public Builder() {
        }

        public Builder(ThreadRecommendInfo threadRecommendInfo) {
            super(threadRecommendInfo);
            if (threadRecommendInfo == null) {
                return;
            }
            this.forum_avatar = threadRecommendInfo.forum_avatar;
            this.forum_name = threadRecommendInfo.forum_name;
            this.show_num = threadRecommendInfo.show_num;
            this.show_type = threadRecommendInfo.show_type;
            this.recommend_reason = threadRecommendInfo.recommend_reason;
            this.topic_id = threadRecommendInfo.topic_id;
            this.recommend_type = threadRecommendInfo.recommend_type;
            this.recommend_tail = threadRecommendInfo.recommend_tail;
            this.recommend_icon = threadRecommendInfo.recommend_icon;
            this.recommend_type_color = threadRecommendInfo.recommend_type_color;
            this.recommend_reason_color = threadRecommendInfo.recommend_reason_color;
            this.strip_color = threadRecommendInfo.strip_color;
            this.background_color = threadRecommendInfo.background_color;
            this.jump_link = threadRecommendInfo.jump_link;
            this.business_type = threadRecommendInfo.business_type;
            this.business_id = threadRecommendInfo.business_id;
            this.jump_icon = threadRecommendInfo.jump_icon;
            this.jump_text = threadRecommendInfo.jump_text;
            this.jump_text_color = threadRecommendInfo.jump_text_color;
            this.dot_color = threadRecommendInfo.dot_color;
            this.tail_color = threadRecommendInfo.tail_color;
            this.style_type = threadRecommendInfo.style_type;
            this.topic_tag = threadRecommendInfo.topic_tag;
            this.countdown = threadRecommendInfo.countdown;
            this.business_info = Message.copyOf(threadRecommendInfo.business_info);
            this.recommend_icon_background = threadRecommendInfo.recommend_icon_background;
            this.button_text = threadRecommendInfo.button_text;
            this.button_text_color = threadRecommendInfo.button_text_color;
            this.button_color = threadRecommendInfo.button_color;
            this.button_link = threadRecommendInfo.button_link;
            this.log_param = Message.copyOf(threadRecommendInfo.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadRecommendInfo build(boolean z) {
            return new ThreadRecommendInfo(this, z);
        }
    }

    public ThreadRecommendInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.forum_avatar;
            if (str == null) {
                this.forum_avatar = "";
            } else {
                this.forum_avatar = str;
            }
            String str2 = builder.forum_name;
            if (str2 == null) {
                this.forum_name = "";
            } else {
                this.forum_name = str2;
            }
            Integer num = builder.show_num;
            if (num == null) {
                this.show_num = DEFAULT_SHOW_NUM;
            } else {
                this.show_num = num;
            }
            String str3 = builder.show_type;
            if (str3 == null) {
                this.show_type = "";
            } else {
                this.show_type = str3;
            }
            String str4 = builder.recommend_reason;
            if (str4 == null) {
                this.recommend_reason = "";
            } else {
                this.recommend_reason = str4;
            }
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str5 = builder.recommend_type;
            if (str5 == null) {
                this.recommend_type = "";
            } else {
                this.recommend_type = str5;
            }
            String str6 = builder.recommend_tail;
            if (str6 == null) {
                this.recommend_tail = "";
            } else {
                this.recommend_tail = str6;
            }
            String str7 = builder.recommend_icon;
            if (str7 == null) {
                this.recommend_icon = "";
            } else {
                this.recommend_icon = str7;
            }
            this.recommend_type_color = builder.recommend_type_color;
            this.recommend_reason_color = builder.recommend_reason_color;
            this.strip_color = builder.strip_color;
            this.background_color = builder.background_color;
            String str8 = builder.jump_link;
            if (str8 == null) {
                this.jump_link = "";
            } else {
                this.jump_link = str8;
            }
            Integer num2 = builder.business_type;
            if (num2 == null) {
                this.business_type = DEFAULT_BUSINESS_TYPE;
            } else {
                this.business_type = num2;
            }
            String str9 = builder.business_id;
            if (str9 == null) {
                this.business_id = "";
            } else {
                this.business_id = str9;
            }
            String str10 = builder.jump_icon;
            if (str10 == null) {
                this.jump_icon = "";
            } else {
                this.jump_icon = str10;
            }
            String str11 = builder.jump_text;
            if (str11 == null) {
                this.jump_text = "";
            } else {
                this.jump_text = str11;
            }
            this.jump_text_color = builder.jump_text_color;
            this.dot_color = builder.dot_color;
            this.tail_color = builder.tail_color;
            Integer num3 = builder.style_type;
            if (num3 == null) {
                this.style_type = DEFAULT_STYLE_TYPE;
            } else {
                this.style_type = num3;
            }
            String str12 = builder.topic_tag;
            if (str12 == null) {
                this.topic_tag = "";
            } else {
                this.topic_tag = str12;
            }
            this.countdown = builder.countdown;
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
            } else {
                this.business_info = Message.immutableCopyOf(list);
            }
            String str13 = builder.recommend_icon_background;
            if (str13 == null) {
                this.recommend_icon_background = "";
            } else {
                this.recommend_icon_background = str13;
            }
            String str14 = builder.button_text;
            if (str14 == null) {
                this.button_text = "";
            } else {
                this.button_text = str14;
            }
            this.button_text_color = builder.button_text_color;
            this.button_color = builder.button_color;
            String str15 = builder.button_link;
            if (str15 == null) {
                this.button_link = "";
            } else {
                this.button_link = str15;
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.forum_avatar = builder.forum_avatar;
        this.forum_name = builder.forum_name;
        this.show_num = builder.show_num;
        this.show_type = builder.show_type;
        this.recommend_reason = builder.recommend_reason;
        this.topic_id = builder.topic_id;
        this.recommend_type = builder.recommend_type;
        this.recommend_tail = builder.recommend_tail;
        this.recommend_icon = builder.recommend_icon;
        this.recommend_type_color = builder.recommend_type_color;
        this.recommend_reason_color = builder.recommend_reason_color;
        this.strip_color = builder.strip_color;
        this.background_color = builder.background_color;
        this.jump_link = builder.jump_link;
        this.business_type = builder.business_type;
        this.business_id = builder.business_id;
        this.jump_icon = builder.jump_icon;
        this.jump_text = builder.jump_text;
        this.jump_text_color = builder.jump_text_color;
        this.dot_color = builder.dot_color;
        this.tail_color = builder.tail_color;
        this.style_type = builder.style_type;
        this.topic_tag = builder.topic_tag;
        this.countdown = builder.countdown;
        this.business_info = Message.immutableCopyOf(builder.business_info);
        this.recommend_icon_background = builder.recommend_icon_background;
        this.button_text = builder.button_text;
        this.button_text_color = builder.button_text_color;
        this.button_color = builder.button_color;
        this.button_link = builder.button_link;
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}