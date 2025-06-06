package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedMixComponent extends Message {
    public static final List<FeedHeadSymbol> DEFAULT_DESC = Collections.emptyList();

    @ProtoField(tag = 5)
    public final FeedButton button;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedHeadSymbol> desc;

    @ProtoField(tag = 4)
    public final FeedFeedback feedback;

    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;

    @ProtoField(tag = 2)
    public final FeedContentText title;

    public static final class Builder extends Message.Builder<FeedMixComponent> {
        public FeedButton button;
        public List<FeedHeadSymbol> desc;
        public FeedFeedback feedback;
        public FeedHeadImg image_data;
        public FeedContentText title;

        public Builder() {
        }

        public Builder(FeedMixComponent feedMixComponent) {
            super(feedMixComponent);
            if (feedMixComponent == null) {
                return;
            }
            this.image_data = feedMixComponent.image_data;
            this.title = feedMixComponent.title;
            this.desc = Message.copyOf(feedMixComponent.desc);
            this.feedback = feedMixComponent.feedback;
            this.button = feedMixComponent.button;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedMixComponent build(boolean z) {
            return new FeedMixComponent(this, z);
        }
    }

    public FeedMixComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            this.title = builder.title;
            List<FeedHeadSymbol> list = builder.desc;
            if (list == null) {
                this.desc = DEFAULT_DESC;
            } else {
                this.desc = Message.immutableCopyOf(list);
            }
            this.feedback = builder.feedback;
            this.button = builder.button;
            return;
        }
        this.image_data = builder.image_data;
        this.title = builder.title;
        this.desc = Message.immutableCopyOf(builder.desc);
        this.feedback = builder.feedback;
        this.button = builder.button;
    }
}