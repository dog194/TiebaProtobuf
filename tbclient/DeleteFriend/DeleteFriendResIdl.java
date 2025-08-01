package tbclient.DeleteFriend;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class DeleteFriendResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<DeleteFriendResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DeleteFriendResIdl deleteFriendResIdl) {
            super(deleteFriendResIdl);
            if (deleteFriendResIdl == null) {
                return;
            }
            this.error = deleteFriendResIdl.error;
            this.data = deleteFriendResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DeleteFriendResIdl build(boolean z) {
            return new DeleteFriendResIdl(this, z);
        }
    }

    public DeleteFriendResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}