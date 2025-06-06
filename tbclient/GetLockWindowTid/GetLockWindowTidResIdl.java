package tbclient.GetLockWindowTid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetLockWindowTidResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<GetLockWindowTidResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetLockWindowTidResIdl getLockWindowTidResIdl) {
            super(getLockWindowTidResIdl);
            if (getLockWindowTidResIdl == null) {
                return;
            }
            this.error = getLockWindowTidResIdl.error;
            this.data = getLockWindowTidResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetLockWindowTidResIdl build(boolean z) {
            return new GetLockWindowTidResIdl(this, z);
        }
    }

    public GetLockWindowTidResIdl(Builder builder, boolean z) {
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