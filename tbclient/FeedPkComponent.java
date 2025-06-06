package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedPkComponent extends Message {

    @ProtoField(tag = 1)
    public final PollInfo poll_info;

    public static final class Builder extends Message.Builder<FeedPkComponent> {
        public PollInfo poll_info;

        public Builder() {
        }

        public Builder(FeedPkComponent feedPkComponent) {
            super(feedPkComponent);
            if (feedPkComponent == null) {
                return;
            }
            this.poll_info = feedPkComponent.poll_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedPkComponent build(boolean z) {
            return new FeedPkComponent(this, z);
        }
    }

    public FeedPkComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.poll_info = builder.poll_info;
        } else {
            this.poll_info = builder.poll_info;
        }
    }
}