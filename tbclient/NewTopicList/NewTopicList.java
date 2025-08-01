package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Post;

/* loaded from: classes4.dex */
public final class NewTopicList extends Message {
    public static final String DEFAULT_TOPIC_DESC = "";
    public static final String DEFAULT_TOPIC_IMAGE = "";
    public static final String DEFAULT_TOPIC_NAME = "";

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long discuss_num;

    @ProtoField(tag = 7)
    public final PkModule pk_module;

    @ProtoField(tag = 6)
    public final Post top_agree_post;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String topic_desc;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long topic_id;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String topic_image;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String topic_name;
    public static final Long DEFAULT_TOPIC_ID = 0L;
    public static final Long DEFAULT_DISCUSS_NUM = 0L;

    public static final class Builder extends Message.Builder<NewTopicList> {
        public Long discuss_num;
        public PkModule pk_module;
        public Post top_agree_post;
        public String topic_desc;
        public Long topic_id;
        public String topic_image;
        public String topic_name;

        public Builder() {
        }

        public Builder(NewTopicList newTopicList) {
            super(newTopicList);
            if (newTopicList == null) {
                return;
            }
            this.topic_id = newTopicList.topic_id;
            this.topic_name = newTopicList.topic_name;
            this.topic_desc = newTopicList.topic_desc;
            this.discuss_num = newTopicList.discuss_num;
            this.topic_image = newTopicList.topic_image;
            this.top_agree_post = newTopicList.top_agree_post;
            this.pk_module = newTopicList.pk_module;
        }

        @Override // com.squareup.wire.Message.Builder
        public NewTopicList build(boolean z) {
            return new NewTopicList(this, z);
        }
    }

    public NewTopicList(Builder builder, boolean z) {
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
            String str2 = builder.topic_desc;
            if (str2 == null) {
                this.topic_desc = "";
            } else {
                this.topic_desc = str2;
            }
            Long l2 = builder.discuss_num;
            if (l2 == null) {
                this.discuss_num = DEFAULT_DISCUSS_NUM;
            } else {
                this.discuss_num = l2;
            }
            String str3 = builder.topic_image;
            if (str3 == null) {
                this.topic_image = "";
            } else {
                this.topic_image = str3;
            }
            this.top_agree_post = builder.top_agree_post;
            this.pk_module = builder.pk_module;
            return;
        }
        this.topic_id = builder.topic_id;
        this.topic_name = builder.topic_name;
        this.topic_desc = builder.topic_desc;
        this.discuss_num = builder.discuss_num;
        this.topic_image = builder.topic_image;
        this.top_agree_post = builder.top_agree_post;
        this.pk_module = builder.pk_module;
    }
}