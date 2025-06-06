package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedInteractionComponent extends Message {

    @ProtoField(tag = 1)
    public final FeedInteractionLeft left;

    @ProtoField(tag = 2)
    public final FeedInteractionRight right;

    public static final class Builder extends Message.Builder<FeedInteractionComponent> {
        public FeedInteractionLeft left;
        public FeedInteractionRight right;

        public Builder() {
        }

        public Builder(FeedInteractionComponent feedInteractionComponent) {
            super(feedInteractionComponent);
            if (feedInteractionComponent == null) {
                return;
            }
            this.left = feedInteractionComponent.left;
            this.right = feedInteractionComponent.right;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedInteractionComponent build(boolean z) {
            return new FeedInteractionComponent(this, z);
        }
    }

    public FeedInteractionComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.left = builder.left;
            this.right = builder.right;
        } else {
            this.left = builder.left;
            this.right = builder.right;
        }
    }
}