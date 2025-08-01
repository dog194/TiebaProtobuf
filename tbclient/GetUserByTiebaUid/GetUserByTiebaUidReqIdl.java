package tbclient.GetUserByTiebaUid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetUserByTiebaUidReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetUserByTiebaUidReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetUserByTiebaUidReqIdl getUserByTiebaUidReqIdl) {
            super(getUserByTiebaUidReqIdl);
            if (getUserByTiebaUidReqIdl == null) {
                return;
            }
            this.data = getUserByTiebaUidReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetUserByTiebaUidReqIdl build(boolean z) {
            return new GetUserByTiebaUidReqIdl(this, z);
        }
    }

    public GetUserByTiebaUidReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}