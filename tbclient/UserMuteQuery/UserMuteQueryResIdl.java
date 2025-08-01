package tbclient.UserMuteQuery;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class UserMuteQueryResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<UserMuteQueryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(UserMuteQueryResIdl userMuteQueryResIdl) {
            super(userMuteQueryResIdl);
            if (userMuteQueryResIdl == null) {
                return;
            }
            this.data = userMuteQueryResIdl.data;
            this.error = userMuteQueryResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserMuteQueryResIdl build(boolean z) {
            return new UserMuteQueryResIdl(this, z);
        }
    }

    public UserMuteQueryResIdl(Builder builder, boolean z) {
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