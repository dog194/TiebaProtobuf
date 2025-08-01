package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PostTopic extends Message {
    public static final String DEFAULT_CONTENT_TOPIC = "";
    public static final String DEFAULT_TITLE_TOPIC = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content_topic;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title_topic;

    public static final class Builder extends Message.Builder<PostTopic> {
        public String content_topic;
        public String title_topic;

        public Builder() {
        }

        public Builder(PostTopic postTopic) {
            super(postTopic);
            if (postTopic == null) {
                return;
            }
            this.title_topic = postTopic.title_topic;
            this.content_topic = postTopic.content_topic;
        }

        @Override // com.squareup.wire.Message.Builder
        public PostTopic build(boolean z) {
            return new PostTopic(this, z);
        }
    }

    public PostTopic(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title_topic;
            if (str == null) {
                this.title_topic = "";
            } else {
                this.title_topic = str;
            }
            String str2 = builder.content_topic;
            if (str2 == null) {
                this.content_topic = "";
                return;
            } else {
                this.content_topic = str2;
                return;
            }
        }
        this.title_topic = builder.title_topic;
        this.content_topic = builder.content_topic;
    }
}