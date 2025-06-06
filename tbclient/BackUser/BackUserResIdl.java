package tbclient.BackUser;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class BackUserResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<BackUserResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(BackUserResIdl backUserResIdl) {
            super(backUserResIdl);
            if (backUserResIdl == null) {
                return;
            }
            this.error = backUserResIdl.error;
            this.data = backUserResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public BackUserResIdl build(boolean z) {
            return new BackUserResIdl(this, z);
        }
    }

    public BackUserResIdl(Builder builder, boolean z) {
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