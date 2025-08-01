package tbclient.AddThread;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class AddThreadResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<AddThreadResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(AddThreadResIdl addThreadResIdl) {
            super(addThreadResIdl);
            if (addThreadResIdl == null) {
                return;
            }
            this.error = addThreadResIdl.error;
            this.data = addThreadResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public AddThreadResIdl build(boolean z) {
            return new AddThreadResIdl(this, z);
        }
    }

    public AddThreadResIdl(Builder builder, boolean z) {
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