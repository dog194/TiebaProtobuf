package tbclient.GetShoubaiThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetShoubaiThreadListReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetShoubaiThreadListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetShoubaiThreadListReqIdl getShoubaiThreadListReqIdl) {
            super(getShoubaiThreadListReqIdl);
            if (getShoubaiThreadListReqIdl == null) {
                return;
            }
            this.data = getShoubaiThreadListReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetShoubaiThreadListReqIdl build(boolean z) {
            return new GetShoubaiThreadListReqIdl(this, z);
        }
    }

    public GetShoubaiThreadListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}