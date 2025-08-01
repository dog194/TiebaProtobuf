package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ElectionInfoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ElectionInfoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ElectionInfoReqIdl electionInfoReqIdl) {
            super(electionInfoReqIdl);
            if (electionInfoReqIdl == null) {
                return;
            }
            this.data = electionInfoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ElectionInfoReqIdl build(boolean z) {
            return new ElectionInfoReqIdl(this, z);
        }
    }

    public ElectionInfoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}