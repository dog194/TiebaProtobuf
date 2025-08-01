package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetBawuInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetBawuInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetBawuInfoReqIdl getBawuInfoReqIdl) {
            super(getBawuInfoReqIdl);
            if (getBawuInfoReqIdl == null) {
                return;
            }
            this.data = getBawuInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBawuInfoReqIdl build(boolean z) {
            return new GetBawuInfoReqIdl(this, z);
        }
    }

    public GetBawuInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}