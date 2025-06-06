package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedVideoComponent extends Message {
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 1)
    public final VideoField video_info;

    public static final class Builder extends Message.Builder<FeedVideoComponent> {
        public List<FeedKV> business_info;
        public String schema;
        public VideoField video_info;

        public Builder() {
        }

        public Builder(FeedVideoComponent feedVideoComponent) {
            super(feedVideoComponent);
            if (feedVideoComponent == null) {
                return;
            }
            this.video_info = feedVideoComponent.video_info;
            this.schema = feedVideoComponent.schema;
            this.business_info = Message.copyOf(feedVideoComponent.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedVideoComponent build(boolean z) {
            return new FeedVideoComponent(this, z);
        }
    }

    public FeedVideoComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.video_info = builder.video_info;
            String str = builder.schema;
            if (str == null) {
                this.schema = "";
            } else {
                this.schema = str;
            }
            List<FeedKV> list = builder.business_info;
            if (list == null) {
                this.business_info = DEFAULT_BUSINESS_INFO;
                return;
            } else {
                this.business_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.video_info = builder.video_info;
        this.schema = builder.schema;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}