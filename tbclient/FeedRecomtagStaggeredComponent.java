package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedRecomtagStaggeredComponent extends Message {
    public static final String DEFAULT_SCHEMA = "";
    public static final List<FeedContentResource> DEFAULT_TEXT = Collections.emptyList();

    @ProtoField(tag = 1)
    public final FeedContentIcon icon_data;

    @ProtoField(tag = 3)
    public final FeedContentIcon right_icon;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedContentResource> text;

    public static final class Builder extends Message.Builder<FeedRecomtagStaggeredComponent> {
        public FeedContentIcon icon_data;
        public FeedContentIcon right_icon;
        public String schema;
        public List<FeedContentResource> text;

        public Builder() {
        }

        public Builder(FeedRecomtagStaggeredComponent feedRecomtagStaggeredComponent) {
            super(feedRecomtagStaggeredComponent);
            if (feedRecomtagStaggeredComponent == null) {
                return;
            }
            this.icon_data = feedRecomtagStaggeredComponent.icon_data;
            this.text = Message.copyOf(feedRecomtagStaggeredComponent.text);
            this.right_icon = feedRecomtagStaggeredComponent.right_icon;
            this.schema = feedRecomtagStaggeredComponent.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedRecomtagStaggeredComponent build(boolean z) {
            return new FeedRecomtagStaggeredComponent(this, z);
        }
    }

    public FeedRecomtagStaggeredComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.icon_data = builder.icon_data;
            List<FeedContentResource> list = builder.text;
            if (list == null) {
                this.text = DEFAULT_TEXT;
            } else {
                this.text = Message.immutableCopyOf(list);
            }
            this.right_icon = builder.right_icon;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.icon_data = builder.icon_data;
        this.text = Message.immutableCopyOf(builder.text);
        this.right_icon = builder.right_icon;
        this.schema = builder.schema;
    }
}