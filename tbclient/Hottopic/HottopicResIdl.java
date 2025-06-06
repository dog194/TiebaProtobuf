package tbclient.Hottopic;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class HottopicResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<HottopicResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(HottopicResIdl hottopicResIdl) {
            super(hottopicResIdl);
            if (hottopicResIdl == null) {
                return;
            }
            this.data = hottopicResIdl.data;
            this.error = hottopicResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public HottopicResIdl build(boolean z) {
            return new HottopicResIdl(this, z);
        }
    }

    public HottopicResIdl(Builder builder, boolean z) {
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