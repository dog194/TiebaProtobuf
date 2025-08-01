package tbclient.GetUserInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetUserInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetUserInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserInfoReqIdl getUserInfoReqIdl) {
            super(getUserInfoReqIdl);
            if (getUserInfoReqIdl == null) {
                return;
            }
            this.data = getUserInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetUserInfoReqIdl build(boolean z) {
            return new GetUserInfoReqIdl(this, z);
        }
    }

    public GetUserInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}