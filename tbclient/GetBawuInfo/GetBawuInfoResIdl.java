package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetBawuInfoResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetBawuInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBawuInfoResIdl getBawuInfoResIdl) {
            super(getBawuInfoResIdl);
            if (getBawuInfoResIdl == null) {
                return;
            }
            this.data = getBawuInfoResIdl.data;
            this.error = getBawuInfoResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBawuInfoResIdl build(boolean z) {
            return new GetBawuInfoResIdl(this, z);
        }
    }

    public GetBawuInfoResIdl(Builder builder, boolean z) {
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