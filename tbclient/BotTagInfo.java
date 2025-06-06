package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BotTagInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_HEIGHT = "";
    public static final String DEFAULT_IMG_URL = "";
    public static final Integer DEFAULT_SUB_TYPE = 0;
    public static final String DEFAULT_WIDTH = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String height;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String img_url;

    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer sub_type;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String width;

    public static final class Builder extends Message.Builder<BotTagInfo> {
        public String content;
        public String height;
        public String img_url;
        public Integer sub_type;
        public String width;

        public Builder() {
        }

        public Builder(BotTagInfo botTagInfo) {
            super(botTagInfo);
            if (botTagInfo == null) {
                return;
            }
            this.sub_type = botTagInfo.sub_type;
            this.content = botTagInfo.content;
            this.img_url = botTagInfo.img_url;
            this.width = botTagInfo.width;
            this.height = botTagInfo.height;
        }

        @Override // com.squareup.wire.Message.Builder
        public BotTagInfo build(boolean z) {
            return new BotTagInfo(this, z);
        }
    }

    public BotTagInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.sub_type;
            if (num == null) {
                this.sub_type = DEFAULT_SUB_TYPE;
            } else {
                this.sub_type = num;
            }
            String str = builder.content;
            if (str == null) {
                this.content = "";
            } else {
                this.content = str;
            }
            String str2 = builder.img_url;
            if (str2 == null) {
                this.img_url = "";
            } else {
                this.img_url = str2;
            }
            String str3 = builder.width;
            if (str3 == null) {
                this.width = "";
            } else {
                this.width = str3;
            }
            String str4 = builder.height;
            if (str4 == null) {
                this.height = "";
                return;
            } else {
                this.height = str4;
                return;
            }
        }
        this.sub_type = builder.sub_type;
        this.content = builder.content;
        this.img_url = builder.img_url;
        this.width = builder.width;
        this.height = builder.height;
    }
}