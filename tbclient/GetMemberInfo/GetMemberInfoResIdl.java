package tbclient.GetMemberInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetMemberInfoResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetMemberInfoResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetMemberInfoResIdl getMemberInfoResIdl) {
            super(getMemberInfoResIdl);
            if (getMemberInfoResIdl == null) {
                return;
            }
            this.data = getMemberInfoResIdl.data;
            this.error = getMemberInfoResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetMemberInfoResIdl build(boolean z) {
            return new GetMemberInfoResIdl(this, z);
        }
    }

    public GetMemberInfoResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}