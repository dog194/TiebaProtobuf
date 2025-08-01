package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class MoreTreasureTroveResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<MoreTreasureTroveResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(MoreTreasureTroveResIdl moreTreasureTroveResIdl) {
            super(moreTreasureTroveResIdl);
            if (moreTreasureTroveResIdl == null) {
                return;
            }
            this.error = moreTreasureTroveResIdl.error;
            this.data = moreTreasureTroveResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public MoreTreasureTroveResIdl build(boolean z) {
            return new MoreTreasureTroveResIdl(this, z);
        }
    }

    public MoreTreasureTroveResIdl(Builder builder, boolean z) {
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