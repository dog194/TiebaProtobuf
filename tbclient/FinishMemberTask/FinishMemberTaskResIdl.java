package tbclient.FinishMemberTask;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class FinishMemberTaskResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<FinishMemberTaskResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(FinishMemberTaskResIdl finishMemberTaskResIdl) {
            super(finishMemberTaskResIdl);
            if (finishMemberTaskResIdl == null) {
                return;
            }
            this.error = finishMemberTaskResIdl.error;
            this.data = finishMemberTaskResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public FinishMemberTaskResIdl build(boolean z) {
            return new FinishMemberTaskResIdl(this, z);
        }
    }

    public FinishMemberTaskResIdl(Builder builder, boolean z) {
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