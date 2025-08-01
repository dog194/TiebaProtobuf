package tbclient.GetPrivateInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetPrivateInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<GetPrivateInfoReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(GetPrivateInfoReqIdl getPrivateInfoReqIdl) {
            super(getPrivateInfoReqIdl);
            if (getPrivateInfoReqIdl == null) {
                return;
            }
            this.data = getPrivateInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetPrivateInfoReqIdl build(boolean z) {
            return new GetPrivateInfoReqIdl(this, z);
        }
    }

    public GetPrivateInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}