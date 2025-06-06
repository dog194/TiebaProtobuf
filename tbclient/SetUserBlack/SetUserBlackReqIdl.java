package tbclient.SetUserBlack;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SetUserBlackReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<SetUserBlackReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SetUserBlackReqIdl setUserBlackReqIdl) {
            super(setUserBlackReqIdl);
            if (setUserBlackReqIdl == null) {
                return;
            }
            this.data = setUserBlackReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SetUserBlackReqIdl build(boolean z) {
            return new SetUserBlackReqIdl(this, z);
        }
    }

    public SetUserBlackReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}