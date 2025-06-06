package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedSidewayLoadMore extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 2)
    public final FeedContentIcon icon;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 1)
    public final FeedContentText text;

    public static final class Builder extends Message.Builder<FeedSidewayLoadMore> {
        public FeedContentIcon icon;
        public String schema;
        public FeedContentText text;

        public Builder() {
        }

        public Builder(FeedSidewayLoadMore feedSidewayLoadMore) {
            super(feedSidewayLoadMore);
            if (feedSidewayLoadMore == null) {
                return;
            }
            this.text = feedSidewayLoadMore.text;
            this.icon = feedSidewayLoadMore.icon;
            this.schema = feedSidewayLoadMore.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedSidewayLoadMore build(boolean z) {
            return new FeedSidewayLoadMore(this, z);
        }
    }

    public FeedSidewayLoadMore(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.text = builder.text;
            this.icon = builder.icon;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.text = builder.text;
        this.icon = builder.icon;
        this.schema = builder.schema;
    }
}