package tbclient.GetMyGift;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetMyGiftResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetMyGiftResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMyGiftResIdl getMyGiftResIdl) {
            super(getMyGiftResIdl);
            if (getMyGiftResIdl == null) {
                return;
            }
            this.data = getMyGiftResIdl.data;
            this.error = getMyGiftResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetMyGiftResIdl build(boolean z) {
            return new GetMyGiftResIdl(this, z);
        }
    }

    public GetMyGiftResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}