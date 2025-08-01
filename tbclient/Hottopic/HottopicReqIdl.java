package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class HottopicReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<HottopicReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(HottopicReqIdl hottopicReqIdl) {
            super(hottopicReqIdl);
            if (hottopicReqIdl == null) {
                return;
            }
            this.data = hottopicReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public HottopicReqIdl build(boolean z) {
            return new HottopicReqIdl(this, z);
        }
    }

    public HottopicReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}