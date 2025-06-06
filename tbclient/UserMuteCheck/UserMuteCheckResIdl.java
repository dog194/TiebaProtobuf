package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class UserMuteCheckResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<UserMuteCheckResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserMuteCheckResIdl userMuteCheckResIdl) {
            super(userMuteCheckResIdl);
            if (userMuteCheckResIdl == null) {
                return;
            }
            this.data = userMuteCheckResIdl.data;
            this.error = userMuteCheckResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserMuteCheckResIdl build(boolean z) {
            return new UserMuteCheckResIdl(this, z);
        }
    }

    public UserMuteCheckResIdl(Builder builder, boolean z) {
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