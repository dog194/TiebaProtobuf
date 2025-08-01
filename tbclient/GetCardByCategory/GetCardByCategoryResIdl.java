package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetCardByCategoryResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetCardByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetCardByCategoryResIdl getCardByCategoryResIdl) {
            super(getCardByCategoryResIdl);
            if (getCardByCategoryResIdl == null) {
                return;
            }
            this.error = getCardByCategoryResIdl.error;
            this.data = getCardByCategoryResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetCardByCategoryResIdl build(boolean z) {
            return new GetCardByCategoryResIdl(this, z);
        }
    }

    public GetCardByCategoryResIdl(Builder builder, boolean z) {
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