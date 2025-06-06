package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeedContentIcon extends Message {
    public static final String DEFAULT_DAY_URL = "";
    public static final String DEFAULT_MARGIN_LEFT = "";
    public static final String DEFAULT_MARGIN_RIGHT = "";
    public static final String DEFAULT_NIGHT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String day_url;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer height;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String margin_left;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String margin_right;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String night_url;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer width;
    public static final Integer DEFAULT_WIDTH = 0;
    public static final Integer DEFAULT_HEIGHT = 0;

    public static final class Builder extends Message.Builder<FeedContentIcon> {
        public String day_url;
        public Integer height;
        public String margin_left;
        public String margin_right;
        public String night_url;
        public Integer width;

        public Builder() {
        }

        public Builder(FeedContentIcon feedContentIcon) {
            super(feedContentIcon);
            if (feedContentIcon == null) {
                return;
            }
            this.day_url = feedContentIcon.day_url;
            this.night_url = feedContentIcon.night_url;
            this.width = feedContentIcon.width;
            this.height = feedContentIcon.height;
            this.margin_right = feedContentIcon.margin_right;
            this.margin_left = feedContentIcon.margin_left;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedContentIcon build(boolean z) {
            return new FeedContentIcon(this, z);
        }
    }

    public FeedContentIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.day_url;
            if (str == null) {
                this.day_url = "";
            } else {
                this.day_url = str;
            }
            String str2 = builder.night_url;
            if (str2 == null) {
                this.night_url = "";
            } else {
                this.night_url = str2;
            }
            Integer num = builder.width;
            if (num == null) {
                this.width = DEFAULT_WIDTH;
            } else {
                this.width = num;
            }
            Integer num2 = builder.height;
            if (num2 == null) {
                this.height = DEFAULT_HEIGHT;
            } else {
                this.height = num2;
            }
            String str3 = builder.margin_right;
            if (str3 == null) {
                this.margin_right = "";
            } else {
                this.margin_right = str3;
            }
            String str4 = builder.margin_left;
            if (str4 == null) {
                this.margin_left = "";
                return;
            } else {
                this.margin_left = str4;
                return;
            }
        }
        this.day_url = builder.day_url;
        this.night_url = builder.night_url;
        this.width = builder.width;
        this.height = builder.height;
        this.margin_right = builder.margin_right;
        this.margin_left = builder.margin_left;
    }
}