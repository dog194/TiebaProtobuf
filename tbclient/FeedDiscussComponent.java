package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedDiscussComponent extends Message {

    @ProtoField(tag = 4)
    public final FeedContentJumpInfo negative_info;

    @ProtoField(tag = 2)
    public final FeedContentText negative_text;

    @ProtoField(tag = 3)
    public final FeedContentJumpInfo positive_info;

    @ProtoField(tag = 1)
    public final FeedContentText positive_text;

    public static final class Builder extends Message.Builder<FeedDiscussComponent> {
        public FeedContentJumpInfo negative_info;
        public FeedContentText negative_text;
        public FeedContentJumpInfo positive_info;
        public FeedContentText positive_text;

        public Builder() {
        }

        public Builder(FeedDiscussComponent feedDiscussComponent) {
            super(feedDiscussComponent);
            if (feedDiscussComponent == null) {
                return;
            }
            this.positive_text = feedDiscussComponent.positive_text;
            this.negative_text = feedDiscussComponent.negative_text;
            this.positive_info = feedDiscussComponent.positive_info;
            this.negative_info = feedDiscussComponent.negative_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedDiscussComponent build(boolean z) {
            return new FeedDiscussComponent(this, z);
        }
    }

    public FeedDiscussComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.positive_text = builder.positive_text;
            this.negative_text = builder.negative_text;
            this.positive_info = builder.positive_info;
            this.negative_info = builder.negative_info;
            return;
        }
        this.positive_text = builder.positive_text;
        this.negative_text = builder.negative_text;
        this.positive_info = builder.positive_info;
        this.negative_info = builder.negative_info;
    }
}