package tbclient.CommitCardInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class CommitCardInfoResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<CommitCardInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(CommitCardInfoResIdl commitCardInfoResIdl) {
            super(commitCardInfoResIdl);
            if (commitCardInfoResIdl == null) {
                return;
            }
            this.error = commitCardInfoResIdl.error;
            this.data = commitCardInfoResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public CommitCardInfoResIdl build(boolean z) {
            return new CommitCardInfoResIdl(this, z);
        }
    }

    public CommitCardInfoResIdl(Builder builder, boolean z) {
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