package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedButton extends Message {
    public static final String DEFAULT_SCHEMA = "";

    @ProtoField(tag = 1)
    public final FeedContentColor background_color;

    @ProtoField(tag = 5)
    public final BorderInfo border_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 7)
    public final List<FeedKV> business_info;

    @ProtoField(tag = 2)
    public final FeedContentIcon icon;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer style;

    @ProtoField(tag = 3)
    public final FeedContentText text;
    public static final Integer DEFAULT_STYLE = 0;
    public static final List<FeedKV> DEFAULT_BUSINESS_INFO = Collections.emptyList();

    public static final class Builder extends Message.Builder<FeedButton> {
        public FeedContentColor background_color;
        public BorderInfo border_info;
        public List<FeedKV> business_info;
        public FeedContentIcon icon;
        public String schema;
        public Integer style;
        public FeedContentText text;

        public Builder() {
        }

        public Builder(FeedButton feedButton) {
            super(feedButton);
            if (feedButton == null) {
                return;
            }
            this.background_color = feedButton.background_color;
            this.icon = feedButton.icon;
            this.text = feedButton.text;
            this.style = feedButton.style;
            this.border_info = feedButton.border_info;
            this.schema = feedButton.schema;
            this.business_info = Message.copyOf(feedButton.business_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedButton build(boolean z) {
            return new FeedButton(this, z);
        }
    }

    public FeedButton(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.background_color = builder.background_color;
            this.icon = builder.icon;
            this.text = builder.text;
            Integer num = builder.style;
            if (num == null) {
                this.style = DEFAULT_STYLE;
            } else {
                this.style = num;
            }
            this.border_info = builder.border_info;
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
        this.background_color = builder.background_color;
        this.icon = builder.icon;
        this.text = builder.text;
        this.style = builder.style;
        this.border_info = builder.border_info;
        this.schema = builder.schema;
        this.business_info = Message.immutableCopyOf(builder.business_info);
    }
}