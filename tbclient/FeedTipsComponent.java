package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedTipsComponent extends Message {
    public static final String DEFAULT_FONT_SIZE = "";
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedContentResource> data;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String font_size;

    @ProtoField(tag = 2)
    public final FeedContentIcon icon_data;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer max_lines;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String schema;
    public static final List<FeedContentResource> DEFAULT_DATA = Collections.emptyList();
    public static final Integer DEFAULT_MAX_LINES = 0;

    public static final class Builder extends Message.Builder<FeedTipsComponent> {
        public List<FeedContentResource> data;
        public String font_size;
        public FeedContentIcon icon_data;
        public Integer max_lines;
        public String schema;

        public Builder() {
        }

        public Builder(FeedTipsComponent feedTipsComponent) {
            super(feedTipsComponent);
            if (feedTipsComponent == null) {
                return;
            }
            this.data = Message.copyOf(feedTipsComponent.data);
            this.icon_data = feedTipsComponent.icon_data;
            this.font_size = feedTipsComponent.font_size;
            this.max_lines = feedTipsComponent.max_lines;
            this.schema = feedTipsComponent.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedTipsComponent build(boolean z) {
            return new FeedTipsComponent(this, z);
        }
    }

    public FeedTipsComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedContentResource> list = builder.data;
            if (list == null) {
                this.data = DEFAULT_DATA;
            } else {
                this.data = Message.immutableCopyOf(list);
            }
            this.icon_data = builder.icon_data;
            String str = builder.font_size;
            if (str == null) {
                this.font_size = "";
            } else {
                this.font_size = str;
            }
            Integer num = builder.max_lines;
            if (num == null) {
                this.max_lines = DEFAULT_MAX_LINES;
            } else {
                this.max_lines = num;
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str2;
                return;
            }
        }
        this.data = Message.immutableCopyOf(builder.data);
        this.icon_data = builder.icon_data;
        this.font_size = builder.font_size;
        this.max_lines = builder.max_lines;
        this.schema = builder.schema;
    }
}