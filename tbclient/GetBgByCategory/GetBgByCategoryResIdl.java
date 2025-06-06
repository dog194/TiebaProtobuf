package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetBgByCategoryResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetBgByCategoryResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBgByCategoryResIdl getBgByCategoryResIdl) {
            super(getBgByCategoryResIdl);
            if (getBgByCategoryResIdl == null) {
                return;
            }
            this.data = getBgByCategoryResIdl.data;
            this.error = getBgByCategoryResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBgByCategoryResIdl build(boolean z) {
            return new GetBgByCategoryResIdl(this, z);
        }
    }

    public GetBgByCategoryResIdl(Builder builder, boolean z) {
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