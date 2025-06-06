package tbclient.GetOrder;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetOrderResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetOrderResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetOrderResIdl getOrderResIdl) {
            super(getOrderResIdl);
            if (getOrderResIdl == null) {
                return;
            }
            this.data = getOrderResIdl.data;
            this.error = getOrderResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetOrderResIdl build(boolean z) {
            return new GetOrderResIdl(this, z);
        }
    }

    public GetOrderResIdl(Builder builder, boolean z) {
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