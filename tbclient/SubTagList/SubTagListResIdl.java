package tbclient.SubTagList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class SubTagListResIdl extends Message {

    @ProtoField(tag = 2)
    public final DataRes data;

    @ProtoField(tag = 1)
    public final Error error;

    public static final class Builder extends Message.Builder<SubTagListResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(SubTagListResIdl subTagListResIdl) {
            super(subTagListResIdl);
            if (subTagListResIdl == null) {
                return;
            }
            this.error = subTagListResIdl.error;
            this.data = subTagListResIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SubTagListResIdl build(boolean z) {
            return new SubTagListResIdl(this, z);
        }
    }

    public SubTagListResIdl(Builder builder, boolean z) {
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