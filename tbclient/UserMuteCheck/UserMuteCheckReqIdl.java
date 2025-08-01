package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UserMuteCheckReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<UserMuteCheckReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(UserMuteCheckReqIdl userMuteCheckReqIdl) {
            super(userMuteCheckReqIdl);
            if (userMuteCheckReqIdl == null) {
                return;
            }
            this.data = userMuteCheckReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserMuteCheckReqIdl build(boolean z) {
            return new UserMuteCheckReqIdl(this, z);
        }
    }

    public UserMuteCheckReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}