package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetGiftListResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetGiftListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetGiftListResIdl getGiftListResIdl) {
            super(getGiftListResIdl);
            if (getGiftListResIdl == null) {
                return;
            }
            this.data = getGiftListResIdl.data;
            this.error = getGiftListResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetGiftListResIdl build(boolean z) {
            return new GetGiftListResIdl(this, z);
        }
    }

    public GetGiftListResIdl(Builder builder, boolean z) {
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