package tbclient.ActiveConfig;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ActiveConfigReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<ActiveConfigReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(ActiveConfigReqIdl activeConfigReqIdl) {
            super(activeConfigReqIdl);
            if (activeConfigReqIdl == null) {
                return;
            }
            this.data = activeConfigReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ActiveConfigReqIdl build(boolean z) {
            return new ActiveConfigReqIdl(this, z);
        }
    }

    public ActiveConfigReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}