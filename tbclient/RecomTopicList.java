package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class RecomTopicList extends Message {
    public static final String DEFAULT_AUTHOR = "";
    public static final String DEFAULT_HEAD_COLOR = "";
    public static final String DEFAULT_KEY_WORD = "";
    public static final String DEFAULT_SHARE_TITLE = "";
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_NAME = "";
    public static final String DEFAULT_TOPIC_PIC = "";

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String author;

    @ProtoField(tag = 14, type = Message.Datatype.UINT64)
    public final Long browse_num;

    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer come_from;

    @ProtoField(tag = 16, type = Message.Datatype.INT32)
    public final Integer content_source;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long discuss_num;

    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String head_color;

    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer idx_num;

    @ProtoField(tag = 12, type = Message.Datatype.UINT64)
    public final Long interaction_num_page;

    @ProtoField(tag = 17, type = Message.Datatype.INT32)
    public final Integer is_porn;

    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer is_video_topic;

    @ProtoField(tag = 21, type = Message.Datatype.STRING)
    public final String key_word;

    @ProtoField(label = Message.Label.REPEATED, tag = 10)
    public final List<Media> media;

    @ProtoField(tag = 13, type = Message.Datatype.UINT64)
    public final Long publisher_num;

    @ProtoField(tag = 20, type = Message.Datatype.STRING)
    public final String share_title;

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer tag;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String topic_desc;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long topic_id;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String topic_pic;

    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer type;

    @ProtoField(tag = 8, type = Message.Datatype.INT64)
    public final Long update_time;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Integer DEFAULT_TYPE = 0;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;
    public static final Integer DEFAULT_TAG = 0;
    public static final Long DEFAULT_UPDATE_TIME = 0L;
    public static final List<Media> DEFAULT_MEDIA = Collections.emptyList();
    public static final Integer DEFAULT_IS_VIDEO_TOPIC = 0;
    public static final Long DEFAULT_INTERACTION_NUM_PAGE = 0L;
    public static final Long DEFAULT_PUBLISHER_NUM = 0L;
    public static final Long DEFAULT_BROWSE_NUM = 0L;
    public static final Integer DEFAULT_COME_FROM = 0;
    public static final Integer DEFAULT_CONTENT_SOURCE = 0;
    public static final Integer DEFAULT_IS_PORN = 0;
    public static final Integer DEFAULT_IDX_NUM = 0;

    public static final class Builder extends Message.Builder<RecomTopicList> {
        public String author;
        public Long browse_num;
        public Integer come_from;
        public Integer content_source;
        public Long discuss_num;
        public String head_color;
        public Integer idx_num;
        public Long interaction_num_page;
        public Integer is_porn;
        public Integer is_video_topic;
        public String key_word;
        public List<Media> media;
        public Long publisher_num;
        public String share_title;
        public Integer tag;
        public String topic_desc;
        public Long topic_id;
        public String topic_name;
        public String topic_pic;
        public Integer type;
        public Long update_time;

        public Builder() {
        }

        public Builder(RecomTopicList recomTopicList) {
            super(recomTopicList);
            if (recomTopicList == null) {
                return;
            }
            this.topic_id = recomTopicList.topic_id;
            this.topic_name = recomTopicList.topic_name;
            this.type = recomTopicList.type;
            this.discuss_num = recomTopicList.discuss_num;
            this.tag = recomTopicList.tag;
            this.topic_desc = recomTopicList.topic_desc;
            this.topic_pic = recomTopicList.topic_pic;
            this.update_time = recomTopicList.update_time;
            this.author = recomTopicList.author;
            this.media = Message.copyOf(recomTopicList.media);
            this.is_video_topic = recomTopicList.is_video_topic;
            this.interaction_num_page = recomTopicList.interaction_num_page;
            this.publisher_num = recomTopicList.publisher_num;
            this.browse_num = recomTopicList.browse_num;
            this.come_from = recomTopicList.come_from;
            this.content_source = recomTopicList.content_source;
            this.is_porn = recomTopicList.is_porn;
            this.head_color = recomTopicList.head_color;
            this.idx_num = recomTopicList.idx_num;
            this.share_title = recomTopicList.share_title;
            this.key_word = recomTopicList.key_word;
        }

        @Override // com.squareup.wire.Message.Builder
        public RecomTopicList build(boolean z) {
            return new RecomTopicList(this, z);
        }
    }

    public RecomTopicList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.topic_id;
            if (l == null) {
                this.topic_id = DEFAULT_TOPIC_ID;
            } else {
                this.topic_id = l;
            }
            String str = builder.topic_name;
            if (str == null) {
                this.topic_name = "";
            } else {
                this.topic_name = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            Integer num2 = builder.tag;
            if (num2 == null) {
                this.tag = DEFAULT_TAG;
            } else {
                this.tag = num2;
            }
            String str2 = builder.topic_desc;
            if (str2 == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = str2;
            }
            String str3 = builder.topic_pic;
            if (str3 == null) {
                this.topic_pic = "";
            } else {
                this.topic_pic = str3;
            }
            Long l3 = builder.update_time;
            if (l3 == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = l3;
            }
            String str4 = builder.author;
            if (str4 == null) {
                this.author = "";
            } else {
                this.author = str4;
            }
            List<Media> list = builder.media;
            if (list == null) {
                this.media = DEFAULT_MEDIA;
            } else {
                this.media = Message.immutableCopyOf(list);
            }
            Integer num3 = builder.is_video_topic;
            if (num3 == null) {
                this.is_video_topic = DEFAULT_IS_VIDEO_TOPIC;
            } else {
                this.is_video_topic = num3;
            }
            Long l4 = builder.interaction_num_page;
            if (l4 == null) {
                this.interaction_num_page = DEFAULT_INTERACTION_NUM_PAGE;
            } else {
                this.interaction_num_page = l4;
            }
            Long l5 = builder.publisher_num;
            if (l5 == null) {
                this.publisher_num = DEFAULT_PUBLISHER_NUM;
            } else {
                this.publisher_num = l5;
            }
            Long l6 = builder.browse_num;
            if (l6 == null) {
                this.browse_num = DEFAULT_BROWSE_NUM;
            } else {
                this.browse_num = l6;
            }
            Integer num4 = builder.come_from;
            if (num4 == null) {
                this.come_from = DEFAULT_COME_FROM;
            } else {
                this.come_from = num4;
            }
            Integer num5 = builder.content_source;
            if (num5 == null) {
                this.content_source = DEFAULT_CONTENT_SOURCE;
            } else {
                this.content_source = num5;
            }
            Integer num6 = builder.is_porn;
            if (num6 == null) {
                this.is_porn = DEFAULT_IS_PORN;
            } else {
                this.is_porn = num6;
            }
            String str5 = builder.head_color;
            if (str5 == null) {
                this.head_color = "";
            } else {
                this.head_color = str5;
            }
            Integer num7 = builder.idx_num;
            if (num7 == null) {
                this.idx_num = DEFAULT_IDX_NUM;
            } else {
                this.idx_num = num7;
            }
            String str6 = builder.share_title;
            if (str6 == null) {
                this.share_title = "";
            } else {
                this.share_title = str6;
            }
            String str7 = builder.key_word;
            if (str7 == null) {
                this.key_word = "";
                return;
            } else {
                this.key_word = str7;
                return;
            }
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.type = builder.type;
        this.discuss_num = builder.discuss_num;
        this.tag = builder.tag;
        this.topic_desc = builder.topic_desc;
        this.topic_pic = builder.topic_pic;
        this.update_time = builder.update_time;
        this.author = builder.author;
        this.media = Message.immutableCopyOf(builder.media);
        this.is_video_topic = builder.is_video_topic;
        this.interaction_num_page = builder.interaction_num_page;
        this.publisher_num = builder.publisher_num;
        this.browse_num = builder.browse_num;
        this.come_from = builder.come_from;
        this.content_source = builder.content_source;
        this.is_porn = builder.is_porn;
        this.head_color = builder.head_color;
        this.idx_num = builder.idx_num;
        this.share_title = builder.share_title;
        this.key_word = builder.key_word;
    }
}