package tbclient.UpdateTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class UpdateTailReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<UpdateTailReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(UpdateTailReqIdl updateTailReqIdl) {
            super(updateTailReqIdl);
            if (updateTailReqIdl == null) {
                return;
            }
            this.data = updateTailReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public UpdateTailReqIdl build(boolean z) {
            return new UpdateTailReqIdl(this, z);
        }
    }

    public UpdateTailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}