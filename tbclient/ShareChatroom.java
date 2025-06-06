package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ShareChatroom extends Message {
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<ShareChatroom> {
        public String url;

        public Builder() {
        }

        public Builder(ShareChatroom shareChatroom) {
            super(shareChatroom);
            if (shareChatroom == null) {
                return;
            }
            this.url = shareChatroom.url;
        }

        @Override // com.squareup.wire.Message.Builder
        public ShareChatroom build(boolean z) {
            return new ShareChatroom(this, z);
        }
    }

    public ShareChatroom(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.url = builder.url;
    }
}