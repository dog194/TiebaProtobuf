package tbclient.DecryptCode;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class DecryptCodeResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<DecryptCodeResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(DecryptCodeResIdl decryptCodeResIdl) {
            super(decryptCodeResIdl);
            if (decryptCodeResIdl == null) {
                return;
            }
            this.error = decryptCodeResIdl.error;
            this.data = decryptCodeResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public DecryptCodeResIdl build(boolean z) {
            return new DecryptCodeResIdl(this, z);
        }
    }

    public DecryptCodeResIdl(Builder builder, boolean z) {
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