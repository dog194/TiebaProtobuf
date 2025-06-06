package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BorderInfo extends Message {
    public static final String DEFAULT_BORDER_WIDTH = "";

    @ProtoField(tag = 2)
    public final FeedContentColor border_color;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String border_width;

    public static final class Builder extends Message.Builder<BorderInfo> {
        public FeedContentColor border_color;
        public String border_width;

        public Builder() {
        }

        public Builder(BorderInfo borderInfo) {
            super(borderInfo);
            if (borderInfo == null) {
                return;
            }
            this.border_width = borderInfo.border_width;
            this.border_color = borderInfo.border_color;
        }

        @Override // com.squareup.wire.Message.Builder
        public BorderInfo build(boolean z) {
            return new BorderInfo(this, z);
        }
    }

    public BorderInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.border_width;
            if (str == null) {
                this.border_width = "";
            } else {
                this.border_width = str;
            }
            this.border_color = builder.border_color;
            return;
        }
        this.border_width = builder.border_width;
        this.border_color = builder.border_color;
    }
}