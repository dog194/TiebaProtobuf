package tbclient.Lego;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class LegoResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<LegoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(LegoResIdl legoResIdl) {
            super(legoResIdl);
            if (legoResIdl == null) {
                return;
            }
            this.data = legoResIdl.data;
            this.error = legoResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public LegoResIdl build(boolean z) {
            return new LegoResIdl(this, z);
        }
    }

    public LegoResIdl(Builder builder, boolean z) {
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