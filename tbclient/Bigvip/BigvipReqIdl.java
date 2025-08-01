package tbclient.Bigvip;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BigvipReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<BigvipReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(BigvipReqIdl bigvipReqIdl) {
            super(bigvipReqIdl);
            if (bigvipReqIdl == null) {
                return;
            }
            this.data = bigvipReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public BigvipReqIdl build(boolean z) {
            return new BigvipReqIdl(this, z);
        }
    }

    public BigvipReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}