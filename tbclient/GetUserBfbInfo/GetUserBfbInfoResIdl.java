package tbclient.GetUserBfbInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetUserBfbInfoResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetUserBfbInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetUserBfbInfoResIdl getUserBfbInfoResIdl) {
            super(getUserBfbInfoResIdl);
            if (getUserBfbInfoResIdl == null) {
                return;
            }
            this.error = getUserBfbInfoResIdl.error;
            this.data = getUserBfbInfoResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetUserBfbInfoResIdl build(boolean z) {
            return new GetUserBfbInfoResIdl(this, z);
        }
    }

    public GetUserBfbInfoResIdl(Builder builder, boolean z) {
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