package tbclient.MoreTreasureTrove;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class MoreTreasureTroveReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<MoreTreasureTroveReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(MoreTreasureTroveReqIdl moreTreasureTroveReqIdl) {
            super(moreTreasureTroveReqIdl);
            if (moreTreasureTroveReqIdl == null) {
                return;
            }
            this.data = moreTreasureTroveReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public MoreTreasureTroveReqIdl build(boolean z) {
            return new MoreTreasureTroveReqIdl(this, z);
        }
    }

    public MoreTreasureTroveReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}