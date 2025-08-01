package tbclient.ReplyFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ReplyFriendResIdl extends Message {

    @ProtoField(tag = 1)
    public final ResData data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<ReplyFriendResIdl> {
        public ResData data;
        public Error error;

        public Builder() {
        }

        public Builder(ReplyFriendResIdl replyFriendResIdl) {
            super(replyFriendResIdl);
            if (replyFriendResIdl == null) {
                return;
            }
            this.data = replyFriendResIdl.data;
            this.error = replyFriendResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public ReplyFriendResIdl build(boolean z) {
            return new ReplyFriendResIdl(this, z);
        }
    }

    public ReplyFriendResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}