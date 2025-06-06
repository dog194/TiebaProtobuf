package tbclient.Lego;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LegoReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<LegoReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(LegoReqIdl legoReqIdl) {
            super(legoReqIdl);
            if (legoReqIdl == null) {
                return;
            }
            this.data = legoReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public LegoReqIdl build(boolean z) {
            return new LegoReqIdl(this, z);
        }
    }

    public LegoReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}