package tbclient.GetBackground;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetBackgroundResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetBackgroundResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetBackgroundResIdl getBackgroundResIdl) {
            super(getBackgroundResIdl);
            if (getBackgroundResIdl == null) {
                return;
            }
            this.data = getBackgroundResIdl.data;
            this.error = getBackgroundResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetBackgroundResIdl build(boolean z) {
            return new GetBackgroundResIdl(this, z);
        }
    }

    public GetBackgroundResIdl(Builder builder, boolean z) {
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