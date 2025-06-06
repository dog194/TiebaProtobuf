package tbclient.Realtime;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class RealtimeReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<RealtimeReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(RealtimeReqIdl realtimeReqIdl) {
            super(realtimeReqIdl);
            if (realtimeReqIdl == null) {
                return;
            }
            this.data = realtimeReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public RealtimeReqIdl build(boolean z) {
            return new RealtimeReqIdl(this, z);
        }
    }

    public RealtimeReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}