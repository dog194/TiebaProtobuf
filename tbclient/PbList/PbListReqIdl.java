package tbclient.PbList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PbListReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<PbListReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(PbListReqIdl pbListReqIdl) {
            super(pbListReqIdl);
            if (pbListReqIdl == null) {
                return;
            }
            this.data = pbListReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public PbListReqIdl build(boolean z) {
            return new PbListReqIdl(this, z);
        }
    }

    public PbListReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}