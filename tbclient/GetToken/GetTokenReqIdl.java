package tbclient.GetToken;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetTokenReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetTokenReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetTokenReqIdl getTokenReqIdl) {
            super(getTokenReqIdl);
            if (getTokenReqIdl == null) {
                return;
            }
            this.data = getTokenReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetTokenReqIdl build(boolean z) {
            return new GetTokenReqIdl(this, z);
        }
    }

    public GetTokenReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}