package tbclient.SetCard;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class SetCardResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<SetCardResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SetCardResIdl setCardResIdl) {
            super(setCardResIdl);
            if (setCardResIdl == null) {
                return;
            }
            this.error = setCardResIdl.error;
            this.data = setCardResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SetCardResIdl build(boolean z) {
            return new SetCardResIdl(this, z);
        }
    }

    public SetCardResIdl(Builder builder, boolean z) {
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