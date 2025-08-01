package tbclient.SendFreeGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SendFreeGiftReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<SendFreeGiftReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SendFreeGiftReqIdl sendFreeGiftReqIdl) {
            super(sendFreeGiftReqIdl);
            if (sendFreeGiftReqIdl == null) {
                return;
            }
            this.data = sendFreeGiftReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SendFreeGiftReqIdl build(boolean z) {
            return new SendFreeGiftReqIdl(this, z);
        }
    }

    public SendFreeGiftReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}