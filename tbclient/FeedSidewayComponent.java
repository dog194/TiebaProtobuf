package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedSidewayComponent extends Message {
    public static final List<FeedSidewayItem> DEFAULT_ITEMS = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedSidewayItem> items;

    @ProtoField(tag = 2)
    public final FeedSidewayLoadMore load_more;

    public static final class Builder extends Message.Builder<FeedSidewayComponent> {
        public List<FeedSidewayItem> items;
        public FeedSidewayLoadMore load_more;

        public Builder() {
        }

        public Builder(FeedSidewayComponent feedSidewayComponent) {
            super(feedSidewayComponent);
            if (feedSidewayComponent == null) {
                return;
            }
            this.items = Message.copyOf(feedSidewayComponent.items);
            this.load_more = feedSidewayComponent.load_more;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedSidewayComponent build(boolean z) {
            return new FeedSidewayComponent(this, z);
        }
    }

    public FeedSidewayComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedSidewayItem> list = builder.items;
            if (list == null) {
                this.items = DEFAULT_ITEMS;
            } else {
                this.items = Message.immutableCopyOf(list);
            }
            this.load_more = builder.load_more;
            return;
        }
        this.items = Message.immutableCopyOf(builder.items);
        this.load_more = builder.load_more;
    }
}