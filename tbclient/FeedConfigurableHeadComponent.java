package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedConfigurableHeadComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 5)
    public final Feedback feedback;

    @ProtoField(tag = 1)
    public final FeedContentIcon icon;

    @ProtoField(tag = 3)
    public final RightBoxInfo right_box;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 2)
    public final ConfigurableHeadTitle title;

    public static final class Builder extends Message.Builder<FeedConfigurableHeadComponent> {
        public Feedback feedback;
        public FeedContentIcon icon;
        public RightBoxInfo right_box;
        public String schema;
        public ConfigurableHeadTitle title;

        public Builder() {
        }

        public Builder(FeedConfigurableHeadComponent feedConfigurableHeadComponent) {
            super(feedConfigurableHeadComponent);
            if (feedConfigurableHeadComponent == null) {
                return;
            }
            this.icon = feedConfigurableHeadComponent.icon;
            this.title = feedConfigurableHeadComponent.title;
            this.right_box = feedConfigurableHeadComponent.right_box;
            this.schema = feedConfigurableHeadComponent.schema;
            this.feedback = feedConfigurableHeadComponent.feedback;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedConfigurableHeadComponent build(boolean z) {
            return new FeedConfigurableHeadComponent(this, z);
        }
    }

    public FeedConfigurableHeadComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.icon = builder.icon;
            this.title = builder.title;
            this.right_box = builder.right_box;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            this.feedback = builder.feedback;
            return;
        }
        this.icon = builder.icon;
        this.title = builder.title;
        this.right_box = builder.right_box;
        this.schema = builder.schema;
        this.feedback = builder.feedback;
    }
}