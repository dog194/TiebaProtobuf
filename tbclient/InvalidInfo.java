package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class InvalidInfo extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_ICON = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;

    public static final class Builder extends Message.Builder<InvalidInfo> {
        public String content;
        public String icon;

        public Builder() {
        }

        public Builder(InvalidInfo invalidInfo) {
            super(invalidInfo);
            if (invalidInfo == null) {
                return;
            }
            this.icon = invalidInfo.icon;
            this.content = invalidInfo.content;
        }

        @Override // com.squareup.wire.Message.Builder
        public InvalidInfo build(boolean z) {
            return new InvalidInfo(this, z);
        }
    }

    public InvalidInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
                return;
            } else {
                this.content = str2;
                return;
            }
        }
        this.icon = builder.icon;
        this.content = builder.content;
    }
}