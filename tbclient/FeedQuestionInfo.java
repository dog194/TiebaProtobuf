package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedQuestionInfo extends Message {

    @ProtoField(tag = 3)
    public final FeedButton feed_button;

    @ProtoField(tag = 1)
    public final TitleComponent feed_title;

    @ProtoField(tag = 2)
    public final QuestionContent question_content;

    public static final class Builder extends Message.Builder<FeedQuestionInfo> {
        public FeedButton feed_button;
        public TitleComponent feed_title;
        public QuestionContent question_content;

        public Builder() {
        }

        public Builder(FeedQuestionInfo feedQuestionInfo) {
            super(feedQuestionInfo);
            if (feedQuestionInfo == null) {
                return;
            }
            this.feed_title = feedQuestionInfo.feed_title;
            this.question_content = feedQuestionInfo.question_content;
            this.feed_button = feedQuestionInfo.feed_button;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedQuestionInfo build(boolean z) {
            return new FeedQuestionInfo(this, z);
        }
    }

    public FeedQuestionInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.feed_title = builder.feed_title;
            this.question_content = builder.question_content;
            this.feed_button = builder.feed_button;
        } else {
            this.feed_title = builder.feed_title;
            this.question_content = builder.question_content;
            this.feed_button = builder.feed_button;
        }
    }
}