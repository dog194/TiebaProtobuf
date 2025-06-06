package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class QuestionContent extends Message {

    @ProtoField(tag = 4)
    public final FeedContentText award_content;

    @ProtoField(tag = 3)
    public final FeedContentIcon award_icon;

    @ProtoField(tag = 2)
    public final FeedContentText mid_text;

    @ProtoField(tag = 1)
    public final FeedContentText user_name;

    public static final class Builder extends Message.Builder<QuestionContent> {
        public FeedContentText award_content;
        public FeedContentIcon award_icon;
        public FeedContentText mid_text;
        public FeedContentText user_name;

        public Builder() {
        }

        public Builder(QuestionContent questionContent) {
            super(questionContent);
            if (questionContent == null) {
                return;
            }
            this.user_name = questionContent.user_name;
            this.mid_text = questionContent.mid_text;
            this.award_icon = questionContent.award_icon;
            this.award_content = questionContent.award_content;
        }

        @Override // com.squareup.wire.Message.Builder
        public QuestionContent build(boolean z) {
            return new QuestionContent(this, z);
        }
    }

    public QuestionContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.user_name = builder.user_name;
            this.mid_text = builder.mid_text;
            this.award_icon = builder.award_icon;
            this.award_content = builder.award_content;
            return;
        }
        this.user_name = builder.user_name;
        this.mid_text = builder.mid_text;
        this.award_icon = builder.award_icon;
        this.award_content = builder.award_content;
    }
}