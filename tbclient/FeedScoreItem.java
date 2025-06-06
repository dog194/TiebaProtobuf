package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedScoreItem extends Message {

    @ProtoField(tag = 3)
    public final ConfigurableHeadTitle extra_data;

    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;

    @ProtoField(tag = 2)
    public final ConfigurableHeadTitle main_data;

    @ProtoField(tag = 4)
    public final FeedContentResource score;

    public static final class Builder extends Message.Builder<FeedScoreItem> {
        public ConfigurableHeadTitle extra_data;
        public FeedHeadImg image_data;
        public ConfigurableHeadTitle main_data;
        public FeedContentResource score;

        public Builder() {
        }

        public Builder(FeedScoreItem feedScoreItem) {
            super(feedScoreItem);
            if (feedScoreItem == null) {
                return;
            }
            this.image_data = feedScoreItem.image_data;
            this.main_data = feedScoreItem.main_data;
            this.extra_data = feedScoreItem.extra_data;
            this.score = feedScoreItem.score;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedScoreItem build(boolean z) {
            return new FeedScoreItem(this, z);
        }
    }

    public FeedScoreItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            this.main_data = builder.main_data;
            this.extra_data = builder.extra_data;
            this.score = builder.score;
            return;
        }
        this.image_data = builder.image_data;
        this.main_data = builder.main_data;
        this.extra_data = builder.extra_data;
        this.score = builder.score;
    }
}