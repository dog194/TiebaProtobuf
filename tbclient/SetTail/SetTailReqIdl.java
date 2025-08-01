package tbclient.SetTail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SetTailReqIdl extends Message {

    @ProtoField(tag = 1)
    public final ReqData data;

    public static final class Builder extends Message.Builder<SetTailReqIdl> {
        public ReqData data;

        public Builder() {
        }

        public Builder(SetTailReqIdl setTailReqIdl) {
            super(setTailReqIdl);
            if (setTailReqIdl == null) {
                return;
            }
            this.data = setTailReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SetTailReqIdl build(boolean z) {
            return new SetTailReqIdl(this, z);
        }
    }

    public SetTailReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}