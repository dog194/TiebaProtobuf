package tbclient.GetAddressList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetAddressListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetAddressListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetAddressListResIdl getAddressListResIdl) {
            super(getAddressListResIdl);
            if (getAddressListResIdl == null) {
                return;
            }
            this.error = getAddressListResIdl.error;
            this.data = getAddressListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetAddressListResIdl build(boolean z) {
            return new GetAddressListResIdl(this, z);
        }
    }

    public GetAddressListResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
        } else {
            this.error = builder.error;
            this.data = builder.data;
        }
    }
}