package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedInteractionRight extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 4)
    public final FeedInteractionRightData data;

    @ProtoField(tag = 2)
    public final FeedContentIcon icon_data;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String schema;

    public static final class Builder extends Message.Builder<FeedInteractionRight> {
        public FeedInteractionRightData data;
        public FeedContentIcon icon_data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedInteractionRight feedInteractionRight) {
            super(feedInteractionRight);
            if (feedInteractionRight == null) {
                return;
            }
            this.schema = feedInteractionRight.schema;
            this.icon_data = feedInteractionRight.icon_data;
            this.data = feedInteractionRight.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedInteractionRight build(boolean z) {
            return new FeedInteractionRight(this, z);
        }
    }

    public FeedInteractionRight(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.icon_data = builder.icon_data;
            this.data = builder.data;
            return;
        }
        this.schema = builder.schema;
        this.icon_data = builder.icon_data;
        this.data = builder.data;
    }
}