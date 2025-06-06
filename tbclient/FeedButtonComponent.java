package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedButtonComponent extends Message {
    public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 2)
    public final FeedContentColor background;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> data;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String schema;

    public static final class Builder extends Message.Builder<FeedButtonComponent> {
        public FeedContentColor background;
        public List<FeedContentResource> data;
        public String schema;

        public Builder() {
        }

        public Builder(FeedButtonComponent feedButtonComponent) {
            super(feedButtonComponent);
            if (feedButtonComponent == null) {
                return;
            }
            this.data = Message.copyOf(feedButtonComponent.data);
            this.background = feedButtonComponent.background;
            this.schema = feedButtonComponent.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedButtonComponent build(boolean z) {
            return new FeedButtonComponent(this, z);
        }
    }

    public FeedButtonComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder.data;
            if (list == null) {
                this.data = DEFAULT_DATA;
            } else {
                this.data = Message.immutableCopyOf(list);
            }
            this.background = builder.background;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str;
                return;
            }
        }
        this.data = Message.immutableCopyOf(builder.data);
        this.background = builder.background;
        this.schema = builder.schema;
    }
}