package tbclient.ElectionInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class ElectionInfoResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<ElectionInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(ElectionInfoResIdl electionInfoResIdl) {
            super(electionInfoResIdl);
            if (electionInfoResIdl == null) {
                return;
            }
            this.error = electionInfoResIdl.error;
            this.data = electionInfoResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public ElectionInfoResIdl build(boolean z) {
            return new ElectionInfoResIdl(this, z);
        }
    }

    public ElectionInfoResIdl(Builder builder, boolean z) {
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